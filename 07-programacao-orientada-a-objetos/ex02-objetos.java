// Crie uma classe que modele uma pessoa. 
// A classe deve possuir os seguintes atributos: nome, idade, peso e altura. Os métodos são os seguintes: 
// envelhecer (um ano por vez), engordar (informar quantidade de quilos) e emagrecer (informar quantidade de quilos). 
// Por padrão, a cada ano que uma pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 1 cm.

class ex02_objetos{
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa();

        p1.nome = "Marcelo";
        p1.idade = 17;
        p1.peso = 58.7;
        p1.altura = 1.75;
    
        p1.status();

        p1.envelhecer();
        p1.status();
        
        p1.engordar(1);
        p1.status();
        
        p1.emagrecer(2);
        p1.status();}}
 
class Pessoa{
    
    int idade;
    double peso;
    double altura;
    String nome;
    
    public void status(){

        System.out.print("Nome: " + this.nome + ". ");
        System.out.print("Idade: " + this.idade + ". ");
        System.out.print("Peso: " + this.peso + ". ");
        System.out.println("Altura: " + this.altura + ". ");}
    
    public void envelhecer(){

        idade++;
    
        if(idade < 21){

            altura += 0.01;}}

    public void emagrecer(float quilos){

        peso -= quilos;}
    
    public void engordar(float quilos){

        peso += quilos;}}