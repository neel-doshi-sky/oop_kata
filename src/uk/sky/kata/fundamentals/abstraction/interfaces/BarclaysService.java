package uk.sky.kata.fundamentals.abstraction.interfaces;

public class BarclaysService implements BankInterface {
  @Override
  public void deposit() {
    System.out.println("Depositing money to barclays");
  }

  @Override
  public void withdraw() {
    System.out.println("Withdrawing money from barclays");
  }

  @Override
  public void viewBalance() {
    System.out.println("Here is your barclays balance: £1000");

  }
}
