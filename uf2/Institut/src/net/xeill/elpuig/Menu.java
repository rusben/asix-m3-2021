package net.xeill.elpuig;
import java.util.Scanner;

class Menu {

  Scanner scanner = new Scanner(System.in);

  public void showMainMenu() {
    System.out.println("1. Listar estudiantes");
    System.out.println("2. Añadir estudiante");
    System.out.println("3. Modificar estudiante");
    System.out.println("4. Eliminar estudiante");
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
