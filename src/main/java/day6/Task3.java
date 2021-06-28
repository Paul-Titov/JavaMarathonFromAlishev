package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("teachersName", "teachersSubject");
        Student student = new Student("studentsName");
        teacher.evaluate(student);
    }
}
