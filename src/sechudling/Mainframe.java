
/*
 *   I am Ahmed Reda Mahfouz
 *   Student at the Faculty of Computing and Information Menoufia University 
 *   Department of Computer Science
 *
 *   *       Please Visit us at www.github.com/amahfouz50     *
 *  This Program was Developed by www.github.com/amahfouz50 forums Team
 *  *           Please Don't Remove This Comment       *
 */  

/**
 *
 *   @author Ahmed Mahfouz
 */

package sechudling;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import sun.applet.Main;


   
public class Mainframe extends javax.swing.JFrame {

    /**
     * Creates new form Mainframe
     */
    public Mainframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jLinkButton2 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton3 = new com.l2fprod.common.swing.JLinkButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sechudling (Ahmed Mahfouz)");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Adobe Arabic", 1, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Number of processes");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "fcfs", "RR", "SPN", "SRT", "HRRN", "FEEDBACK", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jXTable1.setSelectionBackground(new java.awt.Color(153, 0, 51));
        jScrollPane1.setViewportView(jXTable1);

        jLinkButton2.setForeground(new java.awt.Color(0, 0, 153));
        jLinkButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sechudling/driverpack-solution_9387.png"))); // NOI18N
        jLinkButton2.setText("Answer");
        jLinkButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLinkButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton2ActionPerformed(evt);
            }
        });

        jLinkButton3.setForeground(new java.awt.Color(153, 0, 0));
        jLinkButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sechudling/images.jpg"))); // NOI18N
        jLinkButton3.setText("Exit");
        jLinkButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLinkButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Choose the operation");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sechudling/twitter.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sechudling/facebook.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sechudling/googleplus.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(299, 299, 299)
                                        .addComponent(jLinkButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLinkButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLinkButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLinkButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("project of the Sechudling");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar();
       if(c<'0'||c>'9'){
           evt.consume();
       }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().isEmpty()){
        Object sechduling=jComboBox1.getSelectedItem();
        if(sechduling.equals("fcfs")){
          Object coulm[]={"process","aravial time","service time"};  
            DefaultTableModel tab=new DefaultTableModel(coulm, Integer.parseInt(jTextField1.getText()));
            jXTable1.setModel(tab);}
        
        else if(sechduling.equals("RR")){
            quantim=Double.parseDouble(JOptionPane.showInputDialog("enter quatim time"));
               Object coulm[]={"process","aravial time","burst time"}; 
            DefaultTableModel tab=new DefaultTableModel(coulm, Integer.parseInt(jTextField1.getText()));
            jXTable1.setModel(tab); 
        }
        else if(sechduling.equals("SPN")){
             Object coulm[]={"process","aravial time","burst time"}; 
            DefaultTableModel tab=new DefaultTableModel(coulm, Integer.parseInt(jTextField1.getText()));
            jXTable1.setModel(tab);
        }
        else if(sechduling.equals("SRT")){
             Object coulm[]={"process","aravial time","burst time"}; 
            DefaultTableModel tab=new DefaultTableModel(coulm, Integer.parseInt(jTextField1.getText()));
            jXTable1.setModel(tab);
        }
        else if(sechduling.equals("HRRN")){
           Object coulm[]={"process","aravial time","burst time"}; 
            DefaultTableModel tab=new DefaultTableModel(coulm, Integer.parseInt(jTextField1.getText()));
            jXTable1.setModel(tab);  
        }
        else if(sechduling.equals("FEEDBACK")){
             quantim=Double.parseDouble(JOptionPane.showInputDialog("enter quatim time"));
               Object coulm[]={"process","aravial time","burst time"}; 
            DefaultTableModel tab=new DefaultTableModel(coulm, Integer.parseInt(jTextField1.getText()));
            jXTable1.setModel(tab); 
        
        }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // 
    }//GEN-LAST:event_jLabel1MouseClicked
