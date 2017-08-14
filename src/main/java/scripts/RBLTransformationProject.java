package scripts;
import java.io.IOException;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;
public class RBLTransformationProject extends Keywords {

	/*
	 * Name : Pavan
	 * Created Date: 02/Aug/17
	 * Modified Date: 02/Aug/17
	 * Description: RBL Transformation
	 * 
	 */
	public static void rblTransformationProject() throws IOException {
		String index1 = Utils.getDataFromTestData("rblTransformationSlide", "Index 1");
		String index2 = Utils.getDataFromTestData("rblTransformationSlide", "Index 2");
		String projectInputFile = Utils.getDataFromTestData("rblTransformationProject", "Input File");
		String columnname1 = Utils.getDataFromTestData("rblTransformationProject", "Column Name1");
		String columnname2 = Utils.getDataFromTestData("rblTransformationProject", "Column Name2");
		String columnname3 = Utils.getDataFromTestData("rblTransformationProject", "Column Name3");
		String columnname4 = Utils.getDataFromTestData("rblTransformationProject", "Column Name4");
		String value1 = Utils.getDataFromTestData("rblTransformationProject", "Value1");
		String value2 = Utils.getDataFromTestData("rblTransformationProject", "Value2");
		String value3 = Utils.getDataFromTestData("rblTransformationProject", "Value3");
		String value4 = Utils.getDataFromTestData("rblTransformationProject", "Value4");
		String value5 = Utils.getDataFromTestData("rblTransformationProject", "Value5");
		String date = Utils.getDataFromTestData("rblTransformationProject", "last_paymt_dt");
		String dateFormat = Utils.getDataFromTestData("rblTransformationProject", "submitteddate");
		refreshPage();
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(project);
		click(project);
		waitForElement(inputFile);
		sendKeys(inputFile, projectInputFile);
		defaultWait();
		tab();
		waitForElement(addProjection);
		click(addProjection);
		click(selectType);
		click(typeFunction);
		waitForElement(columnName);
		sendKeys(columnName, columnname1);
		waitForElement(columnType);
		click(columnType);
		click(columnTypeFunction);
		waitForElement(functionValue);
		actionClick(Config.driver, functionValue);
		waitForElement(datediffFunction);
		click(datediffFunction);
		waitForElement(summaryType);
		click(summaryType);
		keyboardArrowDown();
		tab();
		click(summaryvalue);
		waitForElement(enterSummaryvalue);
		click(enterSummaryvalue);
		waitForElement(summaryType1);
		click(summaryType1);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue1);
		click(summaryvalue1);
		waitForElement(enterSummaryvalue1);
		click(enterSummaryvalue1);
		waitForElement(addProjection1);
		click(addProjection1);
		click(projectionType);
		click(functionType);
		waitForElement(columnName1);
		sendKeys(columnName1, columnname2);
		waitForElement(columnType1);
		click(columnType1);
		click(columnTypeFunction1);
		waitForElement(functionValue1);
		actionClick(Config.driver, functionValue1);
		waitForElement(datediffFunction1);
		click(datediffFunction1);
		waitForElement(summaryType2);
		click(summaryType2);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue2);
		click(summaryvalue2);
		waitForElement(enterSummaryvalue2);
		click(enterSummaryvalue2);
		tab();
		click(summaryType02);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue02);
		click(summaryvalue02);
		waitForElement(enterSummaryvalue02);
		click(enterSummaryvalue02);
		
		waitForElement(addProjection2);
		click(addProjection2);
		click(projectionType2);
		click(functionType2);
		waitForElement(columnName2);
		sendKeys(columnName2, columnname3);
		waitForElement(columnType2);
		click(columnType2);
		click(columnTypeFunction2);
		waitForElement(functionValue2);
		actionClick(Config.driver, functionValue2);
		waitForElement(datediffFunction2);
		click(datediffFunction2);
		waitForElement(summaryType3);
		click(summaryType3);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue3);
		click(summaryvalue3);
		waitForElement(enterSummaryvalue3);
		click(enterSummaryvalue3);
		tab();
		click(summaryType03);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue03);
		click(summaryvalue03);
		waitForElement(enterSummaryvalue03);
		click(enterSummaryvalue03);
		
		waitForElement(addProjection3);
		click(addProjection3);
		click(projectionType3);
		click(functionType3);
		waitForElement(columnName3);
		sendKeys(columnName3, columnname4);
		waitForElement(columnType3);
		click(columnType3);
		click(columnTypeFunction3);
		waitForElement(functionValue3);
		actionClick(Config.driver, functionValue3);
		waitForElement(datediffFunction3);
		click(datediffFunction3);
		waitForElement(summaryType4);
		click(summaryType4);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue4);
		click(summaryvalue4);
		waitForElement(enterSummaryvalue4);
		click(enterSummaryvalue4);
		tab();
		click(summaryType04);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue04);
		click(summaryvalue04);
		waitForElement(enterSummaryvalue04);
		click(enterSummaryvalue04);
		
		waitForElement(addProjection4);
		click(addProjection4);
		click(projectionType4);
		click(functionType4);
		waitForElement(columnsListProject);
		click(columnsListProject);
		waitForElement(dateFormatColumns);
		click(dateFormatColumns);
		waitForElement(formatColumns);
		sendKeys(formatColumns, value4);
		tab();
		waitForElement(dateFormatValues);
		sendKeys(dateFormatValues, date);
		click(addNewColumn);
		waitForElement(dateFormatColumns1);
		click(dateFormatColumns1);
		waitForElement(formatColumns1);
		sendKeys(formatColumns1, value2);
		tab();
		waitForElement(dateFormatValues1);
		sendKeys(dateFormatValues1, date);
		click(addNewColumn);
		waitForElement(dateFormatColumns2);
		click(dateFormatColumns2);
		waitForElement(formatColumns2);
		sendKeys(formatColumns2, value1);
		tab();
		waitForElement(dateFormatValues2);
		sendKeys(dateFormatValues2, dateFormat);
		click(addNewColumn);
		waitForElement(dateFormatColumns3);
		click(dateFormatColumns3);
		waitForElement(formatColumns3);
		sendKeys(formatColumns3, value5);
		tab();
		waitForElement(dateFormatValues3);
		sendKeys(dateFormatValues3, date);
		click(addNewColumn);
		waitForElement(dateFormatColumns4);
		click(dateFormatColumns4);
		waitForElement(formatColumns4);
		sendKeys(formatColumns4, value3);
		tab();
		waitForElement(dateFormatValues4);
		sendKeys(dateFormatValues4, date);
		waitForElement(runFunction);
		click(runFunction);
		pageUp();
		loadElement();
		waitForElement(projectOutputFile);
		click(projectOutputFile);
		scrollBottom();
		click(close);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
