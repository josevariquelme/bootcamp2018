package com.globant.bootcamp;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}

}