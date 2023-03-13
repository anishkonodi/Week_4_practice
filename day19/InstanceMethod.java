class InstanceMethod {
  static int b = 30;
  int c = 40;

  public void m1(int a, int b) {
    System.out.println(a);// local variables
    System.out.println(b);// static variable
    System.out.println(c);// instance variables
  }

  public static void main(String args[]) {
    InstanceMethod obj = new InstanceMethod();
    int a = 10;// local variables
    obj.m1(a, b);
  }
}