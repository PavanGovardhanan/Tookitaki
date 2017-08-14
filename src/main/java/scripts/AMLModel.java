package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLModel extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Model
	 */
	
	public static void amlModel() throws IOException {
		waitForElement(dashboard);
		click(dashboard);
		waitForElement(model);
		click(model);
		waitForElement(addModelUnit);
		click(addModelUnit);
		String dataLocation = Utils.getDataFromTestData("modelUnit", "Training Data Location1");
		String unitName = Utils.getDataFromTestData("modelUnit", "Decision Unit Name1");
		String desName = Utils.getDataFromTestData("modelUnit", "Description1");
		String threshold = Utils.getDataFromTestData("modelUnit", "Category Threshold");
		waitForElement(trainingDataLocation);
		sendKeys(trainingDataLocation, dataLocation);
		defaultWait();
		tab();
		waitForElement(decisionUnitName);
		sendKeys(decisionUnitName, unitName);
		waitForElement(description);
		sendKeys(description, desName);
		click(infoNextStep);
		waitForElement(dependentVariable);
		click(dependentVariable);
		click(selectDependentVariable1);
		waitForElement(featureSummary00);
		click(featureSummary00);
		waitForElement(featureSummary03);
		click(featureSummary03);
		waitForElement(featureSummary04);
		click(featureSummary04);
		waitForElement(featureSummary09);
		click(featureSummary09);
		click(modelNextStep);
		waitForElement(analyzerType);
		click(analyzerType);
		click(modelClassification);
		click(optimizationNextStep);
		scrollBottom();
		//sendKeys(categoryThreshold, threshold);
		waitForElement(runModel);
		click(runModel);
		defaultWait();
		waitForElement(settings);
		click(settings);
		defaultWait();
		waitForElement(modelStatus);
		getText(modelStatus);
		click(dashboard);
		waitForElement(model);
		click(model);
		waitForElement(viewModel);
		click(viewModel);
		defaultWait();
		refreshPage();
		try {
		waitUntilInvisibilityElement(viewAMLModel1);
		getText(viewAMLModel1);
		waitForElement(viewAMLModel);
		click(viewAMLModel);
		click(featureRelevance);
		click(decisionRules);
		waitForElement(decisionTree);
		click(decisionTree);
		waitForElement(decisionTreeDownload);
		click(decisionTreeDownload);
		}catch(Exception e){
			getText(viewAMLModel1);
			
		}
	}


}
