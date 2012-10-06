package tests;

import org.testng.annotations.Test;


public class Actual2Test extends BaseTest {

  @Test
  public void test() {
    System.out.println("Running test2");
  }

  @Test(dependsOnMethods = "test")
  public void test3() {
    System.out.println("Running test2.1");
  }

}
