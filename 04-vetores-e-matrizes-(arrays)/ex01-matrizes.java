// Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando estruturas de repetição, 
// apresente na tela a soma de todos os elementos da matriz.

import java.util.Scanner;

class ex01_matrizes{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[2][3];
        int soma = 0;

        for(int l = 0; l < 2; l++){
            
            for(int c = 0; c < 3; c++){

                System.out.printf("Informe o elemento [%d][%d]: ", l, c);
                matriz[l][c] = input.nextInt();}}

        for(int l = 0; l < 2; l++){
            
            for(int c = 0; c < 3; c++){

                soma += matriz[l][c];}}

        System.out.print("A soma dos elementos da matriz eh: " + soma);

        input.close();}}