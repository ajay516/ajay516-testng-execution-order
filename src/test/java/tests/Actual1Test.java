package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Actual1Test extends BaseTest {

  private static final String PARAMETERS = "parameters";

  @DataProvider(name = PARAMETERS)
  public Object[][] parameters() {
    return new Object[][]{
        new Object[]{
          "one"
        }, new Object[]{
          "two"
        }, new Object[]{
          "three"
        }, new Object[]{
          "four"
        }
    };
  }

  @Test
  public void test() {
    System.out.printf("%12s - %s%n", Actual1Test.class.getSimpleName(), "test");
  }

  @Test(dependsOnMethods = "test")
  public void test3() {
    System.out.printf("%12s - %s%n", Actual1Test.class.getSimpleName(), "test3");
  }

  @Test(dataProvider = PARAMETERS)
  public void test4(String parameter) {
    System.out.printf("%12s - %s - %s%n", Actual1Test.class.getSimpleName(), "test4", parameter);
  }
}
