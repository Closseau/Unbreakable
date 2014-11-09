// the object from which all in-game objects are based
public class Bar extends GameObject
{
	protected double speed;
	protected int isHorizontal;
	protected int dir;
	protected Bar(double x, double y, double startingSpeed, int Horizontal)
	{
		super(x,y);
		speed = startingSpeed;
		isHorizontal = Horizontal;
	}
	
	public void act()
	{
		move();
		
	}
	
	protected void move()
	{
		if (dir > 0)
		{
			locationX = locationX + speed;
		}
		else if (dir < 0)
		{
			locationX = locationX - speed;
		}
		else
		{
			
		}
	}
	public void changeDir(int change)
	{
		dir = change;
	}
	protected boolean check()
	{
		return true;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setSpeed(double newSpeed)
	{
		speed = newSpeed;
	}
	public int getIsHorizontal()
	{
		return isHorizontal;
	}
	public void setIsHorizontal(int newIsHorizontal)
	{
		isHorizontal = newIsHorizontal;
	}
}

/**
RUN OUTPUT:

*/