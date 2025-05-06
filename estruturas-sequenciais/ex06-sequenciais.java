// Escreva um programa que solicite do usuário o valor de um saque em caixa eletrônico, sendo que estarão disponíveis cédulas de 5, 10, 20, 50 e 100. 
// O programa deve apresentar a menor quantidade de cédulas possível de acordo com o saque.
// 400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
// 350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
// 385,00: 3 cédulas de 100, 1 cédula de 50, 1 cédula de 20, 1 cédula de 10 e 1 cédula de 5.

import java.util.Scanner;

class ex06{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor do saque: ");
        int valor_saque = input.nextInt();
        
        System.out.printf("%d cedulas de 100.", valor_saque / 100);
        valor_saque = valor_saque % 100;
        
        System.out.printf("\n%d cedulas de 50.", valor_saque / 50);
        valor_saque = valor_saque % 50;

        System.out.printf("\n%d cedulas de 20.", valor_saque / 20);
        valor_saque = valor_saque % 20;

        System.out.printf("\n%d cedulas de 10.", valor_saque / 10);
        valor_saque = valor_saque % 10;

        System.out.printf("\n%d cedulas de 5.", valor_saque / 5);
        valor_saque = valor_saque % 5;
        
        input.close();}}
