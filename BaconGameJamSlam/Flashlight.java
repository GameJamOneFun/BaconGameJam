import greenfoot.*;
import java.awt.*;

public class Flashlight extends Actor
{
    int radius = 0;
    int x, y = 250;

    public void act() 
    {
        createPortal(x, y, radius); //Code credit from greenfoot user 'danpost'. All credit goes to him!
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

    public int getRadius()
    {
        return this.radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void increaseRadius(int incrRadSize)
    {
        this.radius += incrRadSize;
    }
}