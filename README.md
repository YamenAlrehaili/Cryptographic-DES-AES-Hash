# Cryptographic-DES-AES-Hash Using CLI
**This is a cryptographic project developed as part of CS 433 Computer Security course. The project implements encryption and decryption using DES and AES, as well as a one-way hash function using SHA256 and SHA512 in Java.**
The project was developed to demonstrate the practical application of cryptographic techniques and to enhance our understanding of computer security.
## Features
* Encryption and decryption using DES and AES
* One-way hash function using SHA256 and SHA512
* ## This text file will be used next
```
Hi there
```
## Symmetric Cryptographic Results
* ## DES Encryption
```
MAIN MENU
===============================================
What do you need to implement ?
        1.Encyption
        2.Hashing
        3.Exit
Enter your Choice:1

ENCRYPTION
===============================================
What do you need to implement ?
        1.Encrypt
        2.Decrypt
        3.Back to main menu
Enter your Choice:1
Choose your file:C:\Users\PC\Downloads\Text.txt

your file is : C:\Users\PC\Downloads\Text.txt
 are you sure [y,n] :y
Choose the algorithm (AES, DES): DES
Enter the secret key (8-length) :%&*123&%
Done! File C:\Users\PC\Downloads\Text.txt is encrypted using DES
Output file is Text0.encrypted
```
* ### After Encryption(Result)
```
Y@Ã|žûŒP7>:ìv¹”û
```
* ## DES Decryption
```
MAIN MENU
===============================================
What do you need to implement ?
        1.Encyption
        2.Hashing
        3.Exit
Enter your Choice:1

ENCRYPTION
===============================================
What do you need to implement ?
        1.Encrypt
        2.Decrypt
        3.Back to main menu
Enter your Choice:2
Choose your file:C:\Users\PC\Downloads\Text0..encrypted

your file is : C:\Users\PC\Downloads\Text0..encrypted
 are you sure [y,n] :y
Error: File Dose not exists!
Choose your file:C:\Users\PC\Downloads\Text0.encrypted  

your file is : C:\Users\PC\Downloads\Text0.encrypted
 are you sure [y,n] :y
Choose the algorithm (AES, DES): DES
Enter the secret key (8-length) :%&*123&%
Done! File C:\Users\PC\Downloads\Text0.encrypted is decrypted using DES
Output file is Text00.txt
```
* ### After Decryption(Result)
```
Hi there
```
* ## AES Encryption
```
MAIN MENU
===============================================
What do you need to implement ?
        1.Encyption
        2.Hashing
        3.Exit
Enter your Choice:1

ENCRYPTION
===============================================
What do you need to implement ?
        1.Encrypt
        2.Decrypt
        3.Back to main menu
Enter your Choice:1
Choose your file:C:\Users\PC\Downloads\Text.txt

your file is : C:\Users\PC\Downloads\Text.txt
 are you sure [y,n] :y
Choose the algorithm (AES, DES): AES
Enter the secret key (24-length) :%&*123&fg9893gh43g7&*$#&
Done! File C:\Users\PC\Downloads\Text.txt is encrypted using AES
Output file is Text1.encrypted
```
* ### After Encryption(Result)
```
w¢í:q¢ ðîå$jCÙ‡
```
* ## AES Decryption
```
MAIN MENU
===============================================
What do you need to implement ?
        1.Encyption
        2.Hashing
        3.Exit
Enter your Choice:1

ENCRYPTION
===============================================
What do you need to implement ?
        1.Encrypt
        2.Decrypt
        3.Back to main menu
Enter your Choice:2
Choose your file:C:\Users\PC\Downloads\Text1.encrypted 

your file is : C:\Users\PC\Downloads\Text1.encrypted
 are you sure [y,n] :y
Choose the algorithm (AES, DES): AES
Enter the secret key (24-length) :%&*123&fg9893gh43g7&*$#&
Done! File C:\Users\PC\Downloads\Text1.encrypted is decrypted using AES
Output file is Text10.txt
```
* ### After Decryption(Result)
```
Hi there
```
## One-way Hash Function Results
generates a message digest of a given file
### Digisting using SHA-256
```
MAIN MENU
===============================================
What do you need to implement ?
        1.Encyption
        2.Hashing
        3.Exit
Enter your Choice:2
Choose your file:C:\Users\PC\Downloads\Text.txt

your file is : C:\Users\PC\Downloads\Text.txt
 are you sure [y,n] :y
Choose the Algorithm (SHA256, SHA512): SHA256
Done! File C:\Users\PC\Downloads\Text.txt digested using SHA256
Output file is Text0.msgdigest
```
* ### SHA-256 Results
```
8328C36D18B7834A38118F6EC924AE143C10263F2519C723CCB36CA14E7461FB
```
### Digisting using SHA-512
```
MAIN MENU
===============================================
What do you need to implement ?
        1.Encyption
        2.Hashing  
        3.Exit     
Enter your Choice:2
Choose your file:C:\Users\PC\Downloads\Text.txt

your file is : C:\Users\PC\Downloads\Text.txt
 are you sure [y,n] :y
Choose the Algorithm (SHA256, SHA512): SHA512
Done! File C:\Users\PC\Downloads\Text.txt digested using SHA512
Output file is Text1.msgdigest
```
* ### SHA-512 Results
```
8ECD9A6D7C9EDEF41FCA235E264D0630754680C37CB9AA0D5B1963E0C87B7ED0E3320A056E396EFE7B6D4469B6D3C1D708C4C28D19DD9DF6F157CA60B8B9988C
```
