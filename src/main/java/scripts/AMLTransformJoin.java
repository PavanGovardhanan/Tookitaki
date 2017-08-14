package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLTransformJoin extends Keywords {
	
	
	public static void amlTransformJoin() throws IOException {
		//JOIN
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataJoining);
				click(dataJoining);
				waitForElement(join);
				click(join);
				String joinleftInputFile = Utils.getDataFromTestData("amlTransformationJoin", "Left Input File");
				String joinrightInputFile = Utils.getDataFromTestData("amlTransformationJoin", "Right Input File");
				String joinleftMapping = Utils.getDataFromTestData("amlTransformationJoin", "Left Mapping");
				String joinrightMapping = Utils.getDataFromTestData("amlTransformationJoin", "Right Mapping");
				String encodeRight = Utils.getDataFromTestData("amlTransformationJoin", "Right Encode");
				waitForElement(leftFile);
				sendKeys(leftFile, joinleftInputFile);
				defaultWait();
				tab();
				waitForElement(rightFile);
				sendKeys(rightFile, joinrightInputFile);
				defaultWait();
				tab();
				click(leftColumnMapping);
				waitForElement(leftColumnMappinginput);
				sendKeys(leftColumnMappinginput, joinleftMapping);
				tab();
				click(rightColumnMapping);
				waitForElement(rightColumnMappinginput);
				sendKeys(rightColumnMappinginput, joinrightMapping);
				tab();
				click(typeofJoin);
				click(fullJoin);
				waitForElement(joinleft);
				click(joinleft);
				waitForElement(joinright1);
				click(joinright1);
				sendKeys(enterRightEncode, encodeRight);
				tab();
				waitForElement(runFunction);
				click(runFunction);
				loadElement();
				waitForElement(joinOutputFile3);
				getText(joinOutputFile3);
				click(joinOutputFile3);
				defaultWait();
				scrollBottom();
				click(close);
	}
}
