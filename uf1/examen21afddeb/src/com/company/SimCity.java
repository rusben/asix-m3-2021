package com.company;

import java.util.Scanner;

public class SimCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columnas = scanner.nextInt();
        int filas = scanner.nextInt();


        String[][] map = new String[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                map[i][j] = scanner.next();
            }
        }

        int semaforosTotal = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
               if(map[i][j].equals("#")){
                   int contador = 0;

                   if(i-1 >= 0 && map[i-1][j].equals("#")){
                       contador++;
                   }
                   if(i+1 < filas && map[i+1][j].equals("#")){
                       contador++;
                   }
                   if(j-1 >= 0 && map[i][j-1].equals("#")){
                       contador++;
                   }
                   if(j+1 < columnas && map[i][j+1].equals("#")){
                       contador++;
                   }

                   if(contador > 2) {
                       semaforosTotal += contador;
                   }

               }
            }
        }

        System.out.println(semaforosTotal);
    }
}
