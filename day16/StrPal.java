class StrPal {
  public static void main(String args[]) {
    String str = "malayalam";
    int pal = str.length() / 2;

    int count = 0;
    for (int i = 0; i < str.length()/2; i++) {
      for (int j = str.length() - 1; j > 0; j--) {
        if (i != j) {
          if (str.charAt(i) == str.charAt(j)) {
            count = count + 1;
            break;
          }
        }
      }
    }
    if (pal == count) {
      System.out.println("Yes it is palindrome");
    } else {
      System.out.println("No it is not  palindrome");
    }
  }
}