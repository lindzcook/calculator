package cs1302.calc;

//import statements
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/** 
 * This class represents the GUI for the Calculator app. It is implemented as a 
 * subclass of JPanel and therefore inherits all of JPanel's methods. 
 */
public class Calculator extends JPanel implements ActionListener {
   
   //declarations of variables
    private JButton back, clear, binary, recursion;
    private JButton nine, eight, seven, six, five, four, three, two, one, zero;
    private JButton sub, add, mul, div, pow, fact, lshift, rshift, equal;
    private JPanel top, left, center, right;
    private boolean re, bi;
   	private String[] infix = new String[20];
    private String[] postfix = new String[20];
    public String expression;
    public int answer;
    public JLabel answerLabel, expressionLabel;
    
    public BinaryPanel bPanel;
    public AnswerPanel aPanel;
    public ExpressionPanel ePanel;
    
    //declaration of math objects
    IterativeMath iMath = new IterativeMath();
	RecursiveMath rMath = new RecursiveMath();
	
	//create a konami input handler
	
	KonamiInputHandler input = new KonamiInputHandler();
	
    /** 
     * Constructs a Calculator object 
     */
    public Calculator() {
	
	//holds the expression to be calculated
	expression = " ";
	
	//tracks if the binary panel is showing or not
	bi = true;
	
	
	//layouts
	this.setLayout(new BorderLayout());
	GridLayout griddy = new GridLayout(0,2);
	GridLayout biggrid = new GridLayout(4,1);
	//add panels 
	
	//add panels to the border layout
	this.top = new JPanel(new BorderLayout());
	this.left = new JPanel(griddy);
	this.center = new JPanel(griddy);
	this.right = new JPanel (biggrid);
	
	//add konami listener to panels
	this.addKeyListener(input);
	top.addKeyListener(input);
	left.addKeyListener(input);
	center.addKeyListener(input);
	right.addKeyListener(input);
	
	//add layouts
	this.expressionLabel = new JLabel(expression);
		expressionLabel.addKeyListener(input);
	answerLabel = new JLabel();
	answerLabel.addKeyListener(input);
	answerLabel.setHorizontalTextPosition(JLabel.RIGHT);
	answerLabel.setHorizontalAlignment(JLabel.RIGHT);
	answerLabel.setText("" + answer);
	
	//create the top panel that contains the expression, the answer, and the bits.
	bPanel = new BinaryPanel(this, input);
		bPanel.addKeyListener(input);
	ePanel = new ExpressionPanel(this);
		ePanel.addKeyListener(input);
	aPanel = new AnswerPanel(this, bPanel);
		aPanel.addKeyListener(input);
	
	TopNumberPanel topPanel = new TopNumberPanel(this, bPanel, ePanel, aPanel);
		topPanel.addKeyListener(input);
	
	// initialize all buttons
	this.back = new JButton("BACK");
	this.clear = new JButton("CLEAR");
	this.binary = new JButton("HIDE BINARY");
	this.recursion = new JButton("USE RECURSION");
	re = true;
	this.nine = new JButton("9");
	this.eight = new JButton("8");
	this.seven = new JButton("7");
	this.six = new JButton("6");
	this.five = new JButton("5");
	this.four = new JButton("4");
	this.three = new JButton("3");
	this.two = new JButton("2");
	this.one = new JButton("1");
	this.zero = new JButton("0");
	this.sub = new JButton("-");
	this.add = new JButton("+");
	this.mul = new JButton("*");
	this.div = new JButton("/");
	this.pow = new JButton("^");
	this.fact = new JButton("!");
	this.rshift = new JButton(">>");
	this.lshift = new JButton("<<");
	this.equal = new JButton("=");
	
	
	// add the general event action listener to all buttons
	this.back.addActionListener(this);
	this.clear.addActionListener(this);
	this.binary.addActionListener(this);
	this.recursion.addActionListener(this);
	this.nine.addActionListener(this);
	this.eight.addActionListener(this);
	this.seven.addActionListener(this);
	this.six.addActionListener(this);
	this.five.addActionListener(this);
	this.four.addActionListener(this);
	this.three.addActionListener(this);
	this.two.addActionListener(this);
	this.one.addActionListener(this);
	this.zero.addActionListener(this);
	this.sub.addActionListener(this);
	this.add.addActionListener(this);
	this.mul.addActionListener(this);
	this.div.addActionListener(this);
	this.pow.addActionListener(this);
	this.fact.addActionListener(this);
	this.rshift.addActionListener(this);
	this.lshift.addActionListener(this);
	this.equal.addActionListener(this);
	
	
	// add the konami listener to all buttons
	this.back.addKeyListener(input);
	this.clear.addKeyListener(input);
	this.binary.addKeyListener(input);
	this.recursion.addKeyListener(input);
	this.nine.addKeyListener(input);
	this.eight.addKeyListener(input);
	this.seven.addKeyListener(input);
	this.six.addKeyListener(input);
	this.five.addKeyListener(input);
	this.four.addKeyListener(input);
	this.three.addKeyListener(input);
	this.two.addKeyListener(input);
	this.one.addKeyListener(input);
	this.zero.addKeyListener(input);
	this.sub.addKeyListener(input);
	this.add.addKeyListener(input);
	this.mul.addKeyListener(input);
	this.div.addKeyListener(input);
	this.pow.addKeyListener(input);
	this.fact.addKeyListener(input);
	this.rshift.addKeyListener(input);
	this.lshift.addKeyListener(input);
	this.equal.addKeyListener(input);
	
	
	// add the buttons to the Calculator 
	right.add(this.back);
	right.add(this.clear);
	right.add(this.binary);
	right.add(this.recursion);
	center.add(this.nine);
	center.add(this.eight);
	center.add(this.seven);
	center.add(this.six);
	center.add(this.five);
	center.add(this.four);
	center.add(this.three);
	center.add(this.two);
	center.add(this.one);
	center.add(this.zero);
	left.add(this.add);
	left.add(this.sub);
	left.add(this.mul);
	left.add(this.div);
	left.add(this.pow);
	left.add(this.fact);
	left.add(this.rshift);
	left.add(this.lshift);
	left.add(this.equal);
	
	
	//add other things 
	top.add(topPanel);
	
	
	//add panels
	add(this.top, BorderLayout.NORTH);
	add(this.center, BorderLayout.CENTER);
	add(this.left, BorderLayout.WEST);
	add(this.right, BorderLayout.EAST);
    
    } // Calculator
  
