package javaHomeworks;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar= new int[] {1,2,3,5,4,6,8};
		int aranacak=3;
		
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==aranacak) {
				System.out.println("Aranan sayı bu dizide bulunmakta");
				break;
			}else {
				System.out.println("Aranaan sayı bu dizide bulunmuyor");
			}
		}//---booelan varMi=false daha kolay olur

		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				
			}
		}
	}

}
