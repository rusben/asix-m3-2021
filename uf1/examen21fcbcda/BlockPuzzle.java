import java.util.Scanner;

public class BlockPuzzle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	
        int x, y;
        
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        int[][] board = new int[x][y];
        int[][] piece = new int[x][y];
        
        // Read board
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        
        // Read piece and check
        boolean ok = true;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                piece[i][j] = scanner.nextInt();
                
                if (piece[i][j] == 1) {
                    // check board
                    if (board[i][j] == 1) {
                        ok = false;
                        break;
                    }
                }
            }
        }
        
        System.out.println(ok);
        
      	
    }
}
