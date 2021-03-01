package net.xeill.elpuig;



class Main {
  public static void main(String[] args) {

    Menu menu = new Menu();
    TicTacToe ttt = new TicTacToe();

    ttt.welcome();
    ttt.print();

    while (true) {
      // Muestra el menú
      menu.showMainMenu();
      // Retorna la opción elegida en el menú
      int option = menu.getMainMenu();
      //System.out.println(option);

      ttt.informacionTirada();

      switch (option) {
        case 1:
//          elpuig.showStudents();
            ttt.play();
          break;
        case 2:
//          elpuig.addStudent();
          break;
        case 3:
//          elpuig.updateStudent();
          break;
        case 4:
//          elpuig.deleteStudent();
          break;
        default: break;
      }
    }
  }
}
