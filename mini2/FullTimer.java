class FullTimer extends Employee {
  private int monthlySalary;

  public FullTimer(int salary) {
    this.monthlySalary = salary;
  }

  @Override
  public int getSalary() {
    return this.monthlySalary;
  }
  
  @Override
  public String toString() {
    return "FullTimer" + super.toString();
  }
}