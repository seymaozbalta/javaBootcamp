package javaHomeworks;

public class recapDemo1 {

	public static void main(String[] args) {
		// üç sayıdan en büyüğünü bulan program
		int sayi1=12;
		int sayi2=200;
		int sayi3=100;
		int enBuyuk=sayi1;
		
		if(sayi1>sayi2) {
	        if(sayi1>sayi3) {
				enBuyuk=sayi1;
			}else {
				enBuyuk=sayi3;
			}
		}else if(sayi2>sayi3){
			enBuyuk=sayi2;
			
		}else {
			enBuyuk=sayi3;
		}
		
		
		System.out.println(enBuyuk);

	}

}
