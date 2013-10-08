package cs1302.calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;


public class Game extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static final int HEIGHT = 120;
	public static final int WIDTH = 160;
	public static final int SCALE = 3;
	public static int playerScore = 0;
	public static int computerScore = 0;
	public int gameSpeed = 5; // lower is faster
	
	private boolean running = false;
	private PongInputHandler input = new PongInputHandler(this);
	
	Image image;
	Graphics dbg;
	
	Ball ball = new Ball((WIDTH * SCALE)/2,(HEIGHT * SCALE)/2);
	Paddle paddlePlayer = new Paddle(1 + 45 ,(HEIGHT * SCALE)/2, true);
	Paddle paddleComputer = new Paddle((WIDTH * SCALE) - 15 - 45, (HEIGHT * SCALE)/2, false);
	
	public Game() {
		init(this);
	}
	
	public void start() {
		running = true;
	}
	
	public void init(Game game) {
		Thread gt = new Thread(game);
		
		game.setTitle("Secret Pong!");
		game.setSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setBackground(Color.DARK_GRAY);
		game.setFocusable(true);
		game.setResizable(false);
		game.setDefaultCloseOperation(EXIT_ON_CLOSE);
		game.setLocationRelativeTo(null);
		game.setVisible(true);
		
		game.start();
		gt.start();
	}
	
	public void run() {
		while (running) {
			ball.move(paddlePlayer, paddleComputer);
			ball.move(paddlePlayer, paddleComputer);
			//make the paddles move more slowly than the ball
			if(System.nanoTime() % 2 == 0) {
				if (input.down) {
					paddlePlayer.move(1, ball);
				}
				if (input.up) {
					paddlePlayer.move(0, ball);
				}
				paddleComputer.move(1, ball);
				repaint();
			}
			try {
				Thread.sleep(gameSpeed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g) {
		image = createImage(getWidth(), getHeight());
		dbg = image.getGraphics();
		draw(dbg);
		g.drawImage(image, 0, 0, this);
		
	}
	
	public void draw(Graphics g) {
		ball.draw(g);
		paddlePlayer.draw(g);
		paddleComputer.draw(g);
		
		g.drawString("" + computerScore, 1 + 15, 0 + 40);
		g.drawString("" + playerScore, (WIDTH * SCALE) - 15 - 15, 0 + 40);
	}
}
	