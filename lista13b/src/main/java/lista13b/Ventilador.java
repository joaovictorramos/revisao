package lista13b;

public class Ventilador {
    private boolean onOff;
    private int venti = 0;
    
    public void velocidade(char maisMenos){
        if(this.getOnOff()){
            if(maisMenos == '+'){
                venti += 1;
                
            }else if(maisMenos == '-'){
                venti -= 1;
            }
            switch(venti){
                case 1:
                    System.out.println("Ventilador ligado na velocidade 1");
                    break;
                
                case 2:
                    System.out.println("Ventilador ligado na velocidade 2");
                    break;
                    
                case 3:
                    System.out.println("Ventilador ligado na velocidade 3");
                    break;
                    
                default:
                    if(venti > 3){
                        venti = 3;
                        System.out.println("Ventilador na velocidade máxima");
                                
                    }else if(venti < 1){
                        venti = 1;
                        System.out.println("Ventilador na velocidade mínima");
                    }
            }
        }else{
            venti = 0;
            System.out.println("Ventilador desligado");
        }
    }
    
    public int medicao(){
       if(venti == 1){
           System.out.println("Temperatura: O quarto está ameno");
           
       }else if(venti == 2){
           System.out.println("Temperatura: O quarto está fresco");
           
       }else if(venti == 3){
           System.out.println("Temperatura: O quarto está frio");
       }
       
       return venti;
    }
    
    public boolean getOnOff(){
        return this.onOff;
    }
    
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }
}
