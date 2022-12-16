package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("Lohith","Loki");
		
		//Execute the body when the positive condition else test will be skipped
		Assumptions.assumeTrue("Loki".equals(System.getProperty("Lohith")));
	}
	@Test
	void display() {
		System.setProperty("Lohith", "Loki");
		
		//Execute the body when the negative condition else test will be slipped
		Assumptions.assumeFalse("Raju".equals(System.getProperty("Lohith")));
	}
	@Test
	void print() {
		System.setProperty("Lohith", "Loki");
		
		Assumptions.assumingThat(true, null);
	}
	

}
