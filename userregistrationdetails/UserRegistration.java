/**************************************************
 * Purpose : Validating the User Details
 * @author : Rosy Rupali
 * @since  : 18-06-2021
 * @version : 1.0
 *
 *************************************************/
package userregistrationdetails;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	/**
	 * This method is validating the first name of the user is correct or not.
	 */
	private void validFirstName() {
		System.out.println("Enter the First name: ");
		String name = scanner.next();
		String regex = "^[A-Z][a-z]{2,}";
		if (name.matches(regex)) {
			System.out.println("First Name of the user is valid.");
		} else {
			System.out.println("First Name of the user is invalid.");
		}
	}
	
	private void validLastName() {
		System.out.println("Enter the Last name: ");
		String name = scanner.next();
		String regex = "^[A-Z][a-z]{2,}";
		if (name.matches(regex)) {
			System.out.println("Last Name of the user is valid.");
		} else {
			System.out.println("Last Name of the user is invalid.");
		}
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.validFirstName();
		user.validLastName();
	}

}
