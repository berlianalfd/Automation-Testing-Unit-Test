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

Berikut merupakan contoh tampilan dari program

<img width="900" alt="contoh tampilan aplikasi" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/a78961a6-973f-4805-aad1-83c67aad6177">


## Testing Tools

- IDE : visual studio code
- Alat build otomatis : Apache Maven
- Tools buat runing : Terminal
- Sistem operasi : Window
- Unit testing : Java (Junit)
- Bahasa pemrograman : Java


## Notes

1. Program ini membatasi rentang angka antara -32768 dan 32767.
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

   Output
   
   
3. Perintah dibawah digunakan untuk menguji semua method test yang terdapat pada satu class test secara sekaligus.
   
   - Perintah untuk menguji semua method test pada class ValidationTest

     ```sh
     mvn -Dtest=ValidationTest test
     ```

     Output

     
   - Perintah untuk menguji semua method test pada class CalculatorOperationsTest

     ```sh
     mvn -Dtest=CalculatorOperationsTest test
     ```

     Output

     
   - Perintah untuk menguji semua method test pada class MainTest

     ```sh
     mvn -Dtest=MainTest test
     ```

     Output

     
4. Perintah dibawah digunakan untuk menguji satu method test spesifik dari satu class test.
   
   - Berikut merupakan perintah untuk menguji method test spesifik yang terdapat pada class ValidationTest

     ```sh
     mvn -Dtest=ValidationTest#<Nama Method Test> test
     ```
     
     Contohnya
     Berikut perintah untuk menguji method ....    
       
   - Berikut merupakan perintah untuk menguji method test spesifik yang terdapat pada class CalculatorOperationsTest

     ```sh
     mvn -Dtest=CalculatorOperationsTest#<Nama Method Test> test
     ```
  
     Contohnya
     Berikut perintah untuk menguji method ....

   - Berikut merupakan perintah untuk menguji method test spesifik yang terdapat pada class MainTest

     ```sh
     mvn -Dtest=MainTest#<Nama Method Test> test
     ```
  
     Contohnya
     Berikut perintah untuk menguji method testAngkaPertamaLebihDariRange yang merupakan test untuk untuk angka pertama yang nilainya lebih dari range
     ```sh
     mvn -Dtest=MainTest#testAngkaPertamaLebihDariRange test
     ```
     
     Output
     <img width="900" alt="contoh tampilan aplikasi" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/f69bfb8c-0e51-4a31-bd30-05ca6d30f677">
     
     
## Generate report by tools

Untuk melakukan generate report dengan menggunakan tools maven, terlibih dahulu harus menambahkan <reporting> pada file pom.xml yang terdapat pada line (31 sampai 40). 

Berikut merupakan perintah untuk generate report menggunakan maven

```sh
mvn surefire-report:report 
```

Sehingga hasil dari generate report tersebut akan membuat folder site didalam folder target
<img width="400" alt="foldersite" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/d4f66f9f-ad29-4cfa-a931-9f11da5d404f">

Untuk melihat hasilnya buka file surefire-report.html pada browser

