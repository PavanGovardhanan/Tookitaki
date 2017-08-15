package commonMethods;


import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import scripts.AMLBalance_With_Fraction1;
import scripts.AMLBalance_With_Fraction2;
import scripts.AMLBalance_With_Fraction3;
import scripts.AMLBalance_With_Fraction4;
import scripts.AMLFilterPredection1;
import scripts.AMLFilterPredection2;
import scripts.AMLFilterPredection3;
import scripts.AMLFilterPredection4;
import scripts.AMLFilterPredection5;
import scripts.AMLModel;
import scripts.AMLN_Union1;
import scripts.AMLN_Union2;
import scripts.AMLN_Union3;
import scripts.AMLPipeline;
import scripts.AMLTransformEncode;
import scripts.AMLTransformJoin;
import scripts.AMLTransformationProject;
import scripts.Cluster;
import scripts.Explore;
import scripts.Login;
import scripts.MailReport;
import scripts.RBLModel;
import scripts.RBLPipeline;
import scripts.RBLTransform;
import scripts.RBLTransformAggregate;
import scripts.RBLTransformAggregate2;
import scripts.RBLTransformJoin;
import scripts.RBLTransformJoin2;
import scripts.RBLTransformSlide;
import scripts.RBLTransformSplit;
import scripts.RBLTransformTranspose;
import scripts.RBLTransformationProject;
import scripts.Upload;
import scripts.ZipUtils;

//@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Testcases extends Keywords{
	/*public static String propertyFilePath=Utils.getDataFromTestConfig("ATUPropertiesPath").trim();
	{
		System.setProperty("atu.reporter.config", propertyFilePath);
	}*/
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
	@Test(priority=2)
	public static void cluster() throws Exception {
		Cluster.cluster();
	}
	@Test(priority=3)
	public static void explore() throws IOException {
		Explore.explore();
	}
	@Test(priority=4)
	public static void amlTransformEncode() throws IOException {
		AMLTransformEncode.amlTransformEncode();
	}
	@Test(priority=5)
	public static void amlTransformJoin() throws IOException {
		AMLTransformJoin.amlTransformJoin();
	}
	@Test(priority=6)
	public static void amlFilterPredection1() throws IOException {
		AMLFilterPredection1.amlFilterPredection1();
	}
	@Test(priority=7)
	public static void amlFilterPredection2() throws IOException {
		AMLFilterPredection2.amlFilterPredection2();
	}
	@Test(priority=8)
	public static void amlFilterPredection3() throws IOException {
		AMLFilterPredection3.amlFilterPredection3();
	}
	@Test(priority=9)
	public static void amlFilterPredection4() throws IOException {
		AMLFilterPredection4.amlFilterPredection4();
	}
	@Test(priority=10)
	public static void amlFilterPredection5() throws IOException {
		AMLFilterPredection5.amlFilterPredection5();
	}
	@Test(priority=11)
	public static void amlBalance_With_Fraction1() throws IOException {
		AMLBalance_With_Fraction1.amlBalance_With_Fraction1();
	}
	@Test(priority=12)
	public static void amlBalance_With_Fraction2() throws IOException {
		AMLBalance_With_Fraction2.amlBalance_With_Fraction2();
	}
	@Test(priority=13)
	public static void amlBalance_With_Fraction3() throws IOException {
		AMLBalance_With_Fraction3.amlBalance_With_Fraction3();
	}
	@Test(priority=14)
	public static void amlBalance_With_Fraction4() throws IOException {
		AMLBalance_With_Fraction4.amlBalance_With_Fraction4();
	}
	@Test(priority=15)
	public static void amlN_Union1() throws IOException {
		AMLN_Union1.amlN_Union1();
	}
	@Test(priority=16)
	public static void amlN_Union2() throws IOException {
		AMLN_Union2.amlN_Union2();
	}
	@Test(priority=17)
	public static void amlN_Union3() throws IOException {
		AMLN_Union3.amlN_Union3();
	}
	@Test(priority=18)
	public static void amlTransformationProject() throws IOException {
		AMLTransformationProject.amlTransformationProject();
	}
	@Test(priority=19)
	public static void amlModel() throws IOException {
		AMLModel.amlModel();
	}
	//@Test(priority=20)
	public static void rblTransform() throws IOException {
		RBLTransform.rblTransform();
	}
	@Test(priority=21)
	public static void rblTransformationProject() throws IOException {
		RBLTransformationProject.rblTransformationProject();
	}
	@Test(priority=22)
	public static void rblTransformAggregate() throws IOException {
		RBLTransformAggregate.rblTransformAggregate();
	}
	@Test(priority=23)
	public static void rblTransformSlide() throws IOException {
		RBLTransformSlide.rblTransformSlide();
	}
	@Test(priority=24)
	public static void rblTransformAggregate2() throws IOException {
		RBLTransformAggregate2.rblTransformAggregate2();
	}
	@Test(priority=25)
	public static void rblTransformationTranspose() throws IOException {
		RBLTransformTranspose.rblTransformTranspose();
	}
	@Test(priority=26)
	public static void rblTransformJoin() throws IOException {
		RBLTransformJoin.rblTransformJoin();
	}
	@Test(priority=27)
	public static void rblTransformJoin2() throws IOException {
		RBLTransformJoin2.rblTransformJoin2();
	}
	@Test(priority=28)
	public static void rblTransformSplit() throws IOException {
		RBLTransformSplit.rblTransformSplit();
	}
	@Test(priority=29)
	public static void rblModel() throws IOException {
		RBLModel.rblModel();
	}
	/*@Test(priority=30)
	public static void amlPipeline() throws IOException {
		AMLPipeline.amlPipeline();
	}
	@Test(priority=31)
	public static void rblPipeline() throws IOException {
		RBLPipeline.rblPipeline();
	}
	//@Test(priority=32)
	public static void upload() throws IOException {
		Upload.upload();
	}
	//@Test(priority=33)
	public static void zipUtils() throws IOException {
		ZipUtils.zipUtils();
	}
	//@Test(priority=34)
	public static void mailReport() throws IOException {
		MailReport.mailReport();
	}*/

	@AfterClass
	public static void teardown() throws Exception {
		Config.tearDown();
	}
	

}
