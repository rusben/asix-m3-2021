package net.xeill.elpuig;

class Atleta {

  int distanciaRecorrida; // m
  float velocidadX; // m/s
  float velocidadY; // m/s
  int elevacion; // m
  int carril;

  Atleta(int carril) {
    this.carril = carril;
    this.distanciaRecorrida = 0;
    this.velocidadX = 0;
    this.velocidadY = 0;
    this.elevacion = 0;
  }

  void correr(float numeroDecimal) {
    this.velocidadX = numeroDecimal;
  }

  void saltar(float numeroDecimal) {
    if (this.elevacion == 0) {
      this.velocidadY = numeroDecimal;
    }
  }

  boolean choca(Valla v) {
    if (this.distanciaRecorrida == v.posicion && this.elevacion <= v.altura)
      return true;
    else
      return false;
  }

  void frenar(float numeroDecimal) {
    this.velocidadX -= numeroDecimal;
    if (this.velocidadX < 0) this.velocidadX = 0;
  }

  public String toString() {
    String s = "";

    s+= "Carril: " + this.carril + "\n";
    s+= "Distancia: " + this.distanciaRecorrida + "\n";
    s+= "Vx: " + this.velocidadX + "\n";
    s+= "Vy: " + this.velocidadY + "\n";
    s+= "Elevación: " + this.elevacion + "\n";

    return s;
  }

}
