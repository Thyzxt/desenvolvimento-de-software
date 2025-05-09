import java.util.ArrayList;
 
 
class ex02_hpe{
    
    public static void main(String[] args){
        
        Carro c1 = new Carro("Volkswagen", "Gol", 2020, 30, 12.0);
        Carro c2 = new Carro("Fiat", "Uno", 2019, 20, 14.0);
        Carro c3 = new Carro("Hyundai", "HB20", 2021, 35, 11.5);
        Moto m1 = new Moto("Honda", "CG 125", 2020, 12, 38.0);
 
 
        ArrayList<Veiculo> frota = new ArrayList<>();
        frota.add(c1);
        frota.add(c2);
        frota.add(c3);
        frota.add(m1);
 
 
        c1.mostrarDetalhes();
 
 
        System.out.println();
        c2.mostrarDetalhes();
 
 
        System.out.println();
        c3.mostrarDetalhes();
 
 
        System.out.println();
        m1.mostrarDetalhes();
 
 
        System.out.println();
        c1.acelerar();
        c2.frear();
        c3.acelerar();
        m1.acelerar();
 
 
        System.out.println();
        c1.realizarViagem(360);
        c2.realizarViagem(300);
        c3.realizarViagem(150);
        m1.realizarViagem(50);
 
 
        System.out.println();
        frota.remove(c2);
        
        System.out.println("Frota apos a viagem:");
        for(Veiculo veiculo : frota){
            
            System.out.println();
            veiculo.mostrarDetalhes();}}}
 
 
class Veiculo{
    
    private double combustivel;
    private double consumoMedio;
    private String marca;
    private String modelo;
    private int anoFabricacao;
 
 
    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;}
        
    public double getCombustivel(){
        
        return combustivel;}
 
 
    public void setCombustivel(double combustivel){
        
        this.combustivel = combustivel;}
 
 
    public double getConsumoMedio(){
        
        return consumoMedio;}
 
 
    public void setConsumoMedio(double consumoMedio){
        
        this.consumoMedio = consumoMedio;}
        
    public String getMarca(){
        
        return marca;}
 
 
    public void setMarca(String marca){
        
        this.marca = marca;}
 
 
    public String getModelo(){
        
        return modelo;}
 
 
    public void setModelo(String modelo){
        
        this.modelo = modelo;}
 
 
    public int getAnoFabricacao(){
        
        return anoFabricacao;}
 
 
    public void setAnoFabricacao(int anoFabricacao){
        
        this.anoFabricacao = anoFabricacao;}
 
 
    public double calcularAutonomia(){
        
        return combustivel * consumoMedio;}
 
 
    public boolean precisaAbastecimento(){
        
        return calcularAutonomia() < 30;}
 
 
    public void realizarViagem(double distancia){
        
        double autonomia = calcularAutonomia();
        
        if(autonomia >= distancia){
            
            combustivel -= distancia / consumoMedio;
            
            System.out.printf("Viagem concluida! Restaram %.2f litros!\n", combustivel);} 
            
        else{
            
            System.out.println("Nao foi possivel realizar a viagem.");}}
 
 
    public void mostrarDetalhes(){
        
        System.out.println("Veiculo: " + modelo);
        System.out.println("Fabricacao: " + anoFabricacao);
        System.out.printf("Autonomia: %.2f km\n", calcularAutonomia());
        
        if(precisaAbastecimento()){
            
            System.out.println("Precisa de abastecimento? Sim");} 
            
        else{
            
            System.out.println("Precisa de abastecimento? Nao");}}
 
 
    public void acelerar(){
        System.out.println(modelo + " acelerando.");}
 
 
    public void frear(){
        System.out.println(modelo + " freando.");}}
 
 
class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);}}
 
 
class Moto extends Veiculo{
    
    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);}}