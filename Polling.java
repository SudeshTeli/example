
public class Polling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter voter1=new Voter("sud","bicholim");
		Voter voter2=new Voter("kid","bicholim");
	
		
		Candidate candidate1=new Candidate("rohan","bicjholim","bjp");
		Candidate candidate2=new Candidate("vijay","bicjholim","independent");
		
		BallotingUnit ballotingunit1=new BallotingUnit(candidate1);
		
		BallotingUnit ballotingunit2=new BallotingUnit(candidate2);
		
		ControlUnit controlunit1=new ControlUnit(ballotingunit1,0);
		
		ControlUnit controlunit2=new ControlUnit(ballotingunit2,0);
		
		voter1.vote(controlunit1);
		voter2.vote(controlunit1);
		
		System.out.println("Total vote count is " + Voter.votecount);
		
	controlunit1.votecount();
		
		
		
		
	}
}


