public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("name1", "middle1", "last1", 1000, 1);
        employees[1] = new Employee("name2", "middle2", "last2", 2000, 1);
        employees[2] = new Employee("name3", "middle3", "last3", 3000, 2);
        employees[3] = new Employee("name4", "middle4", "last4", 4000, 2);
        employees[4] = new Employee("name5", "middle5", "last5", 5000, 3);
        employees[5] = new Employee("name6", "middle6", "last6", 6000, 3);
        employees[6] = new Employee("name7", "middle7", "last7", 7000, 4);
        employees[7] = new Employee("name8", "middle8", "last8", 8000, 4);
        employees[8] = new Employee("name9", "middle9", "last9", 9000, 5);
        employees[9] = new Employee("name10", "middle10", "last10", 10000, 5);

        printEmployees();
        System.out.println(sumSalary());
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(averageSalary());
    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minSalary() {
        int index = 0;
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    private static Employee maxSalary() {
        int index = 0;
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < maxSalary) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    private static double averageSalary() {
        return (double) sumSalary() / employees.length;
    }

    private static void printEmployeeFIO(){
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());

        }
    }
}