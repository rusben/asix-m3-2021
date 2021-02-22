package net.xeill.elpuig;

import java.util.ArrayList;

class Institut {

  ArrayList<Student> students = new ArrayList<Student>();

  int suma (int a, int b) {
    return a+b;
  }

  void showStudents()  {

    for (Student s : students) {
      System.out.println("Name: "+s.name);
      System.out.println("Age: "+s.age);
      System.out.println("Address: "+s.address);
      System.out.println("----------------------");
    }

  }




}
