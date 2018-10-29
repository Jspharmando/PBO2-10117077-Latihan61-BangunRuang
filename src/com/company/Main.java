package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     volume Bangun Ruang
 **/

public class Main {
    public static void main(String[] args) {
        BolaBasket bola = new BolaBasket();
        bola.setRadius(7);
        System.out.println("Jari Jari Bola : "+bola.getRadius()+" cm");
        System.out.println("Volume Bola : "+bola.hitungVolume() +" cm");
        System.out.println("");
        Tabung tabung = new Tabung();
        tabung.setHight(21);
        tabung.setRadius(10);
        System.out.println("Tinggi Tabung : "+tabung.getHight()+" cm");
        System.out.println("Jari Jari Tabung : "+tabung.getRadius()+" cm");
        System.out.println("Volume Tabung : "+Math.ceil(tabung.hitungVolume())+" cm");
        System.out.println("");
        Kerucut kerucut = new Kerucut();
        kerucut.setRadius(14);
        kerucut.setTinggi(9);
        System.out.println("Jari jari Kerucut : "+kerucut.getRadius()+" cm");
        System.out.println("Tinggi Kerucut : "+kerucut.getTinggi()+" cm");
        System.out.println("Volume kerucut " + kerucut.hitungVolume()+" cm");
    }
}