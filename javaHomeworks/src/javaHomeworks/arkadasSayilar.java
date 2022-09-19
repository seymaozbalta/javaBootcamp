package javaHomeworks;

public class arkadasSayilar {

	public static void main(String[] args) {
		// 220-284
		int sayi=220;
		int sayi2=283;
		int bolenToplam=0;
		int bolenToplam2=0;
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				bolenToplam+=i;
			}
		}
		for(int j=1;j<sayi2;j++) {
			if(sayi2%j==0) {
				bolenToplam2+=j;
			}
	 	}
		if(bolenToplam2==sayi) {
			if(bolenToplam==sayi2) {
				System.out.println("Arkadaş sayılardır "+ sayi+" "+sayi2);
			}
		}else {
			System.out.println("Arkadaş sayı değiller " + sayi + " "+ sayi2);
		}

	}

}
