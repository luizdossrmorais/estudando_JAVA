/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcbasic.auladois;

import javax.swing.JOptionPane;

/**
 *
 * @author luizd
 */
public class AulaDois extends javax.swing.JFrame {
    
    String sinal;
    int v1,v2,v3;
    
    
    /**
     * Creates new form AulaDois
     */
    public AulaDois() {
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

        lblTela = new javax.swing.JTextField();
        umButton = new javax.swing.JButton();
        doisButton = new javax.swing.JButton();
        trezButton = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        quatroButton1 = new javax.swing.JButton();
        cincoButton1 = new javax.swing.JButton();
        seisButton1 = new javax.swing.JButton();
        seteButton2 = new javax.swing.JButton();
        oitoButton2 = new javax.swing.JButton();
        noveButton2 = new javax.swing.JButton();
        totalV3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        umButton.setText("1");
        umButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umButtonActionPerformed(evt);
            }
        });

        doisButton.setText("2");
        doisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisButtonActionPerformed(evt);
            }
        });

        trezButton.setText("3");
        trezButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trezButtonActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        quatroButton1.setText("4");
        quatroButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroButton1ActionPerformed(evt);
            }
        });

        cincoButton1.setText("5");
        cincoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoButton1ActionPerformed(evt);
            }
        });

        seisButton1.setText("6");
        seisButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisButton1ActionPerformed(evt);
            }
        });

        seteButton2.setText("7");
        seteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteButton2ActionPerformed(evt);
            }
        });

        oitoButton2.setText("8");
        oitoButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoButton2ActionPerformed(evt);
            }
        });

        noveButton2.setText("9");
        noveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveButton2ActionPerformed(evt);
            }
        });

        totalV3.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTela, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalV3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oitoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quatroButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cincoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seisButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trezButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(totalV3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTela, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oitoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatroButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cincoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seisButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trezButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void umButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umButtonActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"1");
    }//GEN-LAST:event_umButtonActionPerformed

    private void doisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisButtonActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"2");
    }//GEN-LAST:event_doisButtonActionPerformed

    private void trezButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trezButtonActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"3");
    }//GEN-LAST:event_trezButtonActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        // TODO add your handling code here:
        
        
                     
        sinal = "SOMA";
         
        v1 = Integer.parseInt(lblTela.getText());
       
        System.out.println(v1);

        lblTela.setText("");
        
        // SOMAR
       int i = 0, valor = 0;
        double soma = 0;
        boolean x = Boolean.parseBoolean("SOMA");
        while(x){
            valor++;
            double aux = Double.parseDouble(lblTela.getText());
            soma = soma + aux;
            
            totalV3.setText(String.valueOf(soma));
            i = i++;
             
            if(x == false){
                sinal = "IGUAL";
            }
        }

        
        
        
    }//GEN-LAST:event_somaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        
        
        v2 = Integer.parseInt(lblTela.getText());
        lblTela.setText("");
        
        
        System.out.println(v2);
        
        if ("SOMA".equals(sinal)){
            
          v3 = (v1+v2);
          System.out.println(v3);
          lblTela.setText(String.valueOf(v3));
          totalV3.setText(String.valueOf(v1 +"+"+v2+"= "+v3));
                  
        }
        
    }//GEN-LAST:event_igualActionPerformed

    private void quatroButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroButton1ActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"4");
    }//GEN-LAST:event_quatroButton1ActionPerformed

    private void cincoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoButton1ActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"5");
    }//GEN-LAST:event_cincoButton1ActionPerformed

    private void seisButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisButton1ActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"6");
    }//GEN-LAST:event_seisButton1ActionPerformed

    private void seteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteButton2ActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"7");
    }//GEN-LAST:event_seteButton2ActionPerformed

    private void oitoButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoButton2ActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"8");
    }//GEN-LAST:event_oitoButton2ActionPerformed

    private void noveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveButton2ActionPerformed
        // TODO add your handling code here:
        lblTela.setText(lblTela.getText()+"9");
    }//GEN-LAST:event_noveButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AulaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AulaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AulaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AulaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AulaDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cincoButton1;
    private javax.swing.JButton doisButton;
    private javax.swing.JButton igual;
    private javax.swing.JTextField lblTela;
    private javax.swing.JButton noveButton2;
    private javax.swing.JButton oitoButton2;
    private javax.swing.JButton quatroButton1;
    private javax.swing.JButton seisButton1;
    private javax.swing.JButton seteButton2;
    private javax.swing.JButton soma;
    private javax.swing.JLabel totalV3;
    private javax.swing.JButton trezButton;
    private javax.swing.JButton umButton;
    // End of variables declaration//GEN-END:variables
}
