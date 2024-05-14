/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop;

/**
 *
 * @author Yudhistira (2201010192)
 * TGL: 2024-05-14
 */
public class KostManager {
    private KostData[] kostList;
    private int count;

    public KostManager(int size) {
        kostList = new KostData[size];
        count = 0;
    }

    public void addData(KostData data) {
        if (count >= kostList.length) {
            System.out.println("Data Sudah Penuh!");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (kostList[i].getId() == data.getId()) {
                System.out.println("ID sudah ada, data tidak dapat ditambahkan!");
                return;
            }
        }
        kostList[count] = data;
        count++;
        System.out.println("Data Berhasil Ditambahkan!");
    }

    public KostData[] getAllData() {
        return kostList;
    }

    public KostData getDataById(int id) {
        for (int i = 0; i < count; i++) {
            if (kostList[i] != null && kostList[i].getId() == id) {
                return kostList[i];
            }
        }
        return null;
    }

    public void updateData(int id, String nama, String notelp, String tglmasuk) {
        KostData data = getDataById(id);
        if (data != null) {
            data.setNama(nama);
            data.setNotelp(notelp);
            data.setTglmasuk(tglmasuk);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    public void deleteData(int id) {
        for (int i = 0; i < count; i++) {
            if (kostList[i] != null && kostList[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    kostList[j] = kostList[j + 1];
                }
                kostList[count - 1] = null;
                count--;
                System.out.println("Data Berhasil Dihapus!");
                return;
            }
        }
        System.out.println("Data Tidak Ditemukan");
    }
}

