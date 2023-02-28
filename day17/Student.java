import java.util.Scanner;

class Student {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter student name");
    String name = s.nextLine();
    String password = " ";

    if (name.length() < 5 || name.length() > 15) {
      System.out.println("Number of characters in name should be between 5-15 characters.");
    } else if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
      System.out.println("Enter password");
      password = s.nextLine();
    } else {
      System.out.println("Name should starts with uppercase letter only:");
    }

    if (password.length() < 5 || password.length() > 10) {
      System.out.println(" Password length should be between 5-10 characters only.");
    } else {
      int upcount = 0, lowcount = 0, digits = 0, special = 0, space = 0;
      for (int i = 0; i < password.length(); i++) {
        if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
          upcount = upcount + 1;
        } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
          lowcount = lowcount + 1;
        } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
          digits = digits + 1;
        } else if (password.charAt(i) != ' ') {
          special = special + 1;
        } else if (password.charAt(i) == ' ') {
          space = space + 1;
        }
      }
      if (upcount == 0 || lowcount == 0 || digits == 0 || special == 0 || space > 0) {
        System.out
            .println("Password should contains atleast 1 uppercase, 1 lowercase, 1 digit and 1 special character.");
      }
    }

    int other = 0;
    System.out.println("Enter mobile number");
    String mobile = s.nextLine();
    if (mobile.length() > 10 || mobile.length() < 10) {
      System.out.println("Mobile number should contain 10 digits only");
    } else {
      for (int i = 0; i < mobile.length(); i++) {
        if (mobile.charAt(i) >= '0' && mobile.charAt(i) <= '9') {
          other = other + 1;
        }
      }
      if (other > 10 || other < 10) {
        System.out.println("Mobile should contains only digits");
      }
    }
    if (mobile.startsWith("9") || mobile.startsWith("8") || mobile.startsWith("6") || mobile.startsWith("7")) {
      System.out.println();
    } else {
      System.out.println("Mobile number should starts with 9 or 8 or 7 or 6");
    }

    int flag = 1;
    System.out.println("Enter Email ID");
    String email = s.nextLine();
    if (email.endsWith(".com") || email.endsWith(".in")) {
      if (email.contains("@") && email.contains(".")) {
        if (email.charAt(0) >= 'A' && email.charAt(0) <= 'Z') {
          flag = 0;
        } else if (email.charAt(0) >= 'a' && email.charAt(0) <= 'z') {
          flag = 0;
        } else if (email.charAt(0) >= '0' && email.charAt(0) <= '9') {
          flag = 0;
        } else if (email.charAt(0) != ' ') {
          flag = 1;
        }
      } else {
        System.out.println("email id should contains '@' and '.'");
      }
    } else {
      System.out.println(" Email id should ends with .com  or .in");
    }
    if (flag == 1) {
      System.out.println(" Email id should not starts with special characters");
    }
    if (email.length() < 5 || email.length() > 20) {
      System.out.println("email id length should 5-20 characters.");
    }
  }
}