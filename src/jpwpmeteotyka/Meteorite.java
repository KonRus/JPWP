package jpwpmeteotyka;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;


public class Meteorite extends JLabel{
    ArrayList<Integer> settingsCheckBox;
    
    int x;
    int y;
    public int column;
    MathOperation mathOperation;
    public MathOperation[]  mathOperations = new MathOperation[] {
        new MathOperation (0, 100, 0, 100),
        new MathOperation (50, 100, 1, 49),
        new MathOperation (0, 10, 0, 10),
        new MathOperation (1, 10, 1, 10),
        
        
    };
    Meteorite(int y, ArrayList<Integer> settingsCheckBox, int column){
       
       int x=0;
       if(column == 1){
           x=214;
       }
       else if(column == 2){
           x=640;
       }
       else if(column == 3){
           x=1066;
       }
       this.column = column;
       setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("meteorite.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
       initLocation(x,y);
       setOperation();
       this.settingsCheckBox=settingsCheckBox;
       assignOperation();
       setVerticalTextPosition(JLabel.BOTTOM);
       setHorizontalTextPosition(JLabel.CENTER);
       setForeground(Color.WHITE);
       
       
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
        y = y+30;
        this.setLocation(this.x, y);
        
      
       
    }
   public void initLocation(int x, int y){
       setBounds(x,y,100,150);
       this.x = x;
       this.y = y;
   }
   public void assignOperation(){
       int settingsCheckBoxLength = this.settingsCheckBox.size();
       int random = (int)Math.floor(Math.random()*(settingsCheckBoxLength-0));
       int index = settingsCheckBox.get(random);
       this.mathOperation = mathOperations[index];
       setText(this.mathOperation.operation+ "   "+mathOperation.result);
   }
   
}
