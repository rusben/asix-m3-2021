import java.util.*;

public class BuscarNumero {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // Leer la lista de números y guardarla en un array
      // 10  <-- Cuántos elementos tiene el array
      // 4 5 7 3 6 5 8 7 5 3   <-- Estos son los elementos del array
      // 3

      int cantidad = input.nextInt();
      System.out.println("La cantidad de elementos es "+cantidad);


      int[] elementos = new int[cantidad];

      // Leemos los enteros y los guardamos en un array llamado elementos
      for (int i = 0; i < cantidad; i++) {
        elementos[i] = input.nextInt();
      }

      // Leer el número que buscamos
      int buscado = input.nextInt();
      boolean encontrado =  false;
      // Recorremos el array y comparamos cada elemento con el elemento buscado
      for (int i = 0; i < cantidad; i++ ) {
        if (elementos[i] == buscado) { //
          System.out.println("He encontrado el "+buscado+" en la posición "+i+".");
          // cambia el valor de encontrado a true
          encontrado = true;
        }
      }

      // Una vez acabado el bucle miro si encontré el elemento
      if (!encontrado) {
        System.out.println("No he encontrado el "+buscado+" en el array.");
      }

    }
}
