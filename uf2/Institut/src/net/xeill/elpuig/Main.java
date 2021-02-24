package net.xeill.elpuig;

class Main {
  public static void main(String[] args) {

    //System.out.println("Hello, this is an Institut.");

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
        case 3: break;
        case 4: break;
        default: break;
      }

    }
  }

}

// Muestra los estudiantes del Instituto elpuig
//  elpuig.showStudents();
