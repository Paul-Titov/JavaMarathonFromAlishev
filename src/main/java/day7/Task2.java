package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random();

        Player.info();

        Player player1 = new Player(random1.nextInt(11)+90);
        Player player2 = new Player(random1.nextInt(11)+90);
        Player player3 = new Player(random1.nextInt(11)+90);
        Player player4 = new Player(random1.nextInt(11)+90);
        Player player5 = new Player(random1.nextInt(11)+90);
        Player.info();

        Player player6 = new Player(random1.nextInt(11)+90);

        Player.info();

        Player player7 = new Player(random1.nextInt(11)+90);
        Player player8 = new Player(random1.nextInt(11)+90);

        Player.info();

        for (int i = 0; i < 100; i++) {
            player3.run();
        }

        Player.info();

        Player player9 = new Player(random1.nextInt(11)+90);

        Player.info();

    }
}
