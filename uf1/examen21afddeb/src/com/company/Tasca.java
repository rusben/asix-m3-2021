package com.company;

import java.util.Scanner;

public class Tasca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            int horas = scanner.nextInt();
            int minut = scanner.nextInt();
            int segun = scanner.nextInt();

            time[i] = horas*60*60 + minut*60 + segun;
        }

        int horasLimite = scanner.nextInt();
        int minutLimite = scanner.nextInt();
        int segunLimite = scanner.nextInt();

        int timeLimite = horasLimite*60*60 + minutLimite*60 + segunLimite;


        for (int i = 0; i < n; i++) {
            if(time[i] <= timeLimite){
                System.out.println("ok");
            } else {
                int retraso = time[i] - timeLimite;

                int segunRetraso = retraso%60;
                int minutRetraso = retraso/60%60;
                int horasRetraso = retraso/60/60;
                System.out.println("S'ha excedit " + horasRetraso + "h " + minutRetraso + "m " + segunRetraso + "s");
            }
        }


    }
}
