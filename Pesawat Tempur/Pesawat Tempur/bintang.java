import greenfoot.*;

public class bintang extends Actor
{
    /**
     * Act - do whatever the bintang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();

        // Decrease the Y-coordinate to make the star fall
        setLocation(x, y + 1);

        // Remove the star when it reaches the bottom of the screen
        if (y >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }    
}
