package jpwpmeteotyka;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;



public class GameGUI extends JFrame implements ActionListener{
    private Timer timer;
    private Meteorite[] meteorites; 
    public Ship ship;

    
    public GameGUI() {
          initComponents();
        
      
    }
 public void initGameGUI(){
     
     meteorites = new Meteorite[]{
        new Meteorite(214,1),
        new Meteorite(214,-150),
        new Meteorite(214,-500),
        new Meteorite(640,-100),
        new Meteorite(640,-300),
        new Meteorite(640,-800),
        new Meteorite(1066,-200),   
        new Meteorite(1066,-400),
        new Meteorite(1066,-30)   
            
    };
     
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

        gamePanel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(ansInput, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addComponent(ansInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1000, Short.MAX_VALUE))
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
            
        }

    }
 
}
