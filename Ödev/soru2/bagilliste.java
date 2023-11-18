//SORU 2 

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

class BagliListe {
    private ElemanNode bas;

    public void ekle(Eleman eleman) {
        ElemanNode yeniNode = new ElemanNode(eleman);
        if (bas == null) {
            bas = yeniNode;
        } else {
            yeniNode.sonraki = bas;
            bas = yeniNode;
        }
        System.out.println("Listeye eklendi: " + eleman);
    }

    public void sil(String ad) {
        if (bas == null) {
            System.out.println("Liste boş.");
            return;
        }

        ElemanNode temp = bas;
        ElemanNode onceki = null;

        while (temp != null && !temp.eleman.ad.equalsIgnoreCase(ad)) {
            onceki = temp;
            temp = temp.sonraki;
        }

        if (temp == null) {
            System.out.println("Listede " + ad + " bulunamamıştır.");
        } else {
            if (onceki == null) {
                bas = temp.sonraki;
            } else {
                onceki.sonraki = temp.sonraki;
            }
            System.out.println("Silme işlemi tamamlanmıştır.");
        }
    }

    public int elemanSayisi() {
        int sayac = 0;
        ElemanNode temp = bas;
        while (temp != null) {
            sayac++;
            temp = temp.sonraki;
        }
        return sayac;
    }

    public Eleman ara(String ad) {
        ElemanNode temp = bas;
        int index = 0;

        while (temp != null && !temp.eleman.ad.equalsIgnoreCase(ad)) {
            temp = temp.sonraki;
            index++;
        }

        if (temp == null) {
            System.out.println("Listede " + ad + " bulunamamıştır.");
            return null;
        } else {
            System.out.println("Aranan değer " + (index + 1) + ". sırada bulunmaktadır.");
            return temp.eleman;
        }
    }

    public void listele() {
        if (bas == null) {
            System.out.println("Liste boş.");
        } else {
            ElemanNode temp = bas;
            while (temp != null) {
                System.out.println(temp.eleman);
                temp = temp.sonraki;
            }
        }
    }
}

class ElemanNode {
    Eleman eleman;
    ElemanNode sonraki;

    public ElemanNode(Eleman eleman) {
        this.eleman = eleman;
        this.sonraki = null;
    }
}
