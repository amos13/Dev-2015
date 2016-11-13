package org.person.demo.transformer;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllEntityPersonToTransformerTests {

	public static Test suite() 
	{
		TestSuite suite = new TestSuite(AllEntityPersonToTransformerTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(EntityPersonToTransformerMockTest.suite());
		suite.addTest(EntityPersonToTransformerTest.suite());
		//$JUnit-END$
		return suite;
	}
}
