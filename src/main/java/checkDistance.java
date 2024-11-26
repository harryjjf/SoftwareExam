import java.awt.*;

public class checkDistance {
    private double distance;

    public double checkDistance(Point simba, Point geoff) {
        distance = Math.hypot(simba.getX() - geoff.getX(), simba.getY() - geoff.getY());
        return distance ;
        }

    }

