package net.xeill.elpuig;
import java.util.Scanner;

class Menu {

  Scanner scanner = new Scanner(System.in);

  public void showMainMenu() {
    System.out.println("1. Tirar");
    System.out.println("2. Salir");

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

  // Limpia el terminal
  void cls() {
    System.out.print("\033\143");
  }
}
