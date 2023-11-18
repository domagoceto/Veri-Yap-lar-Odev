package soru4;

import java.util.*;

public class AnaSinif {
    public static void main(String[] args) {
        StackLinkedList yigin = new StackLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Yığına ekle");
            System.out.println("2. Yığından sil");
            System.out.println("3. Yığın eleman sayısı");
            System.out.println("4. Yığında ara");
            System.out.println("5. Yığın listele");
            System.out.println("0. Çıkış");
            System.out.print("İstediğiniz komutu giriniz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); 

            switch (secim) {
                case 1:
                    System.out.print("Yığına eklenecek yeni adı giriniz: ");
                    String ad = scanner.nextLine();
                    System.out.print("Yığına eklenecek yeni soyadı giriniz: ");
                    String soyad = scanner.nextLine();
                    System.out.print("Yığına eklenecek yeni doğum tarihini giriniz: ");
                    String dogumTarihi = scanner.nextLine();
                    System.out.print("Yığına eklenecek yeni telefon numarasını giriniz: ");
                    String telefonNumarasi = scanner.nextLine();

                    yigin.ekle(new Eleman(ad, soyad, dogumTarihi, telefonNumarasi));
                    break;

                case 2:
                    yigin.sil();
                    break;

                case 3:
                    System.out.println("Yığında " + yigin.elemanSayisi() + " adet eleman vardır.");
                    break;

                case 4:
                    System.out.print("Yığında aranacak ismi giriniz: ");
                    String arananAd = scanner.nextLine();
                    yigin.ara(arananAd);
                    break;

                case 5:
                    System.out.println("\nYığın Elemanları:");
                    yigin.listele();
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
