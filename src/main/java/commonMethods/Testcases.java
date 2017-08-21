package commonMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import scripts.RBLTransform;
import scripts.RBLTransformation;
import scripts.Upload;
import scripts.Explore;
import scripts.Cluster;
import scripts.Login;
import scripts.AMLModel;
import scripts.AMLPipeline;
import scripts.AMLTransform;
import scripts.RBLModel;
import scripts.RBLPipeline;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Testcases extends Keywords {
	public static String propertyFilePath=Utils.getDataFromTestConfig("ATUPropertiesPath").trim();
	{
		System.setProperty("atu.reporter.config", propertyFilePath);
	}
	public static String appURL;
	public static String UserloginUserName;
	public static String UserloginPassword;
	public static String url;
	public static String project_Name;
	public static String version_Name;
	public static String environment;
	public static String screenShot_value;
	public static String testNGPath;
	public static String reportsPath;
	public static String testNGXML_Path;

	@BeforeClass
	public static void getDataFromConfig() throws MalformedURLException {
		System.out.println("Enters to @before class");
		appURL = Utils.getDataFromTestConfig("URL");
		UserloginUserName = Utils.getDataFromTestConfig("LoginUsername").trim();
		UserloginPassword = Utils.getDataFromTestConfig("LoginPassword").trim();
		project_Name = Utils.getDataFromTestConfig("Project_Name");
		version_Name = Utils.getDataFromTestConfig("Version_Name");
		environment = Utils.getDataFromTestConfig("Environment");
		reportsPath = Utils.getDataFromTestConfig("Reports Path");
		testNGXML_Path = Utils.getDataFromTestConfig("TestNGXML Path");
		Config.getDriver();
	}
	@Test(priority=1)
	public static void login() throws IOException {
		Login.login();
	}
	//@Test(priority=2)
	public static void cluster() throws Exception {
		Cluster.cluster();
	}
	//@Test(priority=3)
	public static void explore() throws IOException {
		Explore.explore();
	}
	//@Test(priority=4)
	public static void amlTransformation() throws IOException {
		AMLTransform.amlTransform();
	}
	@Test(priority=5)
	public static void amlModel() throws IOException {
		AMLModel.amlModel();
	}
	//@Test(priority=6)
	public static void rblTransformation() throws IOException {
		RBLTransform.rblTransform();
	}
	//@Test(priority=7)
	public static void rblTransformationScenario() throws IOException {
		RBLTransformation.rblTransformation();
	}
	//@Test(priority=8)
	public static void rblModel() throws IOException {
		RBLModel.rblModel();
	}
	//@Test(priority=9)
	public static void amlPipeline() throws IOException {
		AMLPipeline.amlPipeline();
	}
	//@Test(priority=10)
	public static void rblPipeline() throws IOException {
		RBLPipeline.rblPipeline();
	}
	//@Test(priority=11)
	public static void upload() throws IOException {
		Upload.upload();
	}
	
	@AfterClass
	public static void teardown() throws Exception {
		Config.tearDown();
	}

}
