import java.util.Scanner;

public class ClubLucha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leemos el número de luchadores
        int N = scanner.nextInt();
        
        // Creamos los arrays para guardar los valores de los luchadores
        String[] names = new String[N];
        int[] life = new int[N];
        
        // Primero leemos los nombres
      	for (int i = 0; i < N; i++) {
            names[i] = scanner.next();
            //System.out.println(names[i]);
        }
        
        // Después leemos la vida
        for (int i = 0; i < N; i++) {
            life[i] = scanner.nextInt();
            //System.out.println(life[i]);
        }
        
        // Leemos el número de combates
        int C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            
            // Leemos los luchadores de cada combate
            String luchadorA = scanner.next();
            String luchadorB = scanner.next();
            
            int valueA, valueB, positionA, positionB;
            valueA = valueB = positionA = positionB = 0;
            
            // Buscar a luchadorA y luchadorB
            for (int j = 0; j < names.length; j++) {
                              
                if (names[j].equals(luchadorA)) {
                    valueA = life[j];    
                    positionA = j;
                }
                
                if (names[j].equals(luchadorB)) {
                    valueB = life[j];    
                    positionB = j;
                }               
            
            }
                      
            // Restar los valores
            // Solo restaremos si la life[] es mayor que 0
            
            // Restar a jugadorA el valueB y a jugadorB el valueA
            if (life[positionA] > 0 && life[positionB] > 0) {
                // Hay combate      
                life[positionA] -= valueB;
                life[positionB] -= valueA;       
            }
        }
        
        // Imprimimos sólo a los jugadores que tienen life > 0
        for (int i = 0; i < life.length; i++) {
            if (life[i] > 0) {
                System.out.println(names[i]+": "+life[i]);
            }
        }      
      	
    }
}
