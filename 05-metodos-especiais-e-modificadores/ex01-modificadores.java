// Criar uma classe chamada Produto que representa um produto em um sistema de estoque. A classe vai ter alguns atributos privados, 
// como nome, preço e quantidade em estoque, além de métodos construtores, getters e setters para acessar e modificar esses atributos.

class ex01_modificadores{

    public static void main(String[] args){

        Produto produto1 = new Produto("desodorante", 8, 20);

        System.out.println("Cadastro do produto:");
        produto1.mostrarInformacoes();

        produto1.atualizarEstoque(-5);

        System.out.println("Apos atualizar o estoque:");
        produto1.mostrarInformacoes();

        produto1.setPreco(10.0);

        System.out.println("Apos modificar o preco:");
        produto1.mostrarInformacoes();}}

class Produto{

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;}

    public String getNome(){

        return nome;}

    public void setNome(String nome){

        this.nome = nome;}

    public double getPreco(){

        return preco;}

    public void setPreco(double preco){

        this.preco = preco;}

    public int getQuantidade(){

        return quantidade;}

    public void setQuantidade(int quantidade){

        this.quantidade = quantidade;}

    public void atualizarEstoque(int quantidade){

        if(this.quantidade + quantidade < 0){

            System.out.println("Nao e possivel atualizar o estoque, pois o mesmo ficaria negativo.");
            System.out.println();}

        else{

            this.quantidade += quantidade;}}

    public void mostrarInformacoes(){

        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println();}}