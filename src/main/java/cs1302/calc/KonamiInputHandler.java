package cs1302.calc;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KonamiInputHandler implements KeyListener{
	
	public KonamiInputHandler() {
		
	}
	
	private int placeInCode = 0;
	
	private int [] konamiCode = {
			KeyEvent.VK_UP, KeyEvent.VK_UP, KeyEvent.VK_DOWN, 
			KeyEvent.VK_DOWN, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, 
			KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_B, KeyEvent.VK_A};
	
	//runs through the konami code as keyevents occur
	//if the user presses an incorrect key, the code is reset
	//if the user completes the code calls doKonamiCode method
	public void checkKonami(KeyEvent key) {
		if (key.getKeyCode() == konamiCode[placeInCode]) {
			placeInCode++;
			if (placeInCode == konamiCode.length) {
				doKonamiCode();
				placeInCode = 0;
			}
		} else placeInCode = 0;
	}

	public void keyPressed(KeyEvent key) {
	
	}
	
	@Override
	public void keyReleased(KeyEvent key) {
		checkKonami(key);
	}
	
	private void doKonamiCode() {
		Game game = new Game();
		
	}

	public void keyTyped(KeyEvent key) {
		
	}
	
}
