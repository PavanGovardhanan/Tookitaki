package scripts;
import java.io.IOException;
import org.openqa.selenium.By;
import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class RBLTransformJoin extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void rblTransformJoin() throws IOException {

		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataJoining);
		click(dataJoining);
		waitForElement(join);
		click(join);
		String joinleftInputFile = Utils.getDataFromTestData("rblTransformationJoin1", "Left Input File");
		String joinrightInputFile = Utils.getDataFromTestData("rblTransformationJoin1", "Right Input File");
		String joinleftMapping = Utils.getDataFromTestData("rblTransformationJoin1", "Left Mapping");
		String joinrightMapping = Utils.getDataFromTestData("rblTransformationJoin1", "Right Mapping");
		waitForElement(leftFile);
		sendKeys(leftFile, joinleftInputFile);
		defaultWait();
		tab();
		waitForElement(rightFile);
		sendKeys(rightFile, joinrightInputFile);
		defaultWait();
		tab();
		click(leftColumnMapping);
		wait("2");
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
		waitForElement(joinright);
		click(joinright);
		click(joincancel);
		waitForElement(runFunction);
		click(runFunction);
		pageUp();
		loadElement();
		waitForElement(joinOutputFile1);
		click(joinOutputFile1);
		defaultWait();
		scrollBottom();
		click(close);
	}


}
