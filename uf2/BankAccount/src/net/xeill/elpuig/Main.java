package net.xeill.elpuig;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Account a = new Account("Husnain", 5000);
    Menu m = new Menu();


    while (true) {

     m.mainMenu();

     int money = 0;
     int option = m.getMainMenu();

     switch(option) {
       case 1: a.showBalance();
        break;

       case 2:
          System.out.println("----- ----- Retirar dinero ----- -----");
          System.out.println("Introduzca la cantidad de dinero que queire retirar.");
          money = scanner.nextInt();
          a.withdraw(money);

        break;
       case 3:
          System.out.println("----- ----- Ingresar dinero ----- -----");
          System.out.println("Introduzca la cantidad de dinero que queire ingresar.");
          money = scanner.nextInt();
          a.makeDeposit(money);

        break;

      case 4:
           System.exit(0);
           break;
      default: break;
     }
   }

  }
}
