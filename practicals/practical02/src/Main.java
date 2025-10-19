import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(String.format("Hello and welcome!"));
    question2();
  }

  public static void question2() {
    StackADT<String> stackADT = new LinkedStack<>();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please type one option. Values in [] are required, values in () are not.");
    boolean done = false;

    while (!done) {
      System.out.print("\nOptions: add [e], remove (top), show (top), empty, size, traverse, quit: ");

      String option = scanner.nextLine().trim().toLowerCase();
      String param = "";
      if (option.contains(" ")) {
        param = option.split(" ")[1];
        option = option.split(" ")[0];
      }

      switch (option) {
        case "add": {
          if (param.isEmpty()) {
            System.out.println("Please input the value you want to add, e.g. add hello");
          } else {
            stackADT.push(param);
            System.out.println("Added " + param + " to the stack");
          }
          break;
        }

        case "remove": {
          try {
            String removed = stackADT.pop();
            System.out.println("Removed: " + removed);
          } catch (EmptyStackException e) {
            System.out.println("No elements to remove!");
          }
          break;
        }

        case "show": {
          try {
            System.out.println("Top: " + stackADT.getTop());
          } catch (EmptyStackException e) {
            System.out.println("No elements to show!");
          }
          break;
        }

        case "empty": {
          System.out.println("The stack is " + (stackADT.isEmpty() ? "" : "not ") + "empty");
          break;
        }

        case "size": {
          System.out.println("Size: " + stackADT.size());
          break;
        }

        case "traverse": {
          try {
            stackADT.traverse();
          } catch (EmptyStackException e) {
            System.out.println("No elements to traverse!");
          }
          break;
        }

        case "quit": {
          done = true;
          break;
        }

        default: {
          System.out.println("Invalid option");
          break;
        }

      }
    }
    scanner.close();
  }
}
