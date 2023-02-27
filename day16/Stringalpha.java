class Stringalpha {
  public static void main(String args[]) {
    String str = "Hi Hello!!, welcome to bitLabs! 1234";
    int upcount = 0, lowcount = 0, digits = 0, space = 0, special = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        upcount = upcount + 1;
      } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        lowcount = lowcount + 1;
      } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        digits = digits + 1;
      }
       else if(str.charAt(i)!=' '){
         special=special+1;
       }
      else if(str.charAt(i)==' '){
        space=space+1;
      }
    }
    System.out.println("Upper case letters count is" + upcount);
    System.out.println("Upper case letters count is" + lowcount);
    System.out.println("Digits  count is " + digits);
    System.out.println("Special character count is " + special);
    System.out.println("Space count is " + space);
  }
}