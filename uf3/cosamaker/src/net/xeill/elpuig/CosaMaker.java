package net.xeill.elpuig;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

class CosaMaker {

  ArrayList<Cosa> cosas = new ArrayList<Cosa>();

  public void cargarCosas() {

    try {
      // Para leer
      BufferedReader inputStream = new BufferedReader(new FileReader(new File("data/cosas.data")));

      String line = "";
      while ((line = inputStream.readLine()) != null) {
            String[] parts = line.split(":");
            Cosa c = new Cosa();
            c.nombre = parts[0];
            c.color = parts[1];
            c.altura = Integer.parseInt(parts[2]);
            c.anchura = Integer.parseInt(parts[3]);
            c.tangible = Boolean.parseBoolean(parts[4]);

            // Añadir el objeto cosa al ArrayList de cosas
            this.cosas.add(c);
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void guardarCosas() {

    try {
       // Para escribir
       BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("data/cosas.data"), false));

       // Leer las cosas y guardarlas en el fichero
       for (Cosa c : this.cosas) {
         outputStream.write(c.nombre+":");
         outputStream.write(c.color+":");
         outputStream.write(c.altura+":");
         outputStream.write(c.anchura+":");
         outputStream.write(c.tangible+"\n");
       }

       outputStream.close();

     } catch (Exception e) {
       System.out.println(e.getMessage());
     }

  }

  public void imprimirCosas() {
    for (Cosa c : this.cosas) {
      System.out.println(c);
    }
  }

  public void nuevaCosa() {

  }

  public static void main(String[] args) {

    CosaMaker cm = new CosaMaker();
    Menu m = new Menu();

    while (true) {

      m.showMainMenu();
      int option = m.getMainMenu();

      switch (option) {

        case 1: cm.cargarCosas();
          break;
        case 2: cm.nuevaCosa();
          break;
        case 3: cm.imprimirCosas();
          break;
        case 4: cm.guardarCosas();
          break;
        case 5:
          System.out.println("BYE!");
          System.exit(0);
          break;
        default:
          break;
      }

    }
  }

}


/*

    System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      System.out.println("  <cosas>");
    for (Cosa c : cosas) {
      System.out.println("  <cosa>");
      System.out.println("    <nombre>");
      System.out.println("      "+c.nombre);
      System.out.println("    </nombre>");
      System.out.println("    <color>");
      System.out.println("      "+c.color);
      System.out.println("    </color>");
      System.out.println("    <altura>");
      System.out.println("      "+c.altura);
      System.out.println("    </altura>");
      System.out.println("    <anchura>");
      System.out.println("      "+c.anchura);
      System.out.println("    </anchura>");
      System.out.println("    <tangible>");
      System.out.println("      "+c.tangible);
      System.out.println("    </tangible>");
      System.out.println("</cosa>");

    }
    System.out.println("  </cosas>");
    System.out.println("</xml>");

*/
