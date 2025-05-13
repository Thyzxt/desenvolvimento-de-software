// Escreva um programa que some os números fornecidos pelo usuário até que o número lido seja igual a zero. 
// Ao final, mostre o resultado da soma.

import java.util.Scanner;

class ex04_repeticao{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num;
        int soma = 0;

        do{

            System.out.print("Digite um numero: ");
            num = input.nextInt();

            soma += num;}

        while(num != 0);

        System.out.print("Resultado da soma: " + soma);

        input.close();}}