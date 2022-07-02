package lista13b;

public class Quarto {
    private Lampada lampada;
    private Abajour abajour;
    private Ventilador ventilador;
    private ArCondicionado arCondicionado;
    private Televisao televisao;
    
    public Quarto(){
       this.setLampada(null);
       this.setAbajour(null);
       this.setVentilador(null);
       this.setArCondicionado(null);
       this.setTelevisao(null);
    }
    
    public void status(Lampada lampada, Abajour abajour, Ventilador ventilador, ArCondicionado arCondicionado, Televisao televisao){
        if(lampada.getOnOff()){
            System.out.println("Lâmpada: ON");
            
        }else{
            System.out.println("Lâmpada: OFF");
        }
        if(abajour.getOnOff()){
            System.out.println("Abajour: ON");
            
        }else{
            System.out.println("Abajour: OFF");
        }
        if(ventilador.getOnOff()){
            System.out.println("Ventilador: ON");
            
        }else{
            System.out.println("Ventilador: OFF");
        }
        if(arCondicionado.getOnOff()){
            System.out.println("Ar condicionado: ON");
            
        }else{
            System.out.println("Ar condicionado: OFF");
        }
        if(televisao.getOnOff()){
            System.out.println("Televisão: ON");
            System.out.println("Canal atual: " + televisao.canal);
            
        }else{
            System.out.println("Televisão: OFF");
        }
    }
    
    public void iluminacao(Lampada lampada, Abajour abajour){
        if(lampada.getOnOff() && abajour.getOnOff()){
            System.out.println("Iluminação: O quarto está totalmente iluminado");
            
        }else if(lampada.getOnOff() && !abajour.getOnOff()){
            System.out.println("Iluminação: O quarto está iluminado");
            
        }else if(!lampada.getOnOff() && abajour.getOnOff()){
            System.out.println("Iluminação: O quarto está meio iluminado");
            
        }else if(!lampada.getOnOff() && !abajour.getOnOff()){
            System.out.println("Iluminação: O quarto está escuro");
        }
    }
    
    public void temperatura(ArCondicionado arCondicionado, Ventilador ventilador){
        int condicao = 0;
        if(arCondicionado.getOnOff()){
            System.out.println("Temperatura: O quarto está muito frio");
            
        }else if(ventilador.getOnOff()){
            condicao = ventilador.medicao();
            
            if(!arCondicionado.getOnOff() && condicao == 0){
                System.out.println("Temperatura: O quarto está quente");
            }
            
        }else if(!arCondicionado.getOnOff()){
            System.out.println("Temperatura: O quarto está quente");
        }
    }
    
    public Lampada getLampada() {
        return lampada;
    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public Abajour getAbajour() {
        return abajour;
    }

    public void setAbajour(Abajour abajour) {
        this.abajour = abajour;
    }

    public Ventilador getVentilador() {
        return ventilador;
    }

    public void setVentilador(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Televisao getTelevisao() {
        return televisao;
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }
}
