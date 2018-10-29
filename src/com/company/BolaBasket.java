package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     volume Bangun Ruang
 **/

public class BolaBasket extends BangunRuang {
    private double radius;

    @Override
    public double hitungVolume() {
        return 4*radius*radius*radius*3.14/3;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}