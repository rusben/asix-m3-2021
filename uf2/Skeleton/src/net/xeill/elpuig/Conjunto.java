package net.xeill.elpuig;

import java.util.ArrayList;
import java.util.Scanner;

class Conjunto {

  ArrayList<Ejemplo> ejemplos = new ArrayList<Ejemplo>();
  Scanner scanner = new Scanner(System.in);

  public void anadirEjemplo() {
    System.out.println("----- Añadir un ejemplo: -----");
    System.out.println("Introduce el valor foo");

    String foo = scanner.nextLine();

    System.out.println("Introduce el valor bar");
    int bar = scanner.nextInt();
    scanner.nextLine();

    Ejemplo e = new Ejemplo(foo, bar);

    this.ejemplos.add(e);

  }

  public void mostrarEjemplos() {

    for (Ejemplo e : ejemplos) {
      System.out.println("foo: "+ e.foo);
      System.out.println("bar: "+e.bar);
    }

  }


}
