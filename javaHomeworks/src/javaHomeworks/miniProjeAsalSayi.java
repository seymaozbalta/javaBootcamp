package javaHomeworks;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int sayi=2;
		
		
		for(int i=2;i<sayi;i++) {
			if(sayi%2==0) {
				System.out.println("Asal değil");
				break;
		}else {
			System.out.println("Asal sayı");
			break;//return de kullanılabilir
		}
		}
		//--------------
		int sayi2=1;
		int kalan=sayi2%2;
		System.out.println(kalan);
		boolean asalMi=true;
		
		for(int i=2;i<sayi2;i++) {
			if(sayi2%2==0) {
				asalMi=false;
			}
		}
		if(sayi2<2) {
			System.out.println("Geçersiz sayı");
		}
		if(asalMi) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Asal değil");
		}
		
		

	}

}
