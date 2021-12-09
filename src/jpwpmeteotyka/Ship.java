package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Ship extends JPanel {
JLabel ship = new JLabel();

    Ship(){
        setLayout(new FlowLayout());
        add(ship);
        ship.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ship.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }
}
