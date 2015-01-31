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
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
  
public class Main  
{
    public static JFrame f;
	public static KeyboardPreformer Keyboard = new KeyboardPreformer();
    public static void main(String args[])  
    {
		
		f = new JFrame("UnBreakable");
		// to check for the user clicking the exit buttion on the window
		f.addWindowListener(new WindowAdapter()
		{                
			public void windowClosing(WindowEvent e)
			{                     
				System.exit(0);           
			}            
		}); 
		f.addKeyListener(Keyboard);
		try
		{
			f.setIconImage(ImageIO.read(new File("IconV1.png")));
		} 
		catch (IOException e)
		{        
		} 
		final ImageCollector GameBoard = new ImageCollector();
		         
		f.add(GameBoard);    
		f.pack();   
		f.setVisible(true);  
		/*
		Timer gameTimer = new Timer(33, new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			  	 GameBoard.move();
				 f.repaint();
			}
		});
		gameTimer.start();
		*/
    } 
}

/**
RUN OUTPUT:

*/