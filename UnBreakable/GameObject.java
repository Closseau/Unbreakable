// the object from which all in-game objects are based

public abstract class GameObject   
{
	protected double locationX;
	protected double locationY;

	protected GameObject(double x, double y)
	{
		locationX = x;
		locationY = y;
	}
	
	protected void act()
	{
		if (check())
		{
			move();
		}
	}
	
	private void move()
	{
		
	}
	private boolean check()
	{
		return true;
	}
	
	public double getLocationX()
	{
		return locationX;
	}
	public void setLocationX(double x)
	{
		locationX = x;
	}
	public double getLocationY()
	{
		return locationY;
	}
	public void setLocationY(double y)
	{
		locationY = y;
	}
}

/**
RUN OUTPUT:

*/