package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product= new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		
		/*yapıcıdan önceki field tanımlama
		 * Product product=new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("mor");*/
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		//System.out.println(product.name);
		//örneğin bir sitedeki bunların texbox olduklarını farzedelim
		//bunları alırken kullanabiliriz classları
		//productManager.Add2(1, "null", "null", 20, 200, null);
		System.out.println(product.getKod());
		

	}

}
