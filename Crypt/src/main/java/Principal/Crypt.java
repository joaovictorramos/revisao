package Principal;

public class Crypt {

    public static void main(String[] args) {
        Cryptographye hacker = new Cryptographye();
        
        String crypto = hacker.encrypt("kkkkk jae");
        System.out.println(crypto);
        
        String decrypto = hacker.decrypt(crypto);
        System.out.println(decrypto);
    }
}