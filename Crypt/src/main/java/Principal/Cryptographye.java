package Principal;

public class Cryptographye {
    
    public String encrypt(String frase){
        String fraseCrypt = "";
        
        for(int cont = 0; cont < frase.length(); cont++){
            fraseCrypt += encryptChar(frase.charAt(cont));
        }
        
        return fraseCrypt;
    }
    
    public char encryptChar(char fraseChar){
        char fraseCharCrypt;
        
        if(fraseChar >= 97 && fraseChar <= 122){
            fraseCharCrypt = (char)(((fraseChar - 97) + 3) % 26 + 97);
            
        }else if(fraseChar >= 65 && fraseChar <= 90){
            fraseCharCrypt = (char)(((fraseChar - 65) + 3) % 26 + 65);
            
        }else{
            fraseCharCrypt = fraseChar;
        }
        
        return fraseCharCrypt;
    }
    
    public String decrypt(String frase){
        String fraseDecrypt = "";
        
        for(int cont = 0; cont < frase.length(); cont++){
            fraseDecrypt += decryptChar(frase.charAt(cont));
        }
        
        return fraseDecrypt;
    }
    
    public char decryptChar(char fraseChar){
        char fraseCharDecrypt;
        
        if(fraseChar >= 97 && fraseChar <= 122){
            fraseCharDecrypt = (char)(((fraseChar - 97) - 3) % 26 + 97);
            if(fraseCharDecrypt < 97 || fraseCharDecrypt > 122){
                fraseCharDecrypt += 26;
            }
            
        }else if(fraseChar >= 65 && fraseChar <= 90){
            fraseCharDecrypt = (char)(((fraseChar - 65) - 3) % 26 + 65);
            if(fraseCharDecrypt < 65 || fraseCharDecrypt > 90){
                fraseCharDecrypt += 26;
            }
            
        }else{
            fraseCharDecrypt = fraseChar;
        }
        
        return fraseCharDecrypt;
    }
}