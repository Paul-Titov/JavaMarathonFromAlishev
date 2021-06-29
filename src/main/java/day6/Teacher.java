package day6;

import java.util.Random;

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
        Random random = new Random();
        int value = random.nextInt(4)+2;
        String evaluation;
        if (value==2) {
            evaluation = "неудовлетворительно";
        } else if (value==3) {
            evaluation = "удовлетворительно";
        } else if (value==4) {
            evaluation = "хорошо";
        } else {
            evaluation = "отлично";
        }
        System.out.println("Преподаватель "+name+" оценил студента с именем "+student.getName()+" по предмету "+subject+" на оценку "+evaluation+".");
    }
}
