package ebookjakubfilistynski;

public class Info {
  private final String message = "add - Add new person.\n" + "info - Information.\n"
      + "list - List of contacts.\n" + "exit - Shut down program.\n";

  public Info(){}

  public void printMessage() {
    System.out.println(message);
  }
}
