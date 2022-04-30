public class controller {
	model m;
	view v;
	admin a;

	/*
	 * Set up basic connections between controller, model and view (as well as
	 * admin).
	 */
	public void setModel(model m) {
		this.m = m;
	}

	public void setView(view v) {
		this.v = v;
	}

	public void setAdmin(admin a) {
		this.a = a;
	}

	/*
	 * General update functions
	 */
	// Updating the map panel...
	public void updateSlot(int s, String n, int p) {
		v.udtName(s, n);
		v.udtPrice(s, p);
	}

	public void updateOwner(int s, int p) {
		v.udtOwner(s, p);
	}

	public void updateMap(int s, String playerSum) {
		v.udtMap(s, playerSum);
	}

	public void updateNotice(int i) {
		String notice = "PLAYER " + Integer.toString(i);
		v.udtNotice(notice);
	}

	public void resetTradePanel() {
		v.resetTrade();
	}

	// Updating the players' info panel...

	public void updateMoney(int p, int m) {
		v.udtMoney(p, m);
	}

	public void locV(int s, int p) { // update position
		v.udtInfo(s, p);
	}

	public void updateStatus(int p) { // update player's status
		v.udtStatus(p);
	}

	/*
	 * special functions with purposes
	 */
	public void dice() { // Roll dice
		int d = m.drawDice();
		v.setDice(d);
	}

	public void trade() { // Trade land
		m.doTrade(v.getTradeSlot(), v.getTradePrice());
	}

	public void buyControl() {
		v.buyOrPass(); // perform the buyOrPass() from view, which disables the DICE and enables BUY or
						// PASS
	}

	public void option(int o) {
		buyControl(); // call the above buyControl() function
		if (o == 1) { // if the option = 1, then the user clicks on BUY button and thus perform
						// processBuy() from model.
			m.processBuy();
		} else { // if the player decides to skip (option = 0), then progress the turn.
			m.processTurn();
		}
	}

	/*
	 * showMessageDialog Function on view
	 */
	public void displayMessageDialog(String input) {
		v.messageDialog(input);
	}

	/*
	 * Functions regarding the role of testers (and the admin class)
	 */
	public void adminChangeP(int pl, int my, int lc) {
		m.adminPML(pl, my, lc);
	}

	public void adminChangeS(int sl, int ow, int pr) {
		m.adminSOP(sl, ow, pr);
	}

	public void updatePrice(int sl, int pr) {
		v.udtPrice(sl, pr);
	}

	public void adminTurn(int t) {
		m.adminT(t);
	}

	public void changeStatus(int player){
    	m.Status(player); // use controller to connect back to model
	}
}
