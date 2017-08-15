package commonMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTest implements ITestListener{

 public void onFinish(ITestContext arg0) {
  // TODO Auto-generated method stub
  
 }

 public void onStart(ITestContext arg0) {
  // TODO Auto-generated method stub
  
 }

 public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
  // TODO Auto-generated method stub
  
 }

 public void onTestFailure(ITestResult arg0) {
	
	 if((arg0.getStatus()== ITestResult.FAILURE))
	  {
	   String imagePath=Keywords.captureScreenshot(Config.driver, arg0.getName());
	   String image= "http://localhost:8080/screenshots/"+arg0.getName()+".png";
	   Reporter.log("<img src='"+ image + "' height='400' width='600'/> </a>");
	   System.out.println(image);
	  }

 }

 public void onTestSkipped(ITestResult arg0) {
  // TODO Auto-generated method stub
  
 }

 public void onTestStart(ITestResult arg0) {
  // TODO Auto-generated method stub
  
 }

 public void onTestSuccess(ITestResult arg0) {
  // TODO Auto-generated method stub
  
 }
 

}