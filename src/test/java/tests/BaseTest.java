package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

  private static Object CREATED = null;

  @BeforeClass
  protected void bestTestBeforeClass() {
    System.out.printf("%12s - %s%n", BaseTest.class.getSimpleName(), "BeforeClass");
    if (CREATED != null) {
      throw new IllegalStateException("There exists an object.");
    }
    CREATED = new Object();
  }

  @AfterClass(alwaysRun = true)
  protected void bestTestAfterClass() {
    System.out.printf("%12s - %s%n", BaseTest.class.getSimpleName(), "AfterClass");
    CREATED = null;
  }
}
