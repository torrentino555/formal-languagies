package lab0;

import java.util.HashSet;
import java.util.Set;

public class GenerateCombinations {
    private int n;
    private long count = 0;

    public GenerateCombinations(int n) {
        this.n = n;
    }

    public void showAllCombinations() {

        for (int i = 1; i <= n; i++) {
            HashSet<Integer> set = new HashSet<>();
            set.add(i);
            recursion(set, i + "");
        }

        System.out.println("Всего: " + count);
    }

    private void recursion(HashSet<Integer> set, String res) {
        if (set.size() == n) {
            System.out.println(res);
            count++;
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                HashSet<Integer> copy = new HashSet<>(set);
                copy.add(i);
                recursion(copy, res + " " + i);
            }
        }
    }

}
