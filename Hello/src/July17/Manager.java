package july17;

import July17.Employee;
import july10.Account;

public class Manager extends Employee {
    private int salary;

    public Manager(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int work(int hours, Account account) {
        try {
            account.transaction(salary);
        } catch (Exception e) {
            System.out.println("Mo money mo problems");
        }
        return salary;
    }
}