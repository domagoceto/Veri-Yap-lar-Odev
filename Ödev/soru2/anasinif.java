package soru3;

//SORU 2

import java.util.*;

public class anasinif {
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Listeye ekle");
            System.out.println("2. Listeden sil");
            System.out.println("3. Liste eleman sayısı");
            System.out.println("4. Listede ara");
            System.out.println("5. Liste yaz");
            System.out.println("0. Çıkış");
            System.out.print("İstediğiniz komutu giriniz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); 

            switch (secim) {
                case 1:
                    System.out.print("Listeye eklenecek yeni adı giriniz: ");
                    String ad = scanner.nextLine();
                    System.out.print("Listeye eklenecek yeni soyadı giriniz: ");
                    String soyad = scanner.nextLine();
                    System.out.print("Listeye eklenecek yeni doğum tarihini giriniz: ");
                    String dogumTarihi = scanner.nextLine();
                    System.out.print("Listeye eklenecek yeni telefon numarasını giriniz: ");
                    String telefonNumarasi = scanner.nextLine();

                    liste.ekle(new Eleman(ad, soyad, dogumTarihi, telefonNumarasi));
                    break;

                case 2:
                    System.out.print("Listeden silinecek kişinin adını giriniz: ");
                    String silinecekAd = scanner.nextLine();
                    liste.sil(silinecekAd);
                    break;

                case 3:
                    System.out.println("Listede " + liste.elemanSayisi() + " adet eleman vardır.");
                    break;

                case 4:
                    System.out.print("Listede aranacak adı giriniz: ");
                    String arananAd = scanner.nextLine();
                    liste.ara(arananAd);
                    break;

                case 5:
                    System.out.println("\nListe Elemanları:");
                    liste.listele();
                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçersiz komut. Lütfen tekrar deneyin.");
            }
        }
    }
}
