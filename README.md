# Program Kalkulator Kelompok A8

yang dapat melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.


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

<img width="700" alt="contoh tampilan aplikasi" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/a78961a6-973f-4805-aad1-83c67aad6177">


## Testing Tools

- IDE : visual studio code
- Alat build otomatis : Apache Maven
- Tools buat runing : Terminal
- Sistem operasi : Window
- Framework Unit testing : JUnit 
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
   
2. Perintah dibawah digunakan untuk menguji semua method test yang terdapat pada satu class test secara sekaligus.
   
   - Perintah untuk menguji semua method test pada class ValidationTest

     ```sh
     mvn -Dtest=ValidationTest test
     ```
     
   - Perintah untuk menguji semua method test pada class CalculatorOperationsTest

     ```sh
     mvn -Dtest=CalculatorOperationsTest test
     ```
     
   - Perintah untuk menguji semua method test pada class MainTest

     ```sh
     mvn -Dtest=MainTest test
     ```

     
3. Perintah dibawah digunakan untuk menguji satu method test spesifik dari satu class test.
   
   - Berikut merupakan perintah untuk menguji method test spesifik yang terdapat pada class ValidationTest

     ```sh
     mvn -Dtest=ValidationTest#<Nama_Method_Test> test
     ```
     
     Contohnya
     
     Berikut merupakan perintah untuk menguji method testValidasiOperand1LessOfRange yang merupakan test untuk menguji angka kurang dari range

     ```sh
     mvn -Dtest=ValidationTest#testValidasiOperand1LessOfRange test
     ```
       
   - Berikut merupakan perintah untuk menguji method test spesifik yang terdapat pada class CalculatorOperationsTest

     ```sh
     mvn -Dtest=CalculatorOperationsTest#<Nama_Method_Test> test
     ```
  
     Contohnya
     
     Berikut perintah untuk menguji method testAddition yang merupakan test untuk menguji proses penjumlahan

     ```sh
     mvn -Dtest=CalculatorOperationsTest#testAddition test
     ```

   - Berikut merupakan perintah untuk menguji method test spesifik yang terdapat pada class MainTest

     ```sh
     mvn -Dtest=MainTest#<Nama_Method_Test> test
     ```
  
     Contohnya
     
     Berikut merupakan perintah untuk menguji method testAngkaPertamaLebihDariRange yang merupakan test untuk menguji angka pertama yang nilainya lebih dari range
     
     ```sh
     mvn -Dtest=MainTest#testAngkaPertamaLebihDariRange test
     ```
     
     
## Generate report by tools

Untuk melakukan generate report dengan menggunakan tools maven, terlibih dahulu harus menambahkan <reporting> pada file pom.xml yang terdapat pada line (31 sampai 40). 

1. Berikut merupakan perintah untuk generate report menggunakan maven

   ```sh
   mvn surefire-report:report 
   ```

2. Sehingga hasil dari generate report tersebut akan membuat folder site didalam folder target

   <img width="275" alt="foldersite" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/d4f66f9f-ad29-4cfa-a931-9f11da5d404f">

3. Untuk melihat hasilnya buka file surefire-report.html pada browser

    <img width="700" alt="generateReport" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/5f2a159e-a11b-459f-bb97-323c1fc51646">

   **Penjelasan**
   - **Summary** berisikan jumlah dari seluruh test, error, failure, skipped, success rate dan time
     <img width="700" alt="summary" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/af9a7449-fc37-429c-a742-00a4a3bbd8a0">
     
   - **Package List** berisikan list dari package serta list dari file test yang terdapat pada package tersebut. Dimana kelompok kami memiliki 3 file test pada package calculator yaitu CalculatorOperationsTest, MainTest dan ValidationTest. Dan pada masing - masing file test terdapat jumlah dari seluruh test, error, failure, skipped, success rate dan time
  
     <img width="700" alt="packagelist" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/69358460-9230-433f-a7ef-717a48e03f3f">

      - File yang tidak memiliki kesalahan dari hasil test akan ditandai dengan icon  ![icon_success_sml](https://github.com/berlianalfd/JavaCalcApp/assets/143075674/35de3318-03aa-4f47-b138-c1878a6fbde6)
        
      - File yang memiliki kesalahan dari hasil test akan ditandai dengan icon  ![icon_warning_sml](https://github.com/berlianalfd/JavaCalcApp/assets/143075674/0c638baa-b3d8-4631-935a-016860d10987)
      
   - **Test Cases** berisikan list dari selurh test yang dilakukan pada setiap file test
     
     <img width="700" alt="testcases" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/698fc74f-57aa-46a7-a497-85e318c19306">

      - Test dengan status **PASS** akan ditandai dengan icon  ![icon_success_sml](https://github.com/berlianalfd/JavaCalcApp/assets/143075674/35de3318-03aa-4f47-b138-c1878a6fbde6)
      
      - Test dengan status **FAIL** akan ditandai dengan icon  ![icon_error_sml](https://github.com/berlianalfd/JavaCalcApp/assets/143075674/74827540-a631-4957-8688-bba7b94b37df)
      
   - Test dengan status **FAIL** akan ditunjukkan dengan menampilkan kesalahan apa yang terjadi yaitu menampilkan expected nya bagaimana apa dan actual nya bagaimana.
  
     <img width="700" alt="tcfail" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/86eb4334-5fab-440d-a8c9-0a80473c0cc1">
      
     Untuk mendapatkan infomasi lebih detail mengenai kesalahan yang sedang terjadi, dapat dilihat pada bagian **Failure Details**

     <img width="700" alt="detail error" src="https://github.com/berlianalfd/JavaCalcApp/assets/143075674/b642f2cf-7513-41c9-ab25-67b076eb1b57">



## Referensi      
https://maven.apache.org/surefire/maven-surefire-report-plugin/usage.html       
