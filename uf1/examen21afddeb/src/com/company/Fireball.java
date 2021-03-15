package com.company;

import java.util.Scanner;

public class Fireball {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int n = scanner.nextInt();
        int[] v = new int[n];
        
        for(int i=0;i<n;i++){
            v[i] = scanner.nextInt();
        }
        
        int p = scanner.nextInt();
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        
        while(!(p == -1 && a == -1 && d == -1)){
            
            v[p] -= d;
            if(v[p] < 0) v[p] = 0;
            
            for(int i=p-a; i<p; i++){
                if(i>=0 && i<n){
                    v[i] -= d;
                    if(v[i] < 0) v[i] = 0;
                }
            }
            for(int i=p+a; i>p; i--){
                if(i>=0 && i<n){
                    v[i] -= d;
                    if(v[i] < 0) v[i] = 0;
                }
            }
            
            for(int i=0; i<n; i++){
                System.out.print(v[i] + " ");
            }
            System.out.println();
            
            p = scanner.nextInt();
            a = scanner.nextInt();
            d = scanner.nextInt();
        }
      	
    }
}
