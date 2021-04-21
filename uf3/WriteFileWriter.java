import java.io.File;
import java.io.FileWriter;

class WriteFileWriter {

  public static void main(String[] args) {

    try {

      FileWriter fw = new FileWriter(new File("data/output.txt"), true);

      fw.write("hola ke ase\n");
      fw.write("yo bien y tú?\n");
      fw.write("Aquí, programando\n");
      fw.write("Vaya, como mola\n");
      fw.write("Pásame el código, no me va\n");
      fw.write("Tranqui, lo modifico, el profe no se enterará\n");

      fw.close();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
