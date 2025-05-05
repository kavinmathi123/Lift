package elavator;

public class Lift {
	private int liftId;
	private int lastPosition;
	private int position;
	private int noOfUser;
	
	
	//Constructor to initialize values
	
	public Lift(int position,int noOfUser)
	{
		this.position=position;
		this.noOfUser=noOfUser;
		
	}
	
	public int getLiftId()
	{
		return liftId;
	}
	public void setLiftId(int lifeId)
	{
		this.liftId=lifeId;
	}
	public int getLastPosition()
	{
		return lastPosition;
	}
	public void setLastPosition(int lastPosition)
	{
		this.lastPosition=lastPosition;
	}
	public int getPosition()
	{
		return position;
	}
	public void setPosition(int position)
	{
		this.position=position;
	}
	public int getNoOfUser()
	{
		return noOfUser;
	}
	public void setNoOfUser(int noOfUser)
	{
		this.noOfUser=noOfUser;
	}
}
