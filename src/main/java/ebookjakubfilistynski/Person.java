package ebookjakubfilistynski;

public class Person {
  private  String name;
  private  String surname;
  private  String number;

  /**
   * This is constructor of this class.
   * @param name Person's name.
   * @param surname Person's surname.
   * @param number  Person's number.
   */
  public Person(String name, String surname, String number) {
    this.name = name;
    this.surname = surname;
    this.number = number;
  }

  public void getData() {
    System.out.println(name + " " + surname + " " + number);
  }



}
