package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        int qount = 0;
        while (qount++ <= 10) {
            System.out.print("Олимпиада "+ (year) +" года\n");
            year = year+4;
        }
    }
}
