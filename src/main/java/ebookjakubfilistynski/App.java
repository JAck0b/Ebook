package ebookjakubfilistynski;

import java.util.Scanner;

public class App {
  /**
 * Main function.
 * @param args Required parameter.
 */
  public static void main(String[] args) {
    System.out.println("1");
    Scanner in = new Scanner(System.in);
    String command = "";
    System.out.println("");
    Info info = new Info();
    Book book = new Book();
    System.out.print("Enter a command [info - more information]  ");
    command = in.nextLine();
    while (!command.equals("exit")) {
      if (command.equals("info")) {
        info.printMessage();
      } else if (command.equals("add")) {
        String name;
        System.out.println("Enter the name.");
        name = in.nextLine();
        String surname;
        System.out.println("Enter the surname.");
        surname = in.nextLine();
        String number;
        System.out.print("Enter the number.");
        number = in.nextLine();
        book.addContact(name, surname, number);
      } else if (command.equals("list")) {
        book.printContacts();
      } else {
        System.out.println("Wrong command.");
      }
      System.out.print("Enter a command [info - more information]  ");
      command = in.nextLine();
    }
  }
}
