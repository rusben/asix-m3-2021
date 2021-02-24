package net.xeill.elpuig;

import java.util.ArrayList;
import java.util.Scanner;

class Institut {

  ArrayList<Student> students = new ArrayList<Student>();
  Scanner scanner = new Scanner(System.in);

  public void showStudents()  {

    for (Student s : this.students) {
      System.out.println(s);
    }

  }

  // Añade un estudiante al ArrayList
  public void addStudent() {

    try {

      System.out.println("Introduce el nombre del estudiante: ");
      String name= this.scanner.nextLine();

      System.out.println("Introduce la edad del estudiante: ");
      String sage= this.scanner.nextLine();
      int age = Integer.parseInt(sage);

      System.out.println("Introduce la dirección del estudiante: ");
      String address= this.scanner.nextLine();

      Student s = new Student();
      s.name = name;
      s.age = age;
      s.address = address;

      this.students.add(s);

    } catch (Exception e) {
      cls();
      addStudent();
    }

  }

  public void loadFakeData() {
    Student husnain = new Student();
    husnain.name = "Husnain Naeem";
    husnain.age = 20;
    husnain.address = "Fondo s/n";

    this.students.add(husnain);

    Student usman = new Student();
    usman.name = "Usman Munawar";
    usman.age = 22;
    usman.address = "Santa Coloma s/n";

    this.students.add(usman);
  }


  void cls() {
    System.out.print("\033\143");
  }




}
