package pacote.Pacote;

import java.sql.SQLOutput;

public class Lutador {

    private String nome;
    private int idade;
    private String nacionalidade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome(){
        return nome;}
    public int getIdade(){
        return idade;}
    public String getNacionalidade(){
        return nacionalidade;}
    public double getAltura(){
        return altura;}
    public double getPeso(){
        return peso;}
    public String getCategoria(){
        return categoria;}
    public int getVitorias(){
        return vitorias;}
    public int getDerrotas(){
        return derrotas;}
    public int getEmpates(){
        return empates;}

    public void setNome(String nome){
        this.nome = nome;}
    public void setIdade(int idade){
        this.idade = idade;}
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;}
    public void setAltura(float altura){
        this.altura = altura;}
    public void setPeso(float peso){
        this.peso = peso; this.setCategoria();}
    private void setCategoria(){
        if(this.peso < 52.2){categoria = "Inválido";
        } else if(this.peso <= 70.3){categoria = "Leve";
        } else if(this.peso <= 83.9){categoria = "Médio";
        } else if(this.peso <= 120.2){categoria = "Pesado";
        } else{categoria = "Inválido";}}
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;}
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;}
    public void setEmpates(int empates){
        this.empates = empates;}

    public void apresentar(){
        System.out.println("-------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Com " + this.getIdade() + " anos de idade");
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.printf("Pesando %.2f kgs \n", this.getPeso());
        System.out.println("Número de Vitórias: " + this.getVitorias());
        System.out.println("Número de Derrotas: " + this.getDerrotas());
        System.out.println("Número de Empates: " + this.getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void ganharLuta(){this.setVitorias(this.getVitorias() + 1);}
    public void perderLuta(){this.setDerrotas(this.getDerrotas() + 1);}
    public void empatarLuta(){this.setEmpates(this.getEmpates() + 1);}

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){

    this.nome = no;
    this.idade = id;
    this.nacionalidade = na;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;

    }

}
