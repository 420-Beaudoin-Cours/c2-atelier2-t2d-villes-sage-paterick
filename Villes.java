package com.company;

/**
 * Créé par Patrick Provost le 18 février 2020
 * Dernières modifications le 18 février 2020
 */

public class Villes {

    public static void afficherTab(int[][] tab) {
        for (int iLine=0; iLine<tab.length; iLine++) {
            for (int iCol = 0; iCol < tab[iLine].length; iCol++) {
                System.out.print(tab[iLine][iCol] + " ");
            }
        }
    }

    public static int sommeUneLigne(int[][] tab, int iLine){
        int somme = 0;

        for (int iCol=0;iCol<tab[iLine].length;iCol++){
            somme += tab[iLine][iCol];
        }

        return somme;
    }

    public static double moyenneUneLigne(int[][] tab, int iLine){
        double somme = 0.0;
        double moyenne = 0.0;

        for (int iCol=0;iCol<tab[iLine].length;iCol++){
            somme += tab[iLine][iCol];
        }

        try{
            moyenne = somme / tab[iLine].length;
        }
        catch (ArithmeticException e){
        }

        return moyenne;
    }

    public static double moyenneUneCol(int[][] tab, int iCol){
        double somme = 0.0;
        double moyenne = 0.0;

        for (int iLine=0;iLine<tab.length;iLine++){
            somme += tab[iLine][iCol];
        }

        try{
            moyenne = somme / tab.length;
        }
        catch (ArithmeticException e){

        }

        return moyenne;
    }

    public static int maxLigne(int[][] tab, int iLine){
        int max = tab[iLine][0];

        for (int iCol=1;iCol<tab[iLine].length;iCol++) {
            if (tab[iLine][iCol] > max)
                max = tab[iLine][iCol];
        }

        return max;
    }

    public static int minLigne(int[][] tab, int iLine){
        int min = tab[iLine][0];

        for (int iCol=1;iCol<tab[iLine].length;iCol++) {
            if (tab[iLine][iCol] < min)
                min = tab[iLine][iCol];
        }

        return min;
    }
}