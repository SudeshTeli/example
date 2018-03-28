  
public class Pizza {
	  public static final int tax=10;
	 	 public static int totalprice=0;
	String name;
	int price;
	
	public Pizza(String name, int price) {
		this.name = name;
		this.price = price+tax();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int tax(){
		int num=this.price;
		int taxamount=0,total=0;
		taxamount=num/tax;
		total=2*(this.price+taxamount);
		totalprice=totalprice+total;
		return totalprice;
		
	}
	
	public void display(){
		System.out.println("The goods name is "+name);
		System.out.println("The good cost  is "+price);
	}
	
}
