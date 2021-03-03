package net.xeill.elpuig;

import java.util.Scanner;

class Account {

  String username;
  int balance;

  public Account(String username, int balance) {
    this.username = username;
    this.balance = balance;
  }

  public void makeDeposit(int money) {
    System.out.println("You are lucky! You get a deposit of: "+money);
    this.balance += money;
  }

  public void withdraw(int money) {

    System.out.println("Trying to get: "+money);

    if (money > balance) {
      System.out.println("Sorry, you have not enough money.");
    } else {
      System.out.println("Here you have.");
      this.balance -= money;
    }

  }

  public void showBalance() {
    System.out.println("Account owner: "+this.username);
    System.out.println("Your balance is: "+this.balance);
  }


}
