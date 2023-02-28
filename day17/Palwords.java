class Palwords {
  public static void main(String args[]) {
    String str = "Hello madam malayalam dad radar welcome namaste abababa";
    String words[] =str.split(" ");
    String pali[] = new String[str.length()];
    int count = 0,paliindex=0;
    for (int i = 0; i < words.length; i++) {
      count = 0;
      for (int j = 0; j < words[i].length() / 2; j++) {
        for (int k = words[i].length() - 1; k > 0; k--) {
          if(words[i].length()!=1){
          if (words[i].charAt(j) == words[i].charAt(k)) {
            count = count + 1;
            break;
          }
      }
      }
      if(words[i].length()/2==count){
        pali[paliindex]=words[i];
        paliindex++;
      }
      }
    }
    System.out.println("The palindrome words in the Sentence is ");
    for(int i=0;i<paliindex;i++){
      System.out.println(pali[i]);
    }
  }
}