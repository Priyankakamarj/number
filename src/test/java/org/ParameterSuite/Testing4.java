package org.ParameterSuite;

import org.testng.annotations.Test;

public class Testing4 {
	@Test(groups="smoke")
	private void tc01() {
		System.out.println("smoke: Test1");
	}

	@Test(groups="sanity")
	private void tc02() {
		System.out.println("sanity: Test2");
	}
	
	@Test(groups="smoke")
	private void tc03() {
		System.out.println("smoke: Test3");

	}
}
