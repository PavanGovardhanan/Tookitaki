package scripts;

import java.io.IOException;

import atu.testng.reports.ATUReports;
import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;

public class Cluster extends Keywords {
	/*
	 * Name : Pavan
	 * Created Date: 27/July/2017 
	 * Modified Date:27/July/2017
	 * Description:
	 * 
	 */
	public static void cluster() throws IOException {
		refreshPage();
		waitForElement(dashboard);
		click(dashboard);
		waitForElement(assemble);
		click(assemble);
		defaultWait();
		waitForElement(assembleNoClusterRunning);
		getText(assembleNoClusterRunning);
		waitForElement(settingsPage);
		jsClickByXPath(settingsPage);
		waitForElement(clusterStatus);
		getText(clusterStatus);
		click(dashboard);
		waitForElement(transform);
		click(transform);
		defaultWait();
		waitForElement(transformNoClusterRunning);
		getText(transformNoClusterRunning);
		jsClickByXPath(settingsPage);
		waitForElement(clusterStatus);
		getText(clusterStatus);
		click(dashboard);
		waitForElement(model);
		click(model);
		waitForElement(addModelUnit);
		click(addModelUnit);
		String dataLocation = Utils.getDataFromTestData("modelUnit", "Training Data Location");
		String unitName = Utils.getDataFromTestData("modelUnit", "Decision Unit Name");
		String desName = Utils.getDataFromTestData("modelUnit", "Description");
		waitForElement(trainingDataLocation);
		sendKeys(trainingDataLocation, dataLocation);
		defaultWait();
		tab();
		waitForElement(decisionUnitName);
		sendKeys(decisionUnitName, unitName+1);
		waitForElement(description);
		sendKeys(description, desName+1);
		waitForElement(infoNextStep);
		click(infoNextStep);
		waitForElement(dependentVariable);
		click(dependentVariable);
		waitForElement(selectDependentVariable);
		click(selectDependentVariable);
		click(modelNextStep);
		waitForElement(analyzerType);
		click(analyzerType);
		click(modelClassification);
		click(optimizationNextStep);
		waitForElement(runModel);
		click(runModel);
		defaultWait();
		waitForElement(modelError);
		getText(modelError);
		click(dashboard);
		waitForElement(pipeline);
		click(pipeline);
		waitForElement(viewPipeline);
		click(viewPipeline);
		waitForElement(runAutomation);
		click(runAutomation);
		waitForElement(processRunAutomation);
		click(processRunAutomation);
		waitForElement(pipelineError);
		getText(pipelineError);
		click(dashboard);
		waitForElement(settings);
		click(settings);
		click(startCluster);
		waitForElement(clusterStartStatus);
		getText(clusterStartStatus);
	
	}

}
