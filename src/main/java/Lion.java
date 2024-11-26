
import java.awt.*;
import java.io.IOException;

public class Lion extends Canvas {
    private String name;
    private int age;
    private int tagID;
    Point locationPoint;
    private String nameAndAge;

    public Lion(String name, int age, int tagID){
        this.name = name;
        this.age = age;
        this.tagID = tagID;

        // Finds the location of Lion using tagID
        try {
            this.locationPoint = LocationSystem.getCoords(tagID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//

        this.nameAndAge = name + ", " + Integer.toString(age);





    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(locationPoint.x,locationPoint.y,3,3);
        g.drawString(nameAndAge,locationPoint.x+10,locationPoint.y+10);
    }

    public String getName(){
        return name;
    }

    public String getNameAndAge() {
        return nameAndAge;
    }

    public int getAge(){
        return age;
    }

    public int getTagID(){
        return tagID;
    }
}
