/**************************************************
 * Purpose : Validating the User Details
 * @author : Rosy Rupali
 * @since  : 18-06-2021
 * @version : 1.0
 *
 *************************************************/
package userregistrationdetails;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	/**
	 * UC-1 This method is validating the first name of the user is correct or not.
	 */
	private void validFirstName() {
		System.out.println("Enter the First name: ");
		String name = scanner.nextLine();
		String regex = "^[A-Z][a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean b = m.matches();
		if (b) {
			System.out.println("First Name of the user is valid.");
		} else {
			System.out.println("First Name of the user is invalid.");
		}
	}

	/**
	 * UC-2 This method is validating the last name of the user is correct or not.
	 */
	private void validLastName() {
		System.out.println("Enter the Last name: ");
		String name = scanner.nextLine();
		String regex = "^[A-Z][a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean b = m.matches();
		if (b) {
			System.out.println("Last Name of the user is valid.");
		} else {
			System.out.println("Last Name of the user is invalid.");
		}
	}

	/**
	 * UC-3 This method is validating the email id of the user is correct or not.
	 */
	private void validEmail() {
		System.out.println("Enter the Email Id: ");
		String emailId = scanner.next();
		scanner.nextLine();
		String regex = "^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		boolean b = m.matches();
		if (b)
			System.out.println("Email Id of the user is valid.");
		else
			System.out.println("Email Id of the user is invalid.");

	}

	/**
	 * UC-4 This method is validating the Mobile number of the user is correct or
	 * not.
	 * 
	 */
	private void validMobileNo() {
		System.out.println("Enter the Mobile number: ");
		String mobileNumber = scanner.nextLine();
		String regex = "[0-9]{2}\\s{1}[0-9]{10}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNumber);
		boolean b = m.matches();
		if (b)
			System.out.println("Mobile number of the user is valid.");
		else
			System.out.println("Mobile number of the user is invalid.");

	}

	/**
	 * UC-5 This method is validating the first rule of password of the user is
	 * correct or not. It should minimum of 8 characters.
	 * 
	 * UC-6 This method is validating the second rule of password of the user is
	 * correct or not. It should contain at least one upper case.
	 * 
	 * UC-7 This method is validating the third rule of password of the user is
	 * correct or not. It should contain at least one numeric value.
	 * 
	 * UC-8 This method is validating the third rule of password of the user is
	 * correct or not. It should contain one special character.
	 */
	private void validPassword() {
		System.out.println("Enter the password: ");
		String password = scanner.next();
		scanner.nextLine();
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean b = m.matches();
		if (b)
			System.out.println("password of the user is valid.");
		else
			System.out.println("password of the user is invalid.");

	}

	/**
	 * UC-9 This method is used to check the given email addresses are valid or not.
	 */
	private void multipleEmailId() {
		String regex = "^[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$";
		ArrayList<String> email = new ArrayList<>();
		email.add("abc@yahoo.com");
		email.add("abc-100@yahoo.om");
		email.add("abc.100@yahoo.com");
		email.add("abc111@abc.com");
		email.add("abc-100@abc.net");
		email.add("abc.100@abc.com.au");
		email.add("abc@1.com");
		email.add("abc@gmail.com.com");
		email.add("abc+100@gmail.com");
		email.add("abc");
		email.add("abc@.com.my");
		email.add("abc123@gmail.a");
		email.add("abc123@.com");
		email.add("abc123@.com.com");
		email.add(".abc@abc.com");
		email.add("abc()*@gmail.com");
		email.add("abc@%*.com");
		email.add("abc..2002@gmail.com");
		email.add("abc.@gmail.com");
		email.add("abc@abc@gmail.com");
		email.add("abc@gmail.com.1a");
		email.add("abc@gmail.com.aa.au");
		for(String str : email) {
			if(str.matches(regex))
				System.out.println("It is valid");
			else
				System.out.println("It is invalid");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.validFirstName();
		user.validLastName();
		user.validEmail();
		user.validMobileNo();
		user.validPassword();
		UserRegistration email = new UserRegistration();
		email.multipleEmailId();
	}
	

}
