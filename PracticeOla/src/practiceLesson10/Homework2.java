package practiceLesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		 /*  Write a program that asks user to enter his/her username and password
		 * until user enters them correctly.
		 */

		// how do we decide?
		// for or while or do while
		// for is more suitable for a countable number of loops
		// here do while seems more suitable

		Scanner scan = new Scanner(System.in);
		String userName= "Erjola";
		String password= "1984";
		
		String userNameInput;
		String passwordInput;
		
		do 
		{
			System.out.println("Please enter your password and username!!!");
			userNameInput= scan.next();
			passwordInput= scan.next();
			
		if (userName.equals(userNameInput) && passwordInput.equals(passwordInput))	{
			System.out.println("You are log in");
			break;
			
		} 
		else 
		{
			System.out.println("You are not log in!!");
		}
		 while (userNameInput != userName || passwordInput != password)
		{
		
		System.out.println("Wrong username and password!!");
		
		{
			
		
		}
		{
			
		
	
		
		
	


		