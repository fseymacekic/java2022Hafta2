package javaHafta2;

public class ClassesWithAttribute {

	public static void main(String[] args) {
		ClassesWithAttributeProduct product = new ClassesWithAttributeProduct();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ClassesWithAttributeProductManager productManager = new ClassesWithAttributeProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
	}

}
