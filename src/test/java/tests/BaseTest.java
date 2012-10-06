package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

  private static Object CREATED = null;

  @BeforeClass
  protected void beforeClass() {
    log();
    if (CREATED != null) {
      throw new IllegalStateException("There exists an object.");
    }
    CREATED = new Object();
  }

  @AfterClass(alwaysRun = true)
  protected void afterClass() {
    log();
    CREATED = null;
  }

  protected void log() {
    StackTraceElement element = new Throwable().getStackTrace()[1];
    String className = getCallerSimpleClassName(element);
    System.out.printf("%12s(%s) - %s%n", className, getClass().getSimpleName(), element.getMethodName());
  }

  protected void log(String parameter) {
    StackTraceElement element = new Throwable().getStackTrace()[1];
    String className = getCallerSimpleClassName(element);
    System.out
        .printf("%12s(%s) - %s - %s%n", className, getClass().getSimpleName(), element.getMethodName(), parameter);
  }

  private String getCallerSimpleClassName(StackTraceElement element) {
    String className = element.getClassName();
    int idx = className.lastIndexOf('.');
    if (idx > 0) {
      className = className.substring(idx + 1);
    }
    return className;
  }

}
