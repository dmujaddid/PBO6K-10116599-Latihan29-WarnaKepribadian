/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program ini menampilkan kepribadian seseorang berdasarkan warna favorit yang dipilih.
 * 
 */
public class PBO6K10116599Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println();
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");
        System.out.println();
        
        // input pilihan warna
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner scan = new Scanner(System.in);
        String pilihWarna = scan.next();
        
        // input nama user
        System.out.print("NAMA KAMU : ");
        String nama = scan.next();
        System.out.println();
        
        // output
        System.out.println("===HASIL TEST KEPRIBADIAN " +nama+ "===");
        
        
        if (pilihWarna.equalsIgnoreCase("biru")) {
            System.out.println("Warna favoritmu adalah " +(char)27+"[01;36m BIRU"+(char)27+"[00;00m");
            System.out.println("1. Menyenagkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senang berbagi,");
            System.out.println("6. Bersahabat,");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
            System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
        } else
            if (pilihWarna.equalsIgnoreCase("orange")) {
                System.out.println("Oops.. Belum teridentifikasi");
            } else
                if (pilihWarna.equalsIgnoreCase("merah")) {
                    System.out.println("Warna favoritmu adalah " +(char)27+"[01;31m MERAH"+(char)27+"[00;00m");
                    System.out.println("1. Periang,");
                    System.out.println("2. Pemberani");
                    System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                    System.out.println("4. Menyukai tantangan,");
                    System.out.println("5. Kurang sabar,");
                    System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                    System.out.println("7. Memiliki energi kehangatan dan cinta.");
                } else
                    if (pilihWarna.equalsIgnoreCase("kuning")) {
                        System.out.println("Warna favoritmu adalah " +(char)27+"[01;33m KUNING"+(char)27+"[00;00m");
                        System.out.println("1. Optimis,");
                        System.out.println("2. Suka bergaul,");
                        System.out.println("3. Periang,");
                        System.out.println("4. Senang menolong,");
                        System.out.println("5. Lincah dan aktif,");
                        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                        System.out.println("7. Loyal,");
                        System.out.println("8. Hangat,");
                        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                        System.out.println("10. Cenderung penakut.");
                    } else
                        if (pilihWarna.equalsIgnoreCase("ungu")) {
                            System.out.println("Warna favoritmu adalah " +(char)27+"[01;35m UNGU"+(char)27+"[00;00m");
                            System.out.println("1. Optimis,");
                            System.out.println("2. Tidak pernah ragu,");
                            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                            System.out.println("4. Memili ambisi yang besar,");
                            System.out.println("5. Memiliki empati yang besar,");
                            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                            System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                        } else
                            if (pilihWarna.equalsIgnoreCase("hijau")) {
                                System.out.println("Warna favoritmu adalah " +(char)27+"[01;32m HIJAU"+(char)27+"[00;00m");
                                System.out.println("1. Romantis,");
                                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                                System.out.println("3. Teguh pada prinsip,");
                                System.out.println("4. Mengingikan kesempurnaan,");
                                System.out.println("5. Mudah cemburu,");
                                System.out.println("6. Mudah merasa iri,");
                                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                            }
        
        
    }
    
}
