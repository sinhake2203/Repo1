package com.dsproblem.practice1.array.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dsproblem.practice1.array.FindSecondHigestNumber;

class FindSecondHigestNumberTest {

	
	FindSecondHigestNumber findSecondNum;
	
	
	@BeforeEach
	void setUp() throws Exception {
		findSecondNum= new FindSecondHigestNumber();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test(){
		int arr[]= {3,4,5,7,4};
		
		String resultMessage=FindSecondHigestNumber.findSecondLargestNumber(arr);
		assertEquals("5", resultMessage);
		
		int arr1[]= {3,3,3,3};
		String resultMessage1=FindSecondHigestNumber.findSecondLargestNumber(arr1);
		assertEquals("NO Second Max not available", resultMessage1);
		
		
		
	}
	
	@Test
	
	void test1() throws Exception{
		assertEquals("NO data",FindSecondHigestNumber.findSecondLargestNumber(null));
		//assertEquals("NO Second Max not available", resultMessage2);
		
	}

}
