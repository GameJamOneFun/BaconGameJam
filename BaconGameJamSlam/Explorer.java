import greenfoot.*;

public class Explorer extends Actor
{
  private double lightRadius;
  private int flashLights;
  private int lives;
  private int count;
  private int timeCounter=0;
  
  public Explorer()
  {
    this.lives = 3;
    this.flashLights = 0;
    this.lightradius = 90.0;
  }
  
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
    
    if(this.location().equals())
    {
      
    }
  }
  
  public double getLightRadius()
  {
    return this.lightRadius;
  }
  
  public void setLightRadius(double r)
  {
    this.lightRadius = r;
  }
  
  public int getFlashLights()
  {
    return this.flashLights;
  }
  
  public void setFlashLights(int l)
  {
    this.flashLights = l;
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
