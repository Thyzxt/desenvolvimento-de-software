// Crie uma classe que modele uma conta corrente. 
// A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
// Os métodos são os seguintes: depósito e saque. 
// O saldo deve ser definido inicialmente com 0 (zero). 
// A cada deposito ou saque efetuado deve ser mostrado o nome do correntista e o saldo atualizado.

class ex01_objetos{
    public static void main(String[] args){
        
        Conta c1 = new Conta();

        c1.nome = "Marcelo";
        c1.num_conta = 12345;

        c1.status();

        c1.depositar(10);
        c1.sacar(5);
        c1.depositar(100);}}
 
class Conta{
    
    int num_conta;
    String nome;
    float saldo = 0;
    
    public void status(){

        System.out.print("Nome do correntista: " + this.nome + ". ");
        System.out.println("Saldo atual: " + this.saldo + ".");}
    
    public void depositar(float deposito){

        saldo += deposito;

        status();}
    
    public void sacar(float saque){

        saldo -= saque;

        status();}}