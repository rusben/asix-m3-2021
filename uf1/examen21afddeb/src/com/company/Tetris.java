package com.company;

import java.util.Scanner;

public class Tetris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        int[][] tablero = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < filas; i++) {

            boolean hayAlgunCero = false;
            for (int j = 0; j < columnas; j++) {
                if(tablero[i][j] == 0){
                    hayAlgunCero = true;
                    break;
                }
            }

            if(hayAlgunCero) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
