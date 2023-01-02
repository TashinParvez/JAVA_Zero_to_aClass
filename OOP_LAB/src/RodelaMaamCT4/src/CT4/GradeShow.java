/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CT4;

/**
 *
 * @author User
 */
public class GradeShow extends javax.swing.JFrame {

    /**
     * Creates new form GradeShow
     */
    public GradeShow() {
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
        lblTotal = new javax.swing.JLabel();
        Grade = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal.setText("Total");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 70, 30));

        Grade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Grade.setText("Grade :");
        jPanel1.add(Grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 30));

        lblGrade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGrade.setForeground(new java.awt.Color(0, 102, 102));
        lblGrade.setText("Grade");
        jPanel1.add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, 30));

        Total.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Total.setText("Total Marks :");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GradeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeShow().setVisible(true);
                           }
        });
    }
    public void setTotal(double z)
    {
        String a=String.valueOf(z);
      lblTotal.setText(a);
  }
    
    public void setGrade(String s)
    {
        lblGrade.setText(s);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Grade;
    private javax.swing.JLabel Total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
