package uk.sky.kata.fundamentals.abstraction.interfaces;

/**
 * We can implement multiple interfaces and have to fulfil both implementations
 */
public class BankAccountService implements BankInterface, BankSystemInterface {
  @Override
  public void deposit() {
    System.out.println("Deposit");
  }

  @Override
  public void withdraw() {
    System.out.println("Withdraw");
  }

  @Override
  public void viewBalance() {
    System.out.println("Balance: ");
  }

  @Override
  public void openAccount() {
    System.out.println("Opened account");
  }

  @Override
  public void closeAccount() {
    System.out.println("Closed account");

  }
}
