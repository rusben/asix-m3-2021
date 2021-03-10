package net.xeill.elpuig;

import java.util.Scanner;

public class Contacto {

  String name;
  String number;
  String email;
  int edad;

  public void crearContacto() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce el nombre del contacto. ");
    this.name = scanner.nextLine();

    System.out.println("Introduce el número del contacto. ");
    this.number = scanner.nextLine();

    System.out.println("Introduce el correo del contacto. ");
    this.email = scanner.nextLine();

    System.out.println("Introduce tu edad. ");
    this.edad = scanner.nextInt();

  }

	public String toString() {
    String s = "";
    s= "Name: "+this.name+"\n";
    s+= "Number: "+this.number+"\n";
    s+= "Age: "+this.edad+"\n";
    s+= "Email: "+this.email+"\n";
    return s;
  }
}
