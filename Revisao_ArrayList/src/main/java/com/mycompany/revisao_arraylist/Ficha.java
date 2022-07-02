package com.mycompany.revisao_arraylist;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ficha {
    private Cachorro cachorro;
    private Pessoa pessoa;
    private String dataAdocao;
    
    private static long tempo = 0;
    private static LocalDate dataEntVali;
    private static LocalDate dataAdoVali;
    
    public Ficha(Cachorro cachorro, Pessoa pessoa, String dataAdocao) {
        this.cachorro = cachorro;
        this.pessoa = pessoa;
        this.dataAdocao = dataAdocao;
    }
    
    public String statusFicha(){
        formatacao();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAdoFor = dataAdoVali.format(formato);
        
        return "CACHORRO: \n" + getCachorro().statusCachorro() + "\n"
             + "PESSOA: \n" + getPessoa().statusPessoa() + "\n"
             + "DATA DE ADOÇÃO: " + dataAdoFor + "\n"
             + "TEMPO NA ONG: " + tempoOng() + "\n\n"
             + "NUTRIÇÃO: " + nutricao() + "\n\n"
             + "TEMPO DE ADOÇÃO: " + tempoAdocao() + "\n\n"
             + "---------------------------------------\n";
    }
    
    private void formatacao(){
        String dataEnt = "";
        String dataAdo = "";
        
        for(int i = 0; i < getCachorro().getDataEntrada().length(); i++){
            if(getCachorro().getDataEntrada().charAt(i) != '/'){
                dataEnt += getCachorro().getDataEntrada().charAt(i);
            }
        }
        
        for(int i = 0; i < getDataAdocao().length(); i++){
            if(getDataAdocao().charAt(i) != '/'){
                dataAdo += getDataAdocao().charAt(i);
            }
        }
        
        String diaDE = "";
        String mesDE = "";
        String anoDE = "";
        
        String diaDA = "";
        String mesDA = "";
        String anoDA = "";
        
        int i = 0;
        while(i < 2){
            diaDE += dataEnt.charAt(i);
            diaDA += dataAdo.charAt(i);
            i++;
        }
        while(i < 4){
            mesDE += dataEnt.charAt(i);
            mesDA += dataAdo.charAt(i);
            i++;
        }
        while(i < 8){
            anoDE += dataEnt.charAt(i);
            anoDA += dataAdo.charAt(i);
            i++;
        }
        
        int diaE = Integer.parseInt(diaDE);
        int mesE = Integer.parseInt(mesDE);
        int anoE = Integer.parseInt(anoDE);
        
        int diaA = Integer.parseInt(diaDA);
        int mesA = Integer.parseInt(mesDA);
        int anoA = Integer.parseInt(anoDA);
        
        dataEntVali = LocalDate.of(anoE, mesE, diaE);
        dataAdoVali = LocalDate.of(anoA, mesA, diaA);
    }
    
    public boolean validacao(){
        boolean resp = true;
        
        formatacao();
        long quest = ChronoUnit.DAYS.between(dataEntVali, dataAdoVali);
        if(quest < 0){
            resp = false;
        }
        
        return resp;
    }
    
    private String tempoOng(){
        formatacao();
        
        Period periodo = Period.between(dataEntVali, dataAdoVali);
        int dia = periodo.getDays();
        int mes = periodo.getMonths();
        int ano = periodo.getYears();
        
        return "\nDias = " + dia +
               "\nMeses = " + mes +
               "\nAnos = " + ano;
    }
    
    private String nutricao(){
        String frase = "";
        double calcPeso = getCachorro().getPeso();
        
        if(calcPeso >= 0 && calcPeso <= 20){
            frase = "Desnutrido";
            
        }else if(calcPeso >= 21 && calcPeso <= 30){
            frase = "Normal";
            
        }else if(calcPeso > 30){
            frase = "Obeso";
            
        }else{
            frase = "Não foi possível realizar a medida...";
        }
        
        return frase;
    }
    
    private String tempoAdocao(){
        formatacao();
        LocalDate agora = LocalDate.now();
        Period periodo = Period.between(dataAdoVali, agora);
        
        return "\nDias = " + periodo.getDays() +
               "\nMeses = " + periodo.getMonths() +
               "\nAnos = " + periodo.getYears();
    }
    
    public long maisTempoAdot(){
        formatacao();
        LocalDate agora = LocalDate.now();
        tempo = ChronoUnit.DAYS.between(dataAdoVali,agora);

        return tempo;
    }
    
    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public String getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(String dataAdocao) {
        this.dataAdocao = dataAdocao;
    }
}
