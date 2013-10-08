package cs1302.calc;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongInputHandler implements KeyListener{
	public boolean up;
	public boolean down;	
	
	public PongInputHandler(Game game) {
		game.addKeyListener(this);
		System.out.println(game);
		System.out.println(this);
	}

	public void releaseAll() {
		up = down = false;
	}

	public void keyPressed(KeyEvent ke) {
		toggle(ke, true);
		
	}

	public void keyReleased(KeyEvent ke) {
		toggle(ke, false);
		
	}

	private void toggle(KeyEvent ke, boolean pressed) {
		
		if(ke.getKeyCode() == KeyEvent.VK_UP) up = pressed;
		if(ke.getKeyCode() == KeyEvent.VK_DOWN) down = pressed;
	}
	
	public void keyTyped(KeyEvent ke) {
		
	}
	
}