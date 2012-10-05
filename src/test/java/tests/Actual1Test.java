package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Actual1Test extends BaseTest {

  @BeforeClass
  public void actual1TestBeforeClass() {
    System.out.println(Actual1Test.class.getSimpleName() + " actual1TestBeforeClass");
  }

  @AfterClass(alwaysRun = true)
  public void actual1TestAfterClass() {
    System.out.println(Actual1Test.class.getSimpleName() + " actual1TestAfterClass");
  }

  @BeforeMethod
  public void actual1TestBeforeMethod() {
    System.out.println(Actual1Test.class.getSimpleName() + " actual1TestBeforeMethod");
  }

  @AfterMethod(alwaysRun = true)
  public void actual1TestAfterMethod() {
    System.out.println(Actual1Test.class.getSimpleName() + " actual1TestAfterMethod");
  }

  @Test
  public void test() {
    System.out.println("Running test1");
  }

}
