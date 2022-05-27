package uk.sky.kata.fundamentals.encapsulation;

public class EmployeeWithoutEncapsulation {

  public String firstName;
  public String lastName;
  public Double salary;
  public String id;
  public int band = 0;

  public EmployeeWithoutEncapsulation(String firstName, String lastName, Double salary,
                                      String id, int band) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.id = id;
    this.band = band;
  }

  void promoteEmployee(){
    int original = band;
    band++;
    System.out.println("Promoted employee from band: " + original + " to: " + band);
  }


}
