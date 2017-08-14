package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLN_Union3 extends Keywords {
	
	
	public static void amlN_Union3() throws IOException {
		String nUnionInputFile2 = Utils.getDataFromTestData("amlTransformationN_UNION", "Input File2");
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataJoining);
		click(dataJoining);
		waitForElement(nUnion);
		click(nUnion);
		waitForElement(inputFile);
		sendKeys(inputFile, nUnionInputFile2);
		defaultWait();
		keyboardArrowDown();
		tab();
		click(addFile);
		waitForElement(inputFile1);
		sendKeys(inputFile1, nUnionInputFile2);
		defaultWait();
		tab();
		click(addFile);
		waitForElement(inputFile2);
		sendKeys(inputFile2, nUnionInputFile2);
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
