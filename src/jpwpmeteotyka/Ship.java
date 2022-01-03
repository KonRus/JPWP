package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;


public class Ship extends JLabel {
    int x=640;
    int y=900;
    
    Ship(){
        initLocation(x,y);
        setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ship.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }
     public void moveShipLeft(){
        x=x-426;
        this.setLocation(this.x, this.y);
    }
    public void moveShipRight(){
        x=x+426;
        this.setLocation(this.x, this.y);
    }
    
     public void initLocation(int x, int y){
       setBounds(x,y,100,100);
       this.x = x;
       this.y = y;
     }
   
}
