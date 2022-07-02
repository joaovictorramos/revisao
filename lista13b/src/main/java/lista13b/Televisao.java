package lista13b;

public class Televisao {
    private boolean onOff;
    private int limiteHDMI = 0;
    private int limiteUSB = 0;
    public int canal = 0;
    
    public Televisao(){
        canal = 1;
    }
    
    public void canal(int numero){
        canal = numero;
        if(this.getOnOff()){
            System.out.println("Canal atual: " + numero);
        }
    }
    
    public void source(char maisMenos, String entrada){
        if(this.getOnOff()){
            if(maisMenos == '+'){
                if("HDMI".equals(entrada) && limiteHDMI == 0){
                    limiteHDMI = 1;
                    System.out.println("HDMI conectado");

                }else if("USB".equals(entrada) && limiteUSB == 0){
                    limiteUSB = 1;
                    System.out.println("USB conectado");
                    
                }else if("HDMI".equals(entrada) && limiteHDMI == 1){
                    System.out.println("HDMI já está conectado");
                    
                }else if("USB".equals(entrada) && limiteUSB == 1){
                    System.out.println("USB já está conectado");
                    
                }else if(!"HDMI".equals(entrada) && !"USB".equals(entrada)){
                    System.out.println("Dispositivo não reconhecido");
                }
                
            }else if(maisMenos == '-'){
                if("HDMI".equals(entrada) && limiteHDMI == 1){
                    limiteHDMI = 0;
                    System.out.println("HDMI retirado");

                }else if("USB".equals(entrada) && limiteUSB == 1){
                    limiteUSB = 0;
                    System.out.println("USB retirado");
                    
                }else if("HDMI".equals(entrada) && limiteHDMI == 0){
                    System.out.println("HDMI não está conectado");
                    
                }else if("USB".equals(entrada) && limiteUSB == 0){
                    System.out.println("USB não está conectado");
                }
            }else{
                System.out.println("Entrada não identificada");
                
            }
        }else{
            System.out.println("TV desligada");
        }
    }
    
    public boolean getOnOff(){
        return this.onOff;
    }
    
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }
}
