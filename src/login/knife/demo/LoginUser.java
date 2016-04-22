package login.knife.demo;


import com.jase.knife.BrowserEmulator;


public class LoginUser {
	
	BrowserEmulator driver;
	static String login_userName = "id=>idInput";
	static String login_passWord = "id=>pwdInput";
	static String login_Button = "id=>loginBtn";
	static String login_success_user = "id=>spnUid";
	static String logout_Button = "linkText=>�˳�";
	static String login_Error_Hint = "xpath=>//div[@class='error-tt']/p";
	
	//��¼����
	public static void login(BrowserEmulator driver,String username,String password){
		driver.type(login_userName,username);
		driver.type(login_passWord,password);
		driver.click(login_Button);
	}
	
	//��ȡ��¼������ʾ
	public static String login_error_info(BrowserEmulator driver){
	String text = driver.getText(login_Error_Hint);
	return text;
	}
	
	//��ȡ��¼�ɹ�֮����û�
	public static String login_user_info(BrowserEmulator driver){
		String text = driver.getText(login_success_user);
		return text;
	}
	
	//�˳�����
	public static void logout(BrowserEmulator driver){
		driver.click(logout_Button);
	}

}
