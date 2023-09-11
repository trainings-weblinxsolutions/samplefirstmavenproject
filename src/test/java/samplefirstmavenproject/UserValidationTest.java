package samplefirstmavenproject;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	
	@Test
	public void dontAllowIfValidUserWithInvalidPasswordIsTryingToLogin() {
		
		String username= "rohit";
		String password= "l@mno";
		
		UserValidation userValidation = new UserValidation();
		
		boolean actual = userValidation.checkIfUserIsValid(username, password); //true or false
		Assert.assertFalse(actual);
		
		
		
		
		
	}
	
	@Test
	public void doNotallowInValidUserToLogin() {
		
		String username= "salil";
		String password= "s@lil";
		
		UserValidation userValidation = new UserValidation();
		
		boolean actual = userValidation.checkIfUserIsValid(username, password); //true or false
		Assert.assertFalse(actual);
		
		
		
		
		
	}
	
	
	@Test
	public void allowValidUserToLogin() {
		
		String username= "rohit";
		String password= "12345";
		
		UserValidation userValidation = new UserValidation();
		
		boolean actual = userValidation.checkIfUserIsValid(username, password); //true or false
		Assert.assertTrue(actual);
		
		
		
		
		
	}
	
	
}
