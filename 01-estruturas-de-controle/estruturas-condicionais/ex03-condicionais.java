// Escreva um programa que efetue a leitura de um número inteiro e 
// apresente se esse número é divisível por 2 e divisível por 3.

import java.util.Scanner;

class ex03_condicionais{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        if(num % 2 == 0 && num % 3 == 0){
            
            System.out.print("O numero eh divisivel por 2 e por 3");}

        else{
            
            System.out.print("O numero nao eh divisivel por 2 e por 3");}
        
        input.close();}}