package net.xeill.elpuig;

class Main {
  public static void main(String[] args) {

    System.out.println("Hello, this is an Institut.");

    Institut elpuig = new Institut();

    Student husnain = new Student();
    husnain.name = "Husnain Naeem";
    husnain.age = 20;
    husnain.address = "Fondo s/n";

    elpuig.students.add(husnain);

    Student usman = new Student();
    usman.name = "Usman Munawar";
    usman.age = 22;
    usman.address = "Santa Coloma s/n";

    elpuig.students.add(usman);

    // Muestra los estudiantes del Instituto elpuig
    elpuig.showStudents();



  }

}
