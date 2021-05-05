package net.xeill.elpuig;

class Main {

  public static void main(String[] args) {

    ArrayList<Atleta> atletas = new ArrayList<Atleta>();

    for (int i = 0; i < 8; i++) {
      //Atleta a = new Atleta(i);
      //atletas.add(a);
      atletas.add(new Atleta(i));
    }

  }

}
