package ebookjakubfilistynski;

import java.util.ArrayList;
import java.util.List;

public class Book {
  private List<Person> bookList = new ArrayList<Person>();

  public Book() {

  }

  public void addContact(String name, String surname, String number) {
    bookList.add(new Person(name, surname, number));
  }

  /**
   * This method print all saved contacts.
   */
  public void printContacts() {
    for (Person x: bookList) {
      x.getData();
    }
  }
}
