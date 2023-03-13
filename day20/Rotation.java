import java.util.Scanner;

class Rotation {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    System.out.println("Enter index");
    int key = s.nextInt();
    int temp = 0;

    System.out.println("Before shifting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < key; i++) {
      temp = arr[0];
      for (int j = 0; j < arr.length - 1; j++) {
        arr[j] = arr[j + 1];
      }
      arr[arr.length - 1] = temp;
    }
    System.out.println("After shifting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}