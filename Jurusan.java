package com.company;
import java.util.ArrayList;

public class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs = new ArrayList<>();

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    void addmhs(Mahasiswa m) {
        this.mhs.add(m);
    }

    public String getkode() {
        return kode;
    }

    public String getnama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getmhs() {
        return mhs;
    }
}
