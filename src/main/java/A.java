class A {
  public int foo(boolean a) {
    int b = 12;
    if(a) {
      return b;
    }
    return b;
  }

  public int foo2(boolean a) {
    int b = 12;
    if(a) {
      return b;
    }
    return b - 1;
  }

  private int someExceptionalMethod() {
    throw new IllegalStateException();
  }

  public boolean someMethod() {
    try {
      someExceptionalMethod();
    } catch (IllegalArgumentException e) {
      return false;
    }
    return true;
  }
}

