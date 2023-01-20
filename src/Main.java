public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.employee("Иванов Иван Иванович", 1, 60000f);
        employeeBook.employee("Семенов Семен Семенович", 2, 65000f);
        employeeBook.employee("Сидоров Сергей Александрович", 3, 50000f);
        employeeBook.employee("Петров Петр Петрович", 4, 110_000f);
        employeeBook.employee("Александров Александр Александрович", 1, 75000f);
        employeeBook.employee("Сергеев Сергей Сергеевич", 5, 70000f);
        employeeBook.employee("Кощеева Любовь Аркадьевна", 1, 90000f);
        employeeBook.employee("Ступен Федр Алексеевич", 3, 50000f);
        employeeBook.employee("Бесмертных Семен Семенович", 2, 55000f);
        employeeBook.employee("Колобков Юрий Васильевич", 5, 63000f);

        employeeBook.printAllEmpoyees();
        System.out.println();

        employeeBook.getSummOfSalary();
        System.out.println();

        employeeBook.getEmployeeMinimumSalary();
        System.out.println();

        employeeBook.getEmployeeMaximumSalary();
        System.out.println();

        employeeBook.getAverageSalary();
        System.out.println();

        employeeBook.printAllFullNames();
        System.out.println();

    }
}
