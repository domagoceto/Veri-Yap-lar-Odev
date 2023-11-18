package soru4;


import java.util.LinkedList;

import java.util.Scanner;

class Eleman {
    String ad;
    String soyad;
    String dogumTarihi;
    String telefonNumarasi;

    public Eleman(String ad, String soyad, String dogumTarihi, String telefonNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.telefonNumarasi = telefonNumarasi;
    }

    public String toString() {
        return "Ad: " + ad + ", Soyad: " + soyad + ", Doğum Tarihi: " + dogumTarihi + ", Telefon Numarası: " + telefonNumarasi;
    }
}

class StackLinkedList {
    private LinkedList<Eleman> yiginListesi = new LinkedList<>();

    public void ekle(Eleman eleman) {
        yiginListesi.push(eleman);
        System.out.println(eleman.ad + " " + eleman.soyad + " yığına eklendi.");
    }

    public void sil() {
        if (yiginListesi.isEmpty()) {
            System.out.println("Yığın boş.");
        } else {
            Eleman removedEleman = yiginListesi.pop();
            System.out.println("Yığından silinen kişi: " + removedEleman);
            System.out.println("Silme işlemi tamamlanmıştır.");
        }
    }

    public int elemanSayisi() {
        return yiginListesi.size();
    }

    public void ara(String ad) {
        int index = yiginListesi.indexOf(new Eleman(ad, "", "", ""));
        if (index != -0) {
            System.out.println("Aranan isim yığının " + (index+2) + ". sırasındadır.");
        }else {
            System.out.println("Yığında aranan " + ad + " bulunamamıştır.");
        }
    }

    public void listele() {
        if (yiginListesi.isEmpty()) {
            System.out.println("Yığın boş.");
        } else {
            for (Eleman eleman : yiginListesi) {
                System.out.println(eleman);
            }
        }
    }
}
