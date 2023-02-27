class Frequencychar {
  public static void main(String args[]) {
    String str = "hello welcome";
    int count = 1;
    String words[] = str.split(" ");
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) != ' ') {
          if (str.charAt(i) == str.charAt(j)) {
            count = count + 1;
          }
        }
      }
      System.out.println("The frequency of the letter " + str.charAt(i) + " in the string " + str + " is " + count);
      count = 1;
    }
  }
}