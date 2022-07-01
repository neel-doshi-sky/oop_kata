package uk.sky.kata.fundamentals.encapsulation;

public class Encapsulation {
  public static void main(String[] args) {
    //Without Encapsulation example, notice how without encapsulation, we have access to everything in this class and make changes to what we want, we are not restricted
    EmployeeWithoutEncapsulation employeeWithoutEncapsulation =
        new EmployeeWithoutEncapsulation("Neel", "Doshi", 100000D, "123A", 2);
    System.out.println(employeeWithoutEncapsulation.salary);
    employeeWithoutEncapsulation.salary = 500000d;
    System.out.println(employeeWithoutEncapsulation.salary);

    /**
     * Encapsulated example
     * Notice how we cannot access salary to modify because we have not provided a setter, this means we are safe from anyone changing the salary after creating the object
     * if we want to allow access to change the salary, we can add a setter
     */

    EmployeeEncapsulated employeeEncapsulated =
        new EmployeeEncapsulated("Neel", "Doshi", 100000D, "123A", 2);
    //Notice the below line will not work as we have encapsulated salary, we need to use a getter
    //System.out.println(employeeEncapsulated.salary);

    System.out.println(employeeEncapsulated.getSalary());
    //We have not allowed the user to modify salary or id so either attempts would not work!
//        employeeEncapsulated.setSalary(50000d);
//    employeeEncapsulated.salary = 4000d;
  }

}
