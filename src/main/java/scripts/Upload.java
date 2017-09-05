package scripts;

import java.io.IOException;

import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;

public class Upload extends Keywords {
	/**
	 * Name : Pavan 
	 * Created Date:01/Aug/2017
	 * Modified Date:09/Jun/2017
	 * Description:
	 * 
	 */
	public static void upload() throws IOException {
		String fileLocation = Utils.getDataFromTestData("uploadFile", "File Location");
		click(dashboard);
		waitForElement(assemble);
		click(assemble);
		waitForElement(uploadCSVFile);
		click(uploadCSVFile);
		defaultWait();
		uploadFileRobot(fileLocation);
		defaultWait();
		waitForElement(calculateSummary);
		click(calculateSummary);
		waitForElement(calcutaleSummaryYes);
		click(calcutaleSummaryYes);
		waitForElement(analyzeSave);
		click(analyzeSave);
		
	}

}
