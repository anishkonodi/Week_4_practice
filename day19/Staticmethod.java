class Staticmethod {
  static int a = 10;

  public static void m1(int a, int b) {
    System.out.println(a); // static variable
    System.out.println(b); // local variables
  }

  public static void main(String args[]) {
    int b = 20;//local variable
    Staticmethod.m1(a, b);
  }
}
