
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2= new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		//value 
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi2=30;
		System.out.println(sayi2);
		
		//referans
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		//classlar referans tip olduğundan iki dizi artık aynı referans 
		//noktasını gösterir ve bir taraf değiştiğinde diğer taraf da etkilenir

	}

}
