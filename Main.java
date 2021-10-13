package com.company;

public class Main {

    public static void main(String[] args) {
        Jurusan D3IF = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi" );
        Jurusan D3SI = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        Mahasiswa ren = new Mahasiswa("6701", "Rendi");
        Mahasiswa cha = new Mahasiswa("6702", "Chaca");
        Mahasiswa ags = new Mahasiswa("6703", "Agus");

        D3IF.addmhs(ren);
        D3IF.addmhs(cha);
        D3IF.addmhs(ags);

        Mahasiswa rid = new Mahasiswa("6301", "Ridwan");
        Mahasiswa sis = new Mahasiswa("6302", "Siska");
        Mahasiswa zay = new Mahasiswa("6303", "Zayn");
        Mahasiswa rah = new Mahasiswa("6304", "Rahmat");

        D3SI.addmhs(rid);
        D3SI.addmhs(sis);
        D3SI.addmhs(zay);
        D3SI.addmhs(rah);

        System.out.println("Kode : " + D3IF.getkode());
        System.out.println("Nama : " + D3IF.getnama());
        System.out.println("Daftar Mahasiswa :");

        int noIF = 1;
        for (Mahasiswa mhs : D3IF.getmhs()) {
            System.out.println(noIF++ + ". " + mhs.getNim() + " - " + mhs.getNama());
        }

        System.out.println();

        System.out.println("Kode : " + D3SI.getkode());
        System.out.println("Nama : " + D3SI.getnama());
        System.out.println("Daftar Mahasiswa :");

        int noSI = 1;
        for (Mahasiswa mhs : D3SI.getmhs()) {
            System.out.println(noSI++ + ". " + mhs.getNim() + " - " + mhs.getNama());
        }
    }
}
