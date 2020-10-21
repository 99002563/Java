package com.java.service;

import com.java.exception.NameExistsException;
import com.java.exception.TooLongException;
import com.java.exception.TooShortException;

public class Validator {

	private String[] names= {"Nithin","Nikhil","Ram Charan","Pranav","Neha","Samhitha"};
	public boolean validateName(String username)throws NameExistsException {
		
		for(String uname:names) {
		  if(uname.equals(username)) {
			  throw new NameExistsException();
		  }
	}

		return true;
	}
	public boolean validatePassword(String password)throws TooLongException,TooShortException {
		
		if(password.length()>=15) {
		throw new TooLongException("Password is too long");

		}
		if(password.length()<=5) {
			throw new TooShortException("Password is too short");

			}
		return true;
}
}
