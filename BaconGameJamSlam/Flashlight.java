import greenfoot.*;
import java.awt.*;

public class Flashlight extends Actor
{
    it j = 0;
    public void act() 
    {
        createPortal(250, 250, j); //Code credit from greenfoot user 'danpost'. All credit goes to him!
    }
    
    public void createPortal(int x, int y, int r) // x and y are the center and r  is the radius  
    {  
        GreenfootImage img = getImage();  
        Color color = Color.white;  
        Color trans = new Color(0, 0, 0, 0);  
        img.setColor(color);  
        img.fillOval(x - r, y - r, r * 2, r * 2);  
        for (int i = 0; i < r * 2; i++)  
        {  
            for (int j = 0; j < r * 2; j++)  
            {  
                Color here = img.getColorAt(x - r + i, y - r + j);  
                if (color.equals(here)) img.setColorAt(x - r + i, y - r + j, trans);  
            }  
        }  
        setImage(img);  
    }
    
}
