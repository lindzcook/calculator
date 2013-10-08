package cs1302.calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *This class serves as a container for the answer, expression, and binary panels
 */
public class TopNumberPanel extends JPanel {
	
	public Calculator calc;
	public ExpressionPanel ePanel;
	public AnswerPanel aPanel;
	public BinaryPanel bPanel;
	
	public TopNumberPanel(Calculator calc, BinaryPanel bPanel, ExpressionPanel ePanel, AnswerPanel aPanel) {
		setLayout(new BorderLayout());
		this.bPanel = bPanel;
		this.ePanel = ePanel;
		this.aPanel = aPanel;
		add(ePanel, BorderLayout.NORTH);
		add(aPanel, BorderLayout.CENTER);
		add(bPanel, BorderLayout.SOUTH);
		setVisible(true);
		
	}//closes TopNu comstructor

}//TopNumberPanel