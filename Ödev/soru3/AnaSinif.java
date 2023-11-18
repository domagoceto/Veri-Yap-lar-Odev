
//SORU 3

import java.util.LinkedList;

import java.util.Scanner;

public class Anasinif {
	public static void main(String[] args) {
		KuyrukLinkedList kuyruk = new KuyrukLinkedList();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n1. Kuyruğa ekle");
			System.out.println("2. Kuyruktan sil");
			System.out.println("3. Kuyruk eleman sayısı");
			System.out.println("4. Kuyrukda ara");
			System.out.println("5. Kuyruk listele");
			System.out.println("0. Çıkış");
			System.out.print("İstediğiniz komutu giriniz: ");

			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				System.out.print("Kuyruğa eklenecek yeni adı giriniz:");
				String ad = scanner.nextLine();
				System.out.print("Kuyruğa eklenecek yeni soyadı giriniz:");
				String soyad = scanner.nextLine();
				System.out.print("Kuyruğa eklenecek yeni Doğum tarihini giriniz:");
				String dogumTarihi = scanner.nextLine();
				System.out.print("Kuyruğa eklenecek yeni Telefon numarasını giriniz:");
				String telefonNumarasi = scanner.nextLine();

				kuyruk.ekle(new Eleman(ad, soyad, dogumTarihi, telefonNumarasi));
				break;

			case 2:
				kuyruk.sil();
				break;

			case 3:
				System.out.println("Kuyrukta" + kuyruk.elemanSayisi() + "eleman var.");
				break;

			case 4:
				System.out.print("Kuyrukta aranacak ismi giriniz:");
				String arananAdSoyad = scanner.nextLine();
				kuyruk.ara(arananAdSoyad);
				break;

			case 5:
				System.out.println("\nKuyruk Elemanları:");
				kuyruk.listele();
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
