// Escreva uma função que receba o nome de um produto, o preço desse produto e o valor em dinheiro entregue ao vendedor. 
// Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo: 
// "Você comprou um produto por R$ 185,00 e entregou ao vendedor R$ 200,00 em dinheiro. Você vai receber R$ 15,00 de troco. Volte sempre!".

import java.util.Scanner;;

class ex04_metodos{

    public static void conta_energia(String produto, float preco, float valor_entregue){

        System.out.printf("Você comprou um produto (%s) por R$ %.2f e entregou ao vendedor R$ %.2f em dinheiro. Você vai receber R$ %.2f de troco. Volte sempre!", produto, preco, valor_entregue, valor_entregue - preco);}

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String produto = input.nextLine();

        System.out.printf("Informe o preço do produto (%s): ", produto);
        float preco = input.nextFloat();

        System.out.printf("Informe o valor entregue: ");
        float valor_entregue = input.nextFloat();

        conta_energia(produto, preco, valor_entregue);
    
        input.close();}}