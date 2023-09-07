class Manager extends Employee {
  private int monthlySalary;
  private int overtimeHours;

  public Manager(int salary, int otHours) {
    this.monthlySalary = salary;
    this.overtimeHours = otHours;
  }

  @Override
  public int getSalary() {
    return this.monthlySalary
    + this.overtimeHours * this.monthlySalary / 160;
  }

  @Override
  public String toString() {
    return "Manager" + super.toString();
  }
}