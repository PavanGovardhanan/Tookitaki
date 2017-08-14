package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLFilterPredection3 extends Keywords {
	
	
	public static void amlFilterPredection3() throws IOException {
		//FILTER
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataCleansing);
				click(dataCleansing);
				waitForElement(filter);
				click(filter);
				String filterInputFile = Utils.getDataFromTestData("amlTransformationFilter", "Input File");
				String predection1 = Utils.getDataFromTestData("amlTransformationFilter", "Predection1");
				String predection2 = Utils.getDataFromTestData("amlTransformationFilter", "Predection2");
				String predection3 = Utils.getDataFromTestData("amlTransformationFilter", "Predection3");
				String predection4 = Utils.getDataFromTestData("amlTransformationFilter", "Predection4");
				String predection5 = Utils.getDataFromTestData("amlTransformationFilter", "Predection5");
				String filterConditionRecord = Utils.getDataFromTestData("amlTransformationFilter", "Filter Data");
				waitForElement(leftFile);
				sendKeys(leftFile, filterInputFile);
				defaultWait();
				tab();
				click(filterColumns);
				waitForElement(SelectFilterColumns);
				sendKeys(SelectFilterColumns, filterConditionRecord);
				tab();
				click(filterCondition);
				waitForElement(selectCondition);
				click(selectCondition);
				waitForElement(enterCondition);
				sendKeys(enterCondition, predection3);
				click(columnstoLeft);
				waitForElement(runFunction);
				click(runFunction);
				loadElement();
				waitForElement(filterOutputFile);
				getText(filterOutputFile);
				click(filterOutputFile);
				defaultWait();
				scrollBottom();
				click(close);
	}
}
