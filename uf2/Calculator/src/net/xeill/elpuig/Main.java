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
      int a, b;

      switch(option) {

        case 1: System.out.println("SUM");
                menu.showOperator();
                a = menu.getOperator();
                menu.showOperator();
                b = menu.getOperator();

                System.out.println("The sum is: "+calculator.sum(a,b));
          break;

        case 2: System.out.println("SUBSTRACT");
                menu.showOperator();
                a = menu.getOperator();
                menu.showOperator();
                b = menu.getOperator();

                System.out.println("The substract is: "+calculator.substract(a,b));
          break;

        case 3: System.out.println("MULTIPLY");
                menu.showOperator();
                a = menu.getOperator();
                menu.showOperator();
                b = menu.getOperator();

                System.out.println("The multiply is: "+calculator.multiply(a,b));
          break;

        case 4: System.out.println("DIVIDE");
                menu.showOperator();
                a = menu.getOperator();
                menu.showOperator();
                b = menu.getOperator();

                if (b == 0) System.out.println("Impossible to divide by zero.");
                else System.out.println("The divide is: "+calculator.divide(a,b));

          break;

        case 5: System.out.println("MODULO");
                menu.showOperator();
                a = menu.getOperator();
                menu.showOperator();
                b = menu.getOperator();

                System.out.println("The modulo is: "+calculator.modulo(a,b));
          break;

        default: System.out.println("UNKNOWN OPERATION");
            break;

      }
    }
  }
}
