package net.xeill.elpuig;

class Atleta {

  int distanciaRecorrida; // m
  int velocidadX; // m/s
  int velocidadY; // m/s
  int elevacion; // m
  int carril;

  Atleta(int carril) {
    this.carril = carril;
    this.distanciaRecorrida = 0;
    this.velocidadX = 0;
    this.velocidadY = 0;
    this.elevacion = 0;
  }

  
}
