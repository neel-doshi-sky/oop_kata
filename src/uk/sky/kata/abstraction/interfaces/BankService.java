package uk.sky.kata.abstraction.interfaces;

public class BankService implements IBank{
  @Override
  public void deposit() {
    System.out.println("Depositing money");
  }

  @Override
  public void withdraw() {
    System.out.println("Withdrawing money");
  }

  @Override
  public void viewBalance() {
    System.out.println("Here is your balance: £1000");

  }
}
