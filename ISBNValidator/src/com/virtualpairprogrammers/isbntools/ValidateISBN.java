package com.virtualpairprogrammers.isbntools;

public class ValidateISBN {

	public boolean checkISBN(String isbn) {
		if(isbn.length() != 10) {
			throw new NumberFormatException("ISBN numbers must be 10 digits long");
		}
			
		int total = 0;
		
		for (int i = 0; i < 10; i++) 
		{
			int currentDigit = 0;
			try {
				currentDigit = Integer.parseInt(Character.toString(isbn.charAt(i)));				
			}
			catch (Exception e) {
				throw new NumberFormatException();
				// TODO: handle exception
			}
			
			total += isbn.charAt(i) * (10 - i);
		}
		
		if(total % 11 == 0) {
			return true;			
		}
		else {
			return false;
		}
	}	
}