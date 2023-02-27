class Wordscount {
  public static void main(String args[]) {
    String str = "hi hello 123 ^&&3 welcome 923%$# to bitLabs";
    String words[] = str.split(" ");
    System.out.println(words.length);
  }
}