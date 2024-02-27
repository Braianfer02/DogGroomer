
package fernandez.braian.doggroomen.giu;

import fernandez.braian.doggroomen.logic.ControllerLogic;
import fernandez.braian.doggroomen.logic.Dogs;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditData extends javax.swing.JFrame {
    
    ControllerLogic Control = null;
    int xMouse, yMouse;
    int number_Client;
    Dogs dog;

    public EditData(int number_Client) {
        Control = new ControllerLogic();
        initComponents();
        LoadData(number_Client);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Mov = new javax.swing.JPanel();
        btnPosition = new javax.swing.JLabel();
        PanelLeft = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelRace = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelAllergic = new javax.swing.JLabel();
        labelSpecialAttention = new javax.swing.JLabel();
        labelOwnerName = new javax.swing.JLabel();
        labelOwnerCellPhone = new javax.swing.JLabel();
        labelObservation = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtRace = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jcbAllergic = new javax.swing.JComboBox<>();
        jcbSpecialAttention = new javax.swing.JComboBox<>();
        txtOwnerName = new javax.swing.JTextField();
        txtOwnerCellPhone = new javax.swing.JTextField();
        txtObservation = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        PanelRight = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTop.setBackground(new java.awt.Color(102, 102, 102));
        PanelTop.setForeground(new java.awt.Color(255, 255, 255));
        PanelTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT DATA");
        PanelTop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        Mov.setBackground(new java.awt.Color(102, 102, 102));
        Mov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovMouseDragged(evt);
            }
        });
        Mov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovMousePressed(evt);
            }
        });

        btnPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPosition.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Arrow.png")); // NOI18N

        javax.swing.GroupLayout MovLayout = new javax.swing.GroupLayout(Mov);
        Mov.setLayout(MovLayout);
        MovLayout.setHorizontalGroup(
            MovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(MovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MovLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MovLayout.setVerticalGroup(
            MovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(MovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MovLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PanelTop.add(Mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(PanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        PanelLeft.setBackground(new java.awt.Color(102, 102, 102));
        PanelLeft.setForeground(new java.awt.Color(255, 255, 255));

        labelName.setBackground(new java.awt.Color(51, 51, 51));
        labelName.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelName.setText("Name:");

        labelRace.setBackground(new java.awt.Color(51, 51, 51));
        labelRace.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelRace.setForeground(new java.awt.Color(255, 255, 255));
        labelRace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelRace.setText("Race:");

        labelColor.setBackground(new java.awt.Color(51, 51, 51));
        labelColor.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelColor.setForeground(new java.awt.Color(255, 255, 255));
        labelColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelColor.setText("Color:");

        labelAllergic.setBackground(new java.awt.Color(51, 51, 51));
        labelAllergic.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelAllergic.setForeground(new java.awt.Color(255, 255, 255));
        labelAllergic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelAllergic.setText("Allergic:");

        labelSpecialAttention.setBackground(new java.awt.Color(51, 51, 51));
        labelSpecialAttention.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelSpecialAttention.setForeground(new java.awt.Color(255, 255, 255));
        labelSpecialAttention.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSpecialAttention.setText("Special Attention:");

        labelOwnerName.setBackground(new java.awt.Color(51, 51, 51));
        labelOwnerName.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelOwnerName.setForeground(new java.awt.Color(255, 255, 255));
        labelOwnerName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOwnerName.setText("Owner Name:");

        labelOwnerCellPhone.setBackground(new java.awt.Color(51, 51, 51));
        labelOwnerCellPhone.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelOwnerCellPhone.setForeground(new java.awt.Color(255, 255, 255));
        labelOwnerCellPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOwnerCellPhone.setText("Owner Cell Phone:");

        labelObservation.setBackground(new java.awt.Color(51, 51, 51));
        labelObservation.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        labelObservation.setForeground(new java.awt.Color(255, 255, 255));
        labelObservation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelObservation.setText("Observation:");

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtRace.setBackground(new java.awt.Color(204, 204, 204));
        txtRace.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        txtRace.setForeground(new java.awt.Color(0, 0, 0));
        txtRace.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtColor.setBackground(new java.awt.Color(204, 204, 204));
        txtColor.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jcbAllergic.setBackground(new java.awt.Color(204, 204, 204));
        jcbAllergic.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jcbAllergic.setForeground(new java.awt.Color(0, 0, 0));
        jcbAllergic.setMaximumRowCount(3);
        jcbAllergic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Yes", "No" }));
        jcbAllergic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAllergicActionPerformed(evt);
            }
        });

        jcbSpecialAttention.setBackground(new java.awt.Color(204, 204, 204));
        jcbSpecialAttention.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jcbSpecialAttention.setForeground(new java.awt.Color(0, 0, 0));
        jcbSpecialAttention.setMaximumRowCount(3);
        jcbSpecialAttention.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Yes", "No" }));
        jcbSpecialAttention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSpecialAttentionActionPerformed(evt);
            }
        });

        txtOwnerName.setBackground(new java.awt.Color(204, 204, 204));
        txtOwnerName.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        txtOwnerName.setForeground(new java.awt.Color(0, 0, 0));
        txtOwnerName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtOwnerCellPhone.setBackground(new java.awt.Color(204, 204, 204));
        txtOwnerCellPhone.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        txtOwnerCellPhone.setForeground(new java.awt.Color(0, 0, 0));
        txtOwnerCellPhone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtObservation.setBackground(new java.awt.Color(204, 204, 204));
        txtObservation.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        txtObservation.setForeground(new java.awt.Color(0, 0, 0));
        txtObservation.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnSave.setBackground(new java.awt.Color(51, 51, 51));
        btnSave.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Save.png")); // NOI18N
        btnSave.setText("save change");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Exit.png")); // NOI18N
        btnExit.setText("EXIT");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLeftLayout = new javax.swing.GroupLayout(PanelLeft);
        PanelLeft.setLayout(PanelLeftLayout);
        PanelLeftLayout.setHorizontalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLeftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLeftLayout.createSequentialGroup()
                            .addComponent(labelRace, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelLeftLayout.createSequentialGroup()
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLeftLayout.createSequentialGroup()
                        .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLeftLayout.createSequentialGroup()
                                .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelLeftLayout.createSequentialGroup()
                                    .addComponent(labelObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLeftLayout.createSequentialGroup()
                                    .addComponent(labelOwnerCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtOwnerCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLeftLayout.createSequentialGroup()
                                    .addComponent(labelOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLeftLayout.createSequentialGroup()
                                    .addComponent(labelAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jcbAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLeftLayout.createSequentialGroup()
                                    .addComponent(labelSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jcbSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelLeftLayout.setVerticalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOwnerCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(PanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 450));

        PanelRight.setBackground(new java.awt.Color(102, 102, 102));
        PanelRight.setForeground(new java.awt.Color(255, 255, 255));

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Image\\Load Data.png")); // NOI18N

        javax.swing.GroupLayout PanelRightLayout = new javax.swing.GroupLayout(PanelRight);
        PanelRight.setLayout(PanelRightLayout);
        PanelRightLayout.setHorizontalGroup(
            PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelRightLayout.setVerticalGroup(
            PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRightLayout.createSequentialGroup()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(PanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 350, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        DogGroomer WindowsDogGroomer = new DogGroomer();
        WindowsDogGroomer.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void jcbAllergicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAllergicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAllergicActionPerformed

    private void jcbSpecialAttentionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSpecialAttentionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSpecialAttentionActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TOO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        //Save New Data
        Control.modifyDogs(
                dog,
                txtName.getText(), 
                txtRace.getText(), 
                txtColor.getText(), 
                (String) jcbAllergic.getSelectedItem(), 
                (String) jcbSpecialAttention.getSelectedItem(), 
                txtOwnerName.getText(), 
                txtOwnerCellPhone.getText(), 
                txtObservation.getText()
            );

        // clear
        txtName.setText("");
        txtRace.setText("");
        txtColor.setText("");
        jcbAllergic.setSelectedIndex(0);
        jcbSpecialAttention.setSelectedIndex(0);
        txtOwnerName.setText("");
        txtOwnerCellPhone.setText("");
        txtObservation.setText("");
        
        // Successful window
        JOptionPane optionPane = new JOptionPane("the changes have been saved correctly");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Successful Save");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void MovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_MovMouseDragged

    private void MovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MovMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel Mov;
    private javax.swing.JPanel PanelLeft;
    private javax.swing.JPanel PanelRight;
    private javax.swing.JPanel PanelTop;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel btnPosition;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcbAllergic;
    private javax.swing.JComboBox<String> jcbSpecialAttention;
    private javax.swing.JLabel labelAllergic;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelObservation;
    private javax.swing.JLabel labelOwnerCellPhone;
    private javax.swing.JLabel labelOwnerName;
    private javax.swing.JLabel labelRace;
    private javax.swing.JLabel labelSpecialAttention;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtObservation;
    private javax.swing.JTextField txtOwnerCellPhone;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtRace;
    // End of variables declaration//GEN-END:variables

    private void LoadData(int number_Client) {
        
        this.dog = Control.bringDog(number_Client);
        
        txtName.setText(dog.getName());
        txtRace.setText(dog.getRace());
        txtColor.setText(dog.getColor());
        txtOwnerName.setText(dog.getOneOnwer().getName());
        txtOwnerCellPhone.setText(dog.getOneOnwer().getOwner_Cell_Phone());
        txtObservation.setText(dog.getObservation());
        
        switch(dog.getAllergic()){
            case "---" -> jcbAllergic.setSelectedIndex(0);
            case "Yes" -> jcbAllergic.setSelectedIndex(1);
            case "No" -> jcbAllergic.setSelectedIndex(2);
            default -> jcbAllergic.setSelectedIndex(0);
        }

        switch(dog.getSpecial_attention()) {
            case "---" -> jcbSpecialAttention.setSelectedIndex(0);
            case "Yes" -> jcbSpecialAttention.setSelectedIndex(1);
            case "No" -> jcbSpecialAttention.setSelectedIndex(2);
            default -> jcbSpecialAttention.setSelectedIndex(0);
        }
    }
}
