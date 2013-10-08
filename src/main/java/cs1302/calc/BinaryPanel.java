package cs1302.calc;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *This class is the Panel which displays an answer's bits. Can be hidden.
 */
public class BinaryPanel extends JPanel {
	
	public Calculator calc;
	public KonamiInputHandler input;
	
			
	private int[] bitValues = {1, 2, 4, 8, 16, 32, 64, 128,
					256, 512, 1024, 2048, 4096,
					8192, 16384, 32768, 65536, 
					131072, 262144, 524288, 1048576,
					2097152, 4194304, 8388608, 16777216,
					33554432, 67108864, 134217728, 268435456,
					536870912, 1073741824, 2147483647};

			//make all the bitLabels. 
			BitLabel b0 = new BitLabel(bitValues[0]);
			BitLabel b1 = new BitLabel(bitValues[1]);
			BitLabel b2 = new BitLabel(bitValues[2]);
			BitLabel b3 = new BitLabel(bitValues[3]);
			BitLabel b4 = new BitLabel(bitValues[4]);
			BitLabel b5 = new BitLabel(bitValues[5]);
			BitLabel b6 = new BitLabel(bitValues[6]);
			BitLabel b7 = new BitLabel(bitValues[7]);
			BitLabel b8 = new BitLabel(bitValues[8]);
			BitLabel b9 = new BitLabel(bitValues[9]);
			BitLabel b10 = new BitLabel(bitValues[10]);
			BitLabel b11 = new BitLabel(bitValues[11]);
			BitLabel b12 = new BitLabel(bitValues[12]);
			BitLabel b13 = new BitLabel(bitValues[13]);
			BitLabel b14 = new BitLabel(bitValues[14]);
			BitLabel b15 = new BitLabel(bitValues[15]);
			BitLabel b16 = new BitLabel(bitValues[16]);
			BitLabel b17 = new BitLabel(bitValues[17]);
			BitLabel b18 = new BitLabel(bitValues[18]);
			BitLabel b19 = new BitLabel(bitValues[19]);
			BitLabel b20 = new BitLabel(bitValues[20]);
			BitLabel b21 = new BitLabel(bitValues[21]);
			BitLabel b22 = new BitLabel(bitValues[22]);
			BitLabel b23 = new BitLabel(bitValues[23]);
			BitLabel b24 = new BitLabel(bitValues[24]);
			BitLabel b25 = new BitLabel(bitValues[25]);
			BitLabel b26 = new BitLabel(bitValues[26]);
			BitLabel b27 = new BitLabel(bitValues[27]);
			BitLabel b28 = new BitLabel(bitValues[28]);
			BitLabel b29 = new BitLabel(bitValues[29]);
			BitLabel b30 = new BitLabel(bitValues[30]);
			BitLabel b31 = new BitLabel(bitValues[31]);
			
			//create the number markers
			
			JLabel l0 = new JLabel("0");
			JLabel l1 = new JLabel("15");
			JLabel l2 = new JLabel("31");
			
			public BitLabel[] bitLabelArray = {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12,
					b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25,
					b26, b27, b28, b29, b30, b31};

			public BinaryPanel(Calculator calc, KonamiInputHandler input) {
				
				this.input = input;
				this.calc = calc;
				
				int bitFontSize = 25;
				int labelFontSize = 10;
				int gapSize = 15;
				
				//set the font for all bitLabels and add KonamiInputHandlers
				l0.setFont(new Font("Serif", Font.PLAIN, labelFontSize));
				l0.addKeyListener(input);
				l1.setFont(new Font("Serif", Font.PLAIN, labelFontSize));
				l1.addKeyListener(input);
				l2.setFont(new Font("Serif", Font.PLAIN, labelFontSize));
				l2.addKeyListener(input);
				
				b31.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b31.addKeyListener(input);
				b30.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b30.addKeyListener(input);
				b29.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b29.addKeyListener(input);
				b28.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b28.addKeyListener(input);
				b27.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b27.addKeyListener(input);
				
				b26.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b26.addKeyListener(input);
				b25.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b25.addKeyListener(input);
				b24.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b24.addKeyListener(input);
				b23.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b23.addKeyListener(input);
				b22.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b22.addKeyListener(input);
				
				b21.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b21.addKeyListener(input);
				b20.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b20.addKeyListener(input);
				b19.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b19.addKeyListener(input);
				b18.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b18.addKeyListener(input);
				b17.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b17.addKeyListener(input);
				
				b16.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b16.addKeyListener(input);
				b15.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b15.addKeyListener(input);
				b14.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b14.addKeyListener(input);
				b13.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b13.addKeyListener(input);
				b12.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b12.addKeyListener(input);
				b11.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b11.addKeyListener(input);
				
				b10.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b10.addKeyListener(input);
				b9.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b9.addKeyListener(input);
				b8.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b8.addKeyListener(input);
				b7.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b7.addKeyListener(input);
				b6.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b6.addKeyListener(input);
				
				b5.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b5.addKeyListener(input);
				b4.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b4.addKeyListener(input);
				b3.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b3.addKeyListener(input);
				b2.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b2.addKeyListener(input);
				b1.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b1.addKeyListener(input);
				b0.setFont(new Font("Serif", Font.PLAIN, bitFontSize));
				b0.addKeyListener(input);
				
				//format the bitLabels
				GroupLayout layout = new GroupLayout(this);
				setLayout(layout);
				
				layout.setHorizontalGroup(
						layout.createSequentialGroup()
							.addGap(10)
							.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(b31)
									.addComponent(l2)
									)
							.addComponent(b30)
							.addComponent(b29)
							.addComponent(b28)
							
							.addGap(gapSize)
							
							.addComponent(b27)
							.addComponent(b26)
							.addComponent(b25)
							.addComponent(b24)
							
							.addGap(gapSize)
							
							.addComponent(b23)
							.addComponent(b22)
							.addComponent(b21)
							.addComponent(b20)
							
							.addGap(gapSize)
							
							
							.addComponent(b19)
							.addComponent(b18)
							.addComponent(b17)
							.addComponent(b16)
									
							.addGap(gapSize)
							
							
							.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(b15)
									.addComponent(l1))
							.addComponent(b14)
							.addComponent(b13)
							.addComponent(b12)
							
