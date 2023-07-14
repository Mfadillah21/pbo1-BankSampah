package com.company;

public class BSI {
    String jenisSampah;
    double harga;
    double berat;

    public void diTabung(){
        this.harga = this.harga*berat;
    }
    public void diAmbil(){
        this.harga = this.harga*berat-0.5*100;
    }
}
