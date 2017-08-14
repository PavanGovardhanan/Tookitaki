package scripts;
import java.io.IOException;
import org.openqa.selenium.By;
import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLBalance_With_Fraction1 extends Keywords {
	
	
	public static void amlBalance_With_Fraction1() throws IOException {
		//Balance_with_Fraction
				String balanceFractionInputFile = Utils.getDataFromTestData("amlTransformationBalancewithFraction", "Input File");
				String className = Utils.getDataFromTestData("amlTransformationBalancewithFraction", "Class Name");
				String dvColumnName = Utils.getDataFromTestData("amlTransformationBalancewithFraction", "Column Name");
				String fraction = Utils.getDataFromTestData("amlTransformationBalancewithFraction", "Fraction");
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataRestructuring);
				click(dataRestructuring);
				waitForElement(balanceWithFraction);
				click(balanceWithFraction);
				waitForElement(inputFile);
				sendKeys(inputFile, balanceFractionInputFile);
				defaultWait();
				keyboardArrowDown();
				keyboardArrowDown();
				keyboardArrowDown();
				keyboardArrowDown();
				tab();
				waitForElement(operation);
				click(operation);
				waitForElement(balanceClass);
				click(balanceClass);
				waitForElement(filterColumns);
				click(filterColumns);
				waitForElement(selectDV);
				sendKeys(selectDV, dvColumnName);
				tab();
				waitForElement(enterClassName);
				sendKeys(enterClassName, className);
				waitForElement(enterFraction);
				sendKeys(enterFraction, fraction);
				waitForElement(samplingType);
				click(samplingType);
				waitForElement(overSampling);
				click(overSampling);
				waitForElement(runFunction);
				click(runFunction);
				loadElement();
				waitForElement(balanceFractionOutputFile);
				getText(balanceFractionOutputFile);
				click(balanceFractionOutputFile);
				defaultWait();
				scrollBottom();
				click(close);
	}
}
