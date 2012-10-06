package tests;

import org.testng.annotations.Test;


public class Actual1Test extends BaseTest {

  @Test
  public void test() {
    System.out.printf("%12s - %s%n", Actual1Test.class.getSimpleName(), "test");
  }

}
