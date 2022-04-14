package com.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		while (true) {

			System.out.println("Enter 0 : Exit");
			System.out.println("Enter 1 : To validate First Name ");
			System.out.println("Enter 2 : To validate Last Name ");
			System.out.println("Enter 3 : To validate E-mail ");

			switch (scanner.nextInt()) {
			case 0:
				System.exit(0);

			case 1:
				UserRegistration.validFirstName();
				break;

			case 2:
				UserRegistration.validLastName();
				break;

			case 3:
				UserRegistration.validEmail();
				break;
			}
		}
	}
}
