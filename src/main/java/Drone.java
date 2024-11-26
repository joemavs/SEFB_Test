
import java.awt.*;
import java.io.IOException;

public class Drone {
    private String name;
    private String radioFreq;
    private int tagID;
    Point locationPoint;
    private String nameAndFreq;

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
        this.nameAndFreq = name + ", " + radioFreq;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(locationPoint.x,locationPoint.y,3,3);
        g.drawString(nameAndFreq,locationPoint.x+10,locationPoint.y+10);
    }
}