double quantim;
    private void jLinkButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton2ActionPerformed
        // TODO add your handling code here:
    
              Object sechduling=jComboBox1.getSelectedItem();
              int x=Integer.parseInt(jTextField1.getText());
       double arvialtime[]=new double[x];
        
  double burst[]=new  double[x];
      String process[]=new String[x];
        if(sechduling.equals("fcfs")){
            for(int i=0;i<x;i++){
       arvialtime[i]=Double.parseDouble(jXTable1.getValueAt(i, 1).toString());
          burst[i]=Double.parseDouble(jXTable1.getValueAt(i, 2).toString());
          process[i]=jXTable1.getValueAt(i, 0).toString();
            }
           Ranking rank=new Ranking(burst, arvialtime,process);
    FCFS fc=new FCFS(arvialtime, burst);
  new Print(fc.start, fc.end, process, fc.totalwait,fc.wait,process,fc.TurnaroundTime,fc.averagerTurnaround).setVisible(true); 
    } 
   else if(sechduling.equals("RR")){
              for(int i=0;i<x;i++){
       arvialtime[i]=Double.parseDouble(jXTable1.getValueAt(i, 1).toString());
          burst[i]=Double.parseDouble(jXTable1.getValueAt(i, 2).toString());
          process[i]=jXTable1.getValueAt(i, 0).toString();
            }
           Ranking rank=new Ranking(burst, arvialtime,process);
              Rod_robin rod =new Rod_robin(burst, quantim, process,arvialtime);
              
              new Print(rod.start1, rod.end1, rod.pr, rod.totalwait, rod.wait3,process,rod.TurnaroundTime,rod.averagerTurnaround).setVisible(true);
        }
   else if(sechduling.equals("SPN")){
          for(int i=0;i<x;i++){
       arvialtime[i]=Double.parseDouble(jXTable1.getValueAt(i, 1).toString());
          burst[i]=Double.parseDouble(jXTable1.getValueAt(i, 2).toString());
          process[i]=jXTable1.getValueAt(i, 0).toString();
            }
           Ranking rank=new Ranking(burst, arvialtime,process);
           Short_process_next sh=new Short_process_next(arvialtime, burst, process);
           new Print(sh.start, sh.end, process, sh.totalwait, sh.wait, process, sh.TurnaroundTime, sh.averagerTurnaround).setVisible(true);
   }
          else if(sechduling.equals("SRT")){
                 for(int i=0;i<x;i++){
       arvialtime[i]=Double.parseDouble(jXTable1.getValueAt(i, 1).toString());
          burst[i]=Double.parseDouble(jXTable1.getValueAt(i, 2).toString());
          process[i]=jXTable1.getValueAt(i, 0).toString();
            }
           Ranking rank=new Ranking(burst, arvialtime,process);
           Short_process_termining sh=new Short_process_termining(burst, process, arvialtime);
            new Print(sh.start1, sh.end1, sh.pr, sh.totalwait, sh.wait3,process,sh.TurnaroundTime,sh.averagerTurnaround).setVisible(true);
        }
          else if(sechduling.equals("HRRN")){
                for(int i=0;i<x;i++){
       arvialtime[i]=Double.parseDouble(jXTable1.getValueAt(i, 1).toString());
          burst[i]=Double.parseDouble(jXTable1.getValueAt(i, 2).toString());
          process[i]=jXTable1.getValueAt(i, 0).toString();
            }
           Ranking rank=new Ranking(burst, arvialtime,process);
           HrrN hrr=new HrrN(arvialtime, burst, process);
           new Print(hrr.start, hrr.end, process, hrr.totalwait, hrr.wait, process, hrr.TurnaroundTime, hrr.averagerTurnaround).setVisible(true);
          }
          else if(sechduling.equals("FEEDBACK")){
                        for(int i=0;i<x;i++){
       arvialtime[i]=Double.parseDouble(jXTable1.getValueAt(i, 1).toString());
          burst[i]=Double.parseDouble(jXTable1.getValueAt(i, 2).toString());
          process[i]=jXTable1.getValueAt(i, 0).toString();
            }
           Ranking rank=new Ranking(burst, arvialtime,process); 
 Feed_back rod =new Feed_back(burst, quantim, process,arvialtime);
              
              new Print(rod.start1, rod.end1, rod.pr, rod.totalwait, rod.wait3,process,rod.TurnaroundTime,rod.averagerTurnaround).setVisible(true);          }
    /*graphic c=new graphic("fcfs",fc.start, fc.end, process);

    c.pack();
        RefineryUtilities.centerFrameOnScreen(c);
        c.setVisible(true);*/
    }//GEN-LAST:event_jLinkButton2ActionPerformed

    private void jLinkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLinkButton3ActionPerformed

    Luncher c = new Luncher();
            
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        c.LaunchGoogle();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.LaunchTwitter();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        c.LaunchFacebook();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
             try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.l2fprod.common.swing.JLinkButton jLinkButton2;
    private com.l2fprod.common.swing.JLinkButton jLinkButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTable jXTable1;
    // End of variables declaration//GEN-END:variables
}
