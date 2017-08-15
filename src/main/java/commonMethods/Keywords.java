package commonMethods;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import commonMethods.Config;
import commonMethods.Testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.relevantcodes.extentreports.model.Log;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

public class Keywords implements OR {
	private static final String True = null;
	public static String ElementWait = "30";
	public static int WaitElementSeconds = new Integer(ElementWait);
	public static String Main_Window = "";
	public static ArrayList<String> tabs;
	public static WebElement fromElement;
	public static ITestResult result;
	public static String report_Filepath = Utils.getDataFromTestConfig("Reports  path");
	public static String date = getCurrentDate();
	public static String folder_name = report_Filepath.concat(date);
	public static String folder_name_subfolder = folder_name.concat("/");
	public static String report_folder_create = folder_name_subfolder;
	public static String report_name = "PocReport";
	public static String filepath_date_concat = folder_name_subfolder.concat(report_name).concat(".html");
	public static String screenshot_folder_name = folder_name_subfolder.concat("Screenshot");
	public static String screenshot_folder_path = screenshot_folder_name.concat("/");
	public static String screenshot_folder_create = screenshot_folder_path;
	public static String firstValue;
	public static String secondValue;

	public static String getCurrentDate() {
		Format formatter = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date date = new Date();
		String value = formatter.format(date);
		return value;
	}
	public static String[] splitXpath(String path) {
		String[] a = path.split(">");
		return a;
	}
	public static void apiTesting() throws Exception {
		try {
		URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221;");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
		throw new RuntimeException("HTTP error code :"+ conn.getResponseCode());
		}

		Scanner scan = new Scanner(url.openStream());
		String entireResponse = new String();
		while (scan.hasNext())
		entireResponse += scan.nextLine();

		//System.out.println("Response :"+entireResponse);
		

		scan.close();

		JSONObject obj = new JSONObject(entireResponse );
		String responseCode = obj.getString("status");
		//System.out.println("status : " + responseCode);
	


		JSONArray arr = obj.getJSONArray("results");
		for (int i = 0; i < arr.length(); i++) {
		String placeid = arr.getJSONObject(i).getString("place_id");
		System.out.println("Place id : " + placeid);
	
		String formatAddress = arr.getJSONObject(i).getString("formatted_address");
		System.out.println("Address :" + formatAddress);
		
		}
		}
		/*//validating Address as per the requirement
		if(formatAddress.equalsIgnoreCase("Chicago, IL, USA"))
		{
		System.out.println("Address is as Expected");
		}
		else
		{
		System.out.println("Address is not as Expected");
		}
		}

		conn.disconnect();
		}*/ catch (MalformedURLException e) {
		e.printStackTrace();

		} catch (IOException e) {

		e.printStackTrace();

		}

		}

	public static void clearCookies() {
		try {
			Config.driver.manage().deleteAllCookies();
			Reporter.log("Clear the cookies", true);
			//ATUReports.add("Clear the cookies", false);

		} catch (Exception e) {
			Reporter.log("Cookies not cleared", false);
			//ATUReports.add("Clear the cookies", LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void get(String url) {
		try {
			Config.driver.get(url);
			Reporter.log("Launch URL:"+url, true);
			//ATUReports.add("Get", url, false);
		} catch (Exception e) {
			Reporter.log("Unable To Launch URL:"+url, false);
			//ATUReports.add("Get", url, LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			Assert.fail();

		}
	}

	public static void click(String path) {
		String[] values = splitXpath(path);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Thread.sleep(500);
			if (webElement.isDisplayed()) {
				webElement.click();
				Reporter.log(values[0]+"is Clicked", true);
				//ATUReports.add("Click - " + values[0], false);
			} else {
				Reporter.log( values[0]+"is not Clicked", true);
				//ATUReports.add("Click - " + values[0], LogAs.FAILED,
						//new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
				Assert.fail();

			}
		} catch (Exception e) {
			Reporter.log(values[0]+"is not Clicked", false);
			//ATUReports.add("Click - " + values[0], LogAs.FAILED,
					//new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			
		}
	}

	public static void jsClickByXPath(String Xpath) {
		String[] values = splitXpath(Xpath);
		try {
			waitForElement(Xpath);
			WebElement element = Config.driver.findElement(By.xpath(values[1]));
			JavascriptExecutor executor = (JavascriptExecutor) Config.driver;
			executor.executeScript("arguments[0].click();", element);
			Reporter.log(values[0]+"is Clicked", true);
			
		} catch (Exception e) {
			Reporter.log(values[0]+"is not Clicked", false);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public static void actionClick(WebDriver driver, String Xpath) {
		String[] values = splitXpath(Xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		try {
			wait("1");
			if (webElement.isEnabled()) {
				Actions action = new Actions(driver);
				action.click(webElement).build().perform();
				Reporter.log(values[0]+"is  Clicked", false);
			} else {
				Reporter.log(values[0]+"is not Clicked", false);
				Assert.fail();
			}
		} catch (StaleElementReferenceException e) {
			Reporter.log(values[0]+"is not Clicked", false);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public static String actionType(WebDriver driver, String xpath, String keysToSend) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			if (webElement.isEnabled()) {
				Actions action = new Actions(driver);
				action.sendKeys(webElement, keysToSend).build().perform();
				Reporter.log(values[0],true);
				//ATUReports.add(values[0], keysToSend, false);
			} else {
				Reporter.log(values[0]+"is not entered", false);
				//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
				Assert.fail();
			}
		} catch (StaleElementReferenceException e) {
			Reporter.log(values[0]+"is not entered", false);
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
		return keysToSend;
	}

	public static void doubleClick(WebDriver driver, String element) {
		String[] values = splitXpath(element);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Actions action = new Actions(driver).doubleClick(webElement);
			action.build().perform();
			//ATUReports.add("Click - " + values[0], false);
		} catch (Exception e) {
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void clear(String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.clear();
			//ATUReports.add(values[0], false);
		} catch (Exception e) {
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static String clearAndType(String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths);
		try {
			Thread.sleep(500);
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.clear();
			webElement.sendKeys(keysToSend);
			Reporter.log("Clear and Type - " + values[0],true);
			//ATUReports.add("Clear and Type - " + values[0], keysToSend, false);
		} catch (InterruptedException e) {
			Reporter.log("Clear and Type - " + values[0],false);
			//ATUReports.add("Clear and Type - " + values[0], keysToSend, LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			Assert.fail();
		}
		return keysToSend;
	}

	public static void mouseOver(WebDriver driver, String element) {
		String[] values = splitXpath(element);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(webElement).build().perform();
			Reporter.log("Mouse over - " +values[0], true);
			//ATUReports.add("Mouse over - " +values[0], false);
		} catch (Exception e) {
			//ATUReports.add("Mouse over - " +values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void mouseOverAndClick(WebDriver driver, String element) {
		String[] values = splitXpath(element);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(webElement).click().build().perform();
		} catch (Exception e) {
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();

		}
	}

	public static String selectByVisibletext(String element, String inputData) {
		String[] values = splitXpath(element);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		try {
			Select selectBox = new Select(webElement);
			selectBox.selectByVisibleText(inputData);

		} catch (Exception e) {
		//	ATUReports.add(values[0], inputData, LogAs.FAILED,
			//		new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();

		}
		return inputData;
	}

	public static String dynamicSendkeysNumbers( String xpaths,String inputData) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			String currenttime = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
			String originalValue = inputData;
			String combinedValues = currenttime + originalValue;
			sendKeys(xpaths, combinedValues);
			return combinedValues;
		} catch (Exception e) {
			//ATUReports.add(values[0], inputData, LogAs.FAILED,
		//			new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
			return null;
		}

	}

	public static String sendKeys(String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.sendKeys(keysToSend);
			Reporter.log(values[0]+"is entered", true);	

		} catch (Exception e) {
			Reporter.log( values[0]+"is not entered", true);
			//ATUReports.add("Type - " + values[0], keysToSend, LogAs.FAILED,
					//new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			Assert.fail();
		}
		return keysToSend;
	}

	public static void clickAt(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Point point = webElement.getLocation();
			int xcord = point.getX();
			System.out.println("Element's Position from left side Is " + xcord + " pixels.");
			int ycord = point.getY();
			new Actions(driver).moveByOffset(xcord, ycord).click().build().perform();
		} catch (Exception e) {
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void clickAndHold(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Actions builder = new Actions(driver);
			builder.clickAndHold(webElement).build().perform();
		} catch (Exception e) {
		//	ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void submit(String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.submit();
		} catch (Exception e) {
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static String getCurrentURL(WebDriver driver) {
		try {
		//	ATUReports.add(driver.getCurrentUrl(), false);
			return driver.getCurrentUrl();
		} catch (Exception e) {

			//ATUReports.add("URL not Retrived", LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
			return null;
		}
	}


	public static void selectCheckBox(String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement element = Config.driver.findElement(By.xpath(values[1]));
			if (element.isSelected()) {
			} else {
				element.click();
			}
		} catch (Exception e) {
		}
	}

	public static void deSelectCheckBox(String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement element = Config.driver.findElement(By.xpath(values[1]));
			if (element.isSelected()) {
				element.click();
			} else {
			}
		} catch (Exception e) {
		}
	}

	public static void selectByIndex(String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Integer index = new Integer(inputData);
			Select selectBox = new Select(webElement);
			selectBox.selectByIndex(index);
		} catch (Exception e) {
			//ATUReports.add(values[0], inputData, LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void selectByValue(String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		try {

			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) Config.driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement,
					"color: red; border: 3px solid red;");
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
			Select selectBox = new Select(webElement);
			selectBox.selectByValue(inputData);
		//	ATUReports.add("Select - " + values[0], inputData, false);
		} catch (Exception e) {
			//ATUReports.add("Select - " + values[0], inputData, LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void deSelectByIndex(String xpath, String inputData) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Integer index = new Integer(inputData);
			Select selectBox = new Select(webElement);
			selectBox.deselectByIndex(index);
		//	ATUReports.add(values[0], inputData, false);
		} catch (Exception e) {
			//ATUReports.add(values[0], inputData, LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void deSelectByValue(String xpath, String inputData) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			Select selectBox = new Select(webElement);
			selectBox.deselectByValue(inputData);
			//ATUReports.add(values[0], inputData, false);
		} catch (Exception e) {
		//	ATUReports.add(values[0], inputData, LogAs.FAILED,
			//		new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	/*
	 * public static void getWindow(WebDriver driver, String path) {
	 * waitTime(Config.driver, "5"); Main_Window = driver.getWindowHandle();
	 * String[] values=splitXpath(path); try { WebElement
	 * webElement=Config.driver.findElement(By.xpath(values[1]));
	 * webElement.click(); Thread.sleep(500);
	 * 
	 * } catch (InterruptedException e) { e.printStackTrace(); }
	 * ArrayList<String> allWindows = new
	 * ArrayList<String>(driver.getWindowHandles());
	 * driver.switchTo().window(allWindows.get(1)); }
	 */
	public static void getWindow(WebDriver driver, String path) {
		try {
			waitTime(Config.driver, "5");
			Main_Window = driver.getWindowHandle();
			String[] values = splitXpath(path);
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.click();
			Thread.sleep(500);
			ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allWindows.get(1));
		} catch (InterruptedException e) {
		}
	}

	public static void switchWindow() {
		try {
			Config.driver.switchTo().window(Main_Window);
		} catch (Exception e) {
		}
	}

	public static void switchDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
		/*
		 * try { Thread.sleep(1000); } catch(InterruptedException e) {
		 * e.printStackTrace(); }
		 */
	}

	public static void getAutoit(String exePath) {
		try {
			Runtime.getRuntime().exec(exePath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void wait(String inputData) {
		try {
			int time = Integer.parseInt(inputData);
			int seconds = time * 1000;
			Thread.sleep(seconds);
			Reporter.log("Waited for element",true);
			//ATUReports.add("Waited for element", inputData, false);
		} catch (InterruptedException e) {
			Reporter.log("Waited for element",false);
			//ATUReports.add("Wait for element", inputData, LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public static void defaultWait() {
		wait("5");
	}
	public static void loadElement() {
		wait("30");
	}

	public static void dragElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		fromElement = webElement;
	}

	public static void dropElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		Actions action = new Actions(driver);
		Action dragDrop = action.dragAndDrop(fromElement, webElement).build();
		dragDrop.perform();
	}

	public static boolean elementIsSelected(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.isSelected();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static boolean verifyElementIsPresent(String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement element = Config.driver.findElement(By.xpath(values[1]));
			highLightElement(xpaths);
			element.isDisplayed();
			Reporter.log("Present"+values[0],true);
			//ATUReports.add("Present", values[0], false);
			return true;
		} catch (NoSuchElementException e) {
			Reporter.log("Not Present"+values[0],true);
		//	ATUReports.add("Not Present", values[0], LogAs.FAILED,
			//		new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			Assert.fail();
			return false;
		}
	}

	public static String verifyElementIsNotPresent(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement element = driver.findElement(By.xpath(xpaths));
			WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
			wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
//			ATUReports.add("Present", values[0], false);

		} catch (Exception e) {
			return "Verified Element is not present";
		}
		return "Verified Element is Visible";
	}

	public static boolean elementIsEnable(WebDriver driver, String xpath) {
		try {
			String[] values = splitXpath(xpath);
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.isEnabled();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static void visibilityElement(String xpath) {
		  try {
		   String[] values = splitXpath(xpath);
		   WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		   WebDriverWait wait = new WebDriverWait( Config.driver, WaitElementSeconds);
		   wait.until(ExpectedConditions.visibilityOf(webElement));
		//   ATUReports.add("wait visibility Element " + values[0], false);
		  } catch (Exception e) {
			  e.printStackTrace();
			  Assert.fail();
		  }
	}
	
	public static void waitUntilInvisibilityElement(String xpath) {
		String[] values = splitXpath(xpath);
		try {
			String ElementWait1 = "900";
			int WaitElementSeconds1 = new Integer(ElementWait1);
			WebDriverWait wait = new WebDriverWait(Config.driver, WaitElementSeconds1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			//ATUReports.add("Wait - " + values[0], false);
		} catch (Exception e) {
			//ATUReports.add("Wait - " + values[0], LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
		}
		  } 
	

	public static void inVisibilityElement(WebDriver driver, String NormalXpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(NormalXpath)));
		} catch (Exception e) {
		}
	}

	public static void textIsPresent(WebDriver driver, String inputData) {
		if (driver.getPageSource().contains(inputData)) {
		} else {
		}
	}

	public static void textTobePresent(WebDriver driver, String xpath, String inputData) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
			waits.until(ExpectedConditions.textToBePresentInElement(webElement, inputData));
			System.out.println("present");
		} catch (Exception e) {
		}
	}

	public static void textIsNotPresent(WebDriver driver, String NormalXpath, String inputData) {
		try {
			WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
			waits.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(NormalXpath), inputData));
		} catch (Exception e) {

		}

	}

	public static void elementTobeClickable(String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(Config.driver, WaitElementSeconds);
			waits.until(ExpectedConditions.elementToBeClickable(webElement));
		} catch (Exception e) {
		}
	}

	public static void elementToBeSelected(String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		WebDriverWait waits = new WebDriverWait(Config.driver, WaitElementSeconds);
		waits.until(ExpectedConditions.elementToBeSelected(webElement));
	}

	public static void waitForElement(String xpath) {
		String[] values = splitXpath(xpath);
		try {
			String ElementWait1 = "30";
			int WaitElementSeconds1 = new Integer(ElementWait1);
			WebDriverWait wait = new WebDriverWait(Config.driver, WaitElementSeconds1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			//ATUReports.add("Wait - " + values[0], false);
		} catch (Exception e) {
			//ATUReports.add("Wait - " + values[0], LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			System.out.println("Waited for Element and the Element does not appear in the given time period so scripts got failure");
		
		}
		
	}

	public static void waitUntilVisibilityOfElement(WebDriver driver, String element) {
		String[] values = splitXpath(element);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public static void waitForElementNotpresent(WebDriver driver, String NormalXpath) {
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
		wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.xpath(NormalXpath))));
	}

	public static String dynamicSendkeys(WebDriver driver, String inputData, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		webElement.clear();
		try {
			Thread.sleep(500);
			String currenttime = new SimpleDateFormat("E_yyyyMMddHHmmssa").format(Calendar.getInstance().getTime());
			String originalValue = inputData;
			String combinedValues = currenttime + originalValue;
			sendKeys(xpath, combinedValues);
			return combinedValues;
		} catch (InterruptedException e) {

			return null;
		}

	}

	public static void checkTwoString(String GetText1, String GetText2) {
		try {
			if (GetText1.equalsIgnoreCase(GetText2)) {
			//	ATUReports.add("Check", "", GetText1 + " and " + GetText2 + " - MATCHED", false);
			} else {
				// ATUReports.add("Check","",GetText1+ "and" +GetText2+
				 //" NOT MATCHED",LogAs.FAILED, new
				 //CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
				 Assert.fail();
			}
		} catch (NoSuchElementException e) {
			//ATUReports.add("Check", "", GetText1 + "and" + GetText2 + " - NOT MATCHED", LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static String partialTextVerify(String sentence, String word) {
		if (sentence.contains(word)) {
			System.out.println("findcity PASS");
			return null;
		} else {
			System.out.println("findcity is not PASS");
			return null;
		}

	}

	public static String enterUniquePhone(WebDriver driver, String path) {
		String[] values = splitXpath(path);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		webElement.clear();
		try {
			Thread.sleep(500);
			String phonenumber = new SimpleDateFormat("MMddHHmmss").format(Calendar.getInstance().getTime());
			sendKeys(path, phonenumber);
			return phonenumber;
		} catch (InterruptedException e) {
			return null;
		}

	}

	public static String dynamicTypeName(WebDriver driver, String inputData, String webElementxPath) {
		String[] values = splitXpath(webElementxPath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		webElement.clear();
		try {
			Thread.sleep(500);
			String currenttime = new SimpleDateFormat("HH_mmss").format(Calendar.getInstance().getTime());
			String combinedValues = inputData + currenttime;
			sendKeys(webElementxPath, combinedValues);
			return combinedValues;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void wait(WebDriver driver, String inputData) {
		try {
			int time = Integer.parseInt(inputData);
			int seconds = time * 1000;
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
		}
	}

	public static String sumOfTwoString(String GetText1, String GetText2) {
		try {
			int string1 = Integer.parseInt(GetText1);
			int string2 = Integer.parseInt(GetText2);
			int sum1 = string1 + string2;
			String sum = Integer.toString(sum1);
			return sum;
		} catch (Exception e) {
			return null;
		}
	}

	public static String getValue(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement inputBox = driver.findElement(By.xpath(values[1]));
		String textInsideInputBox = inputBox.getAttribute("value");
		if (textInsideInputBox.isEmpty()) {
			return "field is empty";
		} else {
			return "field is filled";
		}
	}

	public static void close() {
		try {
			Config.driver.close();
		} catch (Exception e) {
		}
	}

	public static void quit(WebDriver driver) {
		try {
			driver.close();
			driver.quit();
		} catch (Exception e) {
		}
	}

	public static void waitTime(WebDriver driver, String waitSeconds) {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(waitSeconds), TimeUnit.SECONDS);
	}

	public static void refreshPage() {
		try {
			waitTime(Config.driver, "5");
			Config.driver.navigate().refresh();
			waitTime(Config.driver, "5");
			Reporter.log("Page refreshed", true);
		//	ATUReports.add("Page refreshed", false);
		} catch (Exception e) {
			Reporter.log("Page Not refreshed", false);
			//ATUReports.add("Page Refresh", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void maximize(WebDriver driver) {
		try {
			Config.driver.manage().window().maximize();
			Reporter.log("Page Maximize", true);
			//ATUReports.add("Page Maximize", false);
		} catch (Exception e) {
			Reporter.log("Page Maximize", false);
			//ATUReports.add("Page Maximize", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void goBack() {
		try {
			Config.driver.navigate().back();
		//	ATUReports.add("Go Back", false);

		} catch (Exception e) {
			//ATUReports.add("Go Back", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}
	
	public static void tab() {
		try
		{
		Actions action = new Actions(Config.driver); 
		 action.sendKeys(Keys.TAB).build().perform();
		 Reporter.log("Tab pressed", true);
		//	ATUReports.add("Tab pressed", false);

		}
		catch(Exception e)
		{
			 Reporter.log("Tab pressed", false);
		//	ATUReports.add("Tab pressed", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			e.printStackTrace();
			Assert.fail();
		}
	}
	 

	public static void uploadFileRobot(String fileLocation) {
		try {
			StringSelection stringSelection = new StringSelection(fileLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception exp) {
			exp.printStackTrace();
			//ATUReports.add("File upload", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			System.err.println(exp.getMessage());
			Assert.fail();
		}
	}

	public static void goForward(WebDriver driver) {
		try {
			driver.navigate().forward();
		//	ATUReports.add("Go forward", false);

		} catch (Exception e) {
			//ATUReports.add("Go Forward", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void goTo(WebDriver driver, String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
		}
	}

	public static void keyboardTab() {
		Actions actionObject = new Actions(Config.driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).perform();
	}

	public static void enter() {
		try {
			Actions actionObject = new Actions(Config.driver);
			actionObject.sendKeys(Keys.ENTER).build().perform();
			Reporter.log("Enter", true);
			//ATUReports.add("Enter", false);

		} catch (Exception e) {
			Reporter.log("Enter", false);
			//ATUReports.add("Enter", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static String alertOk(WebDriver driver, String path) {
		String[] values = splitXpath(path);

		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			webElement.click();
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
		//	ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
			return null;
		}
	}

	public static void dismissAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static String alertDismiss(WebDriver driver, String path) {
		String[] values = splitXpath(path);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		webElement.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.dismiss();
		return alertText;
	}

	public static String promptBox(WebDriver driver, String path, String inputData) {
		try {
			String[] values = splitXpath(path);
			WebElement element = Config.driver.findElement(By.xpath(values[1]));
			element.click();
			Alert alert = driver.switchTo().alert();
			driver.switchTo().alert().sendKeys(inputData);
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * 
	 * https://www.goibibo.com/ go to sigin for switch to frame
	 * 
	 */
	public static void switchToFrame(WebDriver driver, String frameName) {
		String[] values = splitXpath(frameName);
		try {
			WebElement element = Config.driver.findElement(By.xpath(values[1]));
			driver.switchTo().frame(element);
		//	ATUReports.add(values[0], false);

		} catch (NoSuchFrameException e) {
			//ATUReports.add(values[0], LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
		}
	}

	public static void switchToDefaultFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
			//ATUReports.add("Switch to default frame", false);
		} catch (Exception e) {
			//ATUReports.add("Switch to default frame", LogAs.FAILED,
				//	new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
		}
	}

	public static void switchToFrame(WebDriver driver, WebElement element) {
		try {
			driver.switchTo().frame(element);
			//ATUReports.add("Switch frame", false);
			System.out.println("Navigated to frame with element " + element);
		} catch (NoSuchFrameException e) {
			//ATUReports.add("Switch frame", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
			Assert.fail();
			System.out.println("Doesn't navigated to frame with element " + element);
		}
	}

	public static void keyDown() {
		Actions actionObject = new Actions(Config.driver);
		actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
		actionObject.perform();
		Assert.fail();
	}

	public static void keyUp() {
		Actions actionObject = new Actions(Config.driver);
		actionObject = actionObject.sendKeys(Keys.ARROW_UP);
		actionObject.perform();
		Assert.fail();
	}

	public static void pageDown(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitTime(driver, "5");
	}

	public static void pageUp() {
		((JavascriptExecutor) Config.driver).executeScript("scroll(0,-250);");
	}

	public static void scrollBottom() {
		JavascriptExecutor jse = (JavascriptExecutor) Config.driver;
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,"
				+ "document.body.scrollHeight,document.documentElement.clientHeight));");
		waitTime(Config.driver, "5");
		Reporter.log("Scroll bottom", true);
		//ATUReports.add("Scroll bottom", false);
	}

	public static void keyboardPageUp() {
		Actions actionObject = new Actions(Config.driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();
	}

	public static void refreshUsingKeys(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.sendKeys(Keys.F5).perform();
	}

	public static void keyboardPageDown() {
		Actions actionObject = new Actions(Config.driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();
		waitTime(Config.driver, "5");
	}

	public static void keyboardEnd(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitTime(driver, "5");
	}

	public static void keyboardHome(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitTime(driver, "5");
	}

	public static void keyboardArrowUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
	}

	public static void keyboardArrowDown() {
		Actions actionObject = new Actions(Config.driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).perform();
	}

	public static void keyboardArrowLeft(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).perform();
	}

	public static void keyboardArrowRight(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_RIGHT).perform();
	}

	public static void pageMaximize() {
		Actions actionObject = new Actions(Config.driver);
		actionObject = actionObject.sendKeys(Keys.F11);
		actionObject.perform();
		/*
		 * Actions actionObject = new Actions(Config.driver);
		 * actionObject.keyDown(Keys.F11).build(); actionObject.perform();
		 */
		/*
		 * actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F11).perform();
		 * actionObject.keyDown(Keys.F11);
		 */
	}

	public static void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

	public static void navigateUrl(WebDriver driver, String inputData) {
		driver.navigate().to(inputData);
	}

	public static String captureScreenshot(WebDriver driver, String screenshotName)
	 {
	  try 
	  {
	   String image_dest= "/screenshots/"+screenshotName.concat(".png");
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File source=ts.getScreenshotAs(OutputType.FILE);
	   String dest = image_dest;
	   File destination = new File(dest);
	   FileUtils.copyFile(source, destination);
	   return dest;
	  }
	  catch (Exception e) 
	  {
	   System.out.println("Exception while taking Screenshot"+e.getMessage());
	   return e.getMessage();
	  }
	 }

	public static void alertGenerate(WebDriver driver, String inputData) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('" + inputData + "');");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void highLightElement(String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		JavascriptExecutor js = (JavascriptExecutor) Config.driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement,
				"color: yellow; border: 3px solid yellow;");
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
	}

	/*
	 * public static void newTab(WebDriver driver) { try { Robot r = new
	 * Robot(); r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_T);
	 * if(Config.browserName.equalsIgnoreCase("firefox")) { ArrayList<String>
	 * tabs = new ArrayList<String> (driver.getWindowHandles());
	 * driver.switchTo().window(tabs.get(1)); } else
	 * if(Config.browserName.equalsIgnoreCase("chrome")) {
	 * System.out.println("askjdfkdlaj"); ArrayList<String> tabs = new
	 * ArrayList<String> (driver.getWindowHandles());
	 * System.out.println("321356132"); driver.switchTo().window(tabs.get(0));
	 * System.out.println("!@$@#%"); driver.get("http://facebook.com");
	 * System.out.println("{{{{{{{{{{"); } } catch (Exception e) { // TODO:
	 * handle exception }
	 * 
	 * }
	 */
	public static void newTab(WebDriver driver) {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			get("http://stackoverflow.com/questions/2001586/how-to-comment-a-block-in-eclipse");
		} catch (Exception e) {
		}

	}
	
		
	public static void closeTab(WebDriver driver) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		// tabs.remove(tabs.get(0));
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
	}

	/*
	 * public static String sendHttpPost(String inputData) throws Exception {
	 * String[] requestParameters = inputData.split(","); String url =
	 * requestParameters[0]; URL obj = new URL(url); HttpsURLConnection con =
	 * (HttpsURLConnection) obj.openConnection(); // add request header
	 * con.setRequestMethod(requestParameters[1]);
	 * con.setRequestProperty(requestParameters[2], requestParameters[3]);
	 * con.setRequestProperty(requestParameters[4], requestParameters[5]);
	 * String urlParameters = requestParameters[6]; // Send post request
	 * con.setDoOutput(true); DataOutputStream wr = new
	 * DataOutputStream(con.getOutputStream()); wr.writeBytes(urlParameters);
	 * wr.flush(); wr.close(); int responseCode = con.getResponseCode();
	 * System.out.println("\nSending 'POST' request to URL : " + url);
	 * System.out.println("Post parameters : " + urlParameters);
	 * System.out.println("Response Code : " + responseCode); BufferedReader in
	 * = new BufferedReader(new InputStreamReader(con.getInputStream())); String
	 * inputLine; StringBuffer response = new StringBuffer(); while ((inputLine
	 * = in.readLine()) != null) { response.append(inputLine); } in.close();
	 * System.out.println(response.toString()); return response.toString(); }
	 */
	public static void switchtotab(WebDriver driver, int inputData) {
		Capabilities localCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		String BROWSER_NAME = localCapabilities.getBrowserName().toLowerCase();
		if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(inputData));
		}
		if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(inputData));
		}
	}

	public static String getText(String path) {
		String[] values = splitXpath(path);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			highLightElement(path);
			String text = webElement.getText().trim();
			Reporter.log(text, true);
			//ATUReports.add(values[0], "", text, true);
			return text;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static String getText1(String path) {
		String[] values = splitXpath(path);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			highLightElement(path);
			String text = (String)((JavascriptExecutor)Config.driver).executeScript("arguments[0].innerHTML;", webElement);
			Reporter.log(text, true);
			//ATUReports.add(values[0], "", text, true);
			return text;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String getAttribute(String xpath, String locatorName) {
		String[] values = splitXpath(xpath);
		WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
		return webElement.getAttribute(locatorName);
	}

	public static boolean isDisplayed(String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			return webElement.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isSelected(String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			return webElement.isSelected();
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isEnabled(String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = Config.driver.findElement(By.xpath(values[1]));
			System.out.println("Value======>" + webElement.isEnabled());
			return webElement.isEnabled();
		} catch (Exception e) {
			return false;
		}

	}

	public static final String USER_AGENT = "Mozilla/5.0";

	public static void sendGet(String riderCancelReason) throws IOException {
		URL obj = new URL(riderCancelReason);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		// con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
		} else {
		}
	}

	public static void sendPost(String riderresendotp, String riderresendotp_body) throws IOException {
		URL obj = new URL(riderresendotp);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		// con.setDoInput(true);
		con.setDoOutput(true);
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		OutputStream os = con.getOutputStream();
		os.write(riderresendotp_body.getBytes());
		os.flush();
		os.close();
		int responseCode = con.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
		} else {
			Assert.fail();
		}
	}

	// did not verify
	public static void putReqest() {
		try {
			URL obj = new URL("http://www.example.com/resource");
			HttpURLConnection httpCon = (HttpURLConnection) obj.openConnection();
			httpCon.setDoOutput(true);
			httpCon.setRequestMethod("PUT");
			OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
			out.write("Resource content");
			out.close();
			httpCon.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// did not verify
	public static void deleteReqest() {
		try {
			URL obj = new URL("http://www.example.com/resource");

			HttpURLConnection httpCon = (HttpURLConnection) obj.openConnection();
			httpCon.setDoOutput(true);
			httpCon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			httpCon.setRequestMethod("DELETE");
			httpCon.connect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
