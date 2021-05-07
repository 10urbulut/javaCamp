package hw2;

public class Ders27Main {
public static void main(String[] args) {
	Ders27CustomerManager customerManager27 = new Ders27CustomerManager();
	Ders27CustomerManager custtomerMaCustomer27_1 = new Ders27CustomerManager();
	customerManager27 = custtomerMaCustomer27_1;
	
	
	//referance
	customerManager27.Add();
	customerManager27.Remove();
	customerManager27.Update();
	
	
	//value 
	int sayi1 = 10;
	int sayi2 = 20;
	sayi2 =  sayi1;
	sayi1 = 30;
	System.out.println(sayi2);
	
	
	int[] sayilar1 = new int[] {1,2,3};
	int[] sayilar2 = new int[] {4,5,6};
	sayilar2 = sayilar1;
	sayilar1[0] = 10;
	System.out.println(sayilar2[0]);
	}

}
