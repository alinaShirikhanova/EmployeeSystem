import java.util.ArrayList;

public class Employee {
    private final int id;
    private String name;
    private String surname;
    private int department;
    private int department1;
    private double salary;

    private static final int minDepartmentValue = 1;
    private static final int maxDepartmentValue = 7;

    public Employee(int id, String name, String surname, int department, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        EmployeeList.employees.add(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (minDepartmentValue <= department && department <= maxDepartmentValue)
            this.department = department;
        else
            this.department = 1;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


}


