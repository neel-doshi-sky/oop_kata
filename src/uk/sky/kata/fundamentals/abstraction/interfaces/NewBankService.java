package uk.sky.kata.fundamentals.abstraction.interfaces;

public class NewBankService implements BankInterface {
  @Override
  public void deposit() {
    System.out.println("Depositing to new bank");
  }

  @Override
  public void withdraw() {
    System.out.println("Withdrawing to new bank");
  }

  @Override
  public void viewBalance() {
    System.out.println("New bank balance: £4000");
  }
}
