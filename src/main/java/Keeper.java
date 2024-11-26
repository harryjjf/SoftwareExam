import java.awt.*;

public class Keeper extends Draw{

    private String phoneNumber;

    public Keeper(String name, String phoneNumber, int tagID) {
        super(name, tagID);
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void draw(Graphics g, Point p) {
          g.setColor(Color.blue);
          g.drawOval((int)p.getX(), (int)p.getY(), 4, 4);
          g.drawString(name +" Phone Number: " +phoneNumber, (int)p.getX(), (int)p.getY()-20);
           }
    }

