// Escreva um programa que alimente um vetor com 5 números inteiros e apresente na tela o vetor em ordem inversa

import java.util.Scanner;

class ex01_vetores{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i = 0; i < 5; i++){

            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        for(int i = 4; i >= 0; i--){

            System.out.print(vetor[i] + " ");}

        input.close();}}