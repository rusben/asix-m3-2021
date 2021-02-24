package net.xeill.elpuig;
class Student {

  String name;
  int age;
  String address;

  public String toString() {
    String s = "";
    s= "Name: "+this.name+"\n";
    s+= "Age: "+this.age+"\n";
    s+= "Address: "+this.address+"\n";
    return s;
  }
}
