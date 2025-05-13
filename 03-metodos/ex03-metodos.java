// Escreva um método que calcule e retorne o valor da conta de energia a ser paga de acordo com a quantidade de kW consumidos, 
// sendo que o valor do kW é 0,60 (pessoa física), 0,48 (comércio) e 1,29 (indústria).

import java.util.Scanner;;

class ex03_metodos{

    public static float conta_energia(int kW_consumido, int tipo){

        float conta;

        if(tipo == 1){

            conta = kW_consumido * 0.60f;}

        else if(tipo == 2){

            conta = kW_consumido * 0.48f;}

        else{

            conta = kW_consumido * 1.29f;}
        
        return conta;}

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de kW consumidos: ");
        int kW_consumido = input.nextInt();

        System.out.print("Informe o tipo (1 - Pessoa fisica, 2 - Comercio ou 3 - Industria): ");
        int tipo = input.nextInt();

        System.out.printf("Total a pagar: %.2f", conta_energia(kW_consumido, tipo));
    
        input.close();}}