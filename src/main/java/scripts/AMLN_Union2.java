package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLN_Union2 extends Keywords {
	
	
	public static void amlN_Union2() throws IOException {
		String balanceFractionInputFile = Utils.getDataFromTestData("amlTransformationBalancewithFraction", "Input File");		
		String nUnionInputFile1 = Utils.getDataFromTestData("amlTransformationN_UNION", "Input File 1");
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataJoining);
		click(dataJoining);
		waitForElement(nUnion);
		click(nUnion);
		waitForElement(inputFile);
		sendKeys(inputFile, nUnionInputFile1);
		defaultWait();
		keyboardArrowDown();
		tab();
		click(addFile);
		waitForElement(inputFile1);
		sendKeys(inputFile1, balanceFractionInputFile);
		defaultWait();
		tab();
		click(addFile);
		waitForElement(inputFile2);
		sendKeys(inputFile2, balanceFractionInputFile);
		defaultWait();
		tab();
		click(addFile);
		waitForElement(inputFile3);
		sendKeys(inputFile3, nUnionInputFile1);
		defaultWait();
		tab();
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(nUnionOutputFile);
		getText(nUnionOutputFile);
		click(nUnionOutputFile);
		defaultWait();
		scrollBottom();
		click(close);

	}
}
