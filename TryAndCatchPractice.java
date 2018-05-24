// Wrap the problematic code in the try block, than make it print "Problem with code detected" if the exception is thrown.

public class Main {
  public static void main(String[] args) {
    try {int[] arr = new int[10];
      System.out.println(arr[9001]);
    } catch (Exception ArrayIndexOutOfBoundsException){
      System.out.print("Problem with code detected");
    }
  }
}
