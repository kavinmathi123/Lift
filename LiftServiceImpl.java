package elavator;

public class LiftServiceImpl implements LiftService{
	// liftId,LastPosition,position,noOfUser
	
	@Override
	public void moveTo(Lift lift) {
		
//		System.out.println("Position "+lift.getposition());
		if(lift.getPosition()==0)
		{
			System.out.println("Lift is "+lift.getPosition());
		}
		else if(lift.getPosition()==1)
		{
			System.out.println("Lift is "+lift.getPosition());
		}
		else if(lift.getPosition()==2)
		{
			System.out.println("Lift is "+lift.getPosition());
		}
		else if(lift.getPosition()==3)
		{
			System.out.println("Lift is "+lift.getPosition());
		}
		else
		{
			System.out.println("Invalid Lift number");
		}
	}

	@Override
	public void close(Lift lift) {
		System.out.println("No of users "+lift.getNoOfUser());
		
	}

}
