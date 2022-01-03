package jpwpmeteotyka;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class MainGUI extends JFrame implements KeyListener{
    
   
    private MenuGUI menuGUI = new MenuGUI();
    private SettingsGUI settingsGUI = new SettingsGUI();
    GameGUI gameGUI = new GameGUI();
    JPanel gamePanel = gameGUI.gamePanel;
    private JPanel menuPanel = menuGUI.menuPanel;
    private JPanel settingsPanel = settingsGUI.settingsPanel;

    private CardLayout cardLayout = new CardLayout();
    KeyListener keyListener;
    
   

    public MainGUI() {
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    
        setTitle("METEOTYKA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1280,1024));
        setResizable(false);
        mainPanel.setLayout(cardLayout);



        add(mainPanel);
        mainPanel.add(menuPanel,"mainMenuPanel");
        mainPanel.add(settingsPanel,"settingsPanel");
        


        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(mainPanel);

        menuGUI.settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"settingsPanel");

            }
        });

        settingsGUI.backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "mainMenuPanel");

            }
        });
        menuGUI.playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameGUI.initGameGUI();
                mainPanel.add(gamePanel,"gamePanel");
                cardLayout.show(mainPanel, "gamePanel");
                
            

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 1024));

        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
        gameGUI.ansInput.setText(gameGUI.ansInput.getText() + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
         if (e.getKeyCode() == KeyEvent.VK_LEFT){
             gameGUI.ship.moveShipLeft();
         }
         else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
             gameGUI.ship.moveShipRight();
         }
      
        
    
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }

}
