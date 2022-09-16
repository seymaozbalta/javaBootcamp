package javaHomeworks;

public class arraysDemo {

	public static void main(String[] args) {
		// dizilerde aynı tipte verilerle çalışılır
		
		String[] ogrenciler= new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		//------------------
		//double[] myList=new double[4];
		//=
		double[] myList= {1.2,9.2,5.4,4.3};
		double toplam=0;
		double enBuyuk=myList[0];
		for(double eleman:myList) {
			if(eleman>enBuyuk) {
				enBuyuk=eleman;
				
			}
			toplam+=eleman;
			System.out.println(eleman);
			
			
			
		}System.out.println(toplam);
		System.out.println(enBuyuk);
	}

}
