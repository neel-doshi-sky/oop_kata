package uk.sky.kata.abstraction.intefaces;

/**
 * An interface lets us define what a class should behave like without showing the unnecessary information, this creates a contract so the class that this implements must
 * do the below methods
 */
public interface IBank {

  void deposit();

  void withdraw();

  void viewBalance();

}
