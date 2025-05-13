// Escreva um programa que efetue a leitura de um número inteiro e 
// apresente se esse número é divisível por 2 ou divisível por 7.

import java.util.Scanner;

class ex04_condicionais{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        if(num % 2 == 0 || num % 7 == 0){
            
            System.out.print("O numero eh divisivel por 2 ou por 7");}

        else{
            
            System.out.print("O numero nao eh divisivel por 2 ou por 7");}
        
        input.close();}}