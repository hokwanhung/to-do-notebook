public class main {
    public static void main(String[] args) {
        controller c = new controller();
        model m = new model();
        c.setModel(m);
        view v = new view(c);
        v.labelClass();
        c.setView(v);
        m.setController(c);
        v.iniButton();
        m.initialize();
        v.setVisible(true);
    }
}
