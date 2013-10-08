package cs1302.calc;

import java.awt.Dimension;

import javax.swing.JPanel;

/**
 *displays the answer panel
 */
public class AnswerPanel extends JPanel {
	
	public Calculator calc;
	
	public AnswerPanel(Calculator calc, JPanel bPanel) {
		this.calc = calc;
		setPreferredSize(new Dimension(100, 50));
		add(calc.answerLabel);
		bPanel.setVisible(true);
	}//constructor for AnswerPanel
}//Answer Panel