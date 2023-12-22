import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class peluru2 extends Actor
{

    public void act() 
    {
        int x=getX();
        int y=getY();
        setLocation(x-17,y);
        if(x==0){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneIntersectingObject(ps.class);
        if(a != null){
            getWorld().addObject(new api(),getX(),getY());
            ((bg)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
}
