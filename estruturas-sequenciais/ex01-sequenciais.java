// Escreva um programa que leia horas, minutos e segundos do teclado e apresente o tempo total em segundos.

import java.util.Scanner;

class ex01{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas: ");
        int horas = input.nextInt();

        System.out.print("Informe a quantidade de minutos: ");
        int minutos = input.nextInt();

        System.out.print("Informe a quantidade de segundos: ");
        int segundos = input.nextInt();

        int total_segundos = horas * 3600 + minutos * 60 + segundos;

        System.out.print("Tempo total em segundos: " + total_segundos);
    
        input.close();}}

