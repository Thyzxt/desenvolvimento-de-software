// Escreva um programa que mostre todos os números pares existentes entre 1 e um número lido do teclado, bem como a quantidade de números apresentados.

import java.util.Scanner;

class ex03_repeticao{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        int qtd_pares = 0;

        for(int i = 1; i <= num; i++){

            if(i % 2 == 0){
                
                System.out.println(i);

                qtd_pares++;}}

        System.out.print("Quantidade de numeros: " + qtd_pares);

        input.close();}}