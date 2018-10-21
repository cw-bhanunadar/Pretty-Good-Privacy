import java.io.*;
import java.util.*;
class RSA 
{
	int i;
	static int a=3,b=5;
	public RSA(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	int gcd(int a,int b)
	{
		if (b == 0) 
			return a; 
		return gcd(b, a % b); 
	}
	int decryptKey(int pub,int n)
	{
		int i=0;
		for(i=2;i<1000;i++)
		{
			if((i*pub)%n==1){
				System.out.println("Decryption d*e%(n)==1 where d= "+i);
			return i;
			}
		}
		return i;
	}
	int encryption(int key,int pub)
	{
		int k= ((int)Math.pow(key,pub)% (a*b));
		System.out.println("C=Plain^e % n where e= "+pub+" n= "+(a*b)+" value "+k+" Plain "+key);
		return k;
	}
	static int decryption(int cipherKey,int privateKey)
	{
		int p=((int)Math.pow(cipherKey,privateKey)%(a*b));
		System.out.println("P=Chipher^d % n where d= "+privateKey+" n= "+(a*b)+" Chipher= "+cipherKey+" Value= "+p);
		 return p;
	}

	public int generatePublicKey(String as)
	{
		System.out.println("RSA Algorithm");
		int n=(a-1)*(b-1);
		System.out.println("N value "+n);
		int pub=0;
		for(i=2;i<1000;i++)
		{
			if(gcd(n,i)==1)
			{
				//Public key Generation
				 pub=i;
				 System.out.println("gcd(e,n)==1 where e= "+i);
				 break;
			}
		}
		//Private Key
		int d=decryptKey(pub,n);
		if(as=="Alice")
		{
			PGPBob.setPrivateKey(d);
		}
		else
		{
			PGPAlice.SelfprivateKey=d;
		}
		return pub;
	}
}
