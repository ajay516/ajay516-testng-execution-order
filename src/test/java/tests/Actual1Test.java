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
    log();
  }

  @Test(dependsOnMethods = "test")
  public void test3() {
    log();
  }

  @Test(dataProvider = PARAMETERS)
  public void test4(String parameter) {
    log(parameter);
  }
}
