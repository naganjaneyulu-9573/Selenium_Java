package com.autofw.qa.util;

import java.util.Random;

public class Utility {
	// function to generate a random string of length n
	public String createRandomString(int numberOfCharacters)
	{
		// chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(numberOfCharacters);
  
        for (int i = 0; i < numberOfCharacters; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int)(AlphaNumericString.length()* Math.random());
  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
  
        return sb.toString();		
	}
	
	public int createRandomNumber()
	{
		Random randomNumber = new Random();
		return randomNumber.nextInt(999999);
	}
}
