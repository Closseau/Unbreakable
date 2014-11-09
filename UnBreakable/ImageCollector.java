/** 
 * @student.info 
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*; 
import java.io.*; 
import  javax.imageio.*;
import javax.swing.*;
import javax.swing.Timer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
/**  * This class demonstrates how to load an Image from an external file  */
public class ImageCollector extends Component 
{                 
	// Constants for changes
	public static final int MyDisplayWidth = 900;
	public static final int MyDisplayHeight = 1400;
	public static final int MyBarSpeed = 1;
	BufferedImage Background;
	BufferedImage[][] Ball = new BufferedImage[7][5];
	BufferedImage Bar;
	BufferedImage[] Brick = new BufferedImage[5];
	private ArrayList<Block> Bricks = new ArrayList<Block>();
	private ArrayList<AnimeBall> Balls = new ArrayList<AnimeBall>();
	public static ArrayList<Bar> Bars = new ArrayList<Bar>();

	public ImageCollector() 
	{        
		int x;
		int y;
		int i;
		int j;
		try
		{  
		    
			Background = ImageIO.read(new File("BackGround.png"));     
			Bar = ImageIO.read(new File("BarV2R.png")); 
			
			Brick[0] = null;
			Brick[1] = ImageIO.read(new File("BlockV1.png")); 
			Brick[2] = ImageIO.read(new File("BlockV2.png")); 
			Brick[3] = ImageIO.read(new File("BlockV3.png")); 
			Brick[4] = ImageIO.read(new File("BlockV4.png")); 
			
			Ball[0][0] = ImageIO.read(new File("BallV3.png"));
			Ball[0][1] = ImageIO.read(new File("BallV3-2.png"));
			Ball[0][2] = null;
			Ball[0][3] = null;
			Ball[0][4] = null;
			
			for (y = 0; y < 25; y++)
			{
				for (x = 0; x < 25; x++)
				{
					if (Ball[0][0].getRGB(x, y) >= -500000)
					{
						Ball[0][0].setRGB(x, y, 0x00000000);
					}
				}
			}
			for (y = 0; y < 25; y++)
			{
				for (x = 0; x < 25; x++)
				{
					if (Ball[0][1].getRGB(x, y) >= -500000)
					{
						Ball[0][1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			Ball[1][0] = ImageIO.read(new File("BallV4D1.png")); 
			Ball[1][1] = ImageIO.read(new File("BallV4D1S1.png")); 
			Ball[1][2] = ImageIO.read(new File("BallV4D1S2.png")); 
			Ball[1][3] = ImageIO.read(new File("BallV4D1S3.png")); 
			Ball[1][4] = ImageIO.read(new File("BallV4D1S4.png")); 
			
			Ball[2][0] = ImageIO.read(new File("BallV4D2.png")); 
			Ball[2][1] = ImageIO.read(new File("BallV4D2S1.png")); 
			Ball[2][2] = ImageIO.read(new File("BallV4D2S2.png")); 
			Ball[2][3] = ImageIO.read(new File("BallV4D2S3.png")); 
			Ball[2][4] = ImageIO.read(new File("BallV4D2S4.png")); 
			
			Ball[3][0] = ImageIO.read(new File("BallV4D3.png")); 
			Ball[3][1] = ImageIO.read(new File("BallV4D3S1.png")); 
			Ball[3][2] = ImageIO.read(new File("BallV4D3S2.png")); 
			Ball[3][3] = ImageIO.read(new File("BallV4D3S3.png")); 
			Ball[3][4] = ImageIO.read(new File("BallV4D3S4.png")); 
			
			Ball[4][0] = ImageIO.read(new File("BallV4D4.png")); 
			Ball[4][1] = ImageIO.read(new File("BallV4D4S1.png")); 
			Ball[4][2] = ImageIO.read(new File("BallV4D4S2.png")); 
			Ball[4][3] = ImageIO.read(new File("BallV4D4S3.png")); 
			Ball[4][4] = ImageIO.read(new File("BallV4D4S4.png")); 
			
			Ball[5][0] = ImageIO.read(new File("BallV4D5.png")); 
			Ball[5][1] = ImageIO.read(new File("BallV4D5S1.png")); 
			Ball[5][2] = ImageIO.read(new File("BallV4D5S2.png")); 
			Ball[5][3] = ImageIO.read(new File("BallV4D5S3.png")); 
			Ball[5][4] = ImageIO.read(new File("BallV4D5S4.png")); 
			
			Ball[6][0] = ImageIO.read(new File("BallV4D6.png")); 
			Ball[6][1] = ImageIO.read(new File("BallV4D6S1.png")); 
			Ball[6][2] = ImageIO.read(new File("BallV4D6S2.png")); 
			Ball[6][3] = ImageIO.read(new File("BallV4D6S3.png")); 
			Ball[6][4] = ImageIO.read(new File("BallV4D6S4.png")); 
			
			for (j = 0; j < 5; j++)
			{
				for (i = 1; i < 7; i++)
				{
					
						for (y = 0; y < 25; y++)
						{
							for (x = 0; x < 25; x++)
							{
								if (Ball[i][j].getRGB(x, y) >= -500000)
								{
									Ball[i][j].setRGB(x, y, 0x00000000);
								}
							}
						}
				}	
			}
		} 
		catch (IOException e)
		{        
		} 
// set like this to test
		
		i = 50;
		j = 0;
		for (i = 50; i <= 450; i = i + 60)
		{
			for (j = 25; j <= 1300; j = j + 85)
			{
				Bricks.add(new Block(j, i, 3));
			}
		}
		/*
			StartBall = new AnimeBall(700, 650, 2, -3, 4, 1);
			StartBar = new Bar(660, 840, 5, 0);
		*/
		i = 0;
		j = 0;
		for (i = 0; i <= 0; i++)
		{
			Balls.add(new AnimeBall(700, 650, 2, -3, 4, 0));
		}
			Balls.add(new AnimeBall(500, 650, 2, -3, 4, 1));
		i = 0;
		j = 0;
	//	for (i = 0; i <= 0; i = i++)
	//	{
			Bars.add(new Bar(330, 840, 5, 0));
			Bars.add(new Bar(990, 840, 5, 0));
	//	}
	//	Bricks.add(new Block(675, 50, 3));
		/*
		Bricks.add(new Block(100, 50, 4));
		Bricks.add(new Block(175, 50, 3));
		Bricks.add(new Block(250, 50, 4));
		Bricks.add(new Block(325, 50, 3));
		Bricks.add(new Block(400, 50, 4));
		Bricks.add(new Block(475, 50, 3));
		Bricks.add(new Block(550, 50, 4));
		Bricks.add(new Block(625, 50, 3));
		Bricks.add(new Block(700, 50, 4));
		Bricks.add(new Block(775, 50, 3));
		Bricks.add(new Block(850, 50, 4));
		Bricks.add(new Block(925, 50, 3));
		Bricks.add(new Block(1000, 50, 4));
		Bricks.add(new Block(1075, 50, 3));
		Bricks.add(new Block(1150, 50, 4));
		Bricks.add(new Block(1225, 50, 3));
		Bricks.add(new Block(1300, 50, 4));
		
		Bricks.add(new Block(25, 100, 4));
		Bricks.add(new Block(100, 100, 3));
		Bricks.add(new Block(175, 100, 4));
		Bricks.add(new Block(250, 100, 3));
		Bricks.add(new Block(325, 100, 4));
		Bricks.add(new Block(400, 100, 3));
		Bricks.add(new Block(475, 100, 4));
		Bricks.add(new Block(550, 100, 3));
		Bricks.add(new Block(625, 100, 4));
		Bricks.add(new Block(700, 100, 3));
		Bricks.add(new Block(775, 100, 4));
		Bricks.add(new Block(850, 100, 3));
		Bricks.add(new Block(925, 100, 4));
		Bricks.add(new Block(1000, 100, 3));
		Bricks.add(new Block(1075, 100, 4));
		Bricks.add(new Block(1150, 100, 3));
		Bricks.add(new Block(1225, 100, 4));
		Bricks.add(new Block(1300, 100, 3));
		
		Bricks.add(new Block(25, 150, 3));
		Bricks.add(new Block(100, 150, 4));
		Bricks.add(new Block(175, 150, 3));
		Bricks.add(new Block(250, 150, 4));
		Bricks.add(new Block(325, 150, 3));
		Bricks.add(new Block(400, 150, 4));
		Bricks.add(new Block(475, 150, 3));
		Bricks.add(new Block(550, 150, 4));
		Bricks.add(new Block(625, 150, 3));
		Bricks.add(new Block(700, 150, 4));
		Bricks.add(new Block(775, 150, 3));
		Bricks.add(new Block(850, 150, 4));
		Bricks.add(new Block(925, 150, 3));
		Bricks.add(new Block(1000, 150, 4));
		Bricks.add(new Block(1075, 150, 3));
		Bricks.add(new Block(1150, 150, 4));
		Bricks.add(new Block(1225, 150, 3));
		Bricks.add(new Block(1300, 150, 4));
		
		Bricks.add(new Block(25, 200, 4));
		Bricks.add(new Block(100, 200, 3));
		Bricks.add(new Block(175, 200, 4));
		Bricks.add(new Block(250, 200, 3));
		Bricks.add(new Block(325, 200, 4));
		Bricks.add(new Block(400, 200, 3));
		Bricks.add(new Block(475, 200, 4));
		Bricks.add(new Block(550, 200, 3));
		Bricks.add(new Block(625, 200, 4));
		Bricks.add(new Block(700, 200, 3));
		Bricks.add(new Block(775, 200, 4));
		Bricks.add(new Block(850, 200, 3));
		Bricks.add(new Block(925, 200, 4));
		Bricks.add(new Block(1000, 200, 3));
		Bricks.add(new Block(1075, 200, 4));
		Bricks.add(new Block(1150, 200, 3));
		Bricks.add(new Block(1225, 200, 4));
		Bricks.add(new Block(1300, 200, 3));
		
		Bricks.add(new Block(25, 250, 3));
		Bricks.add(new Block(100, 250, 4));
		Bricks.add(new Block(175, 250, 3));
		Bricks.add(new Block(250, 250, 4));
		Bricks.add(new Block(325, 250, 3));
		Bricks.add(new Block(400, 250, 4));
		Bricks.add(new Block(475, 250, 3));
		Bricks.add(new Block(550, 250, 4));
		Bricks.add(new Block(625, 250, 3));
		Bricks.add(new Block(700, 250, 4));
		Bricks.add(new Block(775, 250, 3));
		Bricks.add(new Block(850, 250, 4));
		Bricks.add(new Block(925, 250, 3));
		Bricks.add(new Block(1000, 250, 4));
		Bricks.add(new Block(1075, 250, 3));
		Bricks.add(new Block(1150, 250, 4));
		Bricks.add(new Block(1225, 250, 3));
		Bricks.add(new Block(1300, 250, 4));
		
		Bricks.add(new Block(25, 300, 4));
		Bricks.add(new Block(100, 300, 3));
		Bricks.add(new Block(175, 300, 4));
		Bricks.add(new Block(250, 300, 3));
		Bricks.add(new Block(325, 300, 4));
		Bricks.add(new Block(400, 300, 3));
		Bricks.add(new Block(475, 300, 4));
		Bricks.add(new Block(550, 300, 3));
		Bricks.add(new Block(625, 300, 4));
		Bricks.add(new Block(700, 300, 3));
		Bricks.add(new Block(775, 300, 4));
		Bricks.add(new Block(850, 300, 3));
		Bricks.add(new Block(925, 300, 4));
		Bricks.add(new Block(1000, 300, 3));
		Bricks.add(new Block(1075, 300, 4));
		Bricks.add(new Block(1150, 300, 3));
		Bricks.add(new Block(1225, 300, 4));
		Bricks.add(new Block(1300, 300, 3));
		
		Bricks.add(new Block(25, 350, 3));
		Bricks.add(new Block(100, 350, 4));
		Bricks.add(new Block(175, 350, 3));
		Bricks.add(new Block(250, 350, 4));
		Bricks.add(new Block(325, 350, 3));
		Bricks.add(new Block(400, 350, 4));
		Bricks.add(new Block(475, 350, 3));
		Bricks.add(new Block(550, 350, 4));
		Bricks.add(new Block(625, 350, 3));
		Bricks.add(new Block(700, 350, 4));
		Bricks.add(new Block(775, 350, 3));
		Bricks.add(new Block(850, 350, 4));
		Bricks.add(new Block(925, 350, 3));
		Bricks.add(new Block(1000, 350, 4));
		Bricks.add(new Block(1075, 350, 3));
		Bricks.add(new Block(1150, 350, 4));
		Bricks.add(new Block(1225, 350, 3));
		Bricks.add(new Block(1300, 350, 4));
		
		Bricks.add(new Block(25, 400, 4));
		Bricks.add(new Block(100, 400, 3));
		Bricks.add(new Block(175, 400, 4));
		Bricks.add(new Block(250, 400, 3));
		Bricks.add(new Block(325, 400, 4));
		Bricks.add(new Block(400, 400, 3));
		Bricks.add(new Block(475, 400, 4));
		Bricks.add(new Block(550, 400, 3));
		Bricks.add(new Block(625, 400, 4));
		Bricks.add(new Block(700, 400, 3));
		Bricks.add(new Block(775, 400, 4));
		Bricks.add(new Block(850, 400, 3));
		Bricks.add(new Block(925, 400, 4));
		Bricks.add(new Block(1000, 400, 3));
		Bricks.add(new Block(1075, 400, 4));
		Bricks.add(new Block(1150, 400, 3));
		Bricks.add(new Block(1225, 400, 4));
		Bricks.add(new Block(1300, 400, 3));
		
		Bricks.add(new Block(25, 450, 3));
		Bricks.add(new Block(100, 450, 4));
		Bricks.add(new Block(175, 450, 3));
		Bricks.add(new Block(250, 450, 4));
		Bricks.add(new Block(325, 450, 3));
		Bricks.add(new Block(400, 450, 4));
		Bricks.add(new Block(475, 450, 3));
		Bricks.add(new Block(550, 450, 4));
		Bricks.add(new Block(625, 450, 3));
		Bricks.add(new Block(700, 450, 4));
		Bricks.add(new Block(775, 450, 3));
		Bricks.add(new Block(850, 450, 4));
		Bricks.add(new Block(925, 450, 3));
		Bricks.add(new Block(1000, 450, 4));
		Bricks.add(new Block(1075, 450, 3));
		Bricks.add(new Block(1150, 450, 4));
		Bricks.add(new Block(1225, 450, 3));
		Bricks.add(new Block(1300, 450, 4));
		*/
		
		
		
		
		startTime();     
		  
	}       
	public void paint(Graphics g)
	{         
		//g.drawImage(Ball, 0, 0, null);
		int i;
		
	//	for (i = 0; i < MovableBallXLocations.length; i++)
			g.drawImage(Background, 0, 0, null);
		
			//g.drawImage(Ball[StartBall.getdirection()][StartBall.getState()], (int)StartBall.getLocationX(), (int)StartBall.getLocationY(), null);
		for (i = 0; i <= Balls.size() - 1; i++)
			g.drawImage(Ball[0][Balls.get(i).getState()], (int)Balls.get(i).getLocationX(), (int)Balls.get(i).getLocationY(), null);
	//	for (i = 0; i < MovableBarXLocations.length; i++)
			System.out.println(Balls.get(0).getState());
	
	
		for (i = 0; i <= Bars.size() - 1; i++)
			g.drawImage(Bar, (int)Bars.get(i).getLocationX(), (int)Bars.get(i).getLocationY(), null);
		
	//	for (i = 0; i < MovableBarXLocations.length; i++)
		
		for (i = 0; i <= Bricks.size() - 1; i++)
			g.drawImage(Brick[Bricks.get(i).getHealth()], (int)Bricks.get(i).getLocationX(), (int)Bricks.get(i).getLocationY(), null);
		
		
	}      
	public void move()
	{         
		boolean done = false;
		int i;
		int j;
		for (j = 0; j <= Bars.size() - 1; j++)
			{
				Bars.get(j).act();
				
			}
		for (i = 0; i <= Balls.size() - 1; i++)
		{		
		// revision maybe
		/*
			if (Balls.get(i).check(StartBar))
			{
				Balls.get(i).act();
			}
			*/
			Balls.get(i).act();
			
			
			// a method to see if the ball hit something
			for (j = 0; j <= Bricks.size() - 1; j++)
			{
				if (Balls.get(i).check(Bricks.get(j)))
				{
					break;
				//	StartBall.act();
				//	StartBall.act();
				}
			}	
			for (j = 0; j <= Bars.size() - 1; j++)
			{
				if (Balls.get(i).check(Bars.get(j)))
				{
					//Balls.get(i).act();
				}
			}
			Balls.get(i).borderBounce(true, true, 0);
			Balls.get(i).borderBounce(true, false, 1375);
			Balls.get(i).borderBounce(false, true, 0);
			Balls.get(i).borderBounce(false, false, 875);
			//Balls.get(i).act();
		}
		Main.f.repaint();
	//	for (i = 0; i < MovableBarXLocations.length; i++)
		
			// jazz about key board events and such
			
		
		
	//	for (i = 0; i < MovableBarXLocations.length; i++)
		
			
		
	}      
	public Dimension getPreferredSize()
	{         
		/*
		if (Background == null) 
		{             
			return new Dimension(100,100);        
		}
		else
		{           
			return new Dimension(Background.getWidth(null), Background.getHeight(null));       
		}  
		*/
		
		return new Dimension(MyDisplayHeight,MyDisplayWidth);       
		
	}  
	public void startTime()
	{
		Timer gameTimer = new Timer(5, new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Main.f.repaint();
				move();
			}
		});
		gameTimer.start();
	}
	
}
/**
RUN OUTPUT:

*/