package net.xeill.elpuig;

class Carril {

  Valla[] vallas = new Valla[10];

  Carril() {
    int posicion = 0;
    for (int i = 0; i < vallas.length; i++ ) {
      vallas[i] = new Valla(posicion);
      posicion = posicion + 10;
    }
  }

}
