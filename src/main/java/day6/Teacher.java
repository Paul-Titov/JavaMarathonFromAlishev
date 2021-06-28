package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        int random = (int)(2+Math.random()*4);
        System.out.println("Преподаватель "+name+" оценил студента с именем "+student.getName()+" по предмету "+subject+" на оценку "+random+".");
    }
}
