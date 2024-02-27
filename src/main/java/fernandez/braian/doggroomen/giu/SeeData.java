
package fernandez.braian.doggroomen.giu;

import fernandez.braian.doggroomen.logic.ControllerLogic;
import fernandez.braian.doggroomen.logic.Dogs;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeeData extends javax.swing.JFrame {
    
    ControllerLogic Control = null;
    int xMouse, yMouse;
    
    public SeeData() {
        Control = new ControllerLogic();
        initComponents();
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
        PanelButtom = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDogs = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTop.setBackground(new java.awt.Color(102, 102, 102));
        PanelTop.setForeground(new java.awt.Color(255, 255, 255));
        PanelTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEE DATA");
        PanelTop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, 620, 50));

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
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(MovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MovLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PanelTop.add(Mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        getContentPane().add(PanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        PanelButtom.setBackground(new java.awt.Color(102, 102, 102));
        PanelButtom.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Exit.png")); // NOI18N
        btnExit.setText(" Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tableDogs.setBackground(new java.awt.Color(51, 51, 51));
        tableDogs.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        tableDogs.setForeground(new java.awt.Color(255, 255, 255));
        tableDogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableDogs);

        btnEdit.setBackground(new java.awt.Color(51, 51, 51));
        btnEdit.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Edit.png")); // NOI18N
        btnEdit.setText(" Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Update.png")); // NOI18N
        btnUpdate.setText(" Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete1.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\Delete.png")); // NOI18N
        btnDelete1.setText(" Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtomLayout = new javax.swing.GroupLayout(PanelButtom);
        PanelButtom.setLayout(PanelButtomLayout);
        PanelButtomLayout.setHorizontalGroup(
            PanelButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtomLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(PanelButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelButtomLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelButtomLayout.setVerticalGroup(
            PanelButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtomLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(PanelButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        getContentPane().add(PanelButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        DogGroomer WindowsDogGroomer = new DogGroomer();
        WindowsDogGroomer.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        loadTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        // Table control and select control
        if(tableDogs.getRowCount() > 0){
            if(tableDogs.getSelectedRow()!=-1){
                
                // Get the id of the pet to delete
                int number_Client = Integer.parseInt(String.valueOf(tableDogs.getValueAt(tableDogs.getSelectedRow(),0)));
                
                EditData WindowsEditData = new EditData(number_Client);
                WindowsEditData.setVisible(true);
                WindowsEditData.setLocationRelativeTo(null);
                dispose();
            }
            else{
                seeMeseger("No pet selected", "Error", "error when edit");
            }
        }
        else{
            seeMeseger("there is no pet to edit","Error","Out of Stock");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void MovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MovMousePressed

    private void MovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_MovMouseDragged

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        
        // Table control and select control
        if(tableDogs.getRowCount() > 0){
            if(tableDogs.getSelectedRow()!=-1){
                
                // Get the id of the pet to delete
                int number_Client = Integer.parseInt(String.valueOf(tableDogs.getValueAt(tableDogs.getSelectedRow(),0)));
                Control.deleteDogs(number_Client);
                loadTable();
                seeMeseger("pet removed correctly","Info","delete pet");
            }
            else{
                seeMeseger("No pet selected", "Error", "error when delete");
            }
        }
        else{
            seeMeseger("there is no pet to delete","Error","Out of Stock");
        }
        
    }//GEN-LAST:event_btnDelete1ActionPerformed

    public void seeMeseger(String messager, String type, String title){
        JOptionPane optionPane = new JOptionPane(messager);
        if(type.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(type.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    };
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mov;
    private javax.swing.JPanel PanelButtom;
    private javax.swing.JPanel PanelTop;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel btnPosition;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDogs;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        // Define table model
        DefaultTableModel boardModel = new DefaultTableModel(){
            // Fixed rows and columns
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        // Column
        String Title[] = {"Number", "Name", "Color", "Race", "Allergic", "Special Attention", "Owner", "Cell Owner"};
        boardModel.setColumnIdentifiers(Title);
        
        // Load data
        List <Dogs> listDogs = Control.bringDogs();
        
        // Scroll list
        if (listDogs != null){
            for(Dogs dogs : listDogs){
                Object[] ObjectDogs = {
                    dogs.getNumber_client(),
                    dogs.getName(),
                    dogs.getColor(),
                    dogs.getRace(),
                    dogs.getAllergic(),
                    dogs.getSpecial_attention(),
                    dogs.getOneOnwer().getName(),
                    dogs.getOneOnwer().getOwner_Cell_Phone()
                };
                boardModel.addRow(ObjectDogs);
            }
        }
        tableDogs.setModel(boardModel);
    }
}
