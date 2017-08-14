package scripts;
import java.io.IOException;
import org.openqa.selenium.By;
import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class RBLTransformTranspose extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void rblTransformTranspose() throws IOException {
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(transpose);
		click(transpose);
		String transposeInputFile = Utils.getDataFromTestData("rblTransformationTranspose", "Input File");
		String transposecolumn = Utils.getDataFromTestData("rblTransformationTranspose", "Transpose Column");
		waitForElement(inputFile);
		sendKeys(inputFile, transposeInputFile);
		defaultWait();
		tab();
		waitForElement(selectTransposeColumn);
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, transposecolumn);
		tab();
		waitForElement(columnsCarriedOver);
		click(columnsCarriedOver);
		waitForElement(runFunction);
		click(runFunction);
		pageUp();
		loadElement();
		waitForElement(transposeOutputFile);
		click(transposeOutputFile);
		defaultWait();
		scrollBottom();
		click(close);
	}


}
