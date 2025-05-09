// Escreva um método que retorne o maior valor entre três números inteiros.

import java.util.Scanner;

class ex05_metodos{

    public static int maior_numero(int num1, int num2, int num3){

        int maior = num1;

        if(num2 > maior){

            maior = num2;}
        
        if(num3 > maior){

            maior = num3;}

        return maior;}

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("Informe o segundo numero: ");
        int num2 = input.nextInt();

        System.out.print("Informe o terceiro numero: ");
        int num3 = input.nextInt();

        System.out.printf("O maior numero eh: %d", maior_numero(num1, num2, num3));
    
        input.close();}}