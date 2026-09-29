// Program 1.3: Employee Salary Management
public class Encapsulation3 {
    static class Employee {
        private int id;
        private double salary;

        public void setEmpData(int i, double s) {
            id = i;
            if (s >= 0) salary = s;
        }

        public void display() {
            System.out.println("ID: " + id + " | Salary: $" + salary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpData(101, 55000.50);
        emp.display();
    }
}
