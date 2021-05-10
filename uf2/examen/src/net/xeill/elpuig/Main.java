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

    System.out.println("Crear una pista:");

    Pista p = new Pista();

    for (int i = 0; i < p.carriles.length; i++) {
      for (int j = 0; j < p.carriles[i].vallas.length; j++) {
        for (int k = 0; k < atletas.size(); k++) {

          if (atletas.get(k).carril == i) { // Miramos si el atleta está en el carril i
            if (atletas.get(k).distanciaRecorrida == p.carriles[i].vallas[j].posicion) { // Miramos para la posición del atleta que valla está en esa posición
              if (atletas.get(k).choca(p.carriles[i].vallas[j])) { // Si chocan hay que tirar la valla
                p.carriles[i].vallas[j].tirar();
                atletas.get(k).frenar(1000);
                System.out.println("Ha chocado!");
                System.out.println("Atleta "+k);
                System.out.println("Valla "+j);
                System.out.println("En el carril "+i);
                System.out.println("Tiro la valla y freno al atleta.");
              }
            }
          }
        }
      }
    }




  }
}
