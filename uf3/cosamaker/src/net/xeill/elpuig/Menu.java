package net.xeill.elpuig;

import java.util.Scanner;

class Menu {

  Scanner scanner = new Scanner(System.in);

  public void showMainMenu() {

    System.out.println("1. Cargar cosas");
    System.out.println("2. Añadir cosa");
    System.out.println("3. Imprimir cosas");
    System.out.println("4. Guardar cosas");
    System.out.println("5. Salir sin guardar");

  }

  public int getMainMenu() {
    String soption;
    int option;
    try {
      soption = scanner.nextLine();
      option = Integer.parseInt(soption);
    } catch (Exception e) {
      cls();
      showMainMenu();
       return getMainMenu();
    }

    return option;

  }

  void cls() {
    System.out.print("\033\143");
  }
}
