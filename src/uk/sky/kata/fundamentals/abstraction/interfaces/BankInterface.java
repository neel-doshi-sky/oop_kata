package uk.sky.kata.fundamentals.abstraction.interfaces;

/**
 * An interface lets us define what a class should behave like without showing the unnecessary information, this creates a contract so the class that this implements must
 * do the below methods
 */
public interface BankInterface {

  void deposit();

  void withdraw();

  void viewBalance();

}
