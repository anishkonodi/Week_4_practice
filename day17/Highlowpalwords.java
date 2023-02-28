class Highlowpalwords {
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
    int high=pali[0].length();
    int low=pali[0].length();
    String highpal=pali[0];
    String lowpal=pali[0];
    for(int i=1;i<paliindex;i++){
      if(high<pali[i].length()){
        high=pali[i].length();
        highpal=pali[i];
      }
      if(low>pali[i].length()){
        low=pali[i].length();
        lowpal=pali[i];
      }
    }
    System.out.println("The longest palindrome in the string is "+highpal+" length is "+high);
    System.out.println("The smallest palindrome in the string is "+lowpal+" length is "+low);
  }
}