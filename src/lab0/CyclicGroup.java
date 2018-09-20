package lab0;

public class CyclicGroup {
    private int n;

    public CyclicGroup(int n) {
        this.n = n;
    }

    public void showMutliplicationTable() {
        System.out.println("Z(" + n + ")\n");

        System.out.print("X ");

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < n; j++) {
                System.out.print((i * j) % n + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
