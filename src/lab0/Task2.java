package lab0;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размерность перестановки: ");

        int n = in.nextInt();

        new GenerateCombinations(n).showAllCombinations();
    }
}
