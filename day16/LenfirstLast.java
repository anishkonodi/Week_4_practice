class LenfirstLast {
  public static void main(String args[]) {
    String str = "hi hello 123 ^&&3 welcome 923%$# to bitLabs";
    int count = 0;
    String words[] = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length(); j++) {
        if (i == 0) {

          System.out.println("The number of character in a first word " + words[i] + " is " + words[i].length());
          break;
        } else if (i == words.length - 1) {
          System.out.println("The number of character in a Last word " + words[i] + " is " + words[i].length());
          break;
        }
      }
    }

  }
}