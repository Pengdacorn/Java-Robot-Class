import java.awt.Robot;
import java.awt.event.*;

public class HappyTimes {

	public static void main(String args[]) {
		Robot bot = null;
		try{
			bot = new Robot();
		}
		catch (Exception failed) {
			System.err.println("Failed instantiating Robot: " + failed);
		}
		int mask = InputEvent.BUTTON1_DOWN_MASK;
		bot.mouseMove(25, 900);
		bot.mousePress(mask);
		bot.mouseRelease(mask);
      bot.mouseMove(300, 825);
      bot.mousePress(mask);
		bot.mouseRelease(mask);
		}
	)