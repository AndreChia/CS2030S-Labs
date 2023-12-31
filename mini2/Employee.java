abstract class Employee {
  private final int id;
  private static int lastId = 0;

  public Employee() {
    this.id = Employee.lastId;
    Employee.lastId += 1;
  }

  public String toString() {
    return String.valueOf(id);
  }

  public int getBonus() {
    return 3 * this.getSalary();
  }

  public abstract int getSalary();
}