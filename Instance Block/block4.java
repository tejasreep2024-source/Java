public class block4 {

  int a = 10;
  int b = 5;
  static int i = 10;
  static int j = 40;

  void m1() {
    System.out.println("m1 - method" + (a + b));
  }

  void m2(int a, int b) {
    System.out.println("m2 - method" + (a + b));
  }

  {
    System.out.println("Instance Block");
  }

  static void m3() {
    System.out.println("m3 - method" + (i + j));
  }

  static void m4(int i, int j) {
    System.out.println("m4 - method" + (i + j));
  }

  static {
    System.out.println("Static Block");
  }

  block4() {
    System.out.println("No Argument Constructor");
  }

  block4(int k) {
    System.out.println(" Argument Constructor" + k);
  }

  public static void main(String[] args) {
    block4 t = new block4();
    t.m1();
    t.m2(3, 5);
    m3();
    m4(4, 6);

    block4 t1 = new block4(2);

  }
}
