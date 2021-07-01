package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrixIntArray = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < matrixIntArray.length; i++) {
            for (int j = 0; j < matrixIntArray[i].length; j++) {
                matrixIntArray[i][j] = random.nextInt(51);
            }
        }
        int maxRowSum = 0;
        int indexMaxSum = 0;
        for (int i = 0; i < matrixIntArray.length; i++) {
            int currentRowSum = 0;
            for (int j: matrixIntArray[i]) {
                currentRowSum += j;
            }
            if (currentRowSum >= maxRowSum) {
                maxRowSum = currentRowSum;
                indexMaxSum = i;
            }
        }
        System.out.println("indexMaxSum = " + indexMaxSum);
    }
}
