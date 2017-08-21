package scripts;
import java.io.IOException;

import atu.testng.reports.ATUReports;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;
public class Explore extends Keywords {

	/*
	 * Name : Pavan
	 * Created Date: 27/July/2017 
	 * Modified Date:20/July/2017
	 * Description:
	 * 
	 */
	public static void explore() throws IOException {
		refreshPage();
		waitForElement(dashboard);
		click(dashboard);
		defaultWait();
		waitForElement(explore);
		click(explore);
		waitForElement(genericData);
		click(genericData);
		String dataFileName = Utils.getDataFromTestData("searchFiles", "Generic Data");
		String outputFileName = Utils.getDataFromTestData("searchFiles", "Transformation Output");
		waitForElement(searchfiles);
		sendKeys(searchfiles, dataFileName);
		waitForElement(summary);
		click(summary);
		waitForElement(rows);
		getText(rows);
		getText(columns);
		click(schema);
		scrollBottom();
		click(distributionSummary);
		scrollBottom();
		click(coRelation);
		scrollBottom();
		click(close);
		defaultWait();
		waitForElement(transformationOutput);
		click(transformationOutput);
		clearAndType(searchfiles, outputFileName);
		waitForElement(summary);
		click(summary);
		scrollBottom();
		click(schema);
		scrollBottom();
		click(distributionSummary);
		scrollBottom();
		click(coRelation);
		scrollBottom();
		click(close);	
	}
}
