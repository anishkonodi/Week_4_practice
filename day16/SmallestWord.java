class SmallestWord {
  public static void main(String args[]) {
    String str = "hi hello 123 ^&&3 welcome 923%$# to bitLabs";
    String words[] = str.split(" ");
    int smallest = words[0].length();
    String smallword = words[0];
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (smallest > words[j].length()) {
          smallest = words[j].length();
          smallword = words[j];
        }
      }
    }
    System.out.println(smallword);
  }
}