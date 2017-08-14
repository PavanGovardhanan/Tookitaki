package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class AMLTransformationProject extends Keywords {
	
	
	public static void amlTransformationProject() throws IOException {
		//PROJECT
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataRestructuring);
				click(dataRestructuring);
				waitForElement(project);
				click(project);
				String projectInputFile = Utils.getDataFromTestData("amlTransformationProject", "Input File");
				waitForElement(inputFile);
				sendKeys(inputFile, projectInputFile);
				defaultWait();
				tab();
				waitForElement(addProjection);
				click(addProjection);
				click(selectType);
				click(typeColumnProjection);
				waitForElement(columnsListProject);
				click(columnsListProject);
				waitForElement(removeListProject);
				click(removeListProject);
				waitForElement(runFunction);
				click(runFunction);
				loadElement();
				waitForElement(projectOutputFile1);
				getText(projectOutputFile1);
				click(projectOutputFile1);
				defaultWait();
				scrollBottom();
				click(close);

	}
}
