import java.awt.*;

public class Drone extends Draw{

    private int radioFreq;


    public Drone(String name, int radioFreq, int tagID) {
        super(name, tagID);
        this.radioFreq = radioFreq;

    }

    @Override
    public void draw(Graphics g, Point p) {
        g.setColor(Color.black);
        g.drawRect((int)p.getX(),(int)p.getY(), 3,3 );
        g.drawString(name+" Frequency: "+radioFreq, (int)p.getX(), (int)p.getY());
    }
}
