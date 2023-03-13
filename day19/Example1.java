import java.util.Scanner;

class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the string ");
    String str = s.next();
    System.out.println("Enter the character ");
    char c = s.next().charAt(0);
    int count = 0;
    char ch[] = str.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      if (c == ch[i]) {
        count = count + 1;

      }
    }
    if (count == ch.length - count) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}