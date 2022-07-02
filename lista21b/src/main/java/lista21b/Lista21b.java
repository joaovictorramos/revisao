package lista21b;

import java.util.ArrayList;

public class Lista21b {

    public static void main(String[] args) {
        ArrayList<Quarto> ventilador = new ArrayList<Quarto>();
        ArrayList<Quarto> lampada = new ArrayList<Quarto>();
        Quarto v1 = new Quarto();
        Quarto l1 = new Quarto();
        
        ventilador.add(v1);
        v1.getVentilador()[0] = true;
        v1.getVentilador()[1] = true;
        v1.getVentilador()[2] = true;

        v1.velocidade(0);
        v1.velocidade(1);
        v1.velocidade(0);
        v1.velocidade(3);
        v1.velocidade(2);
        
        System.out.println("");
        for(Quarto quarto : ventilador){
            if(!ventilador.isEmpty()){
                System.out.println(quarto.status());
            }
        }
        
        lampada.add(l1);
        l1.getLampada()[0] = true;
        l1.getLampada()[1] = false;
        
        for(Quarto quarto : lampada){
            if(!lampada.isEmpty()){
                System.out.println(quarto.statusLampada());
            }
        }
    }
}
