import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class peluru1 extends Actor
{

    public void act() 
    {
        int x=getX();
        int y=getY();
        setLocation(x+29,y);
        if(x == 853){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneObjectAtOffset(0 ,0, ufo.class);
        if(a != null){
            getWorld().addObject(new api(),getX(),getY());
            ((bg)getWorld()).tambah();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
}
