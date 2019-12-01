package com.java.coding.practices1;

public class FirstClassForCheckIn {

	public static void main(String[] args) {
		
		FizBuzzSollutions(Integer.parseInt(args[0]));

	}
	
	
	public static String FizBuzzSollutions(int input) {
		
		String message=null;
		
		if(input>0) {
		if(input%3==0 && input%5==0) {
			
			message="FizzBuzz";
			
		}
		else if(input%3==0) {
			
			message="Fizz";
			
		}
		else if(input%5==0) {
			
			message="Buzz";
			
		}
		else {
			message=String.valueOf(input);
		}
		return message;
		
	}
	
	else
		return String.valueOf(input);

}
}
