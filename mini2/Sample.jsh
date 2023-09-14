/open Queue.java
/open Employee.java
/open Payroll.java
/open Manager.java
/open FullTimer.java
/open PartTimer.java
/open Intern.java
/open Executive.java
/open Tester.java

Tester i = new Tester();

// Payroll
Payroll p = new Payroll(5);

// manager, 10000 monthly salary, 10 hr overtime
Employee m = new Manager(10000, 10);
p.register(m);
i.expect("m", p.getTotalSalary(), 10625);

// fulltimer, 5000 monthly salary
Employee ft = new FullTimer(5000); 
p.register(ft);
i.expect("m + ft", p.getTotalSalary(), 15625);

// parttimer, 40 per hr, 100 hr, 20 hr overtime
Employee pt = new PartTimer(40, 100, 20);
p.register(pt);
i.expect("m + ft + pt", p.getTotalSalary(), 21225);

// intern, 30 per hr, 50 hr
Employee it = new Intern(30, 50);
p.register(it);
i.expect("m + ft + pt + it", p.getTotalSalary(), 22725);

// executives, base salary of 100000
Employee ex = new Executive(100000);
p.register(ex);
i.expect("m + ft + pt + it + ex(0)", p.getTotalSalary(), 122725);

ex.getBonus();
i.expect("m + ft + pt + it + ex(1)", p.getTotalSalary(), 222725);

ex.getBonus();
i.expect("m + ft + pt + it + ex(2)", p.getTotalSalary(), 322725);

i.end()
