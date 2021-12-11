package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;


public class Meteorite extends JLabel{
    
    int x;
    int y;
    
    Meteorite(int x, int y){
       setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("meteorite.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
       initLocation(x,y);
    }

   public void moveMeteorite(){
        y = y+3;
        this.setLocation(this.x, this.y);
       
    }
   public void initLocation(int x, int y){
       setBounds(x,y,100,100);
       this.x = x;
       this.y = y;
   }
   
}
