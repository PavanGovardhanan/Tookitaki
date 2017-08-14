package scripts;
import java.io.IOException;
import org.openqa.selenium.By;

import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;
public class RBLTransformAggregate extends Keywords {
	

	/**
	 * Name : Pavan 
	 * Created Date: 01/Aug/2017
	 *  Modified Date:01/Aug/2017
	 * Description: AML Transformation
	 */
	
	public static void rblTransformAggregate() throws IOException {
		//AGGREGATE
				click(dashboard);
				waitForElement(transform);
				click(transform);
				waitForElement(dataRestructuring);
				click(dataRestructuring);
				waitForElement(aggregate);
				click(aggregate);
				String aggregateInputFile = Utils.getDataFromTestData("rblTransformationAggregate", "Input File");
				String columnValue1 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value1");
				String columnValue2 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value2");
				String columnValue3 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value3");
				String columnValue4 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value4");
				String columnValue5 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value5");
				String columnValue6 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value6");
				String columnValue7 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value7");
				String columnValue8 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value8");
				String avgColumnValue1 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value1");
				String avgColumnValue2 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value2");
				String avgColumnValue3 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value3");
				String avgColumnValue4 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value4");
				String avgColumnValue5 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value5");
				waitForElement(inputFile);
				sendKeys(inputFile, aggregateInputFile);
				defaultWait();
				tab();
				click(aggregateGroupByColumns);
				waitForElement(selectgroupColumn);
				click(selectgroupColumn);
				click(aggregateFunction);
				waitForElement(aggregateFunctionSum);
				click(aggregateFunctionSum);
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue1 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue2 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue3 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue4 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue5 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue6 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue7 );
				tab();
				click(columnsList);
				waitForElement(entercolumnsList);
				sendKeys(entercolumnsList,columnValue8 );
				tab();
				waitForElement(addanAggregation);
				click(addanAggregation);
				waitForElement(aggregateFunctionAvg);
				click(aggregateFunctionAvg);
				waitForElement(aggregateFunAvg);
				click(aggregateFunAvg);
				click(columnsList1);
				waitForElement(entercolumnsListAvg);
				sendKeys(entercolumnsListAvg, avgColumnValue1);
				tab();
				click(columnsList1);
				waitForElement(entercolumnsListAvg);
				sendKeys(entercolumnsListAvg, avgColumnValue2);
				tab();
				click(columnsList1);
				waitForElement(entercolumnsListAvg);
				sendKeys(entercolumnsListAvg, avgColumnValue3);
				tab();
				click(columnsList1);
				waitForElement(entercolumnsListAvg);
				sendKeys(entercolumnsListAvg, avgColumnValue4);
				tab();
				click(columnsList1);
				waitForElement(entercolumnsListAvg);
				sendKeys(entercolumnsListAvg, avgColumnValue5);
				tab();
				waitForElement(runFunction);
				click(runFunction);
				pageUp();
				loadElement();
				waitForElement(aggregateOutputFile0);
				click(aggregateOutputFile0);
				defaultWait();
				scrollBottom();
				click(close);
	}


}
