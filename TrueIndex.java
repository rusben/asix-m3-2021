import java.util.*;

public class TrueIndex {
    public static void main(String[] args) {

      // Crea un array de 100 booleans, i estableix els elements
      // en els índexs indicats a true

      // Input Format
      // Una sèrie de números enters que representen l'índex dels elements
      // que han de ser true. La sèrie acaba amb un -1.

      // Sample input
      // 0 1 2 3 400   -1

      Scanner input = new Scanner(System.in);
      boolean[] elementos = new boolean[100];

      // Recorrerlo y ponerlo a true
      for (int i = 0; i < elementos.length; i++) {
        elementos[i] = false;
      }

      // Lee el primer elemento
      int numero = input.nextInt();

      while (numero != -1) {

        // esta comprobación es para asegurarnos que no intentamos
        // acceder a una posición inexistente del array
        if (numero >= 0 && numero <= 99) {
          elementos[numero] = true;
        }
        // actualiza el valor de numero leyendo otro elemento
        numero = input.nextInt();
      }

      // Recorremos el array e imprimimos sus valores
      System.out.print("[");
      for (int i = 0; i < elementos.length; i++) {

        System.out.print(elementos[i]);
        if (i != elementos.length - 1) { // este es el último elemento
          System.out.print(", ");
        }
      }
      System.out.print("]");
    }
}
