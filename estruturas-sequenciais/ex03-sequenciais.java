// Uma fabrica de refrigerantes vende seu produto em três formatos: 
// lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
// Tomando por base que um comerciante compre uma determinada quantidade de cada um dos formatos disponíveis, 
// escreva um programa para calcular quantos litros de refrigerante ele comprou.

import java.util.Scanner;

class ex03{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a qtd de latas 350 ml: ");
        int latas_350 = input.nextInt();
        
        System.out.print("Informe a qtd de garrafas 600 ml: ");
        int garrafas_600 = input.nextInt();
        
        System.out.print("Informe a qtd de garrafas 2 l: ");
        int garrafas_2000 = input.nextInt();
        
        float total_litros = latas_350 * 0.35f + garrafas_600 * 0.6f + garrafas_2000 * 2;
        System.out.print("Total litros: " + total_litros);
        
        input.close();}}
