// Uma escola remunera seus professores por hora/aula ministrada. Escreva um método que calcule e retorne o salário de um professor, 
// sendo que o valor hora/aula obedece aos seguintes critérios: 20,00 para o nível 1, 25,00 para o nível 2 e 30,00 para o nível 3.

import java.util.Scanner;;

class ex02_metodos{

    public static float salario_prof(int qtd_horas, int nivel){

        int salario;

        if(nivel == 1){

            salario = qtd_horas * 20;}

        else if(nivel == 2){

            salario = qtd_horas * 25;}

        else{

            salario = qtd_horas * 30;}
        
        return salario;}

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int qtd_horas = input.nextInt();

        System.out.print("Informe o nivel do professor: ");
        int nivel = input.nextInt();

        System.out.printf("O salario do professor sera %.2f", salario_prof(qtd_horas, nivel));
    
        input.close();}}