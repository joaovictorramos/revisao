package lista13b;

public class Lista13b {

    public static void main(String[] args) {
        Quarto p1 = new Quarto();
        Lampada l1 = new Lampada();
        Abajour a1 = new Abajour();
        Ventilador v1 = new Ventilador();
        ArCondicionado aC1 = new ArCondicionado();
        Televisao t1 = new Televisao();

        l1.setOnOff(true);
        a1.setOnOff(true);
        
        v1.setOnOff(true);
        v1.velocidade('+');
        v1.velocidade('+');
        v1.velocidade('+');
        v1.velocidade('-');
        
        aC1.setOnOff(true);
        System.out.println("");
        
        t1.setOnOff(true);
        t1.canal(24);
        t1.source('+', "HDMI");
        t1.source('+', "USB");
        t1.source('-', "USB");
        System.out.println("");
        
        p1.status(l1, a1, v1, aC1, t1);
        System.out.println("");
        
        p1.iluminacao(l1, a1);
        p1.temperatura(aC1, v1);
    }
}
