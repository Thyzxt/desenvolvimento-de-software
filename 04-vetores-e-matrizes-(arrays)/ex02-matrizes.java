// Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição, 
// apresente na tela a soma de todos os elementos da terceira linha da matriz.

import java.util.Scanner;

class ex02_matrizes{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, 
        {15, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int soma = 0;

        for (int c = 0; c < 5; c++){
            
            soma += matriz[2][c];}

        System.out.print("A soma dos elementos da terceira linha da matriz eh: " + soma);

        input.close();}}