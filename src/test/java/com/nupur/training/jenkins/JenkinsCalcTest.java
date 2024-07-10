package com.nupur.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc=new JenkinsCalculator();
		assertEquals(10,myCalc.addNumbers(5, 5));
	}
	public void subtractTest() {
		JenkinsCalculator myCalc=new JenkinsCalculator();
		assertEquals(5,myCalc.addNumbers(10, 5));
	}
}
