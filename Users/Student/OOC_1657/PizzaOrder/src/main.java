import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tt=0;
		Pizza[] g=new Pizza[10];
		g[0]= new Pizza("Mushroom",240);
		g[1]= new Pizza("Pepperoni",500);
		g[2]= new Pizza("Onions",300);
		g[3]= new Pizza("Baccon",550);
		
		System.out.println(g[0].price);
		
		
		//g[0].display();
		
		
		Bill[] b=new Bill[10];
		for(int i=0;i<4;i++){
			
			String quantity;
			quantity=JOptionPane.showInputDialog("Enter "+ g[i].name +" quantity that is to be billed");
			int numquantity=Integer.parseInt(quantity);
		b[i]=new Bill(g[i],numquantity);	
		}
		
		int[] t=new int[10];
		for(int j=0;j<4;j++){
		t[j]=b[j].billgeneration();
		tt=t[j];
		}
		System.out.println("The grand total is "+tt);	
	}

}
