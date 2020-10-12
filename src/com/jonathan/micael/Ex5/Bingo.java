package com.jonathan.micael.Ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {

    public static void main(String[] args) {

        int acceptors = 0;

        int[][] matriz = new int[6][4];
        Random aleatory = new Random();

        List<Integer> numerousExistent = new ArrayList<>();

        int count = 0;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                boolean res;
                int aux;

                do {
                    aux = aleatory.nextInt(75);
                    res = verifiedVetoer(numerousExistent, aux);
                    if (!res){
                        numerousExistent.add(aux);
                    }
                }   while (res);

                matriz[i][j] = aux;

            }
        }

        List<Integer> listNumbers = new ArrayList<Integer>();

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }

        List<Integer> listRoads = new ArrayList<Integer>();

        while (acceptors <= 24){

            int nRandom = aleatory.nextInt(75);

            boolean res = verifier(matriz,nRandom);
            boolean verifiesRoadsValid;

            verifiesRoadsValid = verifiedVetoer(listRoads, nRandom);

            if (!verifiesRoadsValid){
                listRoads.add(nRandom);
                count++;
                System.out.println(listRoads.toString());
            }

            if (res){
                acceptors+=1;
                listNumbers.add(nRandom);
            }
        }
        listRoads.sort(null);
        Collections.sort(listRoads);

        System.out.println(listRoads.toString());

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("Total de Rodadas: " + count);
    }

    static boolean verifier(int[][] matriz, int number ){
        boolean numberExisted = false;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == number) {
                    numberExisted = true;
                    break;
                }
            }
        }

        return numberExisted;
    }

    static boolean verifiedVetoer(List<Integer> list, int numberRadom){
        for (Integer integer : list) {
            if (integer == (numberRadom)) {
                return true;
            }
        }
        return false;
    }
}
