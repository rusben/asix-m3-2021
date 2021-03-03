package net.xeill.elpuig;

import java.util.Scanner;

class Menu {

  Scanner input = new Scanner(System.in);

  public void showMainMenu() {
    System.out.println("Welcome to Calculator");
    System.out.println("---------------------");
    System.out.println("1. Sum");
    System.out.println("2. Substract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("5. Modulo");
    System.out.println("---------------------");

  }

  public int getMainMenu() {
    String soption;
    int option;
    try {
      soption = input.nextLine();
      option = Integer.parseInt(soption);
    } catch (Exception e) {
      cls();
      showMainMenu();
       return getMainMenu();
    }

    return option;
  }

  // Limpia el terminal
  void cls() {
    System.out.print("\033\143");
  }


}
