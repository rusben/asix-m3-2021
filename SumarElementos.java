import java.util.*;

public class SumarElementos {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // Leer la lista de números y guardarla en un array
      // 10  <-- Cuántos elementos tiene el array
      // 4 5 7 3 6 5 8 7 5 3   <-- Estos son los elementos del array

      // 53  <-- Salida del programa: Suma de los elementos del array

      int cantidad = input.nextInt();
      int[] elementos = new int[cantidad];

      // Leemos los elementos y los guardamos en un arrayS
      for (int i = 0; i < cantidad; i++) {
        elementos[i] = input.nextInt();
      }

      // Recorre el array y suma cada elemento al total
      int total = 0;
      for (int i = 0; i < elementos.length; i++) {
        total += elementos[i];
        // total = total + elemntos[i]
      }

      System.out.println(total);

    }
}
