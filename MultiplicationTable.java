public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
