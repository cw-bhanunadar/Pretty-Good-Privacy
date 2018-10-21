import java.util.*;
import java.io.*;
class PGPAlice 
{
	static int SelfprivateKey;
    static int PublicKeyOfBob;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("PGP starts, Enter your Message");
		String a=sc.next();
		System.out.println("Random Session Key Generated");
		int key=5;
		char c[]=a.toCharArray();
		char ciphertext[]=new char[a.length()];
		for(i=0;i<a.length();i++)
		{
			ciphertext[i]=(char)(((int)c[i]+key));
		}
		System.out.println("Chipher Text Generated");
		RSA temp =new RSA(7,5);
		PublicKeyOfBob = temp.generatePublicKey("Alice");
		System.out.println("Got the public key of Bob "+PublicKeyOfBob);
		int Encryptkey=temp.encryption(key,PublicKeyOfBob);
		System.out.println("Encryption of Session key by public key of Bob done, EncryptKey is "+Encryptkey);
		PGPBob bob=new PGPBob();
		System.out.println("Alice:Sending Key");
		bob.sendKeyToBob(Encryptkey);
		System.out.println("Alice: Sending Cipher Text  "+String.valueOf(ciphertext));
		bob.sendMessage(String.valueOf(ciphertext));
		

	}
}
