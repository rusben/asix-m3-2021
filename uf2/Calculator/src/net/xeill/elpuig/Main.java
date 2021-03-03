package net.xeill.elpuig;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Calculator calculator = new Calculator();
    Menu menu = new Menu();


    while (true) {
      menu.showMainMenu();
      int option = menu.getMainMenu();

      switch(option) {

        case 1: System.out.println("SUM");
                System.out.println("Insert first operator:");
                int a = input.nextInt();
                System.out.println("Insert second operator:");
                int b = input.nextInt();

                System.out.println("The sum is: "+calculator.sum(a,b));

          break;
        case 2: System.out.println("SUBSTRACT");
          break;
        case 3: System.out.println("MULTIPLY");
          break;
        case 4: System.out.println("DIVIDE");
          break;
        case 5:  System.out.println("MODULO");
          break;
        default: System.out.println("UNKNOWN OPERATION");
            break;

      }
    }
  }
}
