package net.xeill.elpuig;

import java.util.ArrayList;

class Main {

  public static void main(String[] args) {

    ArrayList<Atleta> atletas = new ArrayList<Atleta>();

    for (int i = 0; i < 8; i++) {
      Atleta a = new Atleta(i);
      atletas.add(a);

      System.out.println(a);
      //atletas.add(new Atleta(i));
    }

    System.out.println("----------------------------------------");

    atletas.get(0).correr(100);
    atletas.get(1).saltar(10);
    atletas.get(2).correr(50);
    atletas.get(3).saltar(20);

    for (Atleta a : atletas) {
      System.out.println(a);
    }

    System.out.println("----------------------------------------");

  }
}
