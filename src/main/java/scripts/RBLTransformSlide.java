package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class RBLTransformSlide extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void rblTransformSlide() throws IOException {
		//SLIDE
		String index1 = Utils.getDataFromTestData("rblTransformationSlide", "Index 1");
		String index2 = Utils.getDataFromTestData("rblTransformationSlide", "Index 2");
		String inputFileLocation = Utils.getDataFromTestData("rblTransformationSlide1", "Input File");
		refreshPage();
		waitForElement(dashboard);
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(slide);
		click(slide);
		waitForElement(inputFile);
		sendKeys(inputFile, inputFileLocation);
		defaultWait();
		waitForElement(inputLocation);
		click(inputLocation);
		tab();
		waitForElement(slideGroupByColumns);
		click(slideGroupByColumns);
		defaultWait();
		jsClickByXPath(selectGroupByColumns1);
		click(slideOrderByColumns);
		waitForElement(selectOrderByColumns1);
		click(selectOrderByColumns1);
		waitForElement(afterGrouping);
		click(afterGrouping);
		waitForElement(selectAllRows);
		click(selectAllRows);
		waitForElement(windowRangeIndex1);
		sendKeys(windowRangeIndex1, index1);
		click(windowRangeIndex1True);
		waitForElement(windowRangeIndex2);
		sendKeys(windowRangeIndex2, index2);
		click(windowRangeIndex2True);
		waitForElement(aggregationFunction);
		click(aggregationFunction);
		click(aggregationFunctionAvg);
		click(aggregationcolumns);
		waitForElement(selectAggregationcolumnsAvg);
		click(selectAggregationcolumnsAvg);
		waitForElement(addOne);
		click(addOne);
		waitForElement(windowRangeIndex3);
		sendKeys(windowRangeIndex3, index1);
		click(windowRangeIndex3True);
		waitForElement(windowRangeIndex4);
		sendKeys(windowRangeIndex4, index2);
		click(windowRangeIndex4True);
		waitForElement(aggregationFunction1);
		click(aggregationFunction1);
		click(aggregationFunctionSum1);
		click(aggregationFunctionColumns);
		waitForElement(aggregationFunColumns);
		click(aggregationFunColumns);
		waitForElement(runFunction);
		click(runFunction);
		pageUp();
		loadElement();
		defaultWait();
		waitForElement(slideOutputFile1);
		click(slideOutputFile1);
		defaultWait();
		scrollBottom();
		click(close);
	}


}
