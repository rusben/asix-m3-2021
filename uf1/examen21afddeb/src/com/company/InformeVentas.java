package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class InformeVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        c[0] = v[0];
        a[0] = v[0];

        for (int i = 1; i < n; i++) {
            a[i] = v[i] + a[i-1];
            c[i] = v[i] - v[i-1];
        }


        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(a));
    }
}
