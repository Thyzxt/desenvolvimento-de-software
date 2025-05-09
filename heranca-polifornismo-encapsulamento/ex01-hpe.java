// O objetivo desta atividade é desenvolver um sistema de biblioteca que permite o gerenciamento de diferentes tipos de itens, como livros e DVDs. 
// Cada item possui suas próprias características e funcionalidades específicas.
// A classe deve possuir os atributos título (String), anoPublicacao (int).

// Metódos:
// Construtor que inicializa os atributos título e ano de publicação.
// Getters e setters para todos os atributos.
// Método mostrarDetalhes(), que deve apresentar o título e o ano de publicação do item.

// Subclasses Livro e DVD:
// Devem herdar os atributos da classe ItemBiblioteca.
// Cada classe deve ter seus próprios atributos específicos que os diferenciam dos outros tipos de itens: 
// Livro (autor, número de páginas), DVD (categoria, duração em minutos).
// Método mostrarDetalhes(): cada subclasse deve ter um método mostrarDetalhes() que exibe todas as informações do item, 
// incluindo os atributos herdados da classe ItemBiblioteca e os atributos específicos da classe.

// Classe Main:
// Crie pelo menos uma instância de cada tipo de objeto.
// Chame o método mostrarDetalhes() para cada instância criada e exiba todas as informações do item.

// Observações
// Utilize o conceito de herança para evitar a repetição de código e garantir uma estrutura hierárquica adequada para os itens da biblioteca.
// Utilize o encapsulamento para proteger os atributos e permitir o acesso a eles por meio de métodos getters e setters.
// Aproveite o polimorfismo para tratar todos os tipos de itens de forma uniforme, mesmo sendo objetos de classes diferentes.

class ex01_hpe{
    public static void main(String[] args) {
       
        Livro livro = new Livro("O cavaleiro preso na armadura", 1993, "Robert Fisher", 128);
        DVD dvd = new DVD("Matrix", 1999, "Ficcao Cientifica", 136);
    
        System.out.println("Detalhes do livro:");
        livro.mostrarDetalhes();
        
        System.out.println("\nDetalhes do DVD:");
        dvd.mostrarDetalhes();}}

class ItemBiblioteca{

    private String titulo;
    private int anoPublicacao;
    
    /* Construtor */
    public ItemBiblioteca(String titulo, int anoPublicacao){

        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;}

    public String getTitulo(){

        return titulo;}
    
    public void setTitulo(String titulo){

        this.titulo = titulo;}
    
    public int getAnoPublicacao(){

        return anoPublicacao;}
    
    public void setAnoPublicacao(int anoPublicacao){

        this.anoPublicacao = anoPublicacao;}
 
    public void mostrarDetalhes(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Ano de publicacao: " + anoPublicacao);}}

class Livro extends ItemBiblioteca{

    private String autor;
    private int numPaginas;
    
    /* Construtor */
    public Livro(String titulo, int anoPublicacao, String autor, int numPaginas){

        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numPaginas = numPaginas;}
    
    /* Getters e setters */
    public String getAutor(){

        return autor;}
    
    public void setAutor(String autor){
        
        this.autor = autor;}
    
    public int getNumPaginas(){

        return numPaginas;}
    
    public void setNumPaginas(int numPaginas){

        this.numPaginas = numPaginas;}

    @Override
    public void mostrarDetalhes(){

        super.mostrarDetalhes();

        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPaginas);}}
 
class DVD extends ItemBiblioteca{

    private String categoria;
    private int duracaoMinutos;

    public DVD(String titulo, int anoPublicacao, String categoria, int duracaoMinutos){

        super(titulo, anoPublicacao);

        this.categoria = categoria;
        this.duracaoMinutos = duracaoMinutos;}

    public String getCategoria(){

        return categoria;}
    
    public void setCategoria(String categoria){

        this.categoria = categoria;}
    
    public int getDuracaoMinutos(){

        return duracaoMinutos;}
    
    public void setDuracaoMinutos(int duracaoMinutos){

        this.duracaoMinutos = duracaoMinutos;}

    @Override
    public void mostrarDetalhes(){

        super.mostrarDetalhes();

        System.out.println("Categoria: " + categoria);
        System.out.println("Duracao em minutos: " + duracaoMinutos);}}