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
public class KostData {
    private int id;
    private String nama;
    private String notelp;
    private String tglmasuk;

    public KostData() {}

    public KostData(int id, String nama, String notelp, String tglmasuk) {
        this.id = id;
        this.nama = nama;
        this.notelp = notelp;
        this.tglmasuk = tglmasuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Nomor Telepon: " + notelp + ", Tanggal Masuk: " + tglmasuk;
    }
}

