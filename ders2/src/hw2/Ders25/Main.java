package hw2.Ders25;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);

	}
	

	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Eklendi");		
	}
	
	public static void guncelle() {
		System.out.println("Eklendi");
		
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	

}
