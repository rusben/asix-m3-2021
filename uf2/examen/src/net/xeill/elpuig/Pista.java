package net.xeill.elpuig;

class Pista {

  Carril[] carriles = new Carril[8];

  Pista() {
    for (int i = 0; i < carriles.length; i++) {
      carriles[i] = new Carril();
    }
  }

}
