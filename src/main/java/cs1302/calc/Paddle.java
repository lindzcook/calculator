package cs1302.calc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Paddle {
	private int x, y, yDirection, range;
	private boolean isHuman;
	
	public Rectangle paddleRect;
	
	Random rand = new Random();
	
	public Paddle(int x, int y, boolean isHuman) {
		this.x = x;
		this.y = y;
		this.isHuman = isHuman;
		range = (Game.WIDTH * Game.SCALE) / 2; //range at which ai can see the ball. the midpoint of the game screen.
		
		paddleRect = new Rectangle(this.x, this.y, 15, 65);
		
	}	
	
	public void move(int dir, Ball ball) {
		//check if paddle is in bounds
		//if it isn't, bump it back in bounds.
		if(paddleRect.y <= 20) {
			setYDirection(+1);
			paddleRect.y += yDirection;
		}
		else if(paddleRect.y >= Game.HEIGHT * Game.SCALE - 60) {
			setYDirection(-1);
			paddleRect.y += yDirection;
		}
		//if it is, move normally
		else {
			//if isHuman, player is in control.
			if(isHuman) {
				if(dir == 0) {
					setYDirection(-1);
					paddleRect.y += yDirection;
				}
				else if(dir == 1) {
					setYDirection(+1);
					paddleRect.y += yDirection;
				}
			}
			//if !isHuman, ai is in control.
			else if(!isHuman) {
				//if the ball is in range, attempt to intercept ball	
				if (ball.getX() > range) {
					if (ball.getY() < paddleRect.y + 30) {
						setYDirection(-1);
						paddleRect.y += yDirection;
					}
					else if(ball.getY() > paddleRect.y + 30){
						setYDirection(+1);
						paddleRect.y += yDirection;
					}
					else { } //don't move
				}
				//returns paddle to middle if the ball is out of range
				else if(paddleRect.y > (Game.HEIGHT * Game.SCALE) / 2) {
					setYDirection(-1);
					paddleRect.y += yDirection;
				}
				//returns paddle to middle if the ball is out of range
				else if(paddleRect.y < (Game.HEIGHT * Game.SCALE) / 2) {
					setYDirection(+1);
					paddleRect.y += yDirection;
				}
			}
		}	
	}
	
	private void setYDirection(int direction) {
		yDirection = direction;
	}

	public void draw(Graphics g){
		if (isHuman) g.setColor(Color.BLUE);
		else g.setColor(Color.RED);
		g.fillRect(paddleRect.x, paddleRect.y, paddleRect.width, paddleRect.height);
	}
	
}