package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "Internet Subesi";
		double dolarYesterday = 8.15;
		double dolarNow = 8.18;
		int futures = 36;
		boolean fall = false;
		
		if(dolarYesterday>dolarNow) {
			System.out.println("Dolar dustu");
		}
		else if(dolarNow>dolarYesterday) {
			System.out.println("Dolar artti");
		}
		else {
			System.out.println("Dolar Esit");
		}
		/*
		String kredi1 = "Hizli kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Cifci Kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredsii";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		*/
		
		String[] krediler = {"Hizli kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Cifci Kredisi", "MSB Kredisi", "MEb kredisi" };

		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		int sayi1 =10;
		int sayi2 = 20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2= "izmir";
		System.out.println(sehir1);
		
		System.out.println(internetSubeButonu);
	}
}
