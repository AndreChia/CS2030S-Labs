class Tester {
  private int fail;
  private int pass;

  public Tester() {
    this.fail = 0;
    this.pass = 0;
  }

  public void expect(String msg, Object actual, Object expected) {
    if (actual.equals(expected)) {
      this.pass += 1;
      System.out.println("Test #" + (this.fail + this.pass) + " [PASS]: " + msg);
    } else {
      this.fail += 1;
      System.out.println("Test #" + (this.fail + this.pass) + " [FAIL]: " + msg);
      System.out.println("  - Expected: " + expected);
      System.out.println("  - Actual: " + actual);
    }
  }

  public void end() {
    System.out.println("Statistic: " + this.pass + "/" + (this.fail + this.pass));
  }
}
