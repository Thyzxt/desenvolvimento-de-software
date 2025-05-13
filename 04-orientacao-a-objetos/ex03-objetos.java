// Crie uma classe que modele uma bomba de combustível. 
// A classe deve possuir os seguintes atributos: 
// número da bomba, tipo de combustível, valor do litro de combustível e quantidade de combustível. 
//Os métodos são os seguintes:
// abastecerPorValor( ): método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo.
// abastecerPorLitro( ): método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
// alterarValor( ): altera o valor do litro do combustível.
// alterarQuantidadeCombustivel( ): altera a quantidade de combustível restante na bomba.
// status(): mostra o dados da bomba de combustível.
// Observação: sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba.

class ex03_objetos{
    public static void main(String[] args){
        
        Bomba b1 = new Bomba();
        b1.num_bomba = 14;
        b1.tipo_combustivel = "Alcool";
        b1.valor_litro = 3.99;
        b1.qtd_combustivel = 1000;
        b1.status();
  
        b1.abastecerPorValor(50);
        b1.abastecerPorLitro(10);
        b1.alterarValor(4.25);
        b1.alterarQuantidadeCombustivel(2000);}}
 
class Bomba{
    
    int num_bomba;
    String tipo_combustivel;
    double valor_litro;
    double qtd_combustivel;
    
    public void status(){

        System.out.printf("\nNumero da bomba: %d", num_bomba);
        System.out.printf("\nTipo combustivel: %s", tipo_combustivel);
        System.out.printf("\nValor do litro: %.2f", valor_litro);
        System.out.printf("\nQuantidade de combustivel: %.2f\n", qtd_combustivel);}
    
    public void abastecerPorValor(double valor){

        qtd_combustivel -= valor / valor_litro;

        System.out.printf("\nForam abastecidos %.2f litros", valor / valor_litro);}

    public void abastecerPorLitro(double litros){

        System.out.printf("\nValor a pagar: %.2f", litros * valor_litro);
    
        qtd_combustivel -= litros;}
    
    public void alterarValor(double novo_valor){

        valor_litro = novo_valor;
    
        System.out.printf("\nO valor do combustivel da bomba %d foi alterado para %.2f.", num_bomba, valor_litro);}
    
    public void alterarQuantidadeCombustivel(double nova_qtd){

        qtd_combustivel = nova_qtd;
    
        System.out.printf("\nA quantidade de combustivel na bomba %d foi alterado para %.2f.", num_bomba, qtd_combustivel);}}