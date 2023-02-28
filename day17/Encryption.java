class Encryption {
  public static void main(String args[]) {
    String str = "Hello Welcome";
    System.out.println("Before encryption string is : " + str);
    // char ch[] = new char[str.length()];
    // for (int i = 0; i < str.length(); i++) {
    // ch[i] = str.charAt(i);
    // }
    // String st = " ";
    // for (int i = 0; i < ch.length; i++) {
    // // if (ch[i] != ' ') {
    // if (i % 2 == 0) {
    // st = st + ch[i];
    // }
    // // }
    // }
    // for (int i = 0; i < ch.length; i++) {
    // // if (ch[i] != ' ') {
    // if (i % 2 == 1) {
    // st = st + ch[i];
    // }
    // // }
    // }
    // System.out.println("Encrypted String is : " + st);
    // char c[] = new char[st.length()];
    // for (int i = 0; i < st.length(); i++) {
    // c[i] = st.charAt(i);
    // }
    // for (int i = 0; i < c.length; i++) {
    // if()
    // }
    System.out.println("After encryption : ");
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        if (i % 2 == 0) {
          System.out.print(str.charAt(i));
        }
      }
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        if (i % 2 == 1) {
          System.out.print(str.charAt(i));
        }
      }
    }
    System.out.println();
    System.out.println("After Decryption : ");

    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(str.charAt(i));
      } else {
        System.out.print(str.charAt(i));
      }
    }

  }
}