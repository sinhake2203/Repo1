package com.java.coding.practices1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.java.coding.practices1.FirstClassForCheckIn;

class FizzBuzzTest {
	
	FirstClassForCheckIn fizzbuzz;


	@Test
	void test() {
		
		assertEquals("Buzz", FirstClassForCheckIn.FizBuzzSollutions(5));
		assertEquals("Fizz", FirstClassForCheckIn.FizBuzzSollutions(3));
		assertEquals("FizzBuzz", FirstClassForCheckIn.FizBuzzSollutions(15));
		assertEquals("19", FirstClassForCheckIn.FizBuzzSollutions(19));
		assertEquals("0", FirstClassForCheckIn.FizBuzzSollutions(0));
		assertEquals("-12", FirstClassForCheckIn.FizBuzzSollutions(-12));
		
		
	}

}
