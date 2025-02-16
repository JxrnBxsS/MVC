package mvc;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        //Import model
        Model model = new Model();
        //Model go through controller
        Controller controller = new Controller(model);
        //View use Model from controller
        SwingUtilities.invokeLater(() -> new View(controller));
    }
}