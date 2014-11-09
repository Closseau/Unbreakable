// the object from which all in-game objects are based
import java.lang.Math;
public class Ball extends GameObject  
{
	private int j = 1;
	protected double VelocityX;
	protected double VelocityY;
	protected int speed;
	protected Ball(double x, double y, double startingVelocityX, double startingVelocityY, int mySpeed)
	{
		super(x,y);
		VelocityX = startingVelocityX;
		VelocityY = startingVelocityY;
		speed = mySpeed;
	}
	
	public void act()
	{
		move();
	}
	
	protected void move()
	{
		locationX = locationX + VelocityX;
		locationY = locationY + VelocityY;
	}
	/*
	public boolean check(GameObject OtherObject)
	{
		
		return true;
	}
	*/
	protected boolean check(Block OtherObject)
	{
		//System.out.println("Hello World");
		double xDiffrence;
		double yDiffrence;
		boolean done = false;
		if (((locationX >= OtherObject.getLocationX()) && (locationX <= OtherObject.getLocationX() + 75)) || ((locationX + 25 >= OtherObject.getLocationX()) && (locationX + 25 <= OtherObject.getLocationX() + 75)))
		{
			//System.out.println("pos1");
            if (((locationY >= OtherObject.getLocationY()) && (locationY <= OtherObject.getLocationY() + 50)) || ((locationY + 25 >= OtherObject.getLocationY()) && (locationY + 25 <= OtherObject.getLocationY() + 50)))
			{
			//	System.out.println("pos2");
				if (((OtherObject.getLocationX() >= locationX) && (OtherObject.getLocationX() <= locationX + 25)) || ((OtherObject.getLocationX() + 75 >= locationX) && (OtherObject.getLocationX() <= locationX + 25))) 
				{
			//		System.out.println("pos3");
					if (((OtherObject.getLocationY() >= locationY) && (OtherObject.getLocationY() <= locationY + 25)) || ((OtherObject.getLocationY() + 50 >= locationY) && (OtherObject.getLocationY() <= locationY + 25)))
					{
						done = true;
						
						if (VelocityY > 0)
						{
							// top
							if (VelocityX > 0)
							{
								// LEFT
								System.out.println("TOP LEFT");
								xDiffrence = Math.abs(locationX + 25 - OtherObject.getLocationX());
								yDiffrence = Math.abs(locationY + 25  - (OtherObject.getLocationY()));
								System.out.println(xDiffrence);
								System.out.println(yDiffrence);
								if (xDiffrence < yDiffrence)
								{
									VelocityX = VelocityX * -1;
								}
								else if (xDiffrence > yDiffrence)
								{
									VelocityY = VelocityY * -1;
								}
								else
								{
									VelocityX = VelocityX * -1;
									VelocityY = VelocityY * -1;
								}
							}
							else if (VelocityX < 0)
							{
								// right
								System.out.println("TOP RIGHT");
								System.out.println(locationX - (OtherObject.getLocationX() + 75));
								System.out.println(locationY + 25  - (OtherObject.getLocationY()));
								xDiffrence = Math.abs(locationX - (OtherObject.getLocationX() + 75));
								yDiffrence = Math.abs(locationY  - (OtherObject.getLocationY()));
								if (xDiffrence < yDiffrence)
								{
									VelocityX = VelocityX * -1;
								}
								else if (xDiffrence > yDiffrence)
								{
									VelocityY = VelocityY * -1;
								}
								else
								{
									VelocityX = VelocityX * -1;
									VelocityY = VelocityY * -1;
								}
								
							}
							else
							{
								// vertical
								
							}
						}
						else if (VelocityY < 0)
						{
							// bot
							OtherObject.setLocationY(OtherObject.getLocationY() - 5);
							if (VelocityX > 0)
							{
								OtherObject.setLocationX(OtherObject.getLocationX() + 5);
								// left
								System.out.println("BOT LEFT");
								xDiffrence = Math.abs(locationX + 25 - (OtherObject.getLocationX()));
								yDiffrence = Math.abs(locationY  - (OtherObject.getLocationY() + 50));
								System.out.println(xDiffrence);
								System.out.println(yDiffrence);
								if (xDiffrence <  yDiffrence)
								{
									VelocityX = VelocityX * -1;
								}
								else if (xDiffrence > yDiffrence)
								{
									VelocityY = VelocityY * -1;
								}
								else
								{
									VelocityY = VelocityY * -1;
									VelocityX = VelocityX * -1;
								}
								
							}
							else if (VelocityX < 0)
							{
								OtherObject.setLocationX(OtherObject.getLocationX() - 5);
								// right	
								System.out.println("BOT RIGHT");
								
								xDiffrence = Math.abs(locationX - (OtherObject.getLocationX() + 75));
								yDiffrence = Math.abs(locationY  - (OtherObject.getLocationY() + 50));
								System.out.println(xDiffrence);
								System.out.println(yDiffrence);
								if (xDiffrence < yDiffrence)
								{
									VelocityX = VelocityX * -1;
								}
								else if (xDiffrence > yDiffrence)
								{
									VelocityY = VelocityY * -1;
								}
								else
								{
									VelocityY = VelocityY * -1;
									VelocityX = VelocityX * -1;
								}
								
							}
							else
							{
								// vertical
								
							}
						}	
						else
						{
							//error in the code ;(
						}
						
						
						
						OtherObject.setHealth(OtherObject.getHealth() - 1);
						move();
						
						/*
					//	System.out.println("pos4");
						if (Math.abs(OtherObject.getLocationY() - locationY) > Math.abs(OtherObject.getLocationY() + 50 - locationY))
						{
							if (Math.abs(OtherObject.getLocationY() + 50 - locationY) > Math.abs(OtherObject.getLocationY() + 50 - locationY + 25))
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() + 50 - locationY + 25);
							}
							else
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() + 50 - locationY);
							}
						}
						else
						{
							if (Math.abs(OtherObject.getLocationY() - locationY) > Math.abs(OtherObject.getLocationY() - locationY + 25))
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() - locationY + 25);
							}
							else
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() - locationY);
							}
						}
						// here
						
						
						if (Math.abs(OtherObject.getLocationX() - locationX) > Math.abs(OtherObject.getLocationX() + 75 - locationX))
						{
							if (Math.abs(OtherObject.getLocationX() + 75 - locationX) > Math.abs(OtherObject.getLocationX() + 75 - locationX + 25))
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() +75 - locationX + 25);
							}
							else
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() + 75 - locationX);
							}
							
						}
						else
						{
							if (Math.abs(OtherObject.getLocationX() - locationX) > Math.abs(OtherObject.getLocationX() - locationX + 25))
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() - locationX + 25);
							}
							else
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() - locationX);
							}
						}
						
						
						
						
						// thhwsheuefiksaefnks
						if (xDiffrence < yDiffrence)
						{
							
							VelocityX = VelocityX * -1;
							System.out.println("x");
							OtherObject.setHealth(OtherObject.getHealth() - 1);
							while (j < 1)
							{
								move();
							}
							j = 1;
						}
						else if (xDiffrence > yDiffrence)
						{
							
							VelocityY = VelocityY * -1;
							System.out.println("y");
							OtherObject.setHealth(OtherObject.getHealth() - 1);
							while (j < 1)
							{
								move();
							}
							j = 1;
						}
						else
						{
							VelocityY = VelocityY * -1;
							OtherObject.setHealth(OtherObject.getHealth() - 1);
						
							VelocityY = VelocityY * -1;
							System.out.println("xy");
							
							System.out.println(xDiffrence);
							System.out.println(yDiffrence);
							//j++;
							while (j < 1)
							{
								move();
							}
							j = 1;
						}
						
						*/
						//System.out.println(Math.abs(OtherObject.getLocationY() - locationY));
						//System.out.println("pos4");
						
						//OtherObject.setHealth(OtherObject.getHealth() - 1);
						if (OtherObject.getHealth() <= 0)
						{
							OtherObject.setLocationX(-200);
							OtherObject.setLocationY(-200);
						}
					}
				}
			}
		}	
		
		return done;
	}
	protected boolean check(Bar OtherObject)
	{
		int xDiffrence;
		int yDiffrence;
		double d;
		boolean done = false;
		if (((locationX >= OtherObject.getLocationX()) && (locationX <= OtherObject.getLocationX() + 100)) || ((locationX + 25 >= OtherObject.getLocationX()) && (locationX + 25 <= OtherObject.getLocationX() + 100)))
		{
			//System.out.println("pos1");
            if (((locationY >= OtherObject.getLocationY()) && (locationY <= OtherObject.getLocationY())) || ((locationY + 25 >= OtherObject.getLocationY()) && (locationY + 25 <= OtherObject.getLocationY())))
			{
				//System.out.println("pos2");
				if (((OtherObject.getLocationX() >= locationX) && (OtherObject.getLocationX() <= locationX + 25)) || ((OtherObject.getLocationX() + 100 >= locationX) && (OtherObject.getLocationX() <= locationX + 25))) 
				{
					//System.out.println("pos3");
					if (((OtherObject.getLocationY() >= locationY) && (OtherObject.getLocationY() <= locationY + 25)) || ((OtherObject.getLocationY() >= locationY) && (OtherObject.getLocationY()<= locationY + 25)))
					{
						done = true;
						//	System.out.println("pos4");
						/*
						if (Math.abs(OtherObject.getLocationY() - locationY) > Math.abs(OtherObject.getLocationY() + 25 - locationY))
						{
							if (Math.abs(OtherObject.getLocationY() + 25 - locationY) > Math.abs(OtherObject.getLocationY() + 25 - locationY + 25))
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() + 25 - locationY + 25);
							}
							else
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() + 25 - locationY);
							}
						}
						else
						{
							if (Math.abs(OtherObject.getLocationY() - locationY) > Math.abs(OtherObject.getLocationY() - locationY + 25))
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() - locationY + 25);
							}
							else
							{
								yDiffrence = Math.abs(OtherObject.getLocationY() - locationY);
							}
						}
						// here
						
						
						if (Math.abs(OtherObject.getLocationX() - locationX) > Math.abs(OtherObject.getLocationX() + 100 - locationX))
						{
							if (Math.abs(OtherObject.getLocationX() + 100 - locationX) > Math.abs(OtherObject.getLocationX() + 100 - locationX + 25))
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() + 100 - locationX + 25);
							}
							else
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() + 100 - locationX);
							}
							
						}
						else
						{
							if (Math.abs(OtherObject.getLocationX() - locationX) > Math.abs(OtherObject.getLocationX() - locationX + 25))
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() - locationX + 25);
							}
							else
							{
								xDiffrence = Math.abs(OtherObject.getLocationX() - locationX);
							}
						}
						
						
						
						
						
						// thhwsheuefiksaefnks
						if (xDiffrence < yDiffrence)
						{
							
							VelocityX = VelocityX * -1;
							System.out.println("y");
						}
						else if (xDiffrence > yDiffrence)
						{
							
							VelocityY = VelocityY * -1;
							System.out.println("x");
						}
						else
						{
							VelocityX = VelocityX * -1;
							
							System.out.println("xy");
						}
						*/
						
						VelocityY = VelocityY * -1;
						/*
						if (locationX - 38 <= OtherObject.getLocationX())
						{
							VelocityX = VelocityX + (int)((locationX - 50) / 10);
						}
						else
						{
							VelocityX = VelocityX + (int)((locationX - 50) / 10);
						}
						*/
						VelocityX = VelocityX + ((locationX - 40 - OtherObject.getLocationX()) / 10);
						d = Math.sqrt(Math.pow(VelocityX,2) + Math.pow(VelocityY,2));
						VelocityX = (speed * (VelocityX / d));
						/*
						if ((speed * (VelocityX / d)) < 2)
						{
							if (VelocityX < 0)
							{
								VelocityX = -2;
							}
							else
							{
								VelocityX = 2;
							}
						}
						else
						{
							VelocityX = (speed * (VelocityX / d));
						}
						
						*/
						if ((speed * (VelocityY / d)) < 2)
						{
							if (VelocityY < 0)
							{
								VelocityY = -2;
							}
							else
							{
								VelocityY = 2;
							}
						}
						else
						{
							VelocityY = (speed * (VelocityY / d));
						}
						
						//VelocityY = (speed * (VelocityY / d));
					}
				}
			}
		}	
		
		return done;
	}
	protected boolean check(Ball OtherObject)
	{
		
		
		return true;
	}
	protected boolean borderBounce(boolean isX, boolean isTR,int pos)
	{
		if (isX)
		{
			if (isTR)
			{
				if (locationX >= pos)
				{
					VelocityX = VelocityX * -1;
				}
			}
			else
			{
				if (locationX <= pos)
				{
					VelocityX = VelocityX * -1;
				}
			}
			
		}
		else
		{
			if (isTR)
			{
				if (locationY >= pos)
				{
					VelocityY = VelocityY * -1;
				}
			}
			else
			{
				if (locationY <= pos)
				{
					VelocityY = VelocityY * -1;
				}
			}
		}
		
		return true;
	}
	public double getVelocityX()
	{
		return VelocityX;
	}
	public void setVelocityX(double newVelocityX)
	{
		VelocityX = newVelocityX;
	}
	public double getVelocityY()
	{
		return VelocityY;
	}
	public void setVelocityY(double newVelocityY)
	{
		VelocityY = newVelocityY;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int mySpeed)
	{
		speed = mySpeed;
	}
}

/**
RUN OUTPUT:

*/