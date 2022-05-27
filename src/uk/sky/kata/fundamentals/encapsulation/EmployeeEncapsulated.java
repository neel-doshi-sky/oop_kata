package uk.sky.kata.fundamentals.encapsulation;

public class EmployeeEncapsulated {

  private String firstName;
  private String lastName;
  private Double salary;
  private String id;
  private int band = 0;

  public EmployeeEncapsulated(String firstName, String lastName, Double salary, String id,
                              int band) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.id = id;
    this.band = band;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Double getSalary() {
    return salary;
  }

  public String getId() {
    return id;
  }

  public int getBand() {
    return band;
  }
}
