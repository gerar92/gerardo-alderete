/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads3;

import java.util.Calendar;

/**
 *
 * @author T-
 */
public class FormitaReloj extends javax.swing.JFrame {

    /**
     * Creates new form FormitaReloj
     */
    public FormitaReloj() {
        initComponents();
            Thread t1 = new Thread( new Runnable() {
            @Override
            public void run() {
                
                int contador = 0;
                int alto = 300;
                int ancho = 300;
                
                while (true) {
                    try{
                        
                        Calendar cal = Calendar.getInstance();
                        int hora = cal.get(Calendar.HOUR_OF_DAY);
                        int minuto = cal.get(Calendar.MINUTE);
                        int segundo = cal.get(Calendar.SECOND);
                        algo.setText("" + hora + ":" + minuto + ":"+ segundo);
                        Thread.sleep(1000);
                        
                        
                        setSize(alto,ancho);
                        
                        alto -= contador;
                        ancho -= contador;
                        
                        if( alto <= 0 || ancho <= 0 ){
                            dispose();
                        }
                        
                        contador += 2;
                        
                        
//                        if( segundo == 1 ){
//                            dispose();
//                        }
                    }catch(Exception e){
                        
                    }
                }
            }
        }
        );
        
        
        t1.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        algo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                load(evt);
            }
        });

        algo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        algo.setText("hora");
        algo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                algoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(algo)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(algo)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        algo.getAccessibleContext().setAccessibleName("jlHora");
        algo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void algoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_algoMouseClicked
        // TODO add your handling code here:
 
         
    }//GEN-LAST:event_algoMouseClicked

    private void load(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_load
        // TODO add your handling code here:
    }//GEN-LAST:event_load

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
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormitaReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormitaReloj().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel algo;
    // End of variables declaration//GEN-END:variables
    
}

