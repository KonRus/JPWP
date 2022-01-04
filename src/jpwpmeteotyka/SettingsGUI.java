package jpwpmeteotyka;
import java.util.*;

public class SettingsGUI extends javax.swing.JFrame{
    
    ArrayList<Integer> settingsCheckBox;

    public SettingsGUI() {
        
        initComponents();
        IsSelectedCB();

     
      }
      public void IsSelectedCB(){
          settingsCheckBox = new ArrayList<Integer>();
        if(addCheckBox.isSelected()){
            settingsCheckBox.add(0);
        }
       
        
       if(subtractCheckBox.isSelected()){
            settingsCheckBox.add(1);
        }
       
        
       
       if(multiplyCheckBox.isSelected()){
            settingsCheckBox.add(2);
        }
       
       
       if(divideCheckBox.isSelected()){
            settingsCheckBox.add(3);
        }
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsPanel = new javax.swing.JPanel();
        subtractCheckBox = new javax.swing.JCheckBox();
        addCheckBox = new javax.swing.JCheckBox();
        multiplyCheckBox = new javax.swing.JCheckBox();
        divideCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subtractCheckBox.setSelected(true);
        subtractCheckBox.setText("Odejmowanie");
        subtractCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractCheckBoxActionPerformed(evt);
            }
        });

        addCheckBox.setSelected(true);
        addCheckBox.setText("Dodawanie");
        addCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCheckBoxActionPerformed(evt);
            }
        });

        multiplyCheckBox.setSelected(true);
        multiplyCheckBox.setText("Mnożenie");
        multiplyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyCheckBoxActionPerformed(evt);
            }
        });

        divideCheckBox.setSelected(true);
        divideCheckBox.setText("Dzielenie");

        jLabel1.setText("JAKIE DZIAŁANIA");

        backButton.setText("Powrót");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backButton))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(addCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(subtractCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsPanelLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(multiplyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(divideCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtractCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divideCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(553, 553, 553)
                .addComponent(backButton)
                .addGap(177, 177, 177))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckBoxActionPerformed
        IsSelectedCB();

    }//GEN-LAST:event_addCheckBoxActionPerformed

    private void multiplyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyCheckBoxActionPerformed
        IsSelectedCB();
 
    }//GEN-LAST:event_multiplyCheckBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        IsSelectedCB();

    }//GEN-LAST:event_backButtonActionPerformed

    private void subtractCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractCheckBoxActionPerformed
        IsSelectedCB();

    }//GEN-LAST:event_subtractCheckBoxActionPerformed


    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox addCheckBox;
    public javax.swing.JButton backButton;
    public javax.swing.JCheckBox divideCheckBox;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JCheckBox multiplyCheckBox;
    public javax.swing.JPanel settingsPanel;
    public javax.swing.JCheckBox subtractCheckBox;
    // End of variables declaration//GEN-END:variables

   
}
