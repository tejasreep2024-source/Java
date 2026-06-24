//     1
//    11
//   1*1
//  1**1
// 11111
class Demo47 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 2 || i == 5 || j == 1 || j == i) {
                    System.out.print("1");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}