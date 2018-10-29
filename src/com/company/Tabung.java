package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     volume Bangun Ruang
 **/

public class Tabung extends BangunRuang{
    private double hight;
    private double radius;

    @Override
    public double hitungVolume() {
        return 3.14*(radius*radius)*hight;
    }

    public double getHight() {
        return hight;
    }

    public double getRadius() {
        return radius;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}