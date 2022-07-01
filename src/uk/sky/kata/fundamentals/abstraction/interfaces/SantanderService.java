package uk.sky.kata.fundamentals.abstraction.interfaces;

public class SantanderService implements BankInterface {
  @Override
  public void deposit() {
    System.out.println("Depositing to santander bank");
  }

  @Override
  public void withdraw() {
    System.out.println("Withdrawing to santander bank");
  }

  @Override
  public void viewBalance() {
    System.out.println("santander bank balance: £4000");
  }
}
