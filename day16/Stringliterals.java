class Stringliterals{
  public static void main(String args[]){
    String str1="hi";
    String str2="hello";
    String str3="hi";
    System.out.println(str1==str2);
    System.out.println(str1==str3);
    System.out.println(str2==str3);
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str2.equals(str3));
    
  }
}