import java.util.Objects;

public class Employee {
    private final String fio;
    public String getName;
    private int department;
    private double salary;
    private int id;
    public static int counter = 0;

    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }


    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

}