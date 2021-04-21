import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class ReadFileScanner {

  public static void main(String[] args) {

    try {
      Scanner input = new Scanner(new File("data/autos.txt"));

      while (input.hasNext()) {
        System.out.println(input.nextLine());
      }

    } catch (FileNotFoundException e) {
      System.out.println("Archivo inválido");
    }

  }
}
