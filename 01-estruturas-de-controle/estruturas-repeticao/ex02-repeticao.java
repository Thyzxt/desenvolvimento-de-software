// Escreva um programa que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3 + 4 + 5 + ... + 100).

class ex02_repeticao{

    public static void main(String[] args){

        int soma = 0;

        for(int i = 0; i <= 100; i++){

            soma += i;}

        System.out.print("Soma dos valores: " + soma);}}