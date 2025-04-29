/**
 * Class representing student with variables for name, age, and student number
 * @author Richard Gao
 * @version 1.0.0
 */
public class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Creates instance of the Student class with given name, age, and student number
     * @param name String representing name of the student
     * @param age int representing age of the student
     * @param studentNumber String representing student number of the student
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Gets the name of the student
     * @return String representing name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the student
     * @return int representing age of the student
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the student number of the student
     * @return String representing student number of the student
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * Represents the student instance as a String.
     * 
     * String is formatted as "name, age - student number"
     * @return String representation of the student instance
     */
    @Override
    public String toString() {
        return getName() + ", " + getAge() + " - " + getStudentNumber();
    }

    /**
     * Checks if two student instances are equal.
     * 
     * Two students are considered equal if their student numbers are the same.
     * @return true if student numbers are the same, false if different or if compared instance is not a student
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return getStudentNumber().equals(student.getStudentNumber());
    }
}
