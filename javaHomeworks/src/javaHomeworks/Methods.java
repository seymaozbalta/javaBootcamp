package javaHomeworks;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca(); 

	}
	
	public static void sayiBulmaca() {
		int[] sayilar= new int[] {1,2,3,5,4,6,8};
		int aranacak=3;
		
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==aranacak) {
				System.out.println("Aranan sayı bu dizide bulunmakta "+aranacak);
				break;
			}else {
				System.out.println("Aranaan sayı bu dizide bulunmuyor "+aranacak);
			}
		}
	}
	
	public static void mesajVer() {
		System.out.println("Aranan sayı bu dizide bulunmakta "+aranacak);
	}

}
