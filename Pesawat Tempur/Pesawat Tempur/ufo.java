import greenfoot.*;

public class ufo extends Actor
{
    /**
     * Act - do whatever the ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        
        int x=getX();
        int y=getY();
        setLocation(x-2,y);
        if(x==0){
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            if(mouse.getY()>(y-7) && mouse.getY()<(y+7)){
                getWorld().addObject(new peluru2(),getX(),getY());
                Greenfoot.playSound("p2.wav");
            }
        }
    }    
}
