package com.rememberjava.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestMethods {

  @BeforeClass
  public static void setUpBeforeClass() {}

  @AfterClass
  public static void tearDownAfterClass() {}

  @Before
  public void setUp() {}

  @After
  public void tearDown() {}

  @Test
  public void test() {}
}
