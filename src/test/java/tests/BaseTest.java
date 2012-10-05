package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

  private static Object CREATED = null;

  @BeforeClass
  protected void bestTestBeforeClass() {
    System.out.println(BaseTest.class.getSimpleName() + " bestTestBeforeClass");
    if (CREATED != null) {
      throw new IllegalStateException("There exists an object.");
    }
    CREATED = new Object();
  }

  @AfterClass(alwaysRun = true)
  protected void bestTestAfterClass() {
    System.out.println(BaseTest.class.getSimpleName() + " bestTestAfterClass");
    CREATED = null;
  }

  @BeforeMethod
  protected void bestTestBeforeMethod() {
    System.out.println(BaseTest.class.getSimpleName() + " bestTestBeforeMethod");
  }

  @AfterMethod(alwaysRun = true)
  protected void bestTestAfterMethod() {
    System.out.println(BaseTest.class.getSimpleName() + " bestTestAfterMethod");
  }
}
