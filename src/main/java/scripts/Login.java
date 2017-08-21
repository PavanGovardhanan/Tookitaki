package scripts;
import java.io.IOException;

import atu.testng.reports.ATUReports;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;
public class Login extends Keywords {

	/**
	 * Name : Pavan 
	 * Created Date: 27/Jul/2017
	 * Modified Date: 27/Jul/2017
	 * Description: Login
	 * 
	 */

	public static void login() throws IOException {
		get(Testcases.appURL);
		clearCookies();
		String invalidUsername = Utils.getDataFromTestData("userLogin", "User Name");
		String invalidPassword = Utils.getDataFromTestData("userLogin", "Password");
		waitForElement(username);
		clearAndType(username,invalidUsername);
		waitForElement(password);
		clearAndType(password,invalidPassword);
		click(userLogin);
		waitForElement(getmessage);
		getText(getmessage);
		waitForElement(username);
		clearAndType(username, Testcases.UserloginUserName);
		waitForElement(password);
		clearAndType(password, Testcases.UserloginPassword);
		click(userLogin);
		defaultWait();
		
	}
}
