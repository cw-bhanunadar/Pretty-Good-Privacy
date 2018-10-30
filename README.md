PGP

Pretty Good Privacy uses a variation of the public key system. In this system, each user has an encryption key that is publicly known and a private key that is known only to that user.You encrypt a message you send to someone else using their public key. When they receive it, they decrypt it using their private key.

Since encrypting an entire message can be time-consuming, PGP uses a faster encryption algorithm to encrypt the message and then uses the public key to encrypt the shorter key that was used to encrypt the entire message.

Both the encrypted message and the short key are sent to the receiver who first uses the receiver's private key to decrypt the short key and then uses that key to decrypt the message.

Algo Used RSA for public key system, to encrypt key.
Caesar Cipher for encrypt Plain text.
GPG is an open-source implementation of OpenPGP
Flow of the project
1.Run Alice File, Enter the plain text

2.Chipher Text is generated using Random Key(Which is not random for this code you can edit it).

3.Then Bob public and private key is generated.

4.Encrpytion of Random Key using RSA

5.Bob will get the message and encrypt key

6.Decryption of key done using RSA, using that key ChipherText is decrypted.
