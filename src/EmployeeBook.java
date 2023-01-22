public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int size;


    public void employee(String fio, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fio, department, (float) salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmpoyees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public Employee getEmployeeMinimumSalary() {
        Employee result = employees[9];
        double minSalary = employees[9].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + result + " рублей.");
        return result;
    }

    public Employee getEmployeeMaximumSalary() {
        Employee result = employees[9];
        double maxSalary = employees[9].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + result + " рублей.");
        return result;
    }

    public int getSummOfSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum + " рублей.");
        return sum;
    }

    public void getAverageSalary() {
        int counter = 0;
        int sum = 0;
        double averageSalary;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
            counter++;
        }
        averageSalary = sum / counter;
        System.out.println("Среднее значение зарплат составляет: " + averageSalary + " рублей.");
    }

    public void printAllFullNames() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFio());
        }
    }
}

