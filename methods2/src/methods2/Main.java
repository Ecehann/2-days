package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj =("Bugün hava çok güzel.");
		System.out.println(mesaj);
		
		String yeniMesaj = sehir();
		System.out.println(yeniMesaj);
		
		int sayi = topla(15,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,5,7,9);
		System.out.println(toplam);
	}

public static void ekle() {
	System.out.println("Eklendi");
	}
	
public static void sil() {
	System.out.println("Silindi");
	}

public static void guncelle() {
	System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2 (int... sayilar) {
		int toplami = 0;
		for (int sayi: sayilar) {
			toplami+=sayi;
		}
		return toplami;
	}
	
	public static String sehir() {
		return "Ankara";
		
	}
}
