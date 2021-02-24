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

  public void showStudentsMenu() {
    int i = 1;
    for (Student s : this.students) {
      System.out.println(i+". "+s);
      i++;
    }
  }

  public int getStudentsMenu() {
    String soption;
    int option;
    try {
      soption = scanner.nextLine();
      option = Integer.parseInt(soption);
    } catch (Exception e) {
      cls();
      showStudentsMenu();
       return getStudentsMenu();
    }

    return option;
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

  public void updateStudent() {

    cls();
    System.out.println("Selecciona el estudiante que quieres modificar: ");

    try {
      // Mostrar todos los estudiantes (Pondremos un número delante de cada estudiante (posición en el ArrayList))
      this.showStudentsMenu();
      // El usuario selecciona un estudiante (escribirá un número)
      int option = this.getStudentsMenu();

      // Carga el estudiante que queremos modificar
      Student s = this.students.get(option - 1);

      // El programa mostrará la info de ese usuario
      // Imprimimos el estudiante que vamos a modificar
      System.out.println(s);

      // Preguntamos para cambiar los diferentes atributos
      System.out.println("Quieres cambiar el nombre (s/n)?");
      String cambiaNombre = scanner.nextLine();

      if (cambiaNombre.equals("s")) {
        System.out.println("Introduce el nuevo nombre:");
        String nuevoNombre = scanner.nextLine();
        s.name = nuevoNombre;
      }

      System.out.println("Quieres cambiar la edad (s/n)?");
      String cambiaEdad = scanner.nextLine();

      if (cambiaEdad.equals("s")) {
        System.out.println("Introduce la nueva edad:");
        String sNuevaEdad = scanner.nextLine();
        int nuevaEdad = Integer.parseInt(sNuevaEdad);
        s.age = nuevaEdad;
      }

      System.out.println("Quieres cambiar la dirección (s/n)?");
      String cambiaDireccion = scanner.nextLine();

      if (cambiaDireccion.equals("s")) {
        System.out.println("Introduce la nueva dirección:");
        String sNuevaDireccion = scanner.nextLine();
        s.address = sNuevaDireccion;
      }

      // Cambiar los datos
    } catch (Exception e) {
      cls();
      updateStudent();
    }

  }

  public void deleteStudent() {

    cls();
    System.out.println("Selecciona el estudiante que quieres eliminar: ");

    // Mostrar todos los estudiantes (Pondremos un número delante de cada estudiante (posición en el ArrayList))
    this.showStudentsMenu();
    // El usuario selecciona un estudiante (escribirá un número)
    int option = this.getStudentsMenu();

    if (option < 0 || option > students.size() - 1) {
      deleteStudent();
      return;
    }

    // Elimina el estudiante seleccionado
    this.students.remove(option - 1);

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
