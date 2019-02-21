package com.testthis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.DriverTest;

public class TestSelenium {

	DriverTest obj=new DriverTest();
	@Test
	public void test() throws InterruptedException {
		 String str= obj.callDriver();
		 assertEquals(str,"Success");
	}

}
