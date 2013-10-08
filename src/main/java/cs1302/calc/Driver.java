package cs1302.calc;

/**
 * This class is the entry point into the application.
 */
public class Driver {

    /**≈
     * The main entry point into the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
             Calculator.createAndShowGUI();
          } // run
	});

    } // main

} // Driver