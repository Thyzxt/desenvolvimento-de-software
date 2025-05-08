// Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a sua média aritmética.

import java.util.Scanner;;

class ex01_metodos{

    public static void resultado_notas(String nome, float nota1, float nota2, float nota3){

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("O aluno %s obteve %.1f de media", nome, media);}

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Informe a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float nota3 = input.nextFloat();

        resultado_notas(nome, nota1, nota2, nota3);
    
        input.close();}}