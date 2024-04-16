# Program Kalkulator Kelompok A8

menggunakan maven untuk melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.



## Description

Program ini dibuat untuk memenuhi kebutuhan pengguna dalam melakukan operasi aritmatika sederhana. Pengguna dapat memasukkan dua angka dan sebuah operator (+, -, *, /) untuk mendapatkan hasilnya. Program ini dirancang untuk melakukan pengujian white box dengan menggunakan build tools Maven.



## Creator

- 211524004 Berliana
- 211524005 Cintia
- 211524029 Yane



## Prerequisites

Java Runtime Environment (JRE) harus terinstall di komputer pengguna.



## How to Use

1. Jalankan program dengan menjalankan kelas Main.
2. Masukkan angka pertama ketika diminta.
3. Masukkan operator (+, -, *, /) ketika diminta.
4. Masukkan angka kedua ketika diminta.
5. Hasil dari operasi aritmatika akan ditampilkan.



## Testing Tools

- IDE : visual studio code
- Alat build otomatis : Apache Maven
- Tools buat runing : Terminal
- Sistem operasi : Window
- Unit testing : Java (Junit)
- Bahasa pemrograman : Java



## Notes

1. Program ini membatasi rentang angka antara -32,768 dan 32,767.
2. Pembagian dengan nol tidak diperbolehkan.
3. Hanya input angka yg dapat dioperasikan. Ini berarti karakter dan huruf tidak diperbolehkan.
4. Pada program kalkulator ini hanya mendukung operasi aritmatika dasar seperti, penjumlahan, pengurangan, perkalian dan pembagian.
5. Program hanya dapat menerima input dua angka. Ini berarti operasi yang memerlukan lebih dari dua operand, seperti perkalian matrik atau kalkulasi persentase, tidak dapat     dilakukan.
6. Program hanya dapat menerima input bilangan bulat. Ini berarti angka desimal (float) tidak dapat diproses.
7. Hasil perhitungan akan selalu berupa bilangan bulat.



## Running the program
1. Menjalankan perintah berikut pada terminal untuk mengkompilasi source code menjadi file JAR.
   
   ```sh
   mvn package exec:java
   ```
   
2. Jika file JAR sudah terbuat untuk running program jalankan perintah berikut pada terminal
   
   ```sh
   mvn exec:java
   ```


## Test the program

Berikut merupakan perintah yang dapat di gunakan untuk melakukan test program menggunakan maven pada terminal
1. Perintah dibawah digunakan untuk menguji semua class sekaligus
   
   ```sh
   mvn test
   ```
   
2. Perintah dibawah digunakan untuk menguji semua method test yang terdapat pada satu class test secara sekaligus.
   
   - Perintah untuk menguji semua method test pada class ValidationTest

     ```sh
     mvn -Dtest=ValidationTest test
     ```
     
   - Perintah untuk menguji semua method test pada class CalculatorOperationsTest

     ```sh
     mvn -Dtest=CalculatorOperationsTest test
     ```

3. Perintah dibawah digunakan untuk menguji satu method test spesifik dari satu class test.
   
   - Berikut merupakan rincian perintah untuk menguji method test spesifik yang terdapat pada class ValidationTest
     
     - Perintah untuk menguji method testValidasiInputNonNumerik

       ```sh
       mvn -Dtest=ValidationTest#testValidasiInputNonNumerik test
       ```
       
     - Perintah untuk menguji method testValidasiInputOverOfRange
       
       ```sh
       mvn -Dtest=ValidationTest#testValidasiInputOverOfRange test
       ```
       
     - Perintah untuk menguji method testValidasiInputLessOfRange
       
       ```sh
       mvn -Dtest=ValidationTest#testValidasiInputLessOfRang test
       ```
       
     - Perintah untuk menguji method testValidasiDivisionByZero
       
       ```sh
       mvn -Dtest=ValidationTest#testValidasiDivisionByZero test
       ```
       
     - Perintah untuk menguji method testValidasiOperatorTidakValid
       
       ```sh
       mvn -Dtest=ValidationTest#testValidasiOperatorTidakValid test
       ```
       
       
   -  Berikut merupakan rincian perintah untuk menguji method test spesifik yang terdapat pada class CalculatorOperationsTest
      - Perintah untuk menguji method testAddition

        ```sh
        mvn -Dtest=CalculatorOperationsTest#testAddition test
        ```
        
      - Perintah untuk menguji method testSubtract
  
        ```sh
        mvn -Dtest=CalculatorOperationsTest#testSubtract test
        ```
        
      - Perintah untuk menguji method testMultiply
          
        ```sh
        mvn -Dtest=CalculatorOperationsTest#testMultiply test
        ```
        
      - Perintah untuk menguji method testDivide
          
        ```sh
        mvn -Dtest=CalculatorOperationsTest#testDivide test
        ```

3. Untuk menguji semua metohod pada file validation.java, klik tombol "running" disebelah kiri yang berbentuk segitiga yang       menunjuk ke kanan.


## Generate report by tools
Untuk melakukan generate report dengan menggunakan tools maven, terlibih dahulu harus menambahkan <reporting> pada file pom.xml yang terdapat pada line (31 sampai 40)
