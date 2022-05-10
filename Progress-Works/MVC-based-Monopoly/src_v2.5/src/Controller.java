
public class Controller {
	private View view;
	private Model model;
	
	/*
	 * Functions to establish connections.
	 */
	
	public void setView(View v) {
		this.view = v;
	}
	
	public void setModel(Model m) {
		this.model = m;
	}
	
	/*
	 * Update map info to view
	 */
	public void updatePlayerOnSlotToView (boolean isAdd, int playerIndex, int slotIndex) {
		
	}
	
	public void updateLandInfoToView (int slotIndex, String name, String price) {
		
	}
	
	public void updateLandOwnerToView (int slotIndex, int playerIndex) {
		
	}
	
	public void updateTurnNoticeToView (int nextTurnIndex) {
		
	}
	
	/*
	 * Update player info to view
	 */
	public void updateBalanceToView (int playerIndex, int balance) {
		
	}
	
	public void updatePositionToView (int playerIndex, int position) {
		
	}
	
	public void updateStatusToView (int playerIndex, boolean isNotBankrupted) {
		
	}
}
