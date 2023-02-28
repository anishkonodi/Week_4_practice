class Highlowfrequency {
  public static void main(String args[]) {
    String str = "hello welcome";
    int count = 1, high = 1, low = 1;

    char ch[] = new char[str.length()];
    char h = ch[0], l = ch[0];
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
      if (ch[i] != ' ') {
        if (count > high) {
          high = count;
          h = ch[i];
        } else {
          low = count;
          l = ch[i];
        }
      }
      count = 1;
    }
    System.out.println("The highest frequency of the letter " + h + " is " + high);
    System.out.println("The lowest frequency of the letter " + l + " is " + low);
  }
}