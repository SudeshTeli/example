
public class Pizza {
	String name;
	int price;
	
	public Pizza(String name, int price) {
		this.name = name;
		this.price = price;
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

	
	public void display(){
		System.out.println("The goods name is "+name);
		System.out.println("The good cost  is "+price);
	}
	
}
