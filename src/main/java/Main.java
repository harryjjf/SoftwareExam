import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {

    public static void main(String[] args) {


        mapDraw drawing = new mapDraw();

        Keeper geoff = new Keeper("Geoff", "4392", 80);
        drawing.addKeeper(geoff);
        Lion simba = new Lion("Simba", 7, 30);
        drawing.addLion(simba);
        Drone monitor1 = new Drone("Monitor1", 128, 124);
        drawing.addDrone(monitor1);



        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.add(drawing);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        drawing.refresh();
        }


    }

