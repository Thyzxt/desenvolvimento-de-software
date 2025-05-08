// Escreva um programa alimente um vetor de 5 números inteiros distintos. 
// Em seguida, leia um número qualquer do teclado e mostre na tela o índice em que ele se encontra no vetor, 
// ou então a mensagem "Elemento não encontrado!", se ele não estiver presente no vetor.

import java.util.Scanner;

class ex03_vetores{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] vetor = {1, 2, 3, 4, 5};
        boolean encontrado = false;

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        for(int i = 0; i < 5; i++){

            if(vetor[i] == num){

                System.out.print("Se encontra no indice: " + i);

                encontrado = true;

                break;}}

        if(encontrado == false){
            
            System.out.print("Elemento nao encontrado!");}

        input.close();}}
