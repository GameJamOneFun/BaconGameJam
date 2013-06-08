import greenfoot.*;
import java.awt.*;

public class Flashlight extends Actor
{
    int radius = 250;
    int incRadSize = 50;
    int x, y;
    int count=1;
    int timeCounter=0;
    //Explorer e;

    public void act() 
    {
        followPlayer();
        createPortal(x, y, radius); //Code credit from greenfoot user 'danpost'. All credit goes to him!
        shrink();
    }

    public void createPortal(int x, int y, int r) // x and y are the center and r  is the radius  
    {
        GreenfootImage img = getImage();
        img.setColor(Color.black);
        img.fillRect(0, 0, 600, 600);
        Color color = Color.white;  
        Color trans = new Color(0, 0, 0, 0);  
        img.setColor(color);  
        img.fillOval(x - r, y - r, r * 2, r * 2);  
        for (int i = 0; i < r * 2; i++)  
        {  
            for (int j = 0; j < r * 2; j++)  
            {  
                Color here = img.getColorAt(x - r + i, y - r + j);  
                if (color.equals(here))
                    img.setColorAt(x - r + i, y - r + j, trans);  
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

    public void increaseRadius()
    {
        this.radius += incrRadSize;
    }
    
    public void followPlayer()
    {
        this.x = ((Explorer) getWorld().getObjects(Explorer.class).get(0)).getX();//also credit to greenfoot user danpost
        this.y = ((Explorer) getWorld().getObjects(Explorer.class).get(0)).getY();//same here
    }
    
    public void shrink()
    {
        while(count!=0)
        {
            timeCounter = (timeCounter + 1) % 60;
            radius -= 1;
        }
    }
}
