package javaHomeworks;

public class mukemmelSayi {

	public static void main(String[] args) {
		// 6=1,2,3  28=1,2,4,7,14
		int sayi=28;
		int bolenlerinToplami=0;
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				bolenlerinToplami+=i;
			}
		}
		if(bolenlerinToplami==sayi) {
			System.out.println("Sayi mükemmel sayıdır");
		}else {
			System.out.println("Sayı mükemmel sayı değildir");
		}

	}

}
