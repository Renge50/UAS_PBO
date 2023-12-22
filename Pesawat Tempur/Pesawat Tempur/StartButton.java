import greenfoot.*;

public class StartButton extends Actor
{
    private GreenfootSound backgroundMusic = new GreenfootSound("ms.mp3"); 

    public StartButton()
    {
        
        setImage(new GreenfootImage("start_button.png")); 
    }

    public void act()
    {
        
        if (Greenfoot.mouseClicked(this))
        {
            startGame();
        }
    }

    private void startGame()
    {
        Greenfoot.setWorld(new bg()); 
        if (!backgroundMusic.isPlaying()) {
            backgroundMusic.setVolume(30);
            backgroundMusic.play();
        }
    }
}
