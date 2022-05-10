import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Model {
	/*
	 * Class variables of Monopoly's data.
	 */
	Player[] players = new Player[4];
	Slot[] slots = new Slot[40];
	// Starting point is also considered a land.
	final int[] landIndex = { 0, 1, 2, 3, 5, 6, 8, 12, 13, 15, 16, 18, 22, 24, 25, 27, 28, 32, 33, 34, 36, 37, 38 };

	int currentTurn;
	boolean isGameEnd = false;

	// Class variables to establish connection.
	private Controller control;

	/*
	 * Function to establish connection.
	 */

	public void setController(Controller c) {
		this.control = c;
	}

	/*
	 * Function to initialize the game.
	 */

	public void initializeGame() {
		currentTurn = 0;

		// Initialize all slots
		for (int i = 0; i < slots.length; i++) {
			if (containLandIndex(landIndex, i)) {
				// if the slot is also a land,
				Land target = new Land();
				target.isLand = true;
				target.ownerID = 4; // ownerID4 = null
				slots[i] = target;
			} else {
				Slot target = new Slot();
				target.isLand = false;
				slots[i] = target;
			}
		}

		// Initialize all players,
		for (int j = 0; j < 4; j++) {
			players[j] = new Player();
			// initialize balance.
			players[j].balance = 2000;
			control.updateBalanceToView(j, players[j].balance);
			// initialize status.
			players[j].isAlive = true;
			control.updateStatusToView(j, true);
			// initialize position.
			players[j].position = 0;
			control.updatePositionToView(j, 0);
			// initialize playerOnSlot.
			slots[0].playerOnSlot.add(j); // starts from 0
			control.updateLandOwnerToView(0, j);
		}

		// Initialize land info, missing the view update
		try {
			File file = new File("data.csv");
			Scanner sFile = new Scanner(file);
			int readCount = 0;

			// Initialize the special starting point.
			initializeLandInfo(0, "GO", null);
			control.updateLandInfoToView(0, "GO", null);
			readCount++;

			while (sFile.hasNextLine()) {
				// Data Format: [name] [price]
				for (int k = 1; k <= landIndex.length; k++) {
					String[] input = sFile.nextLine().trim().split(" ", 2);
					initializeLandInfo(k, input[0], input[1]);
					control.updateLandInfoToView(k, input[0], input[1]);
					readCount++;
				}
			}

			if (readCount != landIndex.length) {
				// if data amount not correct, display message.
			}
		} catch (FileNotFoundException e) {
			// if cannot find file, display message

		}

	}

	/*
	 * Helper Functions for initializeGame()
	 */

	private void initializeLandInfo(int index, String name, String price) {
		Land target = (Land) slots[landIndex[index]];
		if (index != 0) {
			target.isGO = false;
			target.name = name;
			target.landPrice = Integer.parseInt(price);
		} else {
			// if index = 0
			target.isGO = true;
			target.name = name;
		}
		slots[landIndex[index]] = target;
	}

	private boolean containLandIndex(final int[] landIndex, final int target) {
		// test if the array contains a specific value.
		return Arrays.stream(landIndex).anyMatch(i -> i == target);
	}

	/*
	 * Functions to perform various options.
	 */

	public int drawDice() {
		int dice = 0;

		if (players[currentTurn].isAlive == true) {
			// Only draw a dice if the player is alive,
			// roll a dice between 1 and 10.
			dice = 1 + (int) (Math.random() * 10);

			// remove the player from the current land slot.
			int previousPosition = players[currentTurn].position;
			slots[previousPosition].playerOnSlot.remove(currentTurn);
			control.updatePlayerOnSlotToView(false, currentTurn, previousPosition);

			// add the player to the next land slot.
			int currentPosition = 0;
			if (players[currentTurn].position + dice > 39) {
				// if the player passes through slot 0,
				currentPosition = previousPosition + dice - 39;
				players[currentTurn].position = currentPosition;
				slots[currentPosition].playerOnSlot.add(currentTurn);
				players[currentTurn].balance += 2000;

				control.updateBalanceToView(currentTurn, players[currentTurn].balance);
			} else {
				currentPosition = previousPosition + dice;
				players[currentTurn].position = currentPosition;
				slots[currentPosition].playerOnSlot.add(currentTurn);
			}
			control.updatePlayerOnSlotToView(true, currentTurn, players[currentTurn].position);
			control.updatePositionToView(currentTurn, players[currentTurn].position);

			// check if the player can perform other actions.
			if (slots[currentPosition].isLand) {
				// if the slot is a land slot,
				Land target = (Land) slots[currentPosition];
				if (target.ownerID == 4) {
					// if the land slot is not owned,

				} else if (target.ownerID != 4 && target.ownerID != currentTurn) {
					// if the land slot is owned not by currentTurn player,
					payRentalFee(currentPosition);
				} else {
					// if the land slot is owned by currentTurn player,
					// Display message.
				}
			} else {
				// Display message.
			}
		} else {
			// if the player is not alive,

		}

		// return dice number for display purpose.
		return dice;
	}

	public void doTradeLand(int slotIndex, int charge) {
		if (slots[slotIndex].isLand == true) {
			// if the slot is a land slot,
			Land target = (Land) slots[slotIndex];
			if (target.ownerID != 4 && target.ownerID != currentTurn) {
				// Add the purchase to previous owner,
				// reduce the purchase from current player.
				players[target.ownerID].balance += charge;
				control.updateBalanceToView(target.ownerID, players[target.ownerID].balance);
				players[currentTurn].balance -= charge;
				control.updateBalanceToView(currentTurn, players[currentTurn].balance);

				// Remove the land ownership from previous owner,
				// add the land ownership to current player.
				target.ownerID = currentTurn;
				slots[slotIndex] = target;
				control.updateLandOwnerToView(slotIndex, target.ownerID);
			} else {
				// if any circumstances does not hold,
				// display message
			}
		} else {
			// if the slot is not a land slot,
			// display message.
		}
	}

	public void doBuyLand() {
		Land target = (Land) slots[players[currentTurn].position];
		if (players[currentTurn].balance >= target.landPrice) {
			// update land ownership.
			target.ownerID = currentTurn;
			control.updateLandOwnerToView(players[currentTurn].position, target.ownerID);
			//update balance.
			players[currentTurn].balance -= target.landPrice;
			control.updateBalanceToView(currentTurn, players[currentTurn].balance);
		} else {
			// if the player not enough balance,
			// display message.
		}
	}

	public void endTurn() {
		// only end turn when button is pressed.
		currentTurn++;
		if (currentTurn == 4) {
			// if turn = 4, reset the turn.
			currentTurn = 0;
		}
		control.updateTurnNoticeToView(currentTurn + 1);
	}

	/*
	 * Helper/Later functions for drawDice()
	 */

	public void payRentalFee(int currentPosition) {
		Land target = (Land) slots[currentPosition];
		// rentalFee = 10% of landPrice
		double rentalFee = target.landPrice * 0.1;
		if (players[currentTurn].balance < rentalFee) {
			// if the player cannot pay, then go bankrupted.
			declareBankruptcy(true, currentTurn);
		} else {
			// if the player can pay,
			// the current player pays the rentalFee.
			players[currentTurn].balance -= rentalFee;
			control.updateBalanceToView(currentTurn, players[currentTurn].balance);
			// the landowner gets the rentalFee.
			players[target.ownerID].balance += rentalFee;
			control.updateBalanceToView(target.ownerID, players[target.ownerID].balance);
		}
	}

	public void declareBankruptcy(boolean isNotCheat, int playerIndex) {
		Land target = (Land) slots[players[playerIndex].position];
		// Update player(s)' balance.
		if (isNotCheat == true) {
			// if the player goes bankrupted naturally,
			// the remaining balance is transferred.
			players[target.ownerID].balance += players[playerIndex].balance;
			control.updateBalanceToView(target.ownerID, players[target.ownerID].balance);
		}
		players[playerIndex].balance = 0;
		control.updateBalanceToView(playerIndex, players[playerIndex].balance);

		// Update bankrupted status.
		players[playerIndex].isAlive = false;
		control.updateStatusToView(playerIndex, false);

		// Reset all occupied lands to no owner.
		for (int i : landIndex) {
			Land owned = (Land) slots[i];
			if (owned.ownerID == playerIndex) {
				owned.ownerID = 4;
				slots[i] = owned;
				control.updateLandOwnerToView(i, owned.ownerID);
			}
		}

		// Update player's position,
		// remove from previous position.
		target.playerOnSlot.remove(playerIndex);
		control.updatePlayerOnSlotToView(false, playerIndex, players[playerIndex].position);
		// add to slot 0.
		players[playerIndex].position = 0;
		control.updatePositionToView(playerIndex, 0);
		slots[0].playerOnSlot.add(playerIndex);
		control.updatePlayerOnSlotToView(true, playerIndex, 0);

		// Display message.
	}

}
