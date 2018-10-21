package com.isograd.exercise;

import java.util.Scanner;

public class IsoContest2 {

    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int centerPos = n / 2;
        char[][] tab = new char[n][n];

        for(int i=0 ; i < n; i++) {
            for (int j=0; j<n; j++){
                tab[i][j] = '=';
            }
        }
        tab[centerPos][centerPos] = 1;
        int i =centerPos;
        int j = centerPos;
        tab[i][j] = '#';
        while ((i != 0 || i != n) && (j != 0 || j != n)) {

        }
    }
}
