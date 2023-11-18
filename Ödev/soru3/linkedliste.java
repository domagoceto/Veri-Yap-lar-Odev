

//SORU 3

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
		return "Ad: " + ad + "Soyad:" + soyad + ", Doğum Tarihi: " + dogumTarihi + ", Telefon Numarası: "
				+ telefonNumarasi;
	}
}

class KuyrukLinkedList {
	private LinkedList<Eleman> kuyrukListesi = new LinkedList<>();

	public void ekle(Eleman eleman) {
		kuyrukListesi.addLast(eleman);
		System.out.println(eleman.ad + " kuyruğa eklendi.");
	}

	public void sil() {
		if (kuyrukListesi.isEmpty()) {
			System.out.println("Kuyruk boş.");
		} else {
			Eleman removedEleman = kuyrukListesi.removeFirst();
			System.out.println("Kuyruktan silinen kişi:" + removedEleman.ad);
		}
	}

	public int elemanSayisi() {
		return kuyrukListesi.size();
	}

	public void ara(String ad) {
		for (Eleman eleman : kuyrukListesi) {
			if (eleman.ad.equalsIgnoreCase(ad)) {
				System.out.println("Bulunan Eleman: " + eleman);
				return;
			}
		}
		System.out.println("Kuyrukta aranan" + ad + "bulunamamıştır.");
	}

	public void listele() {
		if (kuyrukListesi.isEmpty()) {
			System.out.println("Kuyruk boş.");
		} else {
			for (Eleman eleman : kuyrukListesi) {
				System.out.println(eleman);
			}
		}
	}
}