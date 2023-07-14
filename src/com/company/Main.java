package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BSI plastik = new BSI();
        plastik.jenisSampah = "Plastik";
        plastik.harga = 3000;
        plastik.berat = 1;

        BSI kertas = new BSI();
        kertas.jenisSampah = "Kertas";
        kertas.harga = 5000;
        kertas.berat = 1;

        BSI besi = new BSI();
        besi.jenisSampah = "Besi";
        besi.harga = 1000;
        besi.berat = 1;

        besi.diAmbil();
        System.out.println(besi.jenisSampah);
        System.out.println(besi.harga);
    }
}
