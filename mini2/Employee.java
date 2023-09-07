class Employee {
  private final int id;
  public static int lastId = 0;

  public Employee() {
    this.id = Employee.lastId;
    Employee.lastId += 1;
  }

  public String toString() {
    return String.valueOf(id);
  }

  public int getSalary() {
    return 0;
  };
}