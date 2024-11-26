
import java.awt.*;
import java.io.IOException;

public class Drone {
    private String name;
    private String radioFreq;
    private int tagID;
    Point locationPoint;

    public Drone(String name, String radioFreq, int tagID){
        this.name = name;
        this.radioFreq = radioFreq;
        this.tagID = tagID;

        // Finds the location of Drone using tagID
        try {
            this.locationPoint = LocationSystem.getCoords(tagID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(locationPoint.x,locationPoint.y,3,3);
    }
}
