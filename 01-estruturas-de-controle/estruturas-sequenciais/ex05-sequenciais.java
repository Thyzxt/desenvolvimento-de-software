// Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda teria antes de um abastecimento de combustível. 
// Considere que o veículo sempre seja abastecido até encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros abastecidos e a quilometragem percorrida desde o último abastecimento.

import java.util.Scanner;

class ex05{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Capacidade do tanque: ");
        float cap_tanque = input.nextFloat();
        
        System.out.print("Litros abastecidos: ");
        float litros_abast = input.nextFloat();
        
        System.out.print("Km percorrido: ");
        float km_percorrido = input.nextFloat();
        
        float consumo_medio = km_percorrido / litros_abast;
        
        float autonomia = cap_tanque * consumo_medio;
        
        System.out.printf("Consumo medio: %.1f km/litro", consumo_medio);
        
        System.out.printf("\nAutonomia: %.1f km", autonomia);
        
        input.close();}}
