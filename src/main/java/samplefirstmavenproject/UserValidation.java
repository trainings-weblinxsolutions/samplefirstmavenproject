package samplefirstmavenproject;

import java.util.ResourceBundle;

public class UserValidation {

	public boolean checkIfUserIsValid(String username, String password) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String un = rb.getString("username");
		String pwd = rb.getString("password");
		System.out.println("Username : "+un);
		System.out.println("Password : "+pwd);

		
		
		
		if(username.equals(un) && password.equals(pwd)) {
			return true;
		}
		
		
		return false;
		
	}
	
	
	public void changeUserPassword(String username, String oldPassword, String newPassword) {
		//code
	}
	
}
