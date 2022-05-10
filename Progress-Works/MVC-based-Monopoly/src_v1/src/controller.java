public class controller {
    model m;
    view v;
    admin a;
    
    public void setModel(model m) {
        this.m = m;
    }
	
    public void setView(view v) {
        this.v = v;
    }
    
    public void setAdmin(admin a){
        this.a = a;
    }
    
    public void updateSlot(int s, String n, int p){
        v.udtName(s, n);
        v.udtPrice(s, p);
    }
    
    public void updateMap(int s, String player) {
        v.udtMap(s, player);
    }
    
    public void dice(){
        int d = m.drawDice();
        v.setDice(d);
    }

    
    public void buyControl(){
        v.buyOrPass();
        System.out.println("change status");
    }
    
    public void option(int o){
        buyControl();
        if (o == 1){
            m.processBuy();
        }
    }
    
    public void updateOwner(int s, int p) {
        System.out.println("target" + s);
        v.udtOwner(s, p);
    }
    
    public void updateMoney(int p, int m) {
        v.udtMoney(p, m);
    }
    
    public void locV(int s, int p) {
        v.udtInfo(s, p);
    }

    public void updateNotice(int i) {
        String notice = "PLAYER " + Integer.toString(i);
        v.udtNotice(notice);
    }
    
    public void adminChangeP(int pl, int my, int lc) {
        m.adminPML(pl, my, lc);
    }
    
    public void adminChangeS(int sl, int ow, int pr){
        m.adminSOP(sl, ow, pr);
    }

    public void updatePrice(int sl, int pr) {
        v.udtPrice(sl, pr);
    }
    
    public void adminTurn(int t){
        m.adminT(t);
    }
    
    public void changeStatus(int pl){
        m.Status(pl);
    }
}
