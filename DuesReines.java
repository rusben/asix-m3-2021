import java.util.Scanner;

public class DuesReines {

    public static void main(String[] args) {
      	Scanner scanner = new Scanner(System.in);
      
      	int f1 = scanner.nextInt();  // fila de la primera reina
      	int c1 = scanner.nextInt();  // columna de la primera reina
      
      	int f2 = scanner.nextInt();  // fila de la segona reina
      	int c2 = scanner.nextInt();  // columna de la segona reina
        
        if (f1 == f2) System.out.println("true"); // Están en la misma fila
        else if (c1 == c2) System.out.println("true"); // Están en la misma columna
        else if (f1+c1 == f2+c2) System.out.println("true"); // Están en la misma diagonal pendiente positiva
        else if ((f1-c1) == (f2-c2)) System.out.println("true"); // Están en la misma diagonal 
        else System.out.println("false"); // No se amenazan
        
      	
      	
    }
}
