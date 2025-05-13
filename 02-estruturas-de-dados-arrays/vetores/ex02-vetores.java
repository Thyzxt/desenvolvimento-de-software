// Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores.
// Na sequência, apresente na tela os valores que são iguais ou superiores à média.

class ex02_vetores{

    public static void main(String[] args){

        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;

        for(int i = 0; i < 5; i++){

            soma += vetor[i];}

        float media = soma / 5;

        System.out.println("A media eh: " + media);

        System.out.print("Valores iguais ou superiores a media: ");

        for(int i = 0; i < 5; i++){
            
            if(vetor[i] >= media){

                System.out.print(vetor[i] + " ");}}}}
