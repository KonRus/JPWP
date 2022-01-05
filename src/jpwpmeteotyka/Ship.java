package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;


public class Ship extends JLabel {
    int x=640;
    int y=900;
    int column;
    
    Ship(){
        initLocation(x,y);
        setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("ship.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }
     public void moveShipLeft(){
        x=x-426;
        this.setLocation(this.x, this.y);
        this.column=assignColumn(this.x);
    }
    public void moveShipRight(){
        x=x+426;
        this.setLocation(this.x, this.y);
        this.column=assignColumn(this.x);
    }
    
     public void initLocation(int x, int y){
       setBounds(x,y,100,100);
       this.x = x;
       this.y = y;
       this.column=assignColumn(this.x);
     }
     public int assignColumn(int x){
         int column=0;
             switch(x) {
                case 214:
                column=1;
                  break;
                case 640:
                  column=2;
                  break;
                case 1066:
                  column=3;
         }
             return column;
     }
   
}
