import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
public class SimpleAES{
    public static void main(String args[])throws Exception{
        KeyGenerator keyGen=KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretkey=keyGen.generateKey();
        Cipher cipher=Cipher.getInstance("AES");
        String plainText="Hello.AES";
        cipher.init(cipher.ENCRYPT_MODE,secretkey);
        byte[] encrypted=cipher.doFinal(plainText.getBytes());
        cipher.init(cipher.DECRYPT_MODE,secretkey);
        byte[] decrypted=cipher.doFinal(encrypted);
        System.out.println("Encrypted:" + new String(encrypted));
        System.out.println("Decrypted:" + new String(decrypted));
        
    }
}