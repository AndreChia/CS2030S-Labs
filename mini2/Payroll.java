import java.util.ArrayList;

class Payroll {
  private ArrayList<Employee> employees = new ArrayList<Employee>();

  public void register(Employee e) {
    employees.add(e);
  }

  public int getTotalSalary() {
    int totalSalary = 0;
    for (Employee e: employees) {
      totalSalary += e.getSalary();
    }
    return totalSalary;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < employees.size(); i++) {
      str.append(employees.get(i).toString());
      if (i < employees.size() - 1) {
        str.append(" ");
      }
    }
    return str.toString();
  }
}