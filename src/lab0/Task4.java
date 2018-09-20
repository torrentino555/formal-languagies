package lab0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");

        int n = in.nextInt();

        System.out.print("Введите алфавит: ");

        ArrayList<String> alphabet = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            alphabet.add(in.next());
        }

        System.out.println("Введите матрицу умножения: ");

        ArrayList<List<String>> matrix = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            matrix.add(new ArrayList<>(n));

            for (int j = 0; j < n; j++) {
                matrix.get(i).add(in.next());
            }
        }

        System.out.println(matrix);
    }
}
