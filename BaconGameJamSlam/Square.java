public class Square extends Actor
{
   private boolean[4] walls;
   private int row;
   private int col;
   private FlashLight flash;
   private boolean inView;
   
   private final static int SQUARE_UP = 0; // Upper wall
   private final static int SQUARE_DOWN = 1; //Bottom wall
   private final static int SQUARE_LEFT = 2; // Left wall
   private final static int SQUARE_RIGHT = 3; // Right wall
   private final static int SQUARE_SIZE = 50; // 50 for the number of pixels
   
   
   // Constructor to make a Square with walls and placement in the maze.
   public Square(boolean up, boolean down, boolean left, boolean right, int row, int col, boolean inView)
   {
      this.walls[SQUARE_UP] = up;
      this.walls[SQUARE_DOWN] = down;
      this.walls[SQUARE_LEFT] = left;
      this.walls[SQUARE_RIGHT] = right;
      this.row = row;
      this.col = col;
      this.inView = inView;
   }
   
   public Square(int row, int col)
   {
      this.row = row;
      this.col = col;
   }
   
   public int getRow()
   {
       return this.row;
   }
   
   public int getCol()
   {
       return this.col;
   }
   
   public FlashLight getFlashLight()
   {
      return this.flash;
   }
   
   public void setFlashFlight(FlashLight flash)
   {
      this.flash = flash;
   }
   
   public boolean InView()
   {
      return this.inView;
   }
   
   public void setInView(boolean inView)
   {
      this.inView = inView;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}
