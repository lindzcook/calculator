package cs1302.calc;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 *Displays the expression label
 */
public class ExpressionPanel extends JPanel {
	
	public Calculator calc;
	
	public ExpressionPanel(Calculator calc) {
		setPreferredSize(new Dimension(100, 50));
		add(calc.expressionLabel);
		setVisible(true);
	}//closes construtor expression
}//close expression panel