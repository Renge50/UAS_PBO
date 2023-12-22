import greenfoot.*;

public class bg extends World
{
    Counter counter = new Counter("Skor: ");
    private GreenfootSound mulai = new GreenfootSound("ms.mp3");
    private GreenfootSound endSound = new GreenfootSound("end.mp3");
    private int restartDelay = 50; 
    private int restartTimer = 0; 

    public bg()
    {    
        super(854, 480, 1); 
        setPaintOrder(skor.class, api.class, bintang.class, ps.class, ufo.class, Counter.class, peluru1.class, peluru2.class);
        addObject(new bintang(), 150, 50);
        addObject(new ps(), 69, 215);
        addObject(new ufo(), 790, 320);
        addObject(counter, 120, 450);
        showHomeScreen();
    }
    
    

    public void act(){
        if(Greenfoot.getRandomNumber(1000) < 4){
            addObject(new bintang(), 853, Greenfoot.getRandomNumber(70));
            addObject(new bintang(), 953, Greenfoot.getRandomNumber(70));
        }
       
        if(Greenfoot.getRandomNumber(100) < 1){
            addObject(new ufo(), 853, Greenfoot.getRandomNumber(479));
        }
        

        if (Greenfoot.isKeyDown("R") && restartTimer <= 0) {
            stopEndSound(); 
            Greenfoot.setWorld(new bg()); 
            restartTimer = restartDelay; 
        }

        
        if (restartTimer > 0) {
            restartTimer--;
        }
        }
    public void showObjects(boolean show){
        
        if(!show){
            removeObjects(getObjects(null));
        } else{
            addObject(new bintang(), 690, 20);
            addObject(new ps(), 69, 215);
            addObject(new ufo(), 790, 320);
            addObject(counter, 120, 450);
        }
    }

    private void stopEndSound() {
        if (endSound != null && endSound.isPlaying()) {
            endSound.stop();
        }
    }

    public void tambah(){
        counter.add(20);
    }

    public void selesai() 
    {
        addObject(new skor(counter.getValue()), getWidth()/2, getHeight()/2);
        showReplayMessage();
        endSound.setVolume(40);
        endSound.play();
    }

    private void showReplayMessage() {
        showText("Press 'R' to replay", getWidth() / 2, getHeight() / 2 + 50);
    }   
    
    private void showHomeScreen()
    {
        Greenfoot.setWorld(new HomeScreen());
    }
}
