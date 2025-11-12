package homework14.additional;

public class CorporateOffice {

    Employee[] employees;
    Department[] departments;
    int employeeCount;
    int departmentCount;

    public CorporateOffice() {
        this.employees = new Employee[100]; // Припустимо, що в офісі може бути не більше 100 працівників
        this.departments = new Department[10]; // Припустимо, що в офісі може бути не більше 10 відділів
        this.employeeCount = 0;
        this.departmentCount = 0;
    }

    public void addEmployee(String name, int age, String departmentName) {
        Department dep = findDepartment(departmentName);
        if (dep == null) {
            dep = new Department(departmentName);
            if (departmentCount < departments.length) {
                departments[departmentCount] = dep;
                departmentCount++;
            } else {
                System.out.println("Помилка: Досягнуто максимальної кількості відділів.");
                return;
            }
        }

        Employee instance = new Employee(name, age, dep);
        if (employeeCount < employees.length) {
            employees[employeeCount] = instance;
            employeeCount++; // Збільшуємо лічильник!
        } else {
            System.out.println("Помилка: Досягнуто максимальної кількості працівників.");
        }
    }

    public double getAverageAgeByDepartment(String departmentName) {
        Department department = findDepartment(departmentName);
        if (department == null) {
            return 0.0;
        }
        int sum = 0;
        int empCount = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getAge();
                empCount++;
            }
        }
        if (empCount == 0) {
            return 0.0;
        }
        return (double) sum / empCount;
    }

    // Внутрішній клас для представлення працівників
    public class Employee {

        String name;
        int age;
        Department department;

        public Employee(String name, int age, Department department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Department getDepartment() {
            return department;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }

    // Внутрішній клас для представлення відділів
    public class Department {

        String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private Department findDepartment(String departmentName) {
        for (int i = 0; i < departmentCount; i++) {
            if(departments[i].getName().equals(departmentName))
                return departments[i];
        }
        return null;
    }
}