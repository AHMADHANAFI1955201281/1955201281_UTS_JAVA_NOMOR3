/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekSederhanaCampuran;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ProjekCampuran {
        public static void main(String[] args) {
       //membuat variable
       String nilai,nama;
       boolean jalan = true;
       int a = 0;
               
               //membuat new scanner
               Scanner scan = new Scanner (System.in);
               //memanggil perintah untuk input
               System.out.print("Nama Mahasiswa                                  : ");
               nama = scan.nextLine();
               System.out.print("Masukkan Nilai (input nilai berupa huruf A/B/C) : ");
               //menyimpan apa yang akan diketik di variable
               nilai = scan.nextLine();
               
                int i = 1;

while ( i <= 5 ){
    // blok kode yang akan diulang
    System.out.println();
    // increment nilai i
    i++;
               
               
                switch (nilai){
                   case "A":
                       System.out.println(nama +" GOOD JOB, terus belajar untuk meningkatkan pengetahuanmu! ");
                       break;
                   case "B":
                       System.out.println(nama +" LUAR BIASA,terus belajar untuk meningkatkan nilai dan pengetahuanmu!  ");
                       break;
                   case "C":
                       System.out.println(nama +" NILAIMU MASIH KURANG, tetap semangat belajar dan perbaiki nilaimu! ");
                       break;
                   default:
                       System.out.println(nama +" MAAF NILAI YANG KAMU MASUKKAN TIDAK VALID!");
                }
            }
        }
}

/*4.	Proyek Campuran Sederhana 
Deskripsi Program :
Pada program sederhana campuran dengan melakukan input/output berupa nama dan nilai, melakukan percabangan dengan menambah kan switch case pilihan satu sampai pilihan ke tiga dan selain pilihan satu sampai tiga, dan melakukan perulangan dengan menampilkan perulangan sebanyak 5 kali sesuai dengan Input yang dimasukkan user,  apabila user memasukkan nilai A maka program akan mencetak output kalimat “nama +" GOOD JOB, terus belajar untuk meningkatkan pengetahuanmu! " dengan perulangan sebanyak 5 kali,  apabila user memasukkan nilai B maka program akan mencetak output kalimat “LUAR BIASA,terus belajar untuk meningkatkan nilai dan pengetahuanmu!” dengan perulangan sebanyak 5 kali, apabila user memasukkan nilai C maka program akan mencetak output kalimat “nama +" NILAIMU MASIH KURANG, tetap semangat belajar dan perbaiki nilaimu! "” dengan perulangan sebanyak 5 kali, terakhir apabila user memasukkan nilai selain A/B/C maka program akan mencetak output berupa kalimat “nama +" MAAF NILAI YANG KAMU MASUKKAN TIDAK VALID!". 
Deskripsi Source Code :
-	Dimulai dengan mengimport sintaks : import java.util.Scanner   terlebih dahulu pada baris sebelum deklarasi class.
-	Membuat variabel
String nilai,nama;
boolean jalan = true;
int a = 0;
-	Membuat scanner
Scanner scan = new Scanner (System.in);
-	Memanggil perintah untuk input data
               System.out.print("Nama Mahasiswa                                  : ");
               nama = scan.nextLine();
               System.out.print("Masukkan Nilai (input nilai berupa huruf A/B/C) : ");
-	Menyimpan yang diketik pada variable
               nilai = scan.nextLine();
-	Membuat variabel untuk perulangan while
int i = 1;
-	Membuat perulangan while
while ( i <= 5 ){
System.out.println();
 i++;
yang akan menampilkan perulangan sebanyak 5 kali
-	Membuat switch case
switch (nilai){
case "A":
System.out.println(nama +" GOOD JOB, terus belajar untuk meningkatkan pengetahuanmu! ");
                       break;
case "B":
System.out.println(nama +" LUAR BIASA,terus belajar untuk meningkatkan nilai dan pengetahuanmu!  ");
                       break;
case "C":
 System.out.println(nama +" NILAIMU MASIH KURANG, tetap semangat belajar dan perbaiki nilaimu! ");
                       break;

dan apabila input yang dimasukkan user selain tiga pilihan di atas makan program akan mencetak output berupa
default:
System.out.println(nama +" MAAF NILAI YANG KAMU MASUKKAN TIDAK VALID!");
*/