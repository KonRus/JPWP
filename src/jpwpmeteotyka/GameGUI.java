package jpwpmeteotyka;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.util.ArrayList;



public class GameGUI extends JFrame implements ActionListener{
    private Timer timer;
    private Meteorite[] meteorites; 
    public Ship ship;
    public Player player;
    ArrayList<Integer> settingsCheckBox;

    
    public GameGUI() {
          initComponents();
        
      
    }
 public void initGameGUI(){
     
     meteorites = new Meteorite[]{
        new Meteorite(1, settingsCheckBox,1),
        new Meteorite(-150, settingsCheckBox,1),
        new Meteorite(-500, settingsCheckBox,1),
        new Meteorite(-100, settingsCheckBox,2),
        new Meteorite(-300, settingsCheckBox,2),
        new Meteorite(-800, settingsCheckBox,2),
        new Meteorite(-200, settingsCheckBox,3),   
        new Meteorite(-400, settingsCheckBox,3),
        new Meteorite(-30, settingsCheckBox,3)   
            
    };
     player = new Player("LoGiTeCh MX3 MOUSE");
     ship = new Ship();
   
        gamePanel.setLayout((null));   
        
        for (Meteorite meteorite : meteorites){
            gamePanel.add(meteorite);
        }
        
        gamePanel.add(ship);   
        timer = new Timer(100, this);
        timer.start();
        
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        ansInput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gamePanel.setBackground(new java.awt.Color(0, 0, 0));
        gamePanel.setForeground(new java.awt.Color(0, 0, 0));

        ansInput.setFont(new java.awt.Font("L M Sans17", 1, 24)); // NOI18N
        ansInput.setForeground(new java.awt.Color(255, 255, 255));
        ansInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(ansInput, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addComponent(ansInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 982, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ansInput;
    public javax.swing.JPanel gamePanel;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (Meteorite meteorite : meteorites){
            meteorite.moveMeteorite();
            if ( meteorite.y >= 900){
            meteoriteHitsGround(meteorite);
        }
            ansCheck(meteorite);
            
        }
        
    }
    
        
    
    
    public void ansCheck(Meteorite meteorite){
        if((ship.column==meteorite.column) && ansInput.getText() != "" && meteorite.y<900 && meteorite.y>=1 ){
            if( (Integer.parseInt(ansInput.getText())==meteorite.mathOperation.result)){
            System.out.println("dupa");
            ansInput.setText("");
            meteorite.y=1200;
            player.score+=10;
            System.out.println(player.score);
            }
        }
    }
    
    public void meteoriteHitsGround(Meteorite meteorite){
          
            int min = -1;
            int max = -400;
            int newy = (int)Math.floor(Math.random()*(max-min+1)+min);
            player.life--;
            System.out.println(player.life);
            //seticon wybuchu
            meteorite.initLocation(meteorite.x ,newy );
            meteorite.assignOperation();
        
    }
    
   
 
}