							.addGap(gapSize)
							
							
							.addComponent(b11)
							.addComponent(b10)
							.addComponent(b9)
							.addComponent(b8)
							
							.addGap(gapSize)
							
							.addComponent(b7)
							.addComponent(b6)
							.addComponent(b5)
							.addComponent(b4)
							
							.addGap(gapSize)
							
							.addComponent(b3)
							.addComponent(b2)
							.addComponent(b1)
							.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(b0)
									.addComponent(l0))
							
							
						);
				
				layout.setVerticalGroup(
						layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(b31)
								.addComponent(b30)
								.addComponent(b29)
								.addComponent(b28)
								
								.addGap(gapSize)
								
								.addComponent(b27)
								.addComponent(b26)
								.addComponent(b25)
								.addComponent(b24)
								
								.addGap(gapSize)
								
								.addComponent(b23)
								.addComponent(b22)
								.addComponent(b21)
								.addComponent(b20)
								
								.addGap(gapSize)
								
								.addComponent(b19)
								.addComponent(b18)
								.addComponent(b17)
								.addComponent(b16)
								
								.addGap(gapSize)
								
								.addComponent(b15)
								.addComponent(b14)
								.addComponent(b13)
								.addComponent(b12)
								
								.addGap(gapSize)
								
								.addComponent(b11)
								.addComponent(b10)
								.addComponent(b9)
								.addComponent(b8)
								
								.addGap(gapSize)
								
								.addComponent(b7)
								.addComponent(b6)
								.addComponent(b5)
								.addComponent(b4)
								
								.addGap(gapSize)
								
								.addComponent(b3)
								.addComponent(b2)
								.addComponent(b1)
								.addComponent(b0))
								
							.addGroup(layout.createBaselineGroup(false, true)						
								.addComponent(l2)
								.addComponent(l1)
								.addComponent(l0))
								
						);
				updateBits();
			}//close binary constructor
			
			//updates the bits according to the current value of answer
			public void updateBits() {
				//bitList should be read right to left
				String bitList = Integer.toBinaryString(calc.answer);
				for (int i = 0; i < bitList.length(); i++) {
					bitLabelArray[i].setBit(bitList.charAt(bitList.length() - i - 1));
				}//close for
			}//close update bits
			
			//sets all bits to 0. Used when user presses the "clear" button
			public void clearBits() {
				for (int i = 0; i < bitLabelArray.length; i++) {
					bitLabelArray[i].setBit('0');
				}
			}
			
			/**
			 *This class describes the JLabels which display an answer in binary
			 *displayed on the BitPanel
			 */
			public class BitLabel extends JLabel {
				
				private int bitValue;
				
				public BitLabel(int bitValue) {
					setText("0");
					this.addMouseListener(new BinaryToggleListener());
					this.bitValue = bitValue;
				}//close bitlabel constructo
				
				public void toggle() {
					if (getText().equalsIgnoreCase("1")) {
						setText("0");
						updateAnswer(-bitValue);
					}//if
					else if (this.getText().equalsIgnoreCase("0")) {
						setText("1");
						updateAnswer(bitValue);
					}//close else if
				}//close toggle
				
				public void setBit(char c) {
					String textString = "" + c;
					setText(textString);
				}//close setbit
				
				//changes the value of answer according to the value of the toggled bitLabel
				public void updateAnswer(int bitVal) {
					calc.answer += bitVal;
					calc.answerLabel.setText("" + calc.answer);
				}//close updateAnswer

			public class BinaryToggleListener implements MouseListener {
					@Override 
					public void mouseClicked(MouseEvent m) {

					}
					@Override 
					public void mouseEntered(MouseEvent m) {

					}
					@Override 
					public void mouseExited(MouseEvent m) {

					}
					@Override
					public void mousePressed(MouseEvent m) {

					}
					@Override
					public void mouseReleased(MouseEvent m) {
						toggle();
					}

			}//close binarytoggle
}//closebinary
			
			
}