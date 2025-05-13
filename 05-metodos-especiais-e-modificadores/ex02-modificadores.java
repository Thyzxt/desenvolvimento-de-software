// Agenda de contatos

import java.util.Scanner;

class ex02_modificadores{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Contato[] contato = new Contato[3];

        int numContatos = 0;

        while(true){

            System.out.println("\n[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Excluir contato");
            System.out.println("[5] Listar contatos");
            System.out.println("[6] Sair");
            int opcao = input.nextInt();

            input.nextLine();

            switch(opcao){

                case 1:

                    if(numContatos == 2){
                        
                        System.out.println("\nAgenda cheia! Nao eh possivel adicionar mais contatos.");}

                    else{

                        System.out.print("\nInforme o nome: ");
                        String nome = input.nextLine();

                        System.out.print("Informe o numero: ");
                        String numero = input.nextLine();

                        contato[numContatos] = new Contato(nome, numero);

                        numContatos++;} 
                    
                    break;

                case 2:

                    if(numContatos == 0){
                        
                        System.out.println("\nNao ha contatos para buscar.");}

                    else{

                        System.out.print("\nInforme o nome do contato que deseja buscar: ");
                        String buscar = input.nextLine().toLowerCase();

                        for(int i = 0; i < numContatos; i++){

                            if(contato[i].getNome().toLowerCase().contains(buscar)){

                                System.out.println("Numero: " + contato[i].getNumero() + ", Nome: " + contato[i].getNome() + "\n");}}}

                    break;

                case 3:

                    if(numContatos == 0){
                        
                        System.out.println("\nNao ha contatos para editar.");}

                    else{

                        System.out.print("\nInforme o nome do contato para editar: ");
                        String editar = input.nextLine().toLowerCase();

                        for(int i = 0; i < numContatos; i++){

                            if(contato[i].getNome().toLowerCase().contains(editar)){

                                System.out.print("Contato encontrado! Informe o novo numero: ");
                                String novoNumero = input.nextLine();
                            
                                contato[i].setNumero(novoNumero);}}}

                    break;

                case 4:

                    if(numContatos == 0){
                        
                        System.out.println("\nNao ha contatos para excluir.");}
                        
                    else{
                        
                        for(int i = 0; i < numContatos; i++){
                            
                            System.out.println("\nContato: " + (i + 1));
                            
                            System.out.println("Numero: " + contato[i].getNumero() + ", Nome: " + contato[i].getNome() + "\n");}
                            
                            System.out.println("Qual contato quer excluir?");
                            int excluir = input.nextInt() - 1;
                            
                            if(excluir >= 0 && excluir < numContatos){
                                
                                for (int i = excluir; i < numContatos - 1; i++){
                                    
                                    contato[i] = contato[i + 1];}}
                                    
                            contato[numContatos - 1] = null;
                            
                            numContatos--;
                            
                            System.out.println("Contato excluido!");}
                    
                    break;

                case 5:

                    if(numContatos == 0){
                        
                        System.out.println("\nNao ha contatos para listar.");}

                    else{

                        for(int i = 0; i < numContatos; i++){

                            System.out.println("\nContato: " + (i + 1));
                            System.out.println("Numero: " + contato[i].getNumero() + ", Nome: " + contato[i].getNome());}}
                    
                    break;

                case 6:

                    input.close();
                    
                    break;

                    
            
                default:

                    System.out.println("Opcao invalida!");

                    break;}}}}

class Contato{

    private String nome;
    private String numero;

    public Contato(String nome, String numero){

        this.nome = nome;
        this.numero = numero;}

    public String getNome(){

        return this.nome;} 

    public void setNome(String nome){

        this.nome = nome;} 

    public String getNumero(){

        return this.numero;} 

    public void setNumero(String numero){

        this.numero = numero;}}
