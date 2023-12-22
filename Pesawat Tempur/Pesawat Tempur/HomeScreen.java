import greenfoot.*;

public class HomeScreen extends World
{
    public HomeScreen()
    {    
        super(854, 480, 1);  
        prepare();
    }

    private void prepare()
    {
        addObject(new StartButton(), getWidth() / 2, getHeight() / 2);
    }
}
