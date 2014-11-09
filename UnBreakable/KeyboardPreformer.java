/** 
 * @student.info 
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */
import java.awt.event.*;
public class KeyboardPreformer implements KeyListener
{
	private int i;
	public KeyboardPreformer()
	{
		
	}
	public void keyTyped(KeyEvent e) 
	{
        if (e.getKeyChar() == KeyEvent.VK_A)
		{
			for (i = 0; i <= ImageCollector.Bars.size() - 1; i++)
			{
				ImageCollector.Bars.get(i).changeDir(-1);
			}

			System.out.println("downA");
		}
		if (e.getKeyChar() == KeyEvent.VK_D)
		{
			for (i = 0; i <= ImageCollector.Bars.size() - 1; i++)
			{
				ImageCollector.Bars.get(i).changeDir(1);
			}

			System.out.println("downD");
		}
    }

    /** Handle the key-pressed event from the text field. */
    public void keyPressed(KeyEvent e) 
	{
        
    }

    /** Handle the key-released event from the text field. */
    public void keyReleased(KeyEvent e) 
	{
        if (e.getKeyChar() == KeyEvent.VK_A)
		{
			for (i = 0; i <= ImageCollector.Bars.size() - 1; i++)
			{
				ImageCollector.Bars.get(i).changeDir(0);
			}

			System.out.println("upA");
		}
		if (e.getKeyChar() == KeyEvent.VK_D)
		{
			for (i = 0; i <= ImageCollector.Bars.size() - 1; i++)
			{
				ImageCollector.Bars.get(i).changeDir(0);
			}

			System.out.println("upD");
		}
    }
}

/**
RUN OUTPUT:

*/