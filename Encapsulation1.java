// Program 1.1: Student Class with Private Data & Validation
public class Encapsulation1 {
    static class Student {
        private String name;
        private int age;

        public void setName(String n) { name = n; }
        public void setAge(int a) { if(a > 0) age = a; }

        public String getName() { return name; }
        public int getAge() { return age; }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ali");
        s.setAge(21);
        System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
    }
}
