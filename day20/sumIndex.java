
import java.util.Scanner;

class sumIndex {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 1, 4, 7, 8, 3, 2 };
    int count=0;
    System.out.println("Enter number ");
    int key = s.nextInt();
    int count = 0, indexI = -1, indexJ = -1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == key) {
          System.out.println(i + " " + j);
        }
      }
    }
    
  }
}