package net.xeill.elpuig;

class Cosa {

  String nombre;
  String color;
  int altura;
  int anchura;
  boolean tangible;

  public String toString() {
      String s = "";
      s+=nombre;
      s+=" ";
      s+=color;
      s+=" ";
      s+=altura;
      s+=" ";
      s+=anchura;
      s+=" ";
      s+=tangible;
      return s;
  }

}
