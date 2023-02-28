class Uniquechar {
  public static void main(String args[]) {
    String str = "hello welcome";
    int count = 1;
    char ch[] = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    for (int i = 0; i < ch.length; i++) {
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          count = count + 1;
          ch[j] = ' ';
        }
      }
        if (count == 1) {
          System.out.println(ch[i]);
        }
      count = 1;
    }
  }
}