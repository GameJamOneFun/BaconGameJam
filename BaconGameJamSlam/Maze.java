import greenfoot.*;

public class Maze extends Actor
{
    private int rows;
    private int cols;
    private Square[][] maze;
    private Explorer explorer;
    
    public Maze(Square[][] maze, int rows, int cols)
    {
        this.maze = maze;
        this.rows = rows;
        this.cols = cols;
    }
    
    public getSquare(int row, int col)
    {
        return this.maze[row][col];
    }
    
    public int rows()
    {
        return this.rows;
    }
    
    public int cols()
    {
        return this.cols;
    }
    
    public void setExplorer(Explorer e)
    {
        this.explorer = e;
    }
    
    public explorerMove(int key)
    {
        this.explorer.move(key);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
