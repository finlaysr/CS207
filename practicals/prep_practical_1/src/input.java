import java.util.Scanner;

class input {
  public static <T> T get(String message) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print(message);

      return input.nextLine();
    }
  }
}
