import javax.swing.*;
import java.awt.*;

public class view extends javax.swing.JFrame {

	JLabel nameJ[] = new JLabel[23]; // stores every land slot's name
	JLabel priceJ[] = new JLabel[23]; // stores every land slot's price
	JLabel ownerJ[] = new JLabel[23]; // stores every land slot's owner
	JLabel here[] = new JLabel[40]; // stores every slots that may contains a player
	controller c;

	// Start the view class, perform method calling and light modification on part
	// of the display.
	public view(controller c) {
		this.c = c;
		initComponents();
	}

	// Put all labels in the created corresponding arrays, and so can access by
	// other classes.
	public void labelClass() {
		nameJ[0] = nameSlot0;
		priceJ[0] = priceSlot0;
		here[0] = playerAt0;
		ownerJ[0] = OwnerAtSlot0;
		nameJ[1] = nameSlot1;
		priceJ[1] = priceSlot1;
		ownerJ[1] = OwnerAtSlot1;
		here[1] = playerAt1;
		nameJ[2] = nameSlot2;
		priceJ[2] = priceSlot2;
		ownerJ[2] = OwnerAtSlot2;
		here[2] = playerAt2;
		nameJ[3] = nameSlot3;
		priceJ[3] = priceSlot3;
		ownerJ[3] = OwnerAtSlot3;
		here[3] = playerAt3;
		nameJ[4] = nameSlot4;
		priceJ[4] = priceSlot4;
		ownerJ[4] = OwnerAtSlot4;
		here[4] = playerAt4;
		nameJ[5] = nameSlot5;
		priceJ[5] = priceSlot5;
		ownerJ[5] = OwnerAtSlot5;
		here[5] = playerAt5;
		nameJ[6] = nameSlot6;
		priceJ[6] = priceSlot6;
		ownerJ[6] = OwnerAtSlot6;
		here[6] = playerAt6;
		nameJ[7] = nameSlot7;
		priceJ[7] = priceSlot7;
		ownerJ[7] = OwnerAtSlot7;
		here[7] = playerAt7;
		nameJ[8] = nameSlot8;
		priceJ[8] = priceSlot8;
		ownerJ[8] = OwnerAtSlot8;
		here[8] = playerAt8;
		nameJ[9] = nameSlot9;
		priceJ[9] = priceSlot9;
		ownerJ[9] = OwnerAtSlot9;
		here[9] = playerAt9;
		nameJ[10] = nameSlot10;
		priceJ[10] = priceSlot10;
		ownerJ[10] = OwnerAtSlot10;
		here[10] = playerAt10;
		nameJ[11] = nameSlot11;
		priceJ[11] = priceSlot11;
		ownerJ[11] = OwnerAtSlot11;
		here[11] = playerAt11;
		nameJ[12] = nameSlot12;
		priceJ[12] = priceSlot12;
		ownerJ[12] = OwnerAtSlot12;
		here[12] = playerAt12;
		nameJ[13] = nameSlot13;
		priceJ[13] = priceSlot13;
		ownerJ[13] = OwnerAtSlot13;
		here[13] = playerAt13;
		nameJ[14] = nameSlot14;
		priceJ[14] = priceSlot14;
		ownerJ[14] = OwnerAtSlot14;
		here[14] = playerAt14;
		nameJ[15] = nameSlot15;
		priceJ[15] = priceSlot15;
		ownerJ[15] = OwnerAtSlot15;
		here[15] = playerAt15;
		nameJ[16] = nameSlot16;
		priceJ[16] = priceSlot16;
		ownerJ[16] = OwnerAtSlot16;
		here[16] = playerAt16;
		nameJ[17] = nameSlot17;
		priceJ[17] = priceSlot17;
		ownerJ[17] = OwnerAtSlot17;
		here[17] = playerAt17;
		nameJ[18] = nameSlot18;
		priceJ[18] = priceSlot18;
		ownerJ[18] = OwnerAtSlot18;
		here[18] = playerAt18;
		nameJ[19] = nameSlot19;
		priceJ[19] = priceSlot19;
		ownerJ[19] = OwnerAtSlot19;
		here[19] = playerAt19;
		nameJ[20] = nameSlot20;
		priceJ[20] = priceSlot20;
		ownerJ[20] = OwnerAtSlot20;
		here[20] = playerAt20;
		nameJ[21] = nameSlot21;
		priceJ[21] = priceSlot21;
		ownerJ[21] = OwnerAtSlot21;
		nameJ[22] = nameSlot22;
		priceJ[22] = priceSlot22;
		ownerJ[22] = OwnerAtSlot22;
		here[21] = playerAt21;
		here[22] = playerAt22;
		here[23] = playerAt23;
		here[24] = playerAt24;
		here[25] = playerAt25;
		here[26] = playerAt26;
		here[27] = playerAt27;
		here[28] = playerAt28;
		here[29] = playerAt29;
		here[30] = playerAt30;
		here[31] = playerAt31;
		here[32] = playerAt32;
		here[33] = playerAt33;
		here[34] = playerAt34;
		here[35] = playerAt35;
		here[36] = playerAt36;
		here[37] = playerAt37;
		here[38] = playerAt38;
		here[39] = playerAt39;
	}

	/*
	 * Update the name, price, owner, money and map, and multiple buttons' status
	 * when called. Or initialise for the function iniButton().
	 *
	 * Setter methods below:
	 */
	
	// Updating the map panel...
	public void udtName(int s, String name) {
		nameJ[s].setText(name);
	}

	public void udtPrice(int s, int price) {
		priceJ[s].setText(Integer.toString(price));
	}

	public void udtOwner(int s, int playerID) {
		System.out.println("Target " + s);
		switch (playerID) {
		case 0:
			ownerJ[s].setForeground(Color.red);
			break;
		case 1:
			ownerJ[s].setForeground(Color.orange);
			break;
		case 2:
			ownerJ[s].setForeground(Color.green);
			break;
		case 3:
			ownerJ[s].setForeground(Color.blue);
			break;
		case 4:
			ownerJ[s].setForeground(Color.black);
			break;
		}
	}

	public void udtMap(int s, String playerSum) { 
		if (s > 39) {
			s = s - 40;
		}

		// Set the target player on the target slot
		here[s].setText(playerSum);
	}

	public void udtNotice(String n) {
		turnLL.setText(n); // Display which player gets the current turn.
	}

	public void setDice(int d) {
		displayDice.setText(Integer.toString(d)); // Display the dice number rolled by the current player.
	}

	// Updating the players' info panel...
	public void udtMoney(int p, int m) {
		System.out.println("Updating");
		switch (p) {
		case 0:
			displayMoneyP1.setText(Integer.toString(m));
			System.out.println("Updating1");
			break;
		case 1:
			displayMoneyP2.setText(Integer.toString(m));
			System.out.println("Updating2");
			break;
		case 2:
			displayMoneyP3.setText(Integer.toString(m));
			System.out.println("Updating3");
			break;
		case 3:
			displayMoneyP4.setText(Integer.toString(m));
			System.out.println("Updating4");
			break;
		default:
			messageDialog("Something wrong has happened!");
			break;
		}
	}

	public void udtInfo(int s, int p) { // actually is udtPosition
		switch (p) {
		case 0:
			displayPositionP1.setText(Integer.toString(s));
			break;
		case 1:
			displayPositionP2.setText(Integer.toString(s));
			break;
		case 2:
			displayPositionP3.setText(Integer.toString(s));
			break;
		case 3:
			displayPositionP4.setText(Integer.toString(s));
			break;
		}
	}
	
	public void udtStatus(int p) { // update the position
		JLabel displayStatus[] = {displayStatusP1, displayStatusP2, displayStatusP3, displayStatusP4};
		System.out.println(displayStatus[p].getText());
		if (displayStatus[p].getText().equals("Alive")) {
			displayStatus[p].setText("Bankrupted");
		} else if (displayStatus[p].getText().equals("Bankrupted")) { // if the status is "Bankrupted"
			displayStatus[p].setText("Alive");
		} else {
			JOptionPane.showMessageDialog(this, "Error on setting the player's status!");
		}
	}

	public void buyOrPass() { // Set the three buttons in negative relationship
		boolean current = (noBuy.isEnabled());
		buyCurrentLand.setEnabled(!current);
		noBuy.setEnabled(!current);
		dice.setEnabled(current);
	}

	public void iniButton() {
		buyCurrentLand.setEnabled(false);
		noBuy.setEnabled(false);
	}

	/*
	 * getter methods below:
	 */
	public String getTradeSlot() {
		String temp = tradeSlot.getText();
		return temp;
	}

	public String getTradePrice() {
		String temp = tradePrice.getText();
		return temp;
	}

	/*
	 * showMessageDialog method below:
	 */
	public void messageDialog(String input) {
		JOptionPane.showMessageDialog(this, input);
	}

