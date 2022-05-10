
public class Main {

	public static void main(String[] args) {
		// Initialize both three classes.
		Controller control = new Controller();
		Model model = new Model();
		View view = new View();

		// Establish Connections.
		view.setController(control);
		control.setModel(model);
		control.setView(view);
		model.setController(control);

		// Run Initialize commands of the three classes.
		model.initializeGame();
		view.processCommand();
	}

}
