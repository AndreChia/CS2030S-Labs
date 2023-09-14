class Executive extends Employee {
  private int baseSalary;
  private int currSalary;

  public Executive(int salary) {
    this.baseSalary = salary;
    this.currSalary = salary;
  }

  @Override
  public int getSalary() {
    return this.currSalary;
  }

  @Override
  public int getBonus() {
    this.currSalary += this.baseSalary;
    return 0;
  }
  
  @Override
  public String toString() {
    return "Executive" + super.toString();
  }
}