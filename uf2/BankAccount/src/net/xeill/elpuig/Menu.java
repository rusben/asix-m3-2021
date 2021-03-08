package net.xeill.elpuig;

import java.util.Scanner;

class Menu {

  Scanner scanner = new Scanner (System.in);

  public void mainMenu() {

    System.out.println("---------- Welcome to BankAccount ----------");
    System.out.println("---------- ---------- ---------- ----------");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Retirar dinero");
    System.out.println("3. Ingresar dinero");
    System.out.println("4. Salir");

  }

  public int getMainMenu() {

    String soption;
    int option;

    try {
        soption = scanner.nextLine();
        option = Integer.parseInt(soption);
    } catch (Exception e) {
      mainMenu();
      return getMainMenu();
    }

    return option;

  }


}
