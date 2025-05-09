// Em uma certa papelaria, até 100 folhas, a cópia do xerox custa R$ 0,25 e, acima de 100 folhas, cada cópia adicional custa R$ 0,20. 
// Escreva um programa que dado o número total de cópias, informe o valor a ser pago.

import java.util.Scanner;

class ex05_condicionais{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero de copias: ");
        int num_copias = input.nextInt();

        if(num_copias <= 100){
            
            System.out.print("O valor a ser pago eh: " + (num_copias * 0.25));}

        else{
            
            System.out.print("O valor a ser pago eh: " + (100 * 0.25 + ((num_copias - 100) * 0.20)));}
        
        input.close();}}
