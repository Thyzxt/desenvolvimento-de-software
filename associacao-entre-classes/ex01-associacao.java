// O objetivo desta atividade é desenvolver um sistema simples de controle de empréstimos de livros em uma biblioteca.
// O sistema será composto por 3 classes principais: livro, cliente e emprestimo.
// A classe Cliente deve ter 2 atributos: nome (do tipo String) e idade (do tipo int).
// Essa classe deve conter um construtor para inicializar os atributos da classe, além dos getters para acessar o nome e a idade do cliente.
// A classe Livro deve ter 2 os atributos titulo e autor, ambos do tipo String.
// Essa classe deve conter um construtor que inicialize os atributos da classe, além dos getters para acessar o título e o autor do livro.
// A classe Emprestimo deve representar um empréstimo de livro feito por um cliente e deve ter 3 atributos:
// cliente (do tipo Cliente), livro (do tipo Livro) e data do empréstimo (String).
// Essa classe deve conter um construtor para inicializar os atributos da classe, além do método exibirDetalhes(), que exibe as informações do empréstimo.

class ex01_associacao{

    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Caio", 19);
        Cliente cliente2 = new Cliente("Ana Pereira", 30);

        Livro livro1 = new Livro("Machado de Assis", "Dom Casmurro");
        Livro livro2 = new Livro("A revolucao dos bichos", "George Orwell");

        Emprestimo emprestimo1 = new Emprestimo(cliente1, livro1, "08/04/2025");
        Emprestimo emprestimo2 = new Emprestimo(cliente2, livro2, "20/01/2025");

        emprestimo1.exibirDetalhes();
        emprestimo2.exibirDetalhes();}}

class Cliente{

    private String nome;
    private int idade;

    public Cliente(String nome, int idade){

        this.nome = nome;
        this.idade = idade;}

    public String getNome(){

        return this.nome;}

    public int getIdade(){

        return this.idade;}}

class Livro{

    private String autor;
    private String titulo;

    public Livro(String autor, String titulo){

        this.autor = autor;
        this.titulo = titulo;}

    public String getAutor(){

        return this.autor;}

    public String getTitulo(){

        return this.titulo;}}

class Emprestimo{

    private Cliente cliente;
    private Livro livro;
    private String data;

    public Emprestimo(Cliente cliente, Livro livro, String data){

        this.cliente = cliente;
        this.livro = livro;
        this.data = data;}

    public void exibirDetalhes(){

        System.out.println("Dados do emprestimo:");
        System.out.println("Cliente: " + cliente.getNome() + " (Idade: " + cliente.getIdade() + ")");
        System.out.println("Livro: " + livro.getTitulo() + " por " + livro.getAutor());
        System.out.println("Data do Emprestimo: " + data);
        System.out.println();}}