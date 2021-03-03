package net.xeill.elpuig;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Account a = new Account("Husnain", 5000);
    a.showBalance();

    a.makeDeposit(500);

    a.showBalance();

    a.withdraw(7000);

    a.showBalance();

    a.withdraw(5000);

    a.showBalance();

  }
}
