package com.company;

import java.util.Scanner;

public class Inventari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacitat = scanner.nextInt();
        int n = scanner.nextInt();

        String[] codis = new String[n];
        int[] stocks = new int[n];

        int stocktotal = 0;

        for(int i=0; i<n; i++){
            codis[i] = scanner.next();
        }

        for(int i=0; i<n; i++){
            stocks[i] = scanner.nextInt();
            stocktotal += stocks[i];
        }

        int no = scanner.nextInt();
        for(int i=0; i<no; i++){
            String codi = scanner.next();
            int q = scanner.nextInt();

            int pos = -1;
            for(int j=0; j<n; j++){
                if(codis[j].equals(codi)){
                    pos = j;
                }
            }

            if(stocktotal + q > capacitat){
                q = capacitat - stocktotal;
            }else if (stocks[pos] + q < 0){
                q = -stocks[pos];
            }

            stocks[pos] += q;
            stocktotal += q;
        }

        for(int j=0; j<n; j++){
            System.out.print(stocks[j] +" ");
        }
    }
}
