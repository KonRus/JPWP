package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;


public class Ship extends JLabel {
    int x=500;
    int y=900;
    
    Ship(){
        initLocation(x,y);
        setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ship.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }
    public void moveShipRight(){
        System.out.println("right");
        y=y+223;
        this.setLocation(this.x, this.y);
    }
     public void moveShipLeft(){
        y=y+223;
        this.setLocation(this.x, this.y);
    }
     public void initLocation(int x, int y){
       setBounds(x,y,100,100);
       this.x = x;
       this.y = y;
     }
   
}
