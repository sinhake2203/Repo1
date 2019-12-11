package com.dsproblem.practice1.array;

public class FindSecondHigestNumber {

	public static void main(String[] args) {
		//int inputNumber[]= {3,5,4,11,8,-9,23};
		int inputNumber[]= {34,34,34};
		
		String resultMessage=findSecondLargestNumber(inputNumber);
		System.out.println(resultMessage);
		
		

	}

	public static String findSecondLargestNumber(int[] inputNumber) throws NullPointerException {
		
		String resultMessage=null;
		
		int maxNum=Integer.MIN_VALUE;
		int secondMaxNum=Integer.MIN_VALUE;
		
		if(inputNumber==null) {
			return resultMessage="NO data";
			
		}
		
		
		for(int i=0;i<inputNumber.length;i++) {
			
			if(inputNumber[i]>maxNum) {
				
				secondMaxNum=maxNum;
				maxNum=inputNumber[i];
			}
			else if(inputNumber[i]<maxNum&&inputNumber[i]>secondMaxNum) {
				secondMaxNum=inputNumber[i];
			}
			
			
		}
		
		if(secondMaxNum==Integer.MIN_VALUE) {
			resultMessage= "NO Second Max not available";
		}
		else {
			resultMessage=String.valueOf(secondMaxNum);
	}
		
		return resultMessage;
		
	}

}