  //general action listener for the buttons
    @Override
	public void actionPerformed(ActionEvent e) {
	
	
	if (e.getSource() == this.recursion) {
	    if(re == false)
		{
		    this.recursion.setText("USE RECURSION");
		    re = true;

		}
	    else
		{
		    this.recursion.setText("USE ITERATION");
		    re = false;

		}
	}//recursion
	
	if (e.getSource() == this.clear){
	    expression = " ";
	    expressionLabel.setText(expression);
	    answer = 0;
	    answerLabel.setText("" + answer);
		bPanel.clearBits();
		
	    
	}//clear
	
	if (e.getSource() == this.back) {
		

	    expression = expression.substring(0, expression.length()-1);
		expressionLabel.setText(expression);
	}//back
	
	if (e.getSource() == this.nine){

		    expression = expression + "9";

	    expressionLabel.setText(expression);

	}//nine
	
	if (e.getSource() == this.eight){

		    expression = expression + "8";

	    expressionLabel.setText(expression);
	}//eight
	
	if (e.getSource() == this.seven){

		    expression = expression + "7";

	    expressionLabel.setText(expression);
	}//seven close
	
	if (e.getSource() == this.six){

		    expression = expression + "6";

	    expressionLabel.setText(expression);
	}//six close
	
	if (e.getSource() == this.five){

		    expression = expression + "5";

	    expressionLabel.setText(expression);
	}//five close
	
	if (e.getSource() == this.four){

		    expression = expression + "4";

	    expressionLabel.setText(expression);
	}//close four
	
	if (e.getSource() == this.three){

		    expression = expression + "3";

	    expressionLabel.setText(expression);
	}//close three
	
	if (e.getSource() == this.two){

		    expression = expression + "2";

	    expressionLabel.setText(expression);
	}//close two
	
	
	if (e.getSource() == this.one){

		    expression = expression + "1";

	    expressionLabel.setText(expression);
	}//close one
	
	if (e.getSource() == this.zero){

		    expression = expression + "0";

	    expressionLabel.setText(expression);
	}//close zero
	
	if (e.getSource() == this.sub){

		    expression = expression + " - ";

	    expressionLabel.setText(expression);
	}//close sub
	
	if (e.getSource() == this.add){

		    expression = expression + " + ";

	    expressionLabel.setText(expression);
	}//close add
	
	if (e.getSource() == this.mul){

		    expression = expression + " * ";

	    expressionLabel.setText(expression);
	}//close mul
	
	
	if (e.getSource() == this.div){

		    expression = expression + " / ";

	    expressionLabel.setText(expression);
	}//close div
	
	
	if (e.getSource() == this.pow){

		    expression = expression + " ^ ";

	    expressionLabel.setText(expression);
	}//close pow
	
	
	if (e.getSource() == this.fact){

		    expression = expression + " !";

	    expressionLabel.setText(expression);
	}//close fact
	
	if (e.getSource() == this.rshift){

		    expression = expression + " > ";

	    expressionLabel.setText(expression);
	}//close rshift
	
	if (e.getSource() == this.lshift){

		    expression = expression + " < ";
	    expressionLabel.setText(expression);
	}//close lshift
	
	if (e.getSource() == this.equal){
		expression = expression.trim();
	    infix = expression.split(" ");
	    
	    
	    postfix = ReversePolishNotation.infixToPostfix(infix);

	    
	    
	    if(re)
	    {
	    try {
	    	answer = ReversePolishNotation.evaluate(iMath, postfix);

		}
		catch (Exception ERROR) {
			System.out.println("ERROR! CLOSING");
			System.exit(0);
		}
	    	}
	    else
	    {
	    
	      try {
	    	answer = ReversePolishNotation.evaluate(rMath, postfix);

		}
		catch (Exception ERROR) {
			System.out.println("ERROR! CLOSING");
			System.exit(0);
		}
	    }
	    
	    answerLabel.setText("" + answer);
		bPanel.clearBits();
		bPanel.updateBits();
	    
	}//close equal 
	
	if (e.getSource() == this.binary){

	    if(!bi)
		{
		    bi = true;
		    this.binary.setText("HIDE BINARY");
		    bPanel.setVisible(true);
		}
	    else
		{
		    this.binary.setText("SHOW BINARY");
		    bi = false;
		    bPanel.setVisible(false);
		}


	}//close binary
	
	
    } // actionPerformed
    
    
    /**
     * Creates and shows the GUI
     * */
    public static void createAndShowGUI() {
	// create and setup the window 
	JFrame frame = new JFrame("Programmer's Calculator!");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// create an instance of the Calculator class and add it to the window 
	Calculator calc = new Calculator();
	frame.add(calc);
	frame.setResizable(false);
	// show the window. 
	frame.pack();
	frame.setVisible(true);
    } // createAndShowGUI
}// Calculator