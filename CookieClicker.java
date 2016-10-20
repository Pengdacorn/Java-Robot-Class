
import java.awt.Robot;
import java.awt.event.*;

public class CookieClicker {

	public static void main(String args[]) {
		Robot bot = null;
		try{
			bot = new Robot();
		}
		catch (Exception failed) {
			System.err.println("Failed instantiating Robot: " + failed);
		}
		int mask = InputEvent.BUTTON1_DOWN_MASK;
		bot.mouseMove(1250, 5);
		bot.mousePress(mask);
		bot.mouseRelease(mask);/*
		//For Gun Blood
		bot.mouseMove(350, 650);
		bot.delay(1900);
		bot.mouseMove(1000, 350);
		bot.mousePress(mask);			// First Head Shot
		bot.mouseRelease(mask);
		bot.mousePress(mask);			// Second Head Shot
		bot.mouseRelease(mask);
		bot.mouseMove(1000, 520);
		bot.delay(100);
		bot.mousePress(mask);			// Third Shot 
		bot.mouseRelease(mask);
		bot.mousePress(mask);			// Fourth Shot
		bot.mouseRelease(mask);
		bot.mousePress(mask);			// Fifth Shot
		bot.mouseRelease(mask);
		bot.mousePress(mask);			// Sixth Shot
		bot.mouseRelease(mask);*/
//	For Cookie Clicker
 		bot.mouseMove(200, 400);
		for(int i = 0; i < 10000; i++){
			bot.mousePress(mask);
			bot.mouseRelease(mask);
			bot.delay(100);
		}
		}
		 }