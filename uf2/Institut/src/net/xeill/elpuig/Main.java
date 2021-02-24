package net.xeill.elpuig;

class Main {
  public static void main(String[] args) {

    Institut elpuig = new Institut();
    elpuig.loadFakeData();

    Menu menu = new Menu();

    while (true) {
      // Muestra el menú
      menu.showMainMenu();
      // Retorna la opción elegida en el menú
      int option = menu.getMainMenu();
      System.out.println(option);

      switch (option) {
        case 1:
          elpuig.showStudents();
          break;
        case 2:
          elpuig.addStudent();
          break;
        case 3:
          elpuig.updateStudent();
          break;
        case 4:
          elpuig.deleteStudent();
          break;
        default: break;
      }
    }
  }
}
