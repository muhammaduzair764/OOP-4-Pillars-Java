// Program 3.2: Multilevel Inheritance (Person -> Employee -> Manager)
public class Inheritance2 {
    static class Person {
        public void displayPerson() { System.out.println("I am a Person."); }
    }

    static class Employee extends Person {
        public void displayEmp() { System.out.println("I am an Employee."); }
    }

    static class Manager extends Employee {
        public void displayMgr() { System.out.println("I am a Manager."); }
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayPerson();
        m.displayEmp();
        m.displayMgr();
    }
}
