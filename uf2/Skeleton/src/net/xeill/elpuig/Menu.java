package net.xeill.elpuig;

import java.util.Scanner;

class Menu {

  Scanner scanner = new Scanner (System.in);

  public void mainMenu() {

    System.out.println("---------- Welcome to Skeleton ----------");
    System.out.println("1. Añadir ejemplo");
    System.out.println("2. Mostrar ejemplos");
    System.out.println("3. Salir");

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
