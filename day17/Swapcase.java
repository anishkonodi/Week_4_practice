class Swapcase {
  public static void main(String args[]) {
    String str = "Hello Welcome";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        System.out.print(str.charAt(i+32));
      } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        System.out.print(str.charAt(i));

      }
    }

  }
}