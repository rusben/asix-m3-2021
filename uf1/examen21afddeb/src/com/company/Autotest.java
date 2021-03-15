package com.company;

import java.util.Scanner;

public class Autotest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] correctas = {"a", "b", "a", "c", "a", "b", "b", "c", "b", "c", "a", "c", "b", "a", "a", "a", "c", "c", "b", "a", "c", "b", "c", "c", "a", "a", "c", "a", "a", "c"};

        String[] respuestas = new String[30];

        for (int i = 0; i < 30; i++) {
            respuestas[i] = scanner.next();
        }

        int fallos = 0;

        for (int i = 0; i < 30; i++) {
            if (!correctas[i].equals(respuestas[i])) {
                fallos++;
            }
        }

        if(fallos <= 3){
            System.out.println("TEST APROBADO");
        } else {
            System.out.println("TEST SUSPENDIDO");
        }
        System.out.println(fallos + " fallos.");

        System.out.println(" 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");


        for (int i = 0; i < 30; i++) {
            System.out.print(" " + respuestas[i] +" ");
        }
        System.out.println();

        for (int i = 0; i < 30; i++) {
            if(correctas[i].equals(respuestas[i])){
                System.out.print("   ");
            } else {
                System.out.print(" " + correctas[i] + " ");
            }
        }
    }
}
