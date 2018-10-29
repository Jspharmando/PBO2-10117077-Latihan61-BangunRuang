package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     volume Bangun Ruang
 **/

public class Kerucut extends BangunRuang {
    private double tinggi;
    private double radius;

    public double getTinggi() {
        return tinggi;
    }

    public double getRadius() {
        return radius;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungVolume() {
        return (3.14*(radius*radius))*1/3*tinggi;
    }
}