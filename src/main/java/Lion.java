import java.awt.*;

public class Lion extends Draw{

    private int age;


    public Lion(String name, int age, int tagID) {
        super(name, tagID);
        this.age = age;

    }

    @Override
    public void draw(Graphics g, Point p) {
        g.setColor(Color.red);
        g.drawOval((int)p.getX(), (int)p.getY(), 6, 6);
        g.drawString(name+ " Age: " +age, (int)p.getX(), (int)p.getY());
    }
}
