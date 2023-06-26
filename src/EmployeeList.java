import java.util.ArrayList;

public class EmployeeList {
    static ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void deleteEmployeeById(int id) {
        employees.remove(findEmployeeById(id));
    }

    public static Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public static ArrayList<Employee> findEmpsWithLowerSalary(double salary) {
        ArrayList<Employee> lowerSalaryEmps = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() < salary)
                lowerSalaryEmps.add(employee);
        }
        return lowerSalaryEmps;
    }


    public static Employee getEmployerWithLowerSalary() {
        Employee minEmployee = new Employee(0, "", "", 0, Double.MAX_VALUE);
        double min = Double.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                minEmployee = employee;
                min = employee.getSalary();
            }
        }
        return minEmployee;
    }

    public static double getSumOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static ArrayList<Employee> getDepartmentEmps(int department) {
        ArrayList<Employee> departmentEmployees = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getDepartment() == department)
                departmentEmployees.add(employee);
        }
        return departmentEmployees;
    }
}
