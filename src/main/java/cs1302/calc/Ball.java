package cs1302.calc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {

	public int x, y, xDirection, yDirection;
	
	public Rectangle ballRect;
	
	Random rand = new Random();
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		
		ballRect = new Rectangle(this.x, this.y, 10, 10);
		
		Random rand = new Random();
		
		//make ball move in a random direction
		//set random x direction
		int randomXDirection = rand.nextInt(2);
		if(randomXDirection == 0) randomXDirection--;
		setXDirection(randomXDirection);
		
		//set random y direction
		int randomYDirection = rand.nextInt(2);
		if(randomYDirection == 0) randomYDirection--;
		setYDirection(randomYDirection);
	}
	
	public void setXDirection(int direction) {
		xDirection = direction;
	}
	
	public void setYDirection(int direction) {
		yDirection = direction;
	}
	
	public int getY() {
		y = ballRect.y;
		return y;
	}
	
	public int getX() {
		x = ballRect.x;
		return x;
	}
	
	public void checkCollision(Paddle paddlePlayer, Paddle paddleComputer) {
		if (this.ballRect.intersects(paddlePlayer.paddleRect)) {
			setXDirection(+1);
		}
		if (this.ballRect.intersects(paddleComputer.paddleRect)) {
			setXDirection(-1);
		}
	}
	
	public void move(Paddle paddlePlayer, Paddle paddleComputer){
		checkCollision(paddlePlayer, paddleComputer);
		ballRect.x += xDirection;
		ballRect.y += yDirection;
		
		if(ballRect.x <= 0) {
			setXDirection(+1);
			Game.playerScore++;
		}
		if(ballRect.x >= Game.WIDTH * Game.SCALE - 10) {
			setXDirection(-1);
			Game.computerScore++;
		}
		if(ballRect.y <= 20) {
			setYDirection(+1);
		}
		if(ballRect.y >= Game.HEIGHT * Game.SCALE - 10) {
			setYDirection(-1);
		}
	}
	
	public void draw(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(ballRect.x, ballRect.y, ballRect.width, ballRect.height);
	}
}