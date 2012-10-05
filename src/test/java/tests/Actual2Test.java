package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Actual2Test extends BaseTest {

  @BeforeClass
  protected void actual2TestBeforeClass() {
    System.out.println(Actual2Test.class.getSimpleName() + " actual2TestBeforeClass");
  }

  @AfterClass(alwaysRun = true)
  protected void actual2TestAfterClass() {
    System.out.println(Actual2Test.class.getSimpleName() + " actual2TestAfterClass");
  }

  @BeforeMethod
  protected void actual2TestBeforeMethod() {
    System.out.println(Actual2Test.class.getSimpleName() + " actual2TestBeforeMethod");
  }

  @AfterMethod(alwaysRun = true)
  protected void actual2TestAfterMethod() {
    System.out.println(Actual2Test.class.getSimpleName() + " actual2TestAfterMethod");
  }

  @Test
  public void test() {
    System.out.println("Running test2");
  }

  @Test(dependsOnMethods = "test")
  public void test3() {
    System.out.println("Running test2.1");
  }

}
