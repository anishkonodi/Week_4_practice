class Alphacount {
  public static void main(String args[]) {
    String str = "hi hello 123 ^&&3 welcome 923%$# to bitLabs";
    int count = 0;
    String words[] = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      System.out.println("The alphabets in a given word  "+words[i]);
      for(int j=0;j<words[i].length();j++){
      if (words[i].charAt(j) >= 'A' && words[i].charAt(j) <= 'Z' || words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z') {
        count = count + 1;
        
        System.out.println(words[i].charAt(j));
      }
        
      }
      System.out.println("the count of the alphabet is"+count);
      count=0;
    }
   
  }
}