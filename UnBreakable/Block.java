// the object from which all in-game objects are based

public class Block extends GameObject   
{
	protected int Health;
	protected Block(double x, double y, int startingHealth)
	{
		super(x,y);
		Health = startingHealth;
	}
	protected boolean check()
	{
		return true;
	}
	public int getHealth()
	{
		return Health;
	}
	public void setHealth(int newHealth)
	{
		Health = newHealth;
	}
}

/**
RUN OUTPUT:

*/