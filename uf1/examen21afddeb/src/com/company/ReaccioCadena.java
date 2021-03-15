package com.company;

import java.util.Scanner;

public class ReaccioCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            b[i] = scanner.nextInt();
        }

        int e = 0;
        while(true){
            int max = 0;
            for(int i=e; i<e+b[e] && i<n; i++){
                if(i+b[i] > max){
                    max = i+b[i];
                }
            }

            e = max;

            if(e >= n || b[e]==0){
                break;
            }
        }

        if(e >= n){
            System.out.println(n);
        } else {
            System.out.println(e+1);
        }
    }
}
