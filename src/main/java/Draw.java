import java.awt.*;

public abstract class Draw {
    protected String name;
    protected int tagID;

    public Draw(String name, int tagID) {
        this.name = name;
        this.tagID = tagID;

    }
    public int getTagID(){
        return tagID;
    }

    abstract void draw(Graphics g, Point p);
}
