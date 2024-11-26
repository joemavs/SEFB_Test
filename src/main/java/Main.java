import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {
    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration


    public static void main(String[] args) {

        ArrayList<Lion> lions = new ArrayList<Lion>();
        ArrayList<Keeper> keepers = new ArrayList<Keeper>();
        ArrayList<Drone> drones = new ArrayList<Drone>();


        JFrame frame= new JFrame(gc);	// Create a new JFrame
        JPanel panel = new JPanel();

        frame.setSize(1000,1000);

        // Input lions into database
        Lion lion1 = new Lion("Simba",7,30);
        lions.add(lion1);
        for (Lion lion : lions)
            panel.add(lion);
//

        // Input keepers into database
        Keeper keeper1 = new Keeper("Geoff", "4392",80);
        keepers.add(keeper1);
        for (Keeper keeper : keepers)
            panel.add(keeper);


        // Input drones into database
        Drone drone1 = new Drone("Monitor 1", "128MHz", 124);
        drones.add(drone1);
//        for (Drone drone : drones)
//            panel.add(drone);

        frame.add(panel);






        frame.setVisible(true);




        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });




    }
}
