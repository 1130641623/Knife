package login.knife.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jase.knife.BrowserEmulator;

public class LoginAndOutTest {
	
	private BrowserEmulator driver;
	private String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new BrowserEmulator();
		baseUrl = "http://www.126.com";
	}
	
	@Test
	public void testCase()throws Exception {
		driver.open(baseUrl);

		// ���õ�¼ģ��
		String username = "uasename";
		String password = "password";
		LoginPage.login(driver, username, password);
		Thread.sleep(5000);
		
		//��֤
		String text = LoginPage.login_user_info(driver);
		Assert.assertEquals(text,username+"@126.com");
		
		//�����˳�ģ��
		LoginPage.logout(driver);
		

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
