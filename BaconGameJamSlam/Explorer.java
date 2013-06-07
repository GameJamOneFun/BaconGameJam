public class Explorer extends Actor
{
  private double lightRadius;
  private int flashLights;
  private boolean inView;
  
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
  
  public boolean getInView()
  {
    return this.inView;
  }
  
  public void setInView(boolean v)
  {
    this.inView = v;
  }
  
}
