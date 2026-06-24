// ABCDE
// A  D
// A C
// AB
// A
class Demo36 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                if (i == 5 || j == 1 || j == i) {
                    System.out.print((char) ('A' + j - 1));
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}