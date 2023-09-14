class PartTimer extends Employee {
  private int hourlyRate;
  private int clockedHour;
  private int overtimeHour;

  public PartTimer(int hourlyRate, int clockedHour, int otHour) {
    this.hourlyRate = hourlyRate;
    this.clockedHour = clockedHour;
    this.overtimeHour = otHour;
  }

  @Override
  public int getSalary() {
    return this.hourlyRate * (this.clockedHour + this.overtimeHour);
  }
  
  @Override
  public String toString() {
    return "PartTimer" + super.toString();
  }
}