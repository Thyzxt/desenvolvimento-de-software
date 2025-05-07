// Escreva um programa que apresente na tela a tabuada de um número lido do teclado.

import java.util.Scanner;

class ex05_repeticao{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + num * i);}

        input.close();}}
