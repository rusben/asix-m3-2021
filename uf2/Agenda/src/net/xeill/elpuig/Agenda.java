package net.xeill.elpuig;

import java.util.ArrayList;

public class Agenda {

  // Atributos
  ArrayList<Contacto> contactos = new ArrayList<Contacto>();

  // Métodos
  public void mostrarContactos() {

    for (Contacto c : contactos) {

      System.out.println(c.name);
      System.out.println(c.number);
      System.out.println(c.email);
      System.out.println("----------");

    }

  }

  public void anadirContacto(){

    Contacto c = new Contacto();
    c.crearContacto();

    contactos.add(c);

  }


}