	// Initialize all components that appears on the GUI
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		priceSlot0 = new javax.swing.JLabel();
		OwnerAtSlot0 = new javax.swing.JLabel();
		Body = new javax.swing.JPanel();
		MapHolder = new javax.swing.JPanel();
		land0 = new javax.swing.JPanel();
		playerAt0 = new javax.swing.JLabel();
		nameSlot0 = new javax.swing.JLabel();
		land1 = new javax.swing.JPanel();
		playerAt1 = new javax.swing.JLabel();
		nameSlot1 = new javax.swing.JLabel();
		priceSlot1 = new javax.swing.JLabel();
		OwnerAtSlot1 = new javax.swing.JLabel();
		land2 = new javax.swing.JPanel();
		playerAt2 = new javax.swing.JLabel();
		nameSlot2 = new javax.swing.JLabel();
		priceSlot2 = new javax.swing.JLabel();
		OwnerAtSlot2 = new javax.swing.JLabel();
		land3 = new javax.swing.JPanel();
		playerAt3 = new javax.swing.JLabel();
		nameSlot3 = new javax.swing.JLabel();
		priceSlot3 = new javax.swing.JLabel();
		OwnerAtSlot3 = new javax.swing.JLabel();
		land4 = new javax.swing.JPanel();
		playerAt4 = new javax.swing.JLabel();
		land5 = new javax.swing.JPanel();
		playerAt5 = new javax.swing.JLabel();
		nameSlot4 = new javax.swing.JLabel();
		priceSlot4 = new javax.swing.JLabel();
		OwnerAtSlot4 = new javax.swing.JLabel();
		land6 = new javax.swing.JPanel();
		playerAt6 = new javax.swing.JLabel();
		priceSlot5 = new javax.swing.JLabel();
		nameSlot5 = new javax.swing.JLabel();
		OwnerAtSlot5 = new javax.swing.JLabel();
		land7 = new javax.swing.JPanel();
		playerAt7 = new javax.swing.JLabel();
		land8 = new javax.swing.JPanel();
		playerAt8 = new javax.swing.JLabel();
		nameSlot6 = new javax.swing.JLabel();
		priceSlot6 = new javax.swing.JLabel();
		OwnerAtSlot6 = new javax.swing.JLabel();
		land9 = new javax.swing.JPanel();
		playerAt9 = new javax.swing.JLabel();
		land10 = new javax.swing.JPanel();
		playerAt10 = new javax.swing.JLabel();
		land11 = new javax.swing.JPanel();
		playerAt11 = new javax.swing.JLabel();
		land12 = new javax.swing.JPanel();
		playerAt12 = new javax.swing.JLabel();
		nameSlot7 = new javax.swing.JLabel();
		priceSlot7 = new javax.swing.JLabel();
		OwnerAtSlot7 = new javax.swing.JLabel();
		land13 = new javax.swing.JPanel();
		playerAt13 = new javax.swing.JLabel();
		nameSlot8 = new javax.swing.JLabel();
		OwnerAtSlot8 = new javax.swing.JLabel();
		priceSlot8 = new javax.swing.JLabel();
		land14 = new javax.swing.JPanel();
		playerAt14 = new javax.swing.JLabel();
		land15 = new javax.swing.JPanel();
		playerAt15 = new javax.swing.JLabel();
		nameSlot9 = new javax.swing.JLabel();
		priceSlot9 = new javax.swing.JLabel();
		OwnerAtSlot9 = new javax.swing.JLabel();
		land16 = new javax.swing.JPanel();
		playerAt16 = new javax.swing.JLabel();
		nameSlot10 = new javax.swing.JLabel();
		priceSlot10 = new javax.swing.JLabel();
		OwnerAtSlot10 = new javax.swing.JLabel();
		land17 = new javax.swing.JPanel();
		playerAt17 = new javax.swing.JLabel();
		land18 = new javax.swing.JPanel();
		playerAt18 = new javax.swing.JLabel();
		nameSlot11 = new javax.swing.JLabel();
		priceSlot11 = new javax.swing.JLabel();
		OwnerAtSlot11 = new javax.swing.JLabel();
		land19 = new javax.swing.JPanel();
		playerAt19 = new javax.swing.JLabel();
		land20 = new javax.swing.JPanel();
		playerAt20 = new javax.swing.JLabel();
		land21 = new javax.swing.JPanel();
		playerAt21 = new javax.swing.JLabel();
		land22 = new javax.swing.JPanel();
		playerAt22 = new javax.swing.JLabel();
		nameSlot12 = new javax.swing.JLabel();
		priceSlot12 = new javax.swing.JLabel();
		OwnerAtSlot12 = new javax.swing.JLabel();
		land23 = new javax.swing.JPanel();
		playerAt23 = new javax.swing.JLabel();
		land24 = new javax.swing.JPanel();
		playerAt24 = new javax.swing.JLabel();
		nameSlot13 = new javax.swing.JLabel();
		priceSlot13 = new javax.swing.JLabel();
		OwnerAtSlot13 = new javax.swing.JLabel();
		land25 = new javax.swing.JPanel();
		playerAt25 = new javax.swing.JLabel();
		nameSlot14 = new javax.swing.JLabel();
		priceSlot14 = new javax.swing.JLabel();
		OwnerAtSlot14 = new javax.swing.JLabel();
		land26 = new javax.swing.JPanel();
		playerAt26 = new javax.swing.JLabel();
		land27 = new javax.swing.JPanel();
		playerAt27 = new javax.swing.JLabel();
		nameSlot15 = new javax.swing.JLabel();
		priceSlot15 = new javax.swing.JLabel();
		OwnerAtSlot15 = new javax.swing.JLabel();
		land28 = new javax.swing.JPanel();
		playerAt28 = new javax.swing.JLabel();
		nameSlot16 = new javax.swing.JLabel();
		priceSlot16 = new javax.swing.JLabel();
		OwnerAtSlot16 = new javax.swing.JLabel();
		land29 = new javax.swing.JPanel();
		playerAt29 = new javax.swing.JLabel();
		land30 = new javax.swing.JPanel();
		playerAt30 = new javax.swing.JLabel();
		land31 = new javax.swing.JPanel();
		playerAt31 = new javax.swing.JLabel();
		land32 = new javax.swing.JPanel();
		playerAt32 = new javax.swing.JLabel();
		nameSlot17 = new javax.swing.JLabel();
		priceSlot17 = new javax.swing.JLabel();
		OwnerAtSlot17 = new javax.swing.JLabel();
		land33 = new javax.swing.JPanel();
		nameSlot18 = new javax.swing.JLabel();
		playerAt33 = new javax.swing.JLabel();
		priceSlot18 = new javax.swing.JLabel();
		OwnerAtSlot18 = new javax.swing.JLabel();
		land34 = new javax.swing.JPanel();
		nameSlot19 = new javax.swing.JLabel();
		playerAt34 = new javax.swing.JLabel();
		priceSlot19 = new javax.swing.JLabel();
		OwnerAtSlot19 = new javax.swing.JLabel();
		land35 = new javax.swing.JPanel();
		playerAt35 = new javax.swing.JLabel();
		land36 = new javax.swing.JPanel();
		playerAt36 = new javax.swing.JLabel();
		nameSlot20 = new javax.swing.JLabel();
		priceSlot20 = new javax.swing.JLabel();
		OwnerAtSlot20 = new javax.swing.JLabel();
		land37 = new javax.swing.JPanel();
		playerAt37 = new javax.swing.JLabel();
		nameSlot21 = new javax.swing.JLabel();
		priceSlot21 = new javax.swing.JLabel();
		OwnerAtSlot21 = new javax.swing.JLabel();
		land38 = new javax.swing.JPanel();
		playerAt38 = new javax.swing.JLabel();
		nameSlot22 = new javax.swing.JLabel();
		priceSlot22 = new javax.swing.JLabel();
		OwnerAtSlot22 = new javax.swing.JLabel();
		land39 = new javax.swing.JPanel();
		playerAt39 = new javax.swing.JLabel();
		diceHolder = new javax.swing.JPanel();
		dice = new javax.swing.JButton();
		turnLL = new javax.swing.JLabel();
		playerTurnLbl = new javax.swing.JLabel();
		tradeHolder = new javax.swing.JPanel();
		uiLabel2 = new javax.swing.JLabel();
		uiLabelSlot = new javax.swing.JLabel();
		uiLabelPrice = new javax.swing.JLabel();
		tradeSlot = new javax.swing.JTextField();
		tradePrice = new javax.swing.JTextField();
		doTrade = new javax.swing.JButton();
		uiLabelDice = new javax.swing.JLabel();
		displayDice = new javax.swing.JLabel();
		uiHolder = new javax.swing.JPanel();
		uiTitle = new javax.swing.JLabel();
		uiLabelPlayer1 = new javax.swing.JLabel();
		uiLabelMoneyPlayer1 = new javax.swing.JLabel();
		uiLabelPositionPlayer1 = new javax.swing.JLabel();
		uiLabelStatusPlayer1 = new javax.swing.JLabel();
		displayPositionP1 = new javax.swing.JLabel();
		displayMoneyP1 = new javax.swing.JLabel();
		displayStatusP1 = new javax.swing.JLabel();
		uiLabelPlayer2 = new javax.swing.JLabel();
		uiLabelMoneyPlayer2 = new javax.swing.JLabel();
		uiLabelPositionPlayer2 = new javax.swing.JLabel();
		uiLabelStatusPlayer2 = new javax.swing.JLabel();
		displayMoneyP2 = new javax.swing.JLabel();
		displayPositionP2 = new javax.swing.JLabel();
		displayStatusP2 = new javax.swing.JLabel();
		uiLabelPlayer3 = new javax.swing.JLabel();
		uiLabelMoneyPlayer3 = new javax.swing.JLabel();
		uiLabelPositionPlayer3 = new javax.swing.JLabel();
		uiLabelStatusPlayer3 = new javax.swing.JLabel();
		displayMoneyP3 = new javax.swing.JLabel();
		displayPositionP3 = new javax.swing.JLabel();
		displayStatusP3 = new javax.swing.JLabel();
		uiLabelPlayer4 = new javax.swing.JLabel();
		uiLabelMoneyPlayer4 = new javax.swing.JLabel();
		uiLabelPositionPlayer4 = new javax.swing.JLabel();
		uiLabelStatusPlayer4 = new javax.swing.JLabel();
		displayMoneyP4 = new javax.swing.JLabel();
		displayPositionP4 = new javax.swing.JLabel();
		displayStatusP4 = new javax.swing.JLabel();
		buyCurrentLand = new javax.swing.JButton();
		noBuy = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();

