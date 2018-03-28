
public class Bill {
	
	Pizza pizza;
	int quantity;
	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	
	
	public Bill(Pizza pizza, int quantity) {
		this.pizza = pizza;
		this.quantity = quantity;
	}
	
public static int tprice=0;
	
	public int billgeneration(){
		int total=0;
			total=this.pizza.price*this.quantity;
			System.out.println("The total amount on "+this.pizza.name+" with price "+this.pizza.price+" for quantity "+this.quantity+" is "+total*this.quantity);
			tprice=tprice+total;
	
		//finaltotal=totalprice;
		return tprice;
	}
	
}
