package com.java.service;


import java.util.Scanner;

import com.java.exception.NameExistsException;
import com.java.exception.TooLongException;
import com.java.exception.TooShortException;

public class Registration {
public static void main(String[] args)  {
	
	Validator valid = new Validator();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Username");
	String username = scan.next(); 
	try {
		boolean validate = valid.validateName(username);
		 if(validate) {
			 System.out.println("Welcome "+username);
			 System.out.println("Enter Password..");
			 String pass=scan.next();
			 if(valid.validatePassword(pass))
				 System.out.println("You are registered successfully");
		 }
	} catch (NameExistsException e) {
		System.out.println("Name already exists");
		e.printStackTrace();
	} catch (TooLongException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	} catch (TooShortException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	scan.close();
}
}