
public class Voter {
	String name;
	String constituency;
	
	public static int votecount=0;
	
	public Voter(String name, String constituency) {
		super();
		this.name = name;
		this.constituency = constituency;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	
	public void vote(ControlUnit c)
	{
		
		votecount+=1;
		c.votecount+=1;
	}
	
	
	
	
}
