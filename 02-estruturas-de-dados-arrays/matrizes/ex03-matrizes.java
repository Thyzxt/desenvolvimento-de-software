// Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição, 
// apresente na tela o menor valor da matriz, o maior valor da matriz, a soma dos valores da matriz e 
// a média dos valores da matriz.

import java.util.Scanner;

class ex03_matrizes{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, 
        {15, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int soma = 0, menor = matriz[0][0], maior = matriz[0][0];

        for(int l = 0; l < 5; l++){

            for(int c = 0; c < 5; c++){
                
                soma += matriz[l][c];
            
                if(matriz[l][c] < menor){

                    menor = matriz[l][c];}
                
                if(matriz[l][c] > maior){

                    menor = matriz[l][c];}}}

        float media = soma / 25;

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        input.close();}}