		priceSlot0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot0.setText("$200");

		OwnerAtSlot0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot0.setText("Owner");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Body.setBackground(new java.awt.Color(255, 255, 255));
		Body.setPreferredSize(new java.awt.Dimension(1460, 760));

		MapHolder.setBackground(new java.awt.Color(204, 255, 255));
		MapHolder.setPreferredSize(new java.awt.Dimension(748, 748));

		land0.setBackground(new java.awt.Color(255, 255, 255));
		land0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land0.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt0.setText("-");

		nameSlot0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot0.setText("Slot 0");

		javax.swing.GroupLayout land0Layout = new javax.swing.GroupLayout(land0);
		land0.setLayout(land0Layout);
		land0Layout.setHorizontalGroup(land0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land0Layout.createSequentialGroup().addContainerGap()
						.addGroup(land0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(playerAt0, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nameSlot0, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		land0Layout.setVerticalGroup(land0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land0Layout.createSequentialGroup().addContainerGap().addComponent(playerAt0)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(nameSlot0)
						.addContainerGap(18, Short.MAX_VALUE)));

		land1.setBackground(new java.awt.Color(255, 255, 255));
		land1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land1.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt1.setText("-");

		nameSlot1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot1.setText("Slot 1");

		priceSlot1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot1.setText("$200");

		OwnerAtSlot1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot1.setText("Owner");

		javax.swing.GroupLayout land1Layout = new javax.swing.GroupLayout(land1);
		land1.setLayout(land1Layout);
		land1Layout.setHorizontalGroup(land1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land1Layout.createSequentialGroup().addContainerGap().addGroup(land1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, land1Layout.createSequentialGroup()
								.addGroup(land1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(nameSlot1, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
										.addComponent(playerAt1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(6, 6, 6))
						.addGroup(land1Layout.createSequentialGroup()
								.addGroup(land1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(priceSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(OwnerAtSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))));
		land1Layout.setVerticalGroup(land1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land1Layout.createSequentialGroup().addContainerGap().addComponent(playerAt1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(nameSlot1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(OwnerAtSlot1).addContainerGap()));

		land2.setBackground(new java.awt.Color(255, 255, 255));
		land2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land2.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt2.setText("-");

		nameSlot2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot2.setText("Slot 2");

		priceSlot2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot2.setText("$200");

		OwnerAtSlot2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot2.setText("Owner");

		javax.swing.GroupLayout land2Layout = new javax.swing.GroupLayout(land2);
		land2.setLayout(land2Layout);
		land2Layout.setHorizontalGroup(land2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land2Layout.createSequentialGroup().addContainerGap().addGroup(land2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land2Layout.createSequentialGroup()
								.addComponent(playerAt2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(20, 20, 20))
						.addGroup(land2Layout.createSequentialGroup()
								.addGroup(land2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(nameSlot2, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(land2Layout.createSequentialGroup()
												.addComponent(priceSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(15, 15, 15)))
								.addContainerGap())
						.addGroup(
								land2Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))));
		land2Layout.setVerticalGroup(land2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land2Layout.createSequentialGroup().addContainerGap().addComponent(playerAt2)
						.addGap(10, 10, 10).addComponent(nameSlot2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(OwnerAtSlot2).addContainerGap()));

		land3.setBackground(new java.awt.Color(255, 255, 255));
		land3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land3.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt3.setText("-");

		nameSlot3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot3.setText("Slot 3");

		priceSlot3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot3.setText("$200");

		OwnerAtSlot3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot3.setText("Owner");

		javax.swing.GroupLayout land3Layout = new javax.swing.GroupLayout(land3);
		land3.setLayout(land3Layout);
		land3Layout.setHorizontalGroup(land3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land3Layout.createSequentialGroup().addContainerGap().addGroup(land3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land3Layout.createSequentialGroup()
								.addComponent(playerAt3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(20, 20, 20))
						.addComponent(nameSlot3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(land3Layout.createSequentialGroup()
								.addComponent(priceSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(25, 25, 25))
						.addGroup(
								land3Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))));
		land3Layout.setVerticalGroup(land3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land3Layout.createSequentialGroup().addContainerGap().addComponent(playerAt3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(nameSlot3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
						.addComponent(OwnerAtSlot3).addContainerGap()));

		land4.setBackground(new java.awt.Color(255, 255, 255));
		land4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land4.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt4.setText("-");

		javax.swing.GroupLayout land4Layout = new javax.swing.GroupLayout(land4);
		land4.setLayout(land4Layout);
		land4Layout.setHorizontalGroup(land4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land4Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land4Layout.setVerticalGroup(land4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land4Layout.createSequentialGroup().addContainerGap().addComponent(playerAt4)
						.addContainerGap(42, Short.MAX_VALUE)));

		land5.setBackground(new java.awt.Color(255, 255, 255));
		land5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land5.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt5.setText("-");

		nameSlot4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot4.setText("Slot 4");

		priceSlot4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot4.setText("$200");

		OwnerAtSlot4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot4.setText("Owner");

		javax.swing.GroupLayout land5Layout = new javax.swing.GroupLayout(land5);
		land5.setLayout(land5Layout);
		land5Layout.setHorizontalGroup(land5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land5Layout.createSequentialGroup().addContainerGap().addGroup(land5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land5Layout.createSequentialGroup()
								.addComponent(playerAt5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(20, 20, 20))
						.addGroup(land5Layout.createSequentialGroup()
								.addGroup(land5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(nameSlot4, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(land5Layout.createSequentialGroup()
												.addComponent(priceSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(15, 15, 15)))
								.addContainerGap())
						.addGroup(
								land5Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))));
		land5Layout.setVerticalGroup(land5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land5Layout.createSequentialGroup().addContainerGap().addComponent(playerAt5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(nameSlot4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(OwnerAtSlot4).addContainerGap()));

		land6.setBackground(new java.awt.Color(255, 255, 255));
		land6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land6.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt6.setText("-");

		priceSlot5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot5.setText("$200");

		nameSlot5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot5.setText("Slot 5");

		OwnerAtSlot5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot5.setText("Owner");

		javax.swing.GroupLayout land6Layout = new javax.swing.GroupLayout(land6);
		land6.setLayout(land6Layout);
		land6Layout.setHorizontalGroup(land6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land6Layout.createSequentialGroup().addContainerGap().addGroup(land6Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land6Layout.createSequentialGroup()
								.addComponent(playerAt6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(20, 20, 20))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, land6Layout.createSequentialGroup()
								.addGroup(land6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(nameSlot5, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(land6Layout.createSequentialGroup()
												.addComponent(priceSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(15, 15, 15)))
								.addContainerGap())
						.addGroup(
								land6Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))));
		land6Layout.setVerticalGroup(land6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land6Layout.createSequentialGroup().addContainerGap().addComponent(playerAt6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(nameSlot5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(OwnerAtSlot5).addContainerGap()));

		land7.setBackground(new java.awt.Color(255, 255, 255));
		land7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land7.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt7.setText("-");

		javax.swing.GroupLayout land7Layout = new javax.swing.GroupLayout(land7);
		land7.setLayout(land7Layout);
		land7Layout.setHorizontalGroup(land7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land7Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land7Layout.setVerticalGroup(land7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land7Layout.createSequentialGroup().addContainerGap().addComponent(playerAt7)
						.addContainerGap(42, Short.MAX_VALUE)));

		land8.setBackground(new java.awt.Color(255, 255, 255));
		land8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land8.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt8.setText("-");

		nameSlot6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot6.setText("Slot 6");

		priceSlot6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot6.setText("$200");

		OwnerAtSlot6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot6.setText("Owner");

		javax.swing.GroupLayout land8Layout = new javax.swing.GroupLayout(land8);
		land8.setLayout(land8Layout);
		land8Layout.setHorizontalGroup(land8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land8Layout.createSequentialGroup().addContainerGap().addGroup(land8Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land8Layout.createSequentialGroup()
								.addComponent(playerAt8, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(20, 20, 20))
						.addGroup(land8Layout.createSequentialGroup()
								.addGroup(land8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(nameSlot6, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(land8Layout.createSequentialGroup()
												.addComponent(priceSlot6, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(15, 15, 15)))
								.addContainerGap())
						.addGroup(
								land8Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot6, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))));
		land8Layout.setVerticalGroup(land8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land8Layout.createSequentialGroup().addContainerGap().addComponent(playerAt8)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(nameSlot6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(OwnerAtSlot6).addContainerGap()));

		land9.setBackground(new java.awt.Color(255, 255, 255));
		land9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land9.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt9.setText("-");

		javax.swing.GroupLayout land9Layout = new javax.swing.GroupLayout(land9);
		land9.setLayout(land9Layout);
		land9Layout.setHorizontalGroup(land9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land9Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land9Layout.setVerticalGroup(land9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land9Layout.createSequentialGroup().addContainerGap().addComponent(playerAt9)
						.addContainerGap(42, Short.MAX_VALUE)));

		land10.setBackground(new java.awt.Color(255, 255, 255));
		land10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land10.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt10.setText("-");

		javax.swing.GroupLayout land10Layout = new javax.swing.GroupLayout(land10);
		land10.setLayout(land10Layout);
		land10Layout.setHorizontalGroup(land10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land10Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt10, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land10Layout.setVerticalGroup(land10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land10Layout.createSequentialGroup().addContainerGap().addComponent(playerAt10)
						.addContainerGap(42, Short.MAX_VALUE)));

		land11.setBackground(new java.awt.Color(255, 255, 255));
		land11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land11.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt11.setText("-");

		javax.swing.GroupLayout land11Layout = new javax.swing.GroupLayout(land11);
		land11.setLayout(land11Layout);
		land11Layout.setHorizontalGroup(land11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land11Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt11, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land11Layout.setVerticalGroup(land11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land11Layout.createSequentialGroup().addContainerGap().addComponent(playerAt11)
						.addContainerGap(42, Short.MAX_VALUE)));

		land12.setBackground(new java.awt.Color(255, 255, 255));
		land12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land12.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt12.setText("-");

		nameSlot7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot7.setText("Slot 7");

		priceSlot7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot7.setText("$200");

		OwnerAtSlot7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot7.setText("Owner");

		javax.swing.GroupLayout land12Layout = new javax.swing.GroupLayout(land12);
		land12.setLayout(land12Layout);
		land12Layout.setHorizontalGroup(land12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land12Layout.createSequentialGroup().addContainerGap()
						.addGroup(land12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(land12Layout.createSequentialGroup()
										.addComponent(nameSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(priceSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(land12Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(21, 21, 21)
										.addComponent(playerAt12, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(23, 23, 23)))));
		land12Layout.setVerticalGroup(land12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land12Layout.createSequentialGroup().addGap(12, 12, 12)
						.addGroup(land12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt12).addComponent(OwnerAtSlot7))
						.addGap(12, 12, 12)
						.addGroup(land12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(nameSlot7).addComponent(priceSlot7))
						.addContainerGap(14, Short.MAX_VALUE)));

		land13.setBackground(new java.awt.Color(255, 255, 255));
		land13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land13.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt13.setText("-");

		nameSlot8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot8.setText("Slot 8");

		OwnerAtSlot8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot8.setText("Owner");

		priceSlot8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot8.setText("$200");

		javax.swing.GroupLayout land13Layout = new javax.swing.GroupLayout(land13);
		land13.setLayout(land13Layout);
		land13Layout.setHorizontalGroup(land13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land13Layout.createSequentialGroup().addContainerGap()
						.addGroup(land13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(land13Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(playerAt13,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(land13Layout.createSequentialGroup()
										.addComponent(nameSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(priceSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		land13Layout.setVerticalGroup(land13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land13Layout.createSequentialGroup().addGap(12, 12, 12)
						.addGroup(land13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt13).addComponent(OwnerAtSlot8))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
						.addGroup(land13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot8).addComponent(priceSlot8))
						.addContainerGap()));

		land14.setBackground(new java.awt.Color(255, 255, 255));
		land14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land14.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt14.setText("-");

		javax.swing.GroupLayout land14Layout = new javax.swing.GroupLayout(land14);
		land14.setLayout(land14Layout);
		land14Layout.setHorizontalGroup(land14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land14Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land14Layout.setVerticalGroup(land14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land14Layout.createSequentialGroup().addContainerGap().addComponent(playerAt14)
						.addContainerGap(42, Short.MAX_VALUE)));

		land15.setBackground(new java.awt.Color(255, 255, 255));
		land15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land15.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt15.setText("-");

		nameSlot9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot9.setText("Slot 9");

		priceSlot9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot9.setText("$200");

		OwnerAtSlot9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot9.setText("Owner");

		javax.swing.GroupLayout land15Layout = new javax.swing.GroupLayout(land15);
		land15.setLayout(land15Layout);
		land15Layout.setHorizontalGroup(land15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land15Layout.createSequentialGroup().addContainerGap()
						.addGroup(land15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(land15Layout.createSequentialGroup()
										.addComponent(nameSlot9, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(priceSlot9, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										land15Layout.createSequentialGroup()
												.addComponent(OwnerAtSlot9, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,
														Short.MAX_VALUE)
												.addComponent(playerAt15, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE)))));
		land15Layout.setVerticalGroup(land15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land15Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(land15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt15).addComponent(OwnerAtSlot9))
						.addGap(20, 20, 20)
						.addGroup(land15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot9).addComponent(priceSlot9))
						.addContainerGap()));

		land16.setBackground(new java.awt.Color(255, 255, 255));
		land16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land16.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt16.setText("-");

		nameSlot10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot10.setText("Slot 10");

		priceSlot10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot10.setText("$200");

		OwnerAtSlot10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot10.setText("Owner");

		javax.swing.GroupLayout land16Layout = new javax.swing.GroupLayout(land16);
		land16.setLayout(land16Layout);
		land16Layout.setHorizontalGroup(land16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land16Layout.createSequentialGroup().addContainerGap()
						.addGroup(land16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(land16Layout.createSequentialGroup()
										.addComponent(nameSlot10, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(priceSlot10, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(land16Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot10, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20).addComponent(playerAt16,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		land16Layout.setVerticalGroup(land16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land16Layout.createSequentialGroup().addContainerGap()
						.addGroup(land16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt16).addComponent(OwnerAtSlot10))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
						.addGroup(land16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot10).addComponent(priceSlot10))
						.addContainerGap()));

		land17.setBackground(new java.awt.Color(255, 255, 255));
		land17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land17.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt17.setText("-");

		javax.swing.GroupLayout land17Layout = new javax.swing.GroupLayout(land17);
		land17.setLayout(land17Layout);
		land17Layout.setHorizontalGroup(land17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land17Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt17, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land17Layout.setVerticalGroup(land17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land17Layout.createSequentialGroup().addContainerGap().addComponent(playerAt17)
						.addContainerGap(42, Short.MAX_VALUE)));

		land18.setBackground(new java.awt.Color(255, 255, 255));
		land18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land18.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt18.setText("-");

		nameSlot11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot11.setText("Slot 11");

		priceSlot11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot11.setText("$200");

		OwnerAtSlot11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot11.setText("Owner");

		javax.swing.GroupLayout land18Layout = new javax.swing.GroupLayout(land18);
		land18.setLayout(land18Layout);
		land18Layout.setHorizontalGroup(land18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land18Layout.createSequentialGroup().addContainerGap()
						.addGroup(land18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(land18Layout.createSequentialGroup()
										.addComponent(nameSlot11, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(priceSlot11, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(land18Layout.createSequentialGroup()
										.addComponent(OwnerAtSlot11, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(playerAt18,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		land18Layout.setVerticalGroup(land18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land18Layout.createSequentialGroup().addContainerGap()
						.addGroup(land18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt18).addComponent(OwnerAtSlot11))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
						.addGroup(land18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot11).addComponent(priceSlot11))
						.addContainerGap()));

		land19.setBackground(new java.awt.Color(255, 255, 255));
		land19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land19.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt19.setText("-");

		javax.swing.GroupLayout land19Layout = new javax.swing.GroupLayout(land19);
		land19.setLayout(land19Layout);
		land19Layout.setHorizontalGroup(land19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land19Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt19, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land19Layout.setVerticalGroup(land19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land19Layout.createSequentialGroup().addContainerGap().addComponent(playerAt19)
						.addContainerGap(42, Short.MAX_VALUE)));

		land20.setBackground(new java.awt.Color(255, 255, 255));
		land20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land20.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt20.setText("-");

		javax.swing.GroupLayout land20Layout = new javax.swing.GroupLayout(land20);
		land20.setLayout(land20Layout);
		land20Layout.setHorizontalGroup(land20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land20Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt20, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land20Layout.setVerticalGroup(land20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land20Layout.createSequentialGroup().addContainerGap().addComponent(playerAt20)
						.addContainerGap(42, Short.MAX_VALUE)));

		land21.setBackground(new java.awt.Color(255, 255, 255));
		land21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land21.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt21.setText("-");

		javax.swing.GroupLayout land21Layout = new javax.swing.GroupLayout(land21);
		land21.setLayout(land21Layout);
		land21Layout.setHorizontalGroup(land21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land21Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt21, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGap(20, 20, 20)));
		land21Layout.setVerticalGroup(land21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land21Layout.createSequentialGroup().addContainerGap().addComponent(playerAt21)
						.addContainerGap(42, Short.MAX_VALUE)));

		land22.setBackground(new java.awt.Color(255, 255, 255));
		land22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land22.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt22.setText("-");

		nameSlot12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot12.setText("Slot 12");

		priceSlot12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot12.setText("$200");

		OwnerAtSlot12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot12.setText("Owner");

		javax.swing.GroupLayout land22Layout = new javax.swing.GroupLayout(land22);
		land22.setLayout(land22Layout);
		land22Layout.setHorizontalGroup(land22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land22Layout.createSequentialGroup().addContainerGap().addGroup(land22Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(playerAt22, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								land22Layout.createSequentialGroup().addGap(0, 1, Short.MAX_VALUE).addComponent(
										nameSlot12, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(land22Layout.createSequentialGroup()
								.addGroup(land22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(priceSlot12, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(OwnerAtSlot12, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		land22Layout.setVerticalGroup(land22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						land22Layout.createSequentialGroup().addContainerGap().addComponent(nameSlot12)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(priceSlot12)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(playerAt22).addGap(17, 17, 17).addComponent(OwnerAtSlot12)
								.addContainerGap()));

		land23.setBackground(new java.awt.Color(255, 255, 255));
		land23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land23.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt23.setText("-");

		javax.swing.GroupLayout land23Layout = new javax.swing.GroupLayout(land23);
		land23.setLayout(land23Layout);
		land23Layout.setHorizontalGroup(land23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						land23Layout.createSequentialGroup().addContainerGap()
								.addComponent(playerAt23, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
								.addContainerGap()));
		land23Layout.setVerticalGroup(land23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land23Layout.createSequentialGroup().addContainerGap().addComponent(playerAt23)
						.addContainerGap(42, Short.MAX_VALUE)));

		land24.setBackground(new java.awt.Color(255, 255, 255));
		land24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land24.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt24.setText("-");

		nameSlot13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot13.setText("Slot 13");

		priceSlot13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot13.setText("$200");

		OwnerAtSlot13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot13.setText("Owner");

		javax.swing.GroupLayout land24Layout = new javax.swing.GroupLayout(land24);
		land24.setLayout(land24Layout);
		land24Layout.setHorizontalGroup(land24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land24Layout.createSequentialGroup().addContainerGap().addGroup(land24Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(playerAt24, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								land24Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
										nameSlot13, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(land24Layout.createSequentialGroup()
								.addGroup(land24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(priceSlot13, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(OwnerAtSlot13, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		land24Layout.setVerticalGroup(land24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, land24Layout.createSequentialGroup()
						.addContainerGap().addComponent(nameSlot13)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(priceSlot13)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
						.addComponent(playerAt24).addGap(18, 18, 18).addComponent(OwnerAtSlot13).addContainerGap()));

		land25.setBackground(new java.awt.Color(255, 255, 255));
		land25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land25.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt25.setText("-");

		nameSlot14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot14.setText("Slot 14");

		priceSlot14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot14.setText("$200");

		OwnerAtSlot14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot14.setText("Owner");

		javax.swing.GroupLayout land25Layout = new javax.swing.GroupLayout(land25);
		land25.setLayout(land25Layout);
		land25Layout.setHorizontalGroup(land25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land25Layout.createSequentialGroup().addContainerGap().addGroup(land25Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(playerAt25, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addGroup(land25Layout.createSequentialGroup()
								.addGroup(land25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(nameSlot14, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(priceSlot14, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(OwnerAtSlot14, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		land25Layout.setVerticalGroup(land25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						land25Layout.createSequentialGroup().addContainerGap().addComponent(nameSlot14)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(priceSlot14)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(playerAt25).addGap(18, 18, 18).addComponent(OwnerAtSlot14)
								.addGap(12, 12, 12)));

		land26.setBackground(new java.awt.Color(255, 255, 255));
		land26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land26.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt26.setText("-");

		javax.swing.GroupLayout land26Layout = new javax.swing.GroupLayout(land26);
		land26.setLayout(land26Layout);
		land26Layout.setHorizontalGroup(land26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land26Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt26, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addContainerGap()));
		land26Layout.setVerticalGroup(land26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land26Layout.createSequentialGroup().addContainerGap().addComponent(playerAt26)
						.addContainerGap(42, Short.MAX_VALUE)));

		land27.setBackground(new java.awt.Color(255, 255, 255));
		land27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land27.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt27.setText("-");

		nameSlot15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot15.setText("Slot 15");

		priceSlot15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot15.setText("$200");

		OwnerAtSlot15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot15.setText("Owner");

		javax.swing.GroupLayout land27Layout = new javax.swing.GroupLayout(land27);
		land27.setLayout(land27Layout);
		land27Layout.setHorizontalGroup(land27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land27Layout.createSequentialGroup().addContainerGap().addGroup(land27Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(playerAt27, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addGroup(land27Layout.createSequentialGroup()
								.addGroup(land27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(nameSlot15, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(priceSlot15, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(OwnerAtSlot15, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		land27Layout.setVerticalGroup(land27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						land27Layout.createSequentialGroup().addContainerGap().addComponent(nameSlot15)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(priceSlot15)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(playerAt27).addGap(18, 18, 18).addComponent(OwnerAtSlot15)
								.addContainerGap()));

		land28.setBackground(new java.awt.Color(255, 255, 255));
		land28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land28.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt28.setText("-");

		nameSlot16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot16.setText("Slot 16");

		priceSlot16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot16.setText("$200");

		OwnerAtSlot16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot16.setText("Owner");

		javax.swing.GroupLayout land28Layout = new javax.swing.GroupLayout(land28);
		land28.setLayout(land28Layout);
		land28Layout.setHorizontalGroup(land28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land28Layout.createSequentialGroup().addContainerGap().addGroup(land28Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(playerAt28, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								land28Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
										nameSlot16, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(land28Layout.createSequentialGroup()
								.addGroup(land28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(priceSlot16, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(OwnerAtSlot16, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		land28Layout.setVerticalGroup(land28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						land28Layout.createSequentialGroup().addContainerGap().addComponent(nameSlot16)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(priceSlot16)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(playerAt28).addGap(18, 18, 18).addComponent(OwnerAtSlot16)
								.addContainerGap()));

		land29.setBackground(new java.awt.Color(255, 255, 255));
		land29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land29.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt29.setText("-");

		javax.swing.GroupLayout land29Layout = new javax.swing.GroupLayout(land29);
		land29.setLayout(land29Layout);
		land29Layout.setHorizontalGroup(land29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land29Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt29, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addContainerGap()));
		land29Layout.setVerticalGroup(land29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land29Layout.createSequentialGroup().addContainerGap().addComponent(playerAt29)
						.addContainerGap(42, Short.MAX_VALUE)));

		land30.setBackground(new java.awt.Color(255, 255, 255));
		land30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land30.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt30.setText("-");

		javax.swing.GroupLayout land30Layout = new javax.swing.GroupLayout(land30);
		land30.setLayout(land30Layout);
		land30Layout.setHorizontalGroup(land30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land30Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt30, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addContainerGap()));
		land30Layout.setVerticalGroup(land30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land30Layout.createSequentialGroup().addContainerGap().addComponent(playerAt30)
						.addContainerGap(42, Short.MAX_VALUE)));

		land31.setBackground(new java.awt.Color(255, 255, 255));
		land31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land31.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt31.setText("-");

		javax.swing.GroupLayout land31Layout = new javax.swing.GroupLayout(land31);
		land31.setLayout(land31Layout);
		land31Layout.setHorizontalGroup(land31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land31Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt31, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addContainerGap()));
		land31Layout.setVerticalGroup(land31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land31Layout.createSequentialGroup().addContainerGap().addComponent(playerAt31)
						.addContainerGap(42, Short.MAX_VALUE)));

		land32.setBackground(new java.awt.Color(255, 255, 255));
		land32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land32.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt32.setText("-");

		nameSlot17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot17.setText("Slot 17");

		priceSlot17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot17.setText("$200");

		OwnerAtSlot17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot17.setText("Owner");

		javax.swing.GroupLayout land32Layout = new javax.swing.GroupLayout(land32);
		land32.setLayout(land32Layout);
		land32Layout.setHorizontalGroup(land32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land32Layout.createSequentialGroup().addContainerGap().addGroup(land32Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land32Layout.createSequentialGroup()
								.addComponent(playerAt32, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(OwnerAtSlot17, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(19, 19, 19))
						.addGroup(land32Layout.createSequentialGroup()
								.addComponent(nameSlot17, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(priceSlot17, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		land32Layout.setVerticalGroup(land32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land32Layout.createSequentialGroup().addContainerGap()
						.addGroup(land32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt32).addComponent(OwnerAtSlot17))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(land32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot17).addComponent(priceSlot17))
						.addContainerGap(18, Short.MAX_VALUE)));

		land33.setBackground(new java.awt.Color(255, 255, 255));
		land33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land33.setPreferredSize(new java.awt.Dimension(68, 68));

		nameSlot18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot18.setText("Slot 18");

		playerAt33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt33.setText("-");

		priceSlot18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot18.setText("$200");

		OwnerAtSlot18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot18.setText("Owner");

		javax.swing.GroupLayout land33Layout = new javax.swing.GroupLayout(land33);
		land33.setLayout(land33Layout);
		land33Layout.setHorizontalGroup(land33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land33Layout.createSequentialGroup().addContainerGap()
						.addGroup(land33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(playerAt33, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nameSlot18, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(land33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(priceSlot18, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(OwnerAtSlot18, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		land33Layout.setVerticalGroup(land33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land33Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(land33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt33).addComponent(OwnerAtSlot18))
						.addGap(18, 18, 18)
						.addGroup(land33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot18).addComponent(priceSlot18))
						.addContainerGap()));

		land34.setBackground(new java.awt.Color(255, 255, 255));
		land34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land34.setPreferredSize(new java.awt.Dimension(68, 68));

		nameSlot19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot19.setText("Slot 19");

		playerAt34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt34.setText("-");

		priceSlot19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot19.setText("$200");

		OwnerAtSlot19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot19.setText("Owner");

		javax.swing.GroupLayout land34Layout = new javax.swing.GroupLayout(land34);
		land34.setLayout(land34Layout);
		land34Layout.setHorizontalGroup(land34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land34Layout.createSequentialGroup().addContainerGap()
						.addGroup(land34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(playerAt34, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nameSlot19, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(land34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(priceSlot19, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(OwnerAtSlot19, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(16, Short.MAX_VALUE)));
		land34Layout.setVerticalGroup(land34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land34Layout.createSequentialGroup().addContainerGap()
						.addGroup(land34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt34).addComponent(OwnerAtSlot19))
						.addGap(16, 16, 16)
						.addGroup(land34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot19).addComponent(priceSlot19))
						.addContainerGap(12, Short.MAX_VALUE)));

		land35.setBackground(new java.awt.Color(255, 255, 255));
		land35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land35.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt35.setText("-");

		javax.swing.GroupLayout land35Layout = new javax.swing.GroupLayout(land35);
		land35.setLayout(land35Layout);
		land35Layout.setHorizontalGroup(land35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land35Layout
						.createSequentialGroup().addContainerGap().addComponent(playerAt35,
								javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(19, Short.MAX_VALUE)));
		land35Layout.setVerticalGroup(land35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land35Layout.createSequentialGroup().addContainerGap().addComponent(playerAt35)
						.addContainerGap(42, Short.MAX_VALUE)));

		land36.setBackground(new java.awt.Color(255, 255, 255));
		land36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land36.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt36.setText("-");

		nameSlot20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot20.setText("Slot 20");

		priceSlot20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot20.setText("$200");

		OwnerAtSlot20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot20.setText("Owner");

		javax.swing.GroupLayout land36Layout = new javax.swing.GroupLayout(land36);
		land36.setLayout(land36Layout);
		land36Layout.setHorizontalGroup(land36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land36Layout.createSequentialGroup().addContainerGap().addGroup(land36Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land36Layout.createSequentialGroup()
								.addComponent(playerAt36, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(OwnerAtSlot20, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(19, 19, 19))
						.addGroup(land36Layout.createSequentialGroup()
								.addComponent(nameSlot20, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(priceSlot20, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		land36Layout.setVerticalGroup(land36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land36Layout.createSequentialGroup().addContainerGap()
						.addGroup(land36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt36).addComponent(OwnerAtSlot20))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
						.addGroup(land36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot20).addComponent(priceSlot20))
						.addContainerGap()));

		land37.setBackground(new java.awt.Color(255, 255, 255));
		land37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land37.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt37.setText("-");

		nameSlot21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot21.setText("Slot 21");

		priceSlot21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot21.setText("$200");

		OwnerAtSlot21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot21.setText("Owner");

		javax.swing.GroupLayout land37Layout = new javax.swing.GroupLayout(land37);
		land37.setLayout(land37Layout);
		land37Layout.setHorizontalGroup(land37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land37Layout.createSequentialGroup().addContainerGap().addGroup(land37Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land37Layout.createSequentialGroup()
								.addComponent(playerAt37, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addGap(18, 18, 18)
								.addComponent(OwnerAtSlot21, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12))
						.addGroup(land37Layout.createSequentialGroup()
								.addComponent(nameSlot21, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(priceSlot21, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		land37Layout.setVerticalGroup(land37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land37Layout.createSequentialGroup().addContainerGap()
						.addGroup(land37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt37).addComponent(OwnerAtSlot21))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
						.addGroup(land37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot21).addComponent(priceSlot21))
						.addContainerGap()));

		land38.setBackground(new java.awt.Color(255, 255, 255));
		land38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land38.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt38.setText("-");

		nameSlot22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		nameSlot22.setText("Slot 22");

		priceSlot22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		priceSlot22.setText("$200");

		OwnerAtSlot22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		OwnerAtSlot22.setText("Owner");

		javax.swing.GroupLayout land38Layout = new javax.swing.GroupLayout(land38);
		land38.setLayout(land38Layout);
		land38Layout.setHorizontalGroup(land38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land38Layout.createSequentialGroup().addContainerGap().addGroup(land38Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(land38Layout.createSequentialGroup()
								.addComponent(playerAt38, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addGap(18, 18, 18)
								.addComponent(OwnerAtSlot22, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(13, 13, 13))
						.addGroup(land38Layout.createSequentialGroup()
								.addComponent(nameSlot22, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(priceSlot22, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		land38Layout.setVerticalGroup(land38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land38Layout.createSequentialGroup().addContainerGap()
						.addGroup(land38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(playerAt38).addComponent(OwnerAtSlot22))
						.addGap(18, 18, 18)
						.addGroup(land38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nameSlot22).addComponent(priceSlot22))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		land39.setBackground(new java.awt.Color(255, 255, 255));
		land39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		land39.setPreferredSize(new java.awt.Dimension(68, 68));

		playerAt39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		playerAt39.setText("-");

		javax.swing.GroupLayout land39Layout = new javax.swing.GroupLayout(land39);
		land39.setLayout(land39Layout);
		land39Layout.setHorizontalGroup(land39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land39Layout.createSequentialGroup().addContainerGap()
						.addComponent(playerAt39, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addGap(14, 14, 14)));
		land39Layout.setVerticalGroup(land39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(land39Layout.createSequentialGroup().addContainerGap().addComponent(playerAt39)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		diceHolder.setBackground(new java.awt.Color(255, 255, 255));
		diceHolder.setPreferredSize(new java.awt.Dimension(436, 436));

		// Setting basic information for the dice button
		dice.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		dice.setText("DICE");
		dice.setPreferredSize(new java.awt.Dimension(120, 120));
		dice.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				diceActionPerformed(evt);
			}
		});

		turnLL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
		turnLL.setText("PLAYER 1");

		playerTurnLbl.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
		playerTurnLbl.setText("YOUR TURN");

		tradeHolder.setBackground(new java.awt.Color(255, 255, 255));
		tradeHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		uiLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
		uiLabel2.setText("TRADE!");

		uiLabelSlot.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		uiLabelSlot.setText("Slot:");

		uiLabelPrice.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		uiLabelPrice.setText("Price:");

		tradeSlot.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tradeSlotActionPerformed(evt);
			}
		});

		tradePrice.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tradePriceActionPerformed(evt);
			}
		});

		// Set up basic information for doTrade button
		doTrade.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
		doTrade.setText("DO IT!");
		doTrade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				doTradeActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tradeHolderLayout = new javax.swing.GroupLayout(tradeHolder);
		tradeHolder.setLayout(tradeHolderLayout);
		tradeHolderLayout.setHorizontalGroup(tradeHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tradeHolderLayout.createSequentialGroup()
						.addContainerGap(29, Short.MAX_VALUE)
						.addGroup(tradeHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(uiLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(tradeHolderLayout.createSequentialGroup().addGroup(tradeHolderLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(uiLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(uiLabelSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(tradeHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(tradeSlot).addComponent(tradePrice,
														javax.swing.GroupLayout.PREFERRED_SIZE, 96,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(13, 13, 13).addComponent(doTrade)))
						.addGap(21, 21, 21)));
		tradeHolderLayout.setVerticalGroup(tradeHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tradeHolderLayout.createSequentialGroup().addGap(19, 19, 19)
						.addComponent(uiLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(
								tradeHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(tradeHolderLayout.createSequentialGroup().addGroup(tradeHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(tradeSlot).addComponent(uiLabelSlot,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(18, 18, 18)
												.addGroup(tradeHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(uiLabelPrice,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(tradePrice)))
										.addComponent(doTrade, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(54, Short.MAX_VALUE)));

		uiLabelDice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		uiLabelDice.setText("Result:");

		displayDice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		displayDice.setText("0");

		javax.swing.GroupLayout diceHolderLayout = new javax.swing.GroupLayout(diceHolder);
		diceHolder.setLayout(diceHolderLayout);
		diceHolderLayout.setHorizontalGroup(diceHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(diceHolderLayout.createSequentialGroup().addGap(30, 30, 30).addGroup(diceHolderLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(tradeHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(diceHolderLayout.createSequentialGroup()
								.addGroup(diceHolderLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(dice, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(diceHolderLayout.createSequentialGroup().addComponent(uiLabelDice)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(displayDice, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGap(36, 36, 36).addGroup(
										diceHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(turnLL).addComponent(playerTurnLbl))))
						.addContainerGap(23, Short.MAX_VALUE)));
		diceHolderLayout.setVerticalGroup(diceHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(diceHolderLayout.createSequentialGroup().addGap(32, 32, 32)
						.addGroup(diceHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(diceHolderLayout.createSequentialGroup()
										.addComponent(playerTurnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(turnLL, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(diceHolderLayout.createSequentialGroup()
										.addComponent(dice, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(diceHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
												.addComponent(uiLabelDice, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(displayDice))))
						.addGap(20, 20, 20)
						.addComponent(tradeHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)));

		javax.swing.GroupLayout MapHolderLayout = new javax.swing.GroupLayout(MapHolder);
		MapHolder.setLayout(MapHolderLayout);
		MapHolderLayout.setHorizontalGroup(MapHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(MapHolderLayout.createSequentialGroup().addGap(0, 10, Short.MAX_VALUE)
						.addGroup(MapHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(MapHolderLayout.createSequentialGroup().addGroup(MapHolderLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(land35, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(land34, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(MapHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(land33, javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE)
														.addComponent(land32, javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE))
												.addComponent(land38, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(land37, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(land36, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(diceHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(38, 38, 38)
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(land17, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(land14, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(land12, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
												.addComponent(land13, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
												.addComponent(land15, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
												.addComponent(land16, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
												.addComponent(land18, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
								.addGroup(MapHolderLayout.createSequentialGroup()
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(land0, javax.swing.GroupLayout.DEFAULT_SIZE, 72,
														Short.MAX_VALUE)
												.addComponent(land39, javax.swing.GroupLayout.DEFAULT_SIZE, 72,
														Short.MAX_VALUE))
										.addGap(0, 0, Short.MAX_VALUE)
										.addComponent(land1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land6, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land7, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land8, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MapHolderLayout
														.createSequentialGroup()
														.addComponent(land9, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, 0).addComponent(land10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(land11, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(MapHolderLayout.createSequentialGroup()
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(MapHolderLayout.createSequentialGroup()
														.addComponent(land30, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, 0).addComponent(land29,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(land31, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, 0)
										.addComponent(land28, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land27, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land26, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land25, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land24, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land23, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)
										.addComponent(land22, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MapHolderLayout
														.createSequentialGroup()
														.addComponent(land21, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, 0).addComponent(land20,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(MapHolderLayout.createSequentialGroup().addGap(68, 68, 68)
														.addComponent(land19, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))))));
		MapHolderLayout.setVerticalGroup(MapHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(MapHolderLayout.createSequentialGroup().addGroup(MapHolderLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(MapHolderLayout.createSequentialGroup().addGroup(MapHolderLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(land0, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(land4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(land7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(land9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(land10, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(MapHolderLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addGroup(MapHolderLayout.createSequentialGroup()
												.addComponent(land11, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land12, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land13, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land14, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land15, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land16, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0).addComponent(land17,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(MapHolderLayout.createSequentialGroup()
												.addComponent(land39, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(0, 0, 0)
												.addComponent(land38, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land37, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land36, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land35, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0)
												.addComponent(land34, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, 0).addComponent(land33,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, 0).addGroup(
										MapHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(land18, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(land32, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(MapHolderLayout.createSequentialGroup()
								.addGroup(MapHolderLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(land8, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
										.addComponent(land6, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
										.addComponent(land5, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
										.addComponent(land3, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
										.addComponent(land2, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
										.addComponent(land1, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
								.addGap(43, 43, 43).addComponent(diceHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(MapHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(MapHolderLayout.createSequentialGroup()
										.addComponent(land19, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE).addComponent(land20,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MapHolderLayout
										.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addGroup(MapHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MapHolderLayout
														.createSequentialGroup()
														.addComponent(land31, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, 0)
														.addGroup(MapHolderLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(land21,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(land23,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(land26,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(land29,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(land30,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MapHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(land27,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE)
														.addComponent(land28,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE)
														.addComponent(land25,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE)
														.addComponent(land24,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE)
														.addComponent(land22,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 118,
																Short.MAX_VALUE)))))));

		uiHolder.setBackground(new java.awt.Color(255, 255, 255));
		uiHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		uiTitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
		uiTitle.setText("Player Information");

		uiLabelPlayer1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		uiLabelPlayer1.setForeground(new java.awt.Color(204, 0, 0));
		uiLabelPlayer1.setText("Player 1");

		uiLabelMoneyPlayer1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelMoneyPlayer1.setText("Money:");

		uiLabelPositionPlayer1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelPositionPlayer1.setText("Position:");

		uiLabelStatusPlayer1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelStatusPlayer1.setText("Status:");

		displayPositionP1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayPositionP1.setText("0");

		displayMoneyP1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayMoneyP1.setText("$0");

		displayStatusP1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayStatusP1.setText("Alive");

		uiLabelPlayer2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		uiLabelPlayer2.setForeground(new java.awt.Color(255, 153, 0));
		uiLabelPlayer2.setText("Player 2");

		uiLabelMoneyPlayer2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelMoneyPlayer2.setText("Money:");

		uiLabelPositionPlayer2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelPositionPlayer2.setText("Position:");

		uiLabelStatusPlayer2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelStatusPlayer2.setText("Status:");

		displayMoneyP2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayMoneyP2.setText("$0");

		displayPositionP2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayPositionP2.setText("0");

		displayStatusP2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayStatusP2.setText("Alive");

		uiLabelPlayer3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		uiLabelPlayer3.setForeground(new java.awt.Color(0, 153, 51));
		uiLabelPlayer3.setText("Player 3");

		uiLabelMoneyPlayer3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelMoneyPlayer3.setText("Money:");

		uiLabelPositionPlayer3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelPositionPlayer3.setText("Position:");

		uiLabelStatusPlayer3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelStatusPlayer3.setText("Status:");

		displayMoneyP3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayMoneyP3.setText("$0");

		displayPositionP3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayPositionP3.setText("0");

		displayStatusP3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayStatusP3.setText("Alive");

		uiLabelPlayer4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		uiLabelPlayer4.setForeground(new java.awt.Color(0, 102, 255));
		uiLabelPlayer4.setText("Player 4");

		uiLabelMoneyPlayer4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelMoneyPlayer4.setText("Money:");

		uiLabelPositionPlayer4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelPositionPlayer4.setText("Position:");

		uiLabelStatusPlayer4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		uiLabelStatusPlayer4.setText("Status:");

		displayMoneyP4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayMoneyP4.setText("$0");

		displayPositionP4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayPositionP4.setText("0");

		displayStatusP4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		displayStatusP4.setText("Alive");

		buyCurrentLand.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		buyCurrentLand.setText("Buy it");
		buyCurrentLand.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buyCurrentLandActionPerformed(evt);
			}
		});

		noBuy.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		noBuy.setText("Skip");
		noBuy.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				noBuyActionPerformed(evt);
			}
		});

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout uiHolderLayout = new javax.swing.GroupLayout(uiHolder);
		uiHolder.setLayout(uiHolderLayout);
		uiHolderLayout.setHorizontalGroup(uiHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(uiHolderLayout.createSequentialGroup().addGap(175, 175, 175).addComponent(
										uiTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 297,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														uiHolderLayout.createSequentialGroup().addGap(27, 27, 27)
																.addComponent(uiLabelPlayer1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 139,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(uiHolderLayout.createSequentialGroup().addContainerGap()
														.addGroup(uiHolderLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(uiLabelMoneyPlayer1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(uiLabelPositionPlayer1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(uiLabelStatusPlayer1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(uiHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(displayPositionP1,
																javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(displayMoneyP1,
																javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(displayStatusP1,
																javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(buyCurrentLand, javax.swing.GroupLayout.PREFERRED_SIZE,
														219, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(uiLabelPlayer3,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE, 139,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelMoneyPlayer3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelPositionPlayer3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelStatusPlayer3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(uiHolderLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(displayPositionP3,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(displayMoneyP3,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(displayStatusP3,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGap(51, 51, 51)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(uiLabelPlayer2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE, 139,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelMoneyPlayer2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelPositionPlayer2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelStatusPlayer2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(uiHolderLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(displayPositionP2,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(displayMoneyP2,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(displayStatusP2,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(uiHolderLayout.createSequentialGroup().addGroup(uiHolderLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(uiLabelPlayer4,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE, 139,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelMoneyPlayer4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelPositionPlayer4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(uiLabelStatusPlayer4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 111,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(uiHolderLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(displayPositionP4,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(displayMoneyP4,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(displayStatusP4,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addComponent(noBuy, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 219,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(0, 51, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								uiHolderLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
										jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		uiHolderLayout.setVerticalGroup(uiHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(uiHolderLayout.createSequentialGroup().addContainerGap()
						.addComponent(uiTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(uiHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(uiHolderLayout.createSequentialGroup()
										.addComponent(uiLabelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelMoneyPlayer1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayMoneyP1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelPositionPlayer1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayPositionP1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelStatusPlayer1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayStatusP1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(79, 79, 79)
										.addComponent(uiLabelPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelMoneyPlayer3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayMoneyP3, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelPositionPlayer3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayPositionP3, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelStatusPlayer3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayStatusP3, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(uiHolderLayout.createSequentialGroup()
										.addComponent(uiLabelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelMoneyPlayer2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayMoneyP2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelPositionPlayer2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayPositionP2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelStatusPlayer2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayStatusP2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(79, 79, 79)
										.addComponent(uiLabelPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelMoneyPlayer4,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayMoneyP4, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelPositionPlayer4,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayPositionP4, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(uiHolderLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(uiLabelStatusPlayer4,
														javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(displayStatusP4, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGap(58, 58, 58)
						.addGroup(uiHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(noBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(buyCurrentLand, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(143, 143, 143).addComponent(jButton1).addContainerGap()));

		javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
		Body.setLayout(BodyLayout);
		BodyLayout.setHorizontalGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(BodyLayout.createSequentialGroup().addContainerGap()
						.addComponent(MapHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 762,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)
						.addComponent(uiHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		BodyLayout.setVerticalGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(BodyLayout.createSequentialGroup().addContainerGap()
						.addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(MapHolder, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(uiHolder, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(Body, 768, 768, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/*
	 * All listeners for buttons should be performed below. Rule1: All actions are
	 * performed in the controller, in which the controller may call from model.
	 */
	private void diceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_diceActionPerformed
		// TODO add your handling code here:
		c.dice();
	}// GEN-LAST:event_diceActionPerformed

	private void tradeSlotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tradeSlotActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tradeSlotActionPerformed

	private void tradePriceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tradePriceActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tradePriceActionPerformed

	private void doTradeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_doTradeActionPerformed
		// TODO add your handling code here:
		c.trade();
	}// GEN-LAST:event_doTradeActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		// Set the admin panel to visible and establish connection between controller
		// and admin.
		new admin(c).setVisible(true);
	}// GEN-LAST:event_jButton1ActionPerformed

	private void buyCurrentLandActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buyCurrentLandActionPerformed
		// TODO add your handling code here:
		c.option(1);
	}// GEN-LAST:event_buyCurrentLandActionPerformed

	private void noBuyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_noBuyActionPerformed
		// TODO add your handling code here:
		c.option(0);
	}// GEN-LAST:event_noBuyActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel Body;
	private javax.swing.JPanel MapHolder;
	private javax.swing.JLabel OwnerAtSlot0;
	private javax.swing.JLabel OwnerAtSlot1;
	private javax.swing.JLabel OwnerAtSlot10;
	private javax.swing.JLabel OwnerAtSlot11;
	private javax.swing.JLabel OwnerAtSlot12;
	private javax.swing.JLabel OwnerAtSlot13;
	private javax.swing.JLabel OwnerAtSlot14;
	private javax.swing.JLabel OwnerAtSlot15;
	private javax.swing.JLabel OwnerAtSlot16;
	private javax.swing.JLabel OwnerAtSlot17;
	private javax.swing.JLabel OwnerAtSlot18;
	private javax.swing.JLabel OwnerAtSlot19;
	private javax.swing.JLabel OwnerAtSlot2;
	private javax.swing.JLabel OwnerAtSlot20;
	private javax.swing.JLabel OwnerAtSlot21;
	private javax.swing.JLabel OwnerAtSlot22;
	private javax.swing.JLabel OwnerAtSlot3;
	private javax.swing.JLabel OwnerAtSlot4;
	private javax.swing.JLabel OwnerAtSlot5;
	private javax.swing.JLabel OwnerAtSlot6;
	private javax.swing.JLabel OwnerAtSlot7;
	private javax.swing.JLabel OwnerAtSlot8;
	private javax.swing.JLabel OwnerAtSlot9;
	private javax.swing.JButton buyCurrentLand;
	private javax.swing.JButton dice;
	private javax.swing.JPanel diceHolder;
	private javax.swing.JLabel displayDice;
	private javax.swing.JLabel displayMoneyP1;
	private javax.swing.JLabel displayMoneyP2;
	private javax.swing.JLabel displayMoneyP3;
	private javax.swing.JLabel displayMoneyP4;
	private javax.swing.JLabel displayPositionP1;
	private javax.swing.JLabel displayPositionP2;
	private javax.swing.JLabel displayPositionP3;
	private javax.swing.JLabel displayPositionP4;
	private javax.swing.JLabel displayStatusP1;
	private javax.swing.JLabel displayStatusP2;
	private javax.swing.JLabel displayStatusP3;
	private javax.swing.JLabel displayStatusP4;
	private javax.swing.JButton doTrade;
	private javax.swing.JButton jButton1;
	private javax.swing.JPanel land0;
	private javax.swing.JPanel land1;
	private javax.swing.JPanel land10;
	private javax.swing.JPanel land11;
	private javax.swing.JPanel land12;
	private javax.swing.JPanel land13;
	private javax.swing.JPanel land14;
	private javax.swing.JPanel land15;
	private javax.swing.JPanel land16;
	private javax.swing.JPanel land17;
	private javax.swing.JPanel land18;
	private javax.swing.JPanel land19;
	private javax.swing.JPanel land2;
	private javax.swing.JPanel land20;
	private javax.swing.JPanel land21;
	private javax.swing.JPanel land22;
	private javax.swing.JPanel land23;
	private javax.swing.JPanel land24;
	private javax.swing.JPanel land25;
	private javax.swing.JPanel land26;
	private javax.swing.JPanel land27;
	private javax.swing.JPanel land28;
	private javax.swing.JPanel land29;
	private javax.swing.JPanel land3;
	private javax.swing.JPanel land30;
	private javax.swing.JPanel land31;
	private javax.swing.JPanel land32;
	private javax.swing.JPanel land33;
	private javax.swing.JPanel land34;
	private javax.swing.JPanel land35;
	private javax.swing.JPanel land36;
	private javax.swing.JPanel land37;
	private javax.swing.JPanel land38;
	private javax.swing.JPanel land39;
	private javax.swing.JPanel land4;
	private javax.swing.JPanel land5;
	private javax.swing.JPanel land6;
	private javax.swing.JPanel land7;
	private javax.swing.JPanel land8;
	private javax.swing.JPanel land9;
	private javax.swing.JLabel nameSlot0;
	private javax.swing.JLabel nameSlot1;
	private javax.swing.JLabel nameSlot10;
	private javax.swing.JLabel nameSlot11;
	private javax.swing.JLabel nameSlot12;
	private javax.swing.JLabel nameSlot13;
	private javax.swing.JLabel nameSlot14;
	private javax.swing.JLabel nameSlot15;
	private javax.swing.JLabel nameSlot16;
	private javax.swing.JLabel nameSlot17;
	private javax.swing.JLabel nameSlot18;
	private javax.swing.JLabel nameSlot19;
	private javax.swing.JLabel nameSlot2;
	private javax.swing.JLabel nameSlot20;
	private javax.swing.JLabel nameSlot21;
	private javax.swing.JLabel nameSlot22;
	private javax.swing.JLabel nameSlot3;
	private javax.swing.JLabel nameSlot4;
	private javax.swing.JLabel nameSlot5;
	private javax.swing.JLabel nameSlot6;
	private javax.swing.JLabel nameSlot7;
	private javax.swing.JLabel nameSlot8;
	private javax.swing.JLabel nameSlot9;
	private javax.swing.JButton noBuy;
	private javax.swing.JLabel playerAt0;
	private javax.swing.JLabel playerAt1;
	private javax.swing.JLabel playerAt10;
	private javax.swing.JLabel playerAt11;
	private javax.swing.JLabel playerAt12;
	private javax.swing.JLabel playerAt13;
	private javax.swing.JLabel playerAt14;
	private javax.swing.JLabel playerAt15;
	private javax.swing.JLabel playerAt16;
	private javax.swing.JLabel playerAt17;
	private javax.swing.JLabel playerAt18;
	private javax.swing.JLabel playerAt19;
	private javax.swing.JLabel playerAt2;
	private javax.swing.JLabel playerAt20;
	private javax.swing.JLabel playerAt21;
	private javax.swing.JLabel playerAt22;
	private javax.swing.JLabel playerAt23;
	private javax.swing.JLabel playerAt24;
	private javax.swing.JLabel playerAt25;
	private javax.swing.JLabel playerAt26;
	private javax.swing.JLabel playerAt27;
	private javax.swing.JLabel playerAt28;
	private javax.swing.JLabel playerAt29;
	private javax.swing.JLabel playerAt3;
	private javax.swing.JLabel playerAt30;
	private javax.swing.JLabel playerAt31;
	private javax.swing.JLabel playerAt32;
	private javax.swing.JLabel playerAt33;
	private javax.swing.JLabel playerAt34;
	private javax.swing.JLabel playerAt35;
	private javax.swing.JLabel playerAt36;
	private javax.swing.JLabel playerAt37;
	private javax.swing.JLabel playerAt38;
	private javax.swing.JLabel playerAt39;
	private javax.swing.JLabel playerAt4;
	private javax.swing.JLabel playerAt5;
	private javax.swing.JLabel playerAt6;
	private javax.swing.JLabel playerAt7;
	private javax.swing.JLabel playerAt8;
	private javax.swing.JLabel playerAt9;
	private javax.swing.JLabel playerTurnLbl;
	private javax.swing.JLabel priceSlot0;
	private javax.swing.JLabel priceSlot1;
	private javax.swing.JLabel priceSlot10;
	private javax.swing.JLabel priceSlot11;
	private javax.swing.JLabel priceSlot12;
	private javax.swing.JLabel priceSlot13;
	private javax.swing.JLabel priceSlot14;
	private javax.swing.JLabel priceSlot15;
	private javax.swing.JLabel priceSlot16;
	private javax.swing.JLabel priceSlot17;
	private javax.swing.JLabel priceSlot18;
	private javax.swing.JLabel priceSlot19;
	private javax.swing.JLabel priceSlot2;
	private javax.swing.JLabel priceSlot20;
	private javax.swing.JLabel priceSlot21;
	private javax.swing.JLabel priceSlot22;
	private javax.swing.JLabel priceSlot3;
	private javax.swing.JLabel priceSlot4;
	private javax.swing.JLabel priceSlot5;
	private javax.swing.JLabel priceSlot6;
	private javax.swing.JLabel priceSlot7;
	private javax.swing.JLabel priceSlot8;
	private javax.swing.JLabel priceSlot9;
	private javax.swing.JPanel tradeHolder;
	private javax.swing.JTextField tradePrice;
	private javax.swing.JTextField tradeSlot;
	private javax.swing.JLabel turnLL;
	private javax.swing.JPanel uiHolder;
	private javax.swing.JLabel uiLabel2;
	private javax.swing.JLabel uiLabelDice;
	private javax.swing.JLabel uiLabelMoneyPlayer1;
	private javax.swing.JLabel uiLabelMoneyPlayer2;
	private javax.swing.JLabel uiLabelMoneyPlayer3;
	private javax.swing.JLabel uiLabelMoneyPlayer4;
	private javax.swing.JLabel uiLabelPlayer1;
	private javax.swing.JLabel uiLabelPlayer2;
	private javax.swing.JLabel uiLabelPlayer3;
	private javax.swing.JLabel uiLabelPlayer4;
	private javax.swing.JLabel uiLabelPositionPlayer1;
	private javax.swing.JLabel uiLabelPositionPlayer2;
	private javax.swing.JLabel uiLabelPositionPlayer3;
	private javax.swing.JLabel uiLabelPositionPlayer4;
	private javax.swing.JLabel uiLabelPrice;
	private javax.swing.JLabel uiLabelSlot;
	private javax.swing.JLabel uiLabelStatusPlayer1;
	private javax.swing.JLabel uiLabelStatusPlayer2;
	private javax.swing.JLabel uiLabelStatusPlayer3;
	private javax.swing.JLabel uiLabelStatusPlayer4;
	private javax.swing.JLabel uiTitle;
	// End of variables declaration//GEN-END:variables

}
