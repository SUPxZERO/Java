public class school {

    public static void main(String[] args) {
        Student.main(args);
    }
    public static class Student extends Person {
        // Properties
        private String studentId;
        private double gpa;
        private String grade;

        // Constructor
        public Student(String firstName, String lastName, String studentId, double gpa) {
            super(firstName, lastName);
            this.studentId = studentId;
            this.gpa = gpa;
        }

        // Constructor with firstName, lastName, and grade
        public Student(String firstName, String lastName, String grade) {
            super(firstName, lastName);
            this.grade = grade;
        }

        // Getter for studentId
        public String getStudentId() {
            return studentId;
        }

        // Setter for studentId
        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        // Getter for gpa
        public double getGpa() {
            return gpa;
        }

        // Setter for gpa
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        // Getter for grade
        public String getGrade() {
            return grade;
        }

        // Setter for grade
        public void setGrade(String grade) {
            this.grade = grade;
        }

        // Override display method to include student-specific information
        @Override
        public void display() {
            super.display();
            System.out.println("Student ID: " + studentId);
            System.out.println("GPA: " + gpa);
            if (grade != null) {
                System.out.println("Grade: " + grade);
            }
        }

        // Override printName method
        @Override
        public void printName() {
            System.out.println(getFirstName() + " " + getLastName() + " is a student with grade: " + grade);
        }

        // Main method to test the Student class
        public static void main(String[] args) {
            // Create multiple Student objects with different data
            Student student1 = new Student ("John", "Doe", "S001", 3.8);
            student1.setGrade("A");

            Student student2 = new Student("Jane", "Smith", "S002", 4.0);
            student2.setGrade("A+");

            // Using the new constructor with grade
            Student student3 = new Student("Sok", "Chet", "B+");
            student3.setStudentId("S003");
            student3.setGpa(3.9);

            // Display information for each student using display method
            System.out.println("===== Student 1 Information =====");
            student1.display();

            System.out.println("\n===== Student 2 Information =====");
            student2.display();

            System.out.println("\n===== Student 3 Information =====");
            student3.display();

            // Test the overridden printName method
            System.out.println("\n===== Testing printName method =====");
            System.out.println("Student 1:");
            student1.printName();

            System.out.println("Student 2:");
            student2.printName();

            System.out.println("Student 3:");
            student3.printName();
        }
    }

    public static class Person {
        // Properties
        private final String firstName;
        private final String lastName;

        // Constructor
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }

        public void display() {
            System.out.println("First Name: " + getFirstName());
            System.out.println("Last Name: " + getLastName());
        }

        public void printName() {
            System.out.println(getFirstName() + " " + getLastName());
        }

        public static void main(String[] args) {
            Person p = new Person("Sok", "Chet");
            System.out.println("First Name: " + p.getFirstName());
            System.out.println("Last Name: " + p.getLastName());
        }
    }
}