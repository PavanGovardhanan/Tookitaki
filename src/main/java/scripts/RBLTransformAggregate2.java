package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class RBLTransformAggregate2 extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void rblTransformAggregate2() throws IOException {
		//AGGREGATE
				refreshPage();
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataRestructuring);
				click(dataRestructuring);
				waitForElement(aggregate);
				click(aggregate);
				String aggregateInputFileLoc = Utils.getDataFromTestData("rblTransformationAggregate1", "Input File");
				String aggregatecolumnValue1 = Utils.getDataFromTestData("rblTransformationAggregate1", "Aggregation Columns Sum");
				String aggregatecolumnValue2 = Utils.getDataFromTestData("rblTransformationAggregate1", "Aggregation Columns Avg");
				waitForElement(inputFile);
				sendKeys(inputFile, aggregateInputFileLoc);
				defaultWait();
				tab();
				defaultWait();
				waitForElement(aggregateGroupByColumns);
				click(aggregateGroupByColumns);
				waitForElement(selectgroupColumn1);
				click(selectgroupColumn1);
				waitForElement(aggregateFunction);
				click(aggregateFunction);
				waitForElement(aggregateFunctionSum);
				click(aggregateFunctionSum);
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,aggregatecolumnValue1 );
				tab();
				waitForElement(addanAggregation);
				click(addanAggregation);
				waitForElement(aggregateFunctionAvg);
				click(aggregateFunctionAvg);
				waitForElement(aggregateFunAvg);
				click(aggregateFunAvg);
				click(columnsList1);
				waitForElement(entercolumnsListAvg);
				sendKeys(entercolumnsListAvg, aggregatecolumnValue2);
				tab();
				waitForElement(runFunction);
				click(runFunction);
				pageUp();
				loadElement();
				waitForElement(aggregateOutputFile);
				click(aggregateOutputFile);
				defaultWait();
				scrollBottom();
				click(close);
	}


}
