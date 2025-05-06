// Escreva um programa que leia um número inteiro e apresente o seu antecessor e o seu sucessor.

import java.util.Scanner;

class ex02{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;
        
        System.out.println("Numero: " + num);
        
        System.out.println("Antecessor: " + antecessor);
        
        System.out.print("Sucessor: " + sucessor);
        
        input.close();}}
