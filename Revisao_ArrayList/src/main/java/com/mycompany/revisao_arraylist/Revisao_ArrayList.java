package com.mycompany.revisao_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Revisao_ArrayList {
    
    public static void fichaCachorro(ArrayList<Cachorro> fichaC){
        System.out.println("===== Cachorros para Adoção =====");
        for(Cachorro cachorro : fichaC){
            if(!fichaC.isEmpty()){
                System.out.println(cachorro.statusCachorro());
                System.out.println("---------------------------------------\n");
            }
        }
    }
    
    public static void fichaAdocao(ArrayList<Ficha> fichaAdocao){
        boolean cond = true;
        int limite = fichaAdocao.size();
        
        //Remover pelas condições de DATA
        do{
            cond = true;
            for(int i = 0; i < limite; i++){
                if(!fichaAdocao.get(i).validacao()){
                    cond = false;
                    limite -= 1;
                    fichaAdocao.remove(i);
                }
            }
        }while(!cond);
        
        System.out.println("===== Ficha de Adoção =====");
        for(Ficha ficha : fichaAdocao){
            if(!fichaAdocao.isEmpty()){
                System.out.println(ficha.statusFicha());
            }
        }
    }
    
    public static void procurarCachorro(ArrayList<Ficha> fichaAdocao){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int cond;
        String nome = "", resp = "";
        
        do{
            System.out.println("Deseja procurar um cachorro[Sim/Nao]: ");
            resp = scan.nextLine();
            if(resp.equalsIgnoreCase("Sim")){
                System.out.println("Digite o nome do cachorro: ");
                nome = scan2.nextLine();

                cond = 0;
                for(Ficha ficha : fichaAdocao){
                    if(!fichaAdocao.isEmpty()){
                        if(ficha.getCachorro().getNome().equalsIgnoreCase(nome)){
                            cond = 1;
                            System.out.println("\nDados do Cachorro\n\n");
                            System.out.println(ficha.getCachorro().statusCachorro());
                            break;
                        }
                    }
                }
                
                if(cond == 0){
                    System.out.println("\nCachorro não encontrado...");
                }
            }else if(!resp.equalsIgnoreCase("Nao")){
                System.out.println("\nERRO \nDigite novamente...");
            }
        }while(!resp.equalsIgnoreCase("nao"));
    }
    
    public static void maisTempoAdotado(ArrayList<Ficha> fichaAdocao){
        long maior = 0;
        String nome = "";
        for(Ficha ficha : fichaAdocao){
            if(!fichaAdocao.isEmpty()){
                if(maior < ficha.maisTempoAdot()){
                    maior = ficha.maisTempoAdot();
                    nome = ficha.getCachorro().getNome();
                }
            }
        }
        System.out.println("\nCachorro com mais tempo de adoção: " + nome);
        System.out.println("Tempo de adoção: " + maior + " dias\n");
    }
    
    public static void adotViraLata(ArrayList<Ficha> fichaAdocao){
        int cont = 0;
        for(Ficha ficha : fichaAdocao){
            if(!fichaAdocao.isEmpty()){
                if(ficha.getCachorro().getRaca().equalsIgnoreCase("Vira Lata")){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de Vira Latas adotados: " + cont);
    }
    
    public static void quantDesnutridos(ArrayList<Cachorro> listaDog){
        int cont = 0;
        for(Cachorro cachorro : listaDog){
            if(!listaDog.isEmpty()){
                if(cachorro.getPeso() >= 0 && cachorro.getPeso() <= 20){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de cachorros desnutridos: " + cont);
    }
    
    public static void quantViraLata(ArrayList<Cachorro> listaDog){
        int cont = 0;
        for(Cachorro cachorro : listaDog){
            if(!listaDog.isEmpty()){
                if(cachorro.getRaca().equalsIgnoreCase("Vira Lata")){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de cachorros Vira Latas: " + cont);
    }
    
    public static void quantAmarelo(ArrayList<Cachorro> listaDog){
        int cont = 0;
        for(Cachorro cachorro : listaDog){
            if(!listaDog.isEmpty()){
                if(cachorro.getCor().equalsIgnoreCase("Amarela")){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de cachorros de cor Amarela: " + cont);
    }

    public static void main(String[] args) {
        ArrayList<Cachorro> cachorro = new ArrayList<>();
        ArrayList<Ficha> ficha = new ArrayList<>();
        
        Cachorro c1 = new Cachorro("Kate", "12/06/2009", "Vira Lata", "Preta", 35);
        Cachorro c2 = new Cachorro("Bob", "09/10/2010", "Bull Dog", "Preta", 22);
        Cachorro c3 = new Cachorro("Pitty", "02/03/2007", "Pitbull", "Branca", 38);
        Cachorro c4 = new Cachorro("Kelly", "08/05/2001", "Labrador", "Amarela", 36);
        Cachorro c5 = new Cachorro("Peixe", "09/11/2008", "Vira Lata", "Amarela", 20);
        Cachorro c6 = new Cachorro("Grazi", "12/12/2012", "Pastor", "Amarela", 18);
        
        Pessoa p1 = new Pessoa("Diana", "Rua da Diana", 911111111, "diana01@gmail.com", "feminino", c1);
        Pessoa p2 = new Pessoa("Louis", "Rua do Louis", 922222222, "louis02@gmail.com", "masculino", c2);
        Pessoa p3 = new Pessoa("Bruce", "Rua do Bruce", 933333333, "bruce03@gmail.com", "masculino", c3);
        Pessoa p4 = new Pessoa("Clark", "Rua do Clark", 944444444, "clark04@gmail.com", "masculino", c4);
        
        Ficha f1 = new Ficha(c1, p1, "24/12/2010");
        Ficha f2 = new Ficha(c2, p2, "20/03/2011");
        Ficha f3 = new Ficha(c3, p3, "18/06/2007");
        Ficha f4 = new Ficha(c4, p4, "01/09/2002");
        
        cachorro.add(c1);
        cachorro.add(c2);
        cachorro.add(c3);
        cachorro.add(c4);
        cachorro.add(c5);
        cachorro.add(c6);
        //fichaCachorro(cachorro);
        
        ficha.add(f1);
        ficha.add(f2);
        ficha.add(f3);
        ficha.add(f4);
        fichaAdocao(ficha);
        
        procurarCachorro(ficha);
        maisTempoAdotado(ficha);
        adotViraLata(ficha);
        
        quantDesnutridos(cachorro);
        quantViraLata(cachorro);
        quantAmarelo(cachorro);
    }
}
