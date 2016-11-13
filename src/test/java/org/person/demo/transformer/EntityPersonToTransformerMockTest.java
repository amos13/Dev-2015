package org.person.demo.transformer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EntityPersonToTransformerMockTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EntityPersonToTransformerMockTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(EntityPersonToTransformerMockTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testEntityPersonToTransformer()
    {
        assertTrue(true);
    }
}
