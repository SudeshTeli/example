
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
}
