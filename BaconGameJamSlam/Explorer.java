import greenfoot.*;

public class Explorer extends Actor
{
  private double lightRadius;
  private int flashLights;
  //private boolean inView;
  
  public Explorer()
  {
    this.inView = false;
    this.flashLights = 0;
    this.lightradius = 20.0;
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
  
  /*public boolean getInView()
  {
    return this.inView;
  }*/
  
  /*public void setInView(boolean v)
  {
    this.inView = v;
  }*/
  
  public void move()
  {
    int x = getY();
    int y = getX();
    
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
