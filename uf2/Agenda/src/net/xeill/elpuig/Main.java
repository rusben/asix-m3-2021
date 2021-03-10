package net.xeill.elpuig;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Agenda a = new Agenda();

    Menu m = new Menu();

    while(true) {

      m.mainMenu();

      int option = m.getMainMenu();

      switch(option) {
        case 1: a.mostrarContactos();
          break;
        case 2: a.anadirContacto();
          break;
        case 3: a.modificarContacto();
          break;
          case 4:a.eliminarContacto();
          break;
          case 5: System.exit(0);
          break;
        default:
          break;

      }
    }
  }
}
