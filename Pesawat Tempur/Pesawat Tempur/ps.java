import greenfoot.*;

public class ps extends Actor
{
    private bg pl;
    private int shootDelay = 30; 
    private int shootTimer = 0; 
    private int movementSpeed = 5; 

    public void addedToWorld(World bg) {
        pl = (bg) bg;
    }

    public void act() 
    {
        if (Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }

        
        if (Greenfoot.mouseClicked(null) && shootTimer <= 0) {
            pl.addObject(new peluru1(), getX() + getImage().getHeight(), getY());
            Greenfoot.playSound("p1.wav");
            shootTimer = shootDelay; 
        }


        if (shootTimer > 0) {
            shootTimer--;
        }

      
        if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - movementSpeed);
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + movementSpeed);
        }
        if (Greenfoot.isKeyDown("A")) {
            setLocation(getX() - movementSpeed, getY());
        }
        if (Greenfoot.isKeyDown("D")) {
            setLocation(getX() + movementSpeed, getY());
        }
        if (Greenfoot.isKeyDown("Space")) {
            pl.addObject(new peluru1(), getX() + getImage().getHeight(), getY());
            shootTimer = shootDelay;
        }
        


        Actor a = getOneObjectAtOffset(0, 0, ufo.class);
        if (a != null) {
            getWorld().addObject(new api(), getX(), getY());
            ((bg) getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }    
    }
}
