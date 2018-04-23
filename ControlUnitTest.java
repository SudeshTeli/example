import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControlUnitTest {
	Candidate cc1;
	Candidate cc2;
	BallotingUnit bb1;
	BallotingUnit bb2;
	ControlUnit cu1;
	ControlUnit cu2;
	Voter v1;
	Voter v2;
	
	@Before
	public void setUp() throws Exception {
		Candidate cc1=new Candidate("rohan","bicjholim","bjp");
		Candidate cc2=new Candidate("vijay","bicjholim","independent");
		
		BallotingUnit bb1=new BallotingUnit(cc1);
		
		BallotingUnit bb2=new BallotingUnit(cc2);
		
		ControlUnit cu1=new ControlUnit(bb1,0);
		
		ControlUnit cu2=new ControlUnit(bb2,0);
		
		Voter v1=new Voter("sud","bicholim");
		Voter v2=new Voter("kid","bicholim");
		
		v1.vote(cu1);
		v2.vote(cu1);
		cu1.votecount();
	}

	@Test
	public void testsetVotecount() {
		//fail("Not yet implemented");
		assertEquals(2,cu1.votecount);
	}

}
