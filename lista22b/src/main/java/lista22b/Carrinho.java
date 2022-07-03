package lista22b;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Mercadorias> mercadorias = new ArrayList<Mercadorias>();
    
    public ArrayList<Mercadorias> getMercadorias(){
        return this.mercadorias;
    }
    
    public void setMercadorias(ArrayList mercadorias){
        this.mercadorias = mercadorias;
    }
}
