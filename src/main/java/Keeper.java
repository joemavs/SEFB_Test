
import java.awt.*;
import java.io.IOException;

public class Keeper extends Canvas{
    private String name;
    private String phoneNumber;
    private int tagID;
    Point locationPoint;
    private String nameAndNumber;

    public Keeper(String name, String phoneNumber, int tagID){
        // Constructor for Keeper objects

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.tagID = tagID;

        // Finds the location of Keeper using tagID
        try {
            this.locationPoint = LocationSystem.getCoords(tagID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.nameAndNumber = name + ", " + phoneNumber;

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(locationPoint.x,locationPoint.y,2,2);
        g.drawString(nameAndNumber,locationPoint.x+10,locationPoint.y+10);
    }

}
