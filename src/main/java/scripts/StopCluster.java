package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;

public class StopCluster extends Keywords {
	/*
	 * Name : Pavan
	 * Created Date: 27/July/2017 
	 * Modified Date:27/July/2017
	 * Description:
	 * 
	 */
	public static void stopCluster() throws IOException, AWTException {
		waitForElement(settings);
		click(settings);
		waitForElement(stop);
		click(stop);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		defaultWait();
		waitForElement(logout);
		click(logout);
		robot.keyPress(KeyEvent.VK_ENTER);
			
			
		
		
		
		
	}

}
