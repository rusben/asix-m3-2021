package net.xeill.elpuig;

import java.util.Scanner;

public class Contacto {

  String name;
  String number;
  String email;


  public void crearContacto() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce el nombre del contacto. ");
    this.name = scanner.nextLine();

    System.out.println("Introduce el número del contacto. ");
    this.number = scanner.nextLine();

    System.out.println("Introduce el correo del contacto. ");
    this.email = scanner.nextLine();


  }

}
