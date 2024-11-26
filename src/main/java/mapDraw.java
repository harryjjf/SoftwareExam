import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class mapDraw extends Canvas {

    LocationSystem locationSystem = new LocationSystem();
    checkDistance checkDistance = new checkDistance();

    public mapDraw() {
        setSize(600, 600);
        setBackground(Color.white);

    }

    List<Draw> object = new ArrayList();

    public void addLion(Lion l) {
        object.add(l);
    }

    public void addKeeper(Keeper k) {
        object.add(k);
    }

    public void addDrone(Drone d) {
        object.add(d);
    }

    public void paint(Graphics g) {
        for (Draw o : object) {
            try {
                o.draw(g, getLocation(o));
            } catch (NullPointerException e) {
                System.out.println("Tag ID could not be found");
            } catch (Exception e) {
                System.out.println("Could not connect to GPS System");
            }
        }

    }

    private Point position;

    public Point getLocation(Draw d) {
        try {
            position = locationSystem.getCoords(d.getTagID());
        } catch (NullPointerException e) {
            System.out.println("Tag ID could not be found");
        } catch (Exception e) {
            System.out.println("Could not connect to GPS System");
        }
        return position;

    }

    public void refresh(){
        while(true){
            repaint();
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }





    }





