package lista21b;

public class Quarto {
    private boolean ventilador[] = new boolean[3];
    private boolean lampada[] = new boolean[2];
    private static int contV0 = 0;
    private static int contV1 = 0;
    private static int contV2 = 0;
    
    public String status(){
        return "\t===== STATUS =====\n" +
               "Ventilador [0]: " + this.getVentilador()[0] + "\n" +
               "Ventilador [1]: " + this.getVentilador()[1] + "\n" +
               "Ventilador [2]: " + this.getVentilador()[2] + "\n\n" +
               "Velocidade [0]: " + contV0 + "\n" +
               "Velocidade [1]: " + contV1 + "\n" +
               "Velocidade [2]: " + contV2 + "\n\n";
    }
    
    public String statusLampada(){
        return "\t===== STATUS DA LÂMPADA =====\n" +
               "Lâmpada [0]: " + this.getLampada()[0] + "\n" +
               "Lâmpada [1]: " + this.getLampada()[1] + "\n";
    }
    
    public static void velocidade(int pos){
        if((pos >= 0) && (pos <= 2)){
            switch(pos){
                case 0:
                    if(contV0 == 3){
                        contV0 = 1;
                        
                    }else{
                        contV0 += 1;
                    }
                    break;

                case 1:
                    if(contV1 == 3){
                        contV1 = 1;
                        
                    }else{
                        contV1 += 1;
                    }
                    break;

                case 2:
                    if(contV2 == 3){
                        contV2 = 1;
                        
                    }else{
                        contV2 += 1;
                    }
                    break;

                default:
                    System.out.println("Ventilador não encontrado\n");
            }
        }
    }
    
    public boolean[] getVentilador(){
        return this.ventilador;
    }
    
    public void setVentilador(boolean[] ventilador){
        this.ventilador = ventilador;
    }
    
    public boolean[] getLampada(){
        return this.lampada;
    }
    
    public void setLampada(boolean[] lampada){
        this.lampada = lampada;
    }
}
