package net.xeill.elpuig;

class Main {
  public static void main(String[] args) {

    // Método principal
    Menu m = new Menu();
    Conjunto c = new Conjunto();

    while (true) {
      m.mainMenu();
      int option = m.getMainMenu();

      switch(option) {
        case 1: c.anadirEjemplo();
          break;
        case 2: c.mostrarEjemplos();
          break;
        case 3: System.exit(0);
          break;
        default:
          break;

      }

    }
  }
}
