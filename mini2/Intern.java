class Intern extends Employee {
  private int hourlyRate;
  private int clockedHour;

  public Intern(int hourlyRate, int clockedHour) {
    this.hourlyRate = hourlyRate;
    this.clockedHour = clockedHour;
  }

  @Override
  public int getSalary() {
    return this.hourlyRate * clockedHour;
  }

  @Override
  public String toString() {
    return "Intern" + super.toString();
  }
}