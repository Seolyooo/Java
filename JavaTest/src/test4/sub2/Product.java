package test4.sub2;
class Product1{
	
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product1(String productId,String productName,int price,int quantity) {
		this.productId=productId;
		this.productName= productName;
		this.price= price;
		this.quantity = quantity;		

	}

	public void updatePrice(int price) {
		this.price = price;
		System.out.println("키보드 가격 수정됨");

	}
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("키보드 추가");
	}
	public void printProducctInfo() {
		
		System.out.println("상품Id"+productId);
		System.out.println("상품이름"+productName);
		System.out.println("상품가격"+price);
		System.out.println("재고수량"+quantity);
		
	}
	
}


public class Product {

	public static void main(String[] args) {
		Product1 pr = new Product1("P001","키보드",35000,10);
		
		pr.printProducctInfo();
		
		System.out.println("--------------------");
		pr.updatePrice(30000);
		System.out.println("--------------------");
		pr.printProducctInfo();
		System.out.println("--------------------");
		pr.addStock(5);
		System.out.println("--------------------");
		pr.printProducctInfo();
		
		
	}

}
