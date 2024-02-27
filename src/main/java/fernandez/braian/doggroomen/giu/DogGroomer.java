
package fernandez.braian.doggroomen.giu;

import javax.swing.JFrame;

public class DogGroomer extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public DogGroomer() {
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
        PanelLeft = new javax.swing.JPanel();
        btnLoadData = new javax.swing.JButton();
        btnSeeData = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        PanelRight = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTop.setBackground(new java.awt.Color(102, 102, 102));
        PanelTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOG DROOMER");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelTop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

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

        btnPosition.setBackground(new java.awt.Color(102, 102, 102));
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

        getContentPane().add(PanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelLeft.setBackground(new java.awt.Color(102, 102, 102));

        btnLoadData.setBackground(new java.awt.Color(51, 51, 51));
        btnLoadData.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnLoadData.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadData.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\LoadData.png")); // NOI18N
        btnLoadData.setText("LOAD DATA");
        btnLoadData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoadData.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        btnSeeData.setBackground(new java.awt.Color(51, 51, 51));
        btnSeeData.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnSeeData.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeData.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Icon\\See Data.png")); // NOI18N
        btnSeeData.setText("SEE DATA");
        btnSeeData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeeData.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSeeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDataActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
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
                .addGap(25, 25, 25)
                .addGroup(PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeeData, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanelLeftLayout.setVerticalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLeftLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSeeData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 400));

        PanelRight.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Braia\\OneDrive\\Documentos\\Programing Proyect\\Java\\DogGroomen\\src\\main\\resources\\images\\Image\\DogGroomer.png")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelRightLayout = new javax.swing.GroupLayout(PanelRight);
        PanelRight.setLayout(PanelRightLayout);
        PanelRightLayout.setHorizontalGroup(
            PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRightLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelRightLayout.setVerticalGroup(
            PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRightLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(PanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed
        LoadData WindowsLoadData = new LoadData();
        WindowsLoadData.setVisible(true);
    }//GEN-LAST:event_btnLoadDataActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSeeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDataActionPerformed
        SeeData WindowsSeeData = new SeeData();
        WindowsSeeData.setVisible(true);
    }//GEN-LAST:event_btnSeeDataActionPerformed

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
    private javax.swing.JPanel Mov;
    private javax.swing.JPanel PanelLeft;
    private javax.swing.JPanel PanelRight;
    private javax.swing.JPanel PanelTop;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JLabel btnPosition;
    private javax.swing.JButton btnSeeData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
