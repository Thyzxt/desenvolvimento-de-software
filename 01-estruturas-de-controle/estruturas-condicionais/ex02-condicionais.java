// Escreva um programa que leia três números inteiros e apresente na tela o menor valor.

import java.util.Scanner;

class ex02_condicionais{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = input.nextInt();

        int menor = num1;

        System.out.print("Informe o segundo numero: ");
        int num2 = input.nextInt();

        if(num2 < menor){
            
            menor = num2;}

        System.out.print("Informe o terceiro numero: ");
        int num3 = input.nextInt();

        if(num3 < menor){
            
            menor = num3;}

        System.out.print("O menor valor eh: " + menor);
        
        input.close();}}