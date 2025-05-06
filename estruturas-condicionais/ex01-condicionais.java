// Escreva um programa que leia dois números inteiros e os apresente em ordem crescente.

import java.util.Scanner;

class ex01_condicionais{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("Informe segundo numero: ");
        int num2 = input.nextInt();

        if(num1 > num2){
            
            System.out.print("Numeros em ordem crescente: " + num2 + ", " + num1);}
            
        else{
            
            System.out.print("Numeros em ordem crescente: " + num1 + ", " + num2);}
        
        input.close();}}