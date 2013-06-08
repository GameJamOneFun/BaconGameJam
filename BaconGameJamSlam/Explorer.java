import greenfoot.*;

public class Explorer extends Actor
{
    private int batNum;
    private Flashlight flashlight = ((Flashlight) getWorld().getObjects(Flashlight.class).get(0));
    private int count=1;
    private int timeCounter=0;
    
    public Explorer()//Maze maze)
    {
        
    }

    public void act()
    {
        moving();

        while(count!=0)
        {
            timeCounter = (timeCounter + 1) % 60;
            //flashlight.shrink();
            //this.lightRadius-=1.5;

            if(timeCounter==0)
            {
                count=0;
            }
        }
    }

    public int getBatNum()
    {
        return this.batNum;
    }

    public Square location()
    {
        int col = getX();
        int row = getY();

        return (new Square(row, col));
    }

    public void moving()
    {
        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-1);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+1);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-1, y);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+1, y);
        }
    }
}
