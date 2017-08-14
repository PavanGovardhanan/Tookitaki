package scripts;
import java.io.IOException;
import org.openqa.selenium.By;
import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class RBLTransformSplit extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void rblTransformSplit() throws IOException {

		//SPLIT
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataRestructuring);
				click(dataRestructuring);
				waitForElement(split);
				click(split);
				String splitInputFile = Utils.getDataFromTestData("rblTransformationSplit", "Input File");
				String percentage = Utils.getDataFromTestData("rblTransformationSplit", "Split Percentage");
				waitForElement(inputFile);
				sendKeys(inputFile, splitInputFile);
				defaultWait();
				tab();
				waitForElement(enterFraction);
				sendKeys(enterFraction, percentage);
				click(splitType);
				waitForElement(splitTypeSequential);
				click(splitTypeSequential);
				waitForElement(runFunction);
				click(runFunction);
				pageUp();
				loadElement();
				waitForElement(splitOutputFile);
				click(splitOutputFile);
				defaultWait();
				scrollBottom();
				click(close);
	}


}
