import java.io.*;
import java.util.*;
class PGPBob{
    static int SelfprivateKey;
    static int PublicKeyOfAlice,encryptKey;

    public static void setPrivateKey(int a)
    {
        SelfprivateKey=a;
        System.out.println("Bob got his the private key is "+a);
    }
    public void sendKeyToBob(int Encryptkey)
    {
		encryptKey=RSA.decryption(Encryptkey,SelfprivateKey);
        System.out.println("Bob: Got the Key i.e "+encryptKey);
    }
    public void sendMessage(String s)
    {
        System.out.println("Got the chipher message\nDecrypting");
        System.out.println("Message is");
        DecryptMessage(encryptKey,s);
    }
    public void DecryptMessage(int key,String message)
    {
        for(int i=0;i<message.length();i++)
        {
            System.out.print((char)(message.charAt(i)-key));
        }
    }
}