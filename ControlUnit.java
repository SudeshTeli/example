
public class ControlUnit {

	BallotingUnit ballotunit;
	int votecount;

	public ControlUnit(BallotingUnit ballotunit, int votecount) {
		super();
		this.ballotunit = ballotunit;
		this.votecount = votecount;
	}
	
	public BallotingUnit getBallotunit() {
		return ballotunit;
	}

	public void setBallotunit(BallotingUnit ballotunit) {
		this.ballotunit = ballotunit;
	}
	
	public int getVotecount() {
		return votecount;
	}
	public void setVotecount(int votecount) {
		this.votecount = votecount;
	}


	public void votecount(){
		System.out.println("The candidate "+ this.ballotunit.candidate.name+" from constituency "+this.ballotunit.candidate.constituency+" belonging to "+ this.ballotunit.candidate.party+" has sccored "+ this.votecount+" votes");
		
	}
		
	}

