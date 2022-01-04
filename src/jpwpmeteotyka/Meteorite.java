package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;


public class Meteorite extends JLabel{
    
    int x;
    int y;
    MathOperation mathOperation;
    public MathOperation[]  mathOperations = new MathOperation[] {
        new MathOperation (0, 100, 0, 100),
        new MathOperation (50, 100, 1, 49),
        new MathOperation (0, 10, 0, 10),
        new MathOperation (1, 10, 1, 10),
        
    };
    Meteorite(int x, int y){
       
       setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("meteorite.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
       initLocation(x,y);
       setOperation();
       this.mathOperation = mathOperations[(int)Math.floor(Math.random()*(3-0))];
       setText(this.mathOperation.operation +"   "+ this.mathOperation.result);
       setVerticalTextPosition(JLabel.BOTTOM);
       setHorizontalTextPosition(JLabel.CENTER);
       
       
       
    }
    public void setOperation(){
        mathOperations[0].result=mathOperations[0].a+mathOperations[0].b;
        mathOperations[0].operation=mathOperations[0].a+" + "+mathOperations[0].b;
        mathOperations[1].result=mathOperations[1].a-mathOperations[1].b;
        mathOperations[1].operation=mathOperations[1].a+" - "+mathOperations[1].b;
        mathOperations[2].result=mathOperations[2].a*mathOperations[2].b;
        mathOperations[2].operation=mathOperations[2].a+" * "+mathOperations[2].b;
        mathOperations[3].result=mathOperations[3].a;
        mathOperations[3].operation=mathOperations[3].a*mathOperations[3].b+" : "+mathOperations[3].b;
        
    }

   public void moveMeteorite(){
        y = y+3;
        this.setLocation(this.x, y);
        if ( this.y >= 1000){
            int min = -1;
            int max = -400;
            int newy = (int)Math.floor(Math.random()*(max-min+1)+min);
            //zycie -1
            //seticon wybuchu
            this.initLocation(this.x ,newy );
            
        }
        System.out.println(y);
       
    }
   public void initLocation(int x, int y){
       setBounds(x,y,100,150);
       this.x = x;
       this.y = y;
   }
   
}
