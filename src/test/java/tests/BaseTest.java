package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

  @BeforeClass
  protected void beforeClass() {
    log();
  }

  @AfterClass(alwaysRun = true)
  protected void afterClass() {
    log();
  }

  protected void log() {
    StackTraceElement element = new Throwable().getStackTrace()[1];
    String className = getCallerSimpleClassName(element);
    System.out.printf("%s %12s(%s) - %s%n", Thread.currentThread().getName(), className, getClass().getSimpleName(),
        element.getMethodName());
  }

  protected void log(String parameter) {
    StackTraceElement element = new Throwable().getStackTrace()[1];
    String className = getCallerSimpleClassName(element);
    System.out.printf("%s %12s(%s) - %s - %s%n", Thread.currentThread().getName(), className, getClass()
        .getSimpleName(), element.getMethodName(), parameter);
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
