import greenfoot.*;

public class Explorer extends Actor
{
<<<<<<< HEAD
    private double lightRadius;
    private int batteries;
    private int lives;
    private int count;
    private int timeCounter=0;

    public Explorer()
=======
  private double lightRadius;
  private int batNum;
  private Battery battery;
  private Flashlight flashlight;
  private int count;
  private int timeCounter=0;
  
  public Explorer(Maze maze)
  {
    this.batNum = 0;
    this.lightRadius = 90.0;
  }
  
  public void act()
  {
    moving();
    
    while(count!=0)
>>>>>>> f5f9c004ded5ff960c0fac120a747e8a72adde81
    {
        this.lives = 3;
        this.batteries = 0;
        this.lightRadius = 90.0;
    }
<<<<<<< HEAD

    public void act()
    {
        moving();

        while(count!=0)
        {
            timeCounter = (timeCounter + 1) % 60;
            this.lightRadius-=1.5;

            if(timeCounter==0)
            {
                count=0;
            }
        }

        //if(this.location().equals())
        //{

        //}
    }

    public double getLightRadius()
=======
    
    if(this.location().equals(battery.location()))
    {
      this.batNum++;
      this.lightRadius = 90.0;
      count = 1;
    }
  }
  
  /*public double getLightRadius()
  {
    return this.lightRadius;
  }
  
  public void setLightRadius(double r)
  {
    this.lightRadius = r;
  }*/
  
  public int getbatNum()
  {
    return this.flashLights;
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
>>>>>>> f5f9c004ded5ff960c0fac120a747e8a72adde81
    {
        return this.lightRadius;
    }

    public void setLightRadius(double r)
    {
        this.lightRadius = r;
    }

    public int getBatteries()
    {
        return this.batteries;
    }

    public void setBatteries(int l)
    {
        this.batteries = l;
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
