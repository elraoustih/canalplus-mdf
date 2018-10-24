package com.isograd.exercise;

import java.util.Arrays;
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

        int i =centerPos;
        int j = centerPos;
        tab[i][j] = '#';

        //System.out.println(Arrays.deepToString(tab));

        while ((i != 0 || i != n) && (j != 0 || j != n)) {
            if(i == centerPos && j == centerPos) {
                j--;
                tab[i][j] = '#';
            } else if(tab[i++][j--] == '=') {
                i++;
                j--;
                tab[i][j] = '#';
            } else if(tab[i][j++] == '=' && tab[i][j--] == '='){
                j++;
                tab[i][j] = '#';
            } else if(tab[i++][j] == '=') {
                i++;
                tab[i][j] = '#';
            } else if(tab[i][j--] == '=' && tab[i][j--] == '='){
                j--;
                tab[i][j] = '#';
            } else if(tab[i--][j] == '=') {
                i--;
                tab[i][j] = '#';
            }
           // System.out.println(Arrays.deepToString(tab));
            for (int k = 0 ; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(tab[k][l]);
                }
                System.out.println();
            }
            System.out.println("-----------------");
        }
    }
}