package com.mycompany.revisao_arraylist;

public class Pessoa {
    private String nome;
    private String endereco;
    private long telefone;
    private String email;
    private String sexo;
    private Cachorro cachorro;

    public Pessoa(String nome, String endereco, long telefone, String email, String sexo, Cachorro cachorro) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cachorro = cachorro;
    }
    
    public String statusPessoa(){
        return "Nome: " + getNome() + "\n"
             + "Endereço: " + getEndereco() + "\n"
             + "Telefone: " + getTelefone() + "\n"
             + "Email: " + getEmail() + "\n"
             + "Sexo: " + getSexo() + "\n"
             + "Cachorro: " + getCachorro().getNome() + "\n";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
}
