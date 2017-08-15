package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;


import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;

public class RBLModel extends Keywords{
	/**
	 * Name : Pavan
	 * Created Date: 01/Aug/2017
	 * Modified Date:01/Aug/2017
	 * Description:
	 * 
	 */
	public static void rblModel() throws IOException {
		waitForElement(dashboard);
		click(dashboard);
		waitForElement(model);
		click(model);
		waitForElement(addModelUnit);
		click(addModelUnit);
		String dataLocation = Utils.getDataFromTestData("modelUnit", "Training Data Location");
		String desName = Utils.getDataFromTestData("modelUnit", "Description");
		String unitName = Utils.getDataFromTestData("modelUnit", "Decision Unit Name");
		String dataLocationFile = Utils.getDataFromTestData("modelUnit", "Data Location File");
		waitForElement(trainingDataLocation);
		sendKeys(trainingDataLocation, dataLocation);
		defaultWait();
		tab();
		waitForElement(decisionUnitName);
		sendKeys(decisionUnitName, desName);
		waitForElement(description);
		sendKeys(description, desName);
		click(infoNextStep);
		waitForElement(dependentVariable);
		click(dependentVariable);
		click(selectDependentVariable);
		waitForElement(featureSummary0);
		click(featureSummary0);
		waitForElement(featureSummary2);
		click(featureSummary2);
		waitForElement(featureSummary6);
		click(featureSummary6);
		waitForElement(featureSummary7);
		click(featureSummary7);
		waitForElement(featureSummary17);
		click(featureSummary17);
		waitForElement(featureSummary18);
		click(featureSummary18);
		waitForElement(featureSummary28);
		click(featureSummary28);
		waitForElement(featureSummary33);
		click(featureSummary33);
		waitForElement(featureSummary34);
		click(featureSummary34);
		waitForElement(featureSummary35);
		click(featureSummary35);
		waitForElement(featureSummary37);
		click(featureSummary37);
		waitForElement(featureSummary40);
		click(featureSummary40);
		waitForElement(featureSummary41);
		click(featureSummary41);
		waitForElement(featureSummary42);
		click(featureSummary42);
		waitForElement(featureSummary43);
		click(featureSummary43);
		waitForElement(featureSummary45);
		click(featureSummary45);
		waitForElement(featureSummary48);
		click(featureSummary48);
		waitForElement(featureSummary49);
		click(featureSummary49);
		waitForElement(featureSummary50);
		click(featureSummary50);
		waitForElement(featureSummary52);
		click(featureSummary52);
		click(modelNextStep);
		waitForElement(analyzerType);
		click(analyzerType);
		click(modelClassification);
		click(optimizationNextStep);
		waitForElement(runModel);
		click(runModel);
		defaultWait();
		waitForElement(settings);
		click(settings);
		waitForElement(modelStatus);
		getText(modelStatus);
		click(dashboard);
		waitForElement(model);
		click(model);
		waitForElement(viewModel);
		click(viewModel);
		try {
		waitUntilInvisibilityElement(viewRBLModel1);
		mouseOver(Config.driver, viewRBLModel1);
		getText1(viewRBLModel1);
		Assert.fail();
		}catch(Exception e){
		click(viewRBLModel);
		click(featureRelevance);
		click(decisionRules);
		waitForElement(decisionTree);
		click(decisionTree);
		waitForElement(decisionTreeDownload);
		click(decisionTreeDownload);	
		}
		click(viewPredection);
		waitForElement(createPredection);
		click(createPredection);
		waitForElement(inputFile);
		sendKeys(inputFile, unitName);
		waitForElement(addDataLocation);
		sendKeys(addDataLocation, dataLocationFile);
		waitForElement(computemetrics);
		click(computemetrics);
		waitForElement(saveScenario);
		click(saveScenario);
		
	}

}
