
public class Candidate {
	String name;
	String constituency;
	String party;
	public static int ballotcount=0;
	public static int controlunit=0;
	
	public Candidate(String name, String constituency, String party) {
		super();
		this.name = name;
		this.constituency = constituency;
		this.party = party;
		ballotcount+=1;
		controlunit+=1;
		setEVM(this);
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
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	
	void setEVM(Candidate object)
	{
		BallotingUnit[] BU=new BallotingUnit[10];
		int i=object.ballotcount-1;
		BU[i] = new BallotingUnit(object);
		
		
		
	}
}
