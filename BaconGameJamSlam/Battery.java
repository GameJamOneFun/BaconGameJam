import greenfoot.*;

public class Battery extends Actor
{
    private boolean found;

    public Battery()
    {

    }

    public boolean found()
    {
        return found;
    }

    public void setFound()
    {
        found = true;
    }
    
    public Square location()
    {
        int col = getX();
        int row = getY();

        return (new Square(row, col));
    }
    
    public void checkCollision()
    {
        
    }
}
