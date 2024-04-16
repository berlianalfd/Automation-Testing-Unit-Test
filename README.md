# Program Kalkulator Kelompok A8
menggunakan maven untuk melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.

## Creator
Berliana, Cintia, Yane

## Description
Program ini dibuat untuk memenuhi kebutuhan pengguna dalam melakukan operasi aritmatika sederhana. Pengguna dapat memasukkan dua angka dan sebuah operator (+, -, *, /) untuk mendapatkan hasilnya. Program ini dirancang untuk melakukan pengujian white box dengan menggunakan build tools Maven.

## Prerequisites
Java Runtime Environment (JRE) harus terinstall di komputer pengguna.

## How to Use
1. Jalankan program dengan menjalankan kelas Main.
2. Masukkan angka pertama ketika diminta.
3. Masukkan operator (+, -, *, /) ketika diminta.
4. Masukkan angka kedua ketika diminta.
5. Hasil dari operasi aritmatika akan ditampilkan.

## Testing
Program ini mencakup pengujian unit untuk memastikan kebenaran operasi aritmatika dan validasi input.

## Notes
1. Program ini membatasi rentang angka antara -32,768 dan 32,767.
2. Pembagian dengan nol tidak diperbolehkan.
3. Hanya input angka yg dapat dioperasikan. Ini berarti karakter dan huruf tidak diperbolehkan.
4. Pada program kalkulator ini hanya mendukung operasi aritmatika dasar seperti, penjumlahan, pengurangan, perkalian dan pembagian.
5. Program hanya dapat menerima input dua angka. Ini berarti operasi yang memerlukan lebih dari dua operand, seperti perkalian matrik atau kalkulasi persentase, tidak dapat     dilakukan.
6. Program hanya dapat menerima input bilangan bulat. Ini berarti angka desimal (float) tidak dapat diproses.
7. Hasil perhitungan akan selalu berupa bilangan bulat.

## Running the program
1. Menjalankan perintah "mvn package exec:java" pada terminal untuk mengkompilasi source code menjadi file JAR.
2. Untuk running program jalankan perintah "mvn exec:java" pada terminal

## Test the program
1. Perintah "mvn test" dijalankan di terminal untuk menguji semua class sekaligus
2. Perintah "mvn -Dtest=MainTest#testAddition test" dijalankan di terminal untuk menguji satu method test spesifik dari satu    class test.
3. Untuk menguji semua class pada file validation.java, klik tombol "running" disebelah kiri yang berbentuk segitiga yang       menunjuk ke kanan.
