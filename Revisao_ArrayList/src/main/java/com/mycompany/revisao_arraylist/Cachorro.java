package com.mycompany.revisao_arraylist;

public class Cachorro {
    private String nome;
    private String dataEntrada;
    private String raca;
    private String cor;
    private double peso;

    public Cachorro(String nome, String dataEntrada, String raca, String cor, double peso) {
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }
    
    public String statusCachorro(){
        return "Nome: " + getNome() + "\n"
             + "Data de entrada: " + getDataEntrada() + "\n"
             + "Raça: " + getRaca() + "\n"
             + "Cor: " + getCor() + "\n"
             + "Peso: " + getPeso() + " Kg\n";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
