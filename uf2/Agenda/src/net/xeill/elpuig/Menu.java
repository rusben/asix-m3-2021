package net.xeill.elpuig;

import java.util.Scanner;

public class Menu {

  Scanner scanner = new Scanner (System.in);

  public void mainMenu() {

    System.out.println("---------- Welcome to Agenda ----------");
    System.out.println("---------- ---------- ---------- ----------");
    System.out.println("1. Mostrar contactos");
    System.out.println("2. Agregar un contacto");
    System.out.println("3. Modificar un contacto");
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

  void cls() {
    System.out.print("\033\143");
  }
}
