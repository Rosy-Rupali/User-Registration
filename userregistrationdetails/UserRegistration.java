/**************************************************
 * Purpose : Validating the User Details
 * @author : Rosy Rupali
 * @since  : 18-06-2021
 * @version : 1.0
 *
 *************************************************/
package userregistrationdetails;

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
		String name = scanner.next();
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
		String name = scanner.next();
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
	 * UC-7 This method is validating the third rule of password of the user is
	 * correct or not. It should contain at least one numeric value.
	 */
	private void validPassword() {
		System.out.println("Enter the password: ");
		String password = scanner.nextLine();
		String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean b = m.matches();
		if (b)
			System.out.println("password of the user is valid.");
		else
			System.out.println("password of the user is invalid.");

	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.validPassword();
	}

}
