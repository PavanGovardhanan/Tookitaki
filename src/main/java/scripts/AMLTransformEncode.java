package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLTransformEncode extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void amlTransformEncode() throws IOException {
		refreshPage();
		String encodeInputFile = Utils.getDataFromTestData("amlTransformationEncode", "Input File");
		String encodeColumn1 = Utils.getDataFromTestData("amlTransformationEncode", "Column 1");
		String encodeColumn2 = Utils.getDataFromTestData("amlTransformationEncode", "Column 2");
		String encodeColumn3 = Utils.getDataFromTestData("amlTransformationEncode", "Column 3");
		String encodeColumn4 = Utils.getDataFromTestData("amlTransformationEncode", "Column 4");
		String encodeColumn5 = Utils.getDataFromTestData("amlTransformationEncode", "Column 5");
		String encodeColumn6 = Utils.getDataFromTestData("amlTransformationEncode", "Column 6");
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(encode);
		click(encode);
		waitForElement(inputFile);
		sendKeys(inputFile, encodeInputFile);
		defaultWait();
		tab();
		waitForElement(selectTransposeColumn);
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, encodeColumn1);
		tab();
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, encodeColumn2);
		tab();
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, encodeColumn3);
		tab();
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, encodeColumn4);
		tab();
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, encodeColumn5);
		tab();
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, encodeColumn6);
		tab();
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(encodeOutputFile);
		getText(encodeOutputFile);
		click(encodeOutputFile);
		defaultWait();
		scrollBottom();
		click(close);
	}


}
