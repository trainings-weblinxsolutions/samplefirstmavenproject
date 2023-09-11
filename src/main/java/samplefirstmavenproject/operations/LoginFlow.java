package samplefirstmavenproject.operations;

import java.util.ResourceBundle;

public class LoginFlow {

	
	public boolean allowUserToPostATweet(String username, String password) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String un = rb.getString("username");
		String pwd = rb.getString("password");
		
		if(username.equals(un) && password.equals(pwd)) {
			return true;
		}
		
		
		return false;
		
	}
}
