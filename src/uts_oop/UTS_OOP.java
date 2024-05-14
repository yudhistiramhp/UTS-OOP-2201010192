/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_oop;

/**
 *
 * @author Yudhistira (2201010192)
 * TGL: 2024-05-14
 */

import java.util.Scanner;
public class UTS_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KostManager kosManager = new KostManager(10);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1/2/3/4/5): "); 
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("====================");

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nomor Telepon: ");
                    String notelp = scanner.nextLine();
                    System.out.print("Tanggal Masuk: ");
                    String tglmasuk = scanner.nextLine();
                    System.out.println("===================="); 
                    kosManager.addData(new KostData(id, nama, notelp, tglmasuk)); 
                    break;
                case 2:
                    KostData[] dataList = kosManager.getAllData();
                    System.out.println("Data Penghuni Kost :");
                    boolean first = true;
                    for (KostData data : dataList) {
                        if (data != null) {
                            if (!first) {
                                System.out.println();
                            }
                            System.out.println("ID: " + data.getId());
                            System.out.println("Nama: " + data.getNama());
                            System.out.println("Nomor Telepon: " + data.getNotelp());
                            System.out.println("Tanggal Masuk: " + data.getTglmasuk());
                            first = false;
                        }
                    }
                    System.out.println("====================");
                    break;
                case 3:
                    System.out.print("Masukkan ID untuk diubah: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan Nama Baru: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Telepon Baru: ");
                    notelp = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Masuk Baru: ");
                    tglmasuk = scanner.nextLine();
                    kosManager.updateData(id, nama, notelp, tglmasuk); 
                    break;
                case 4:
                    System.out.print("Masukkan ID yang dihapus: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 
                    kosManager.deleteData(id); 
                    break;
                case 5:
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Tidak Ada Pilihan Tersebut");
                    System.out.println("====================");
            }
        }
    }
}

