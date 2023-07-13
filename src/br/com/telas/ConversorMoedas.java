/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.telas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ConversorMoedas extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public ConversorMoedas() {
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
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        cbMoeda = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Moedas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Digite o valor:");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Escolha a moeda para conversão:");

        cbMoeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Real a Dólar", "Dólar a Real", "Real a Euro", "Euro a Real", "Real a Libras", "Libras a Real", "Real a Peso Argentino", "Peso Argentino a Real", "Real a Peso Chileno", "Peso Chileno a Real" }));

        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/money.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(cbMoeda, 0, 334, Short.MAX_VALUE)
                            .addComponent(txtValor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

// ...
        Double valor = Double.valueOf(txtValor.getText());

        if (null != cbMoeda.getSelectedItem().toString()) {
            switch (cbMoeda.getSelectedItem().toString()) {
                case "Real a Dólar": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(4.82);
                    BigDecimal resultado = BigDecimal.valueOf(valor).divide(taxaCambio, 2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Dólar é igual a: US$" + resultado.toString());
                    break;
                }
                case "Dólar a Real": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(4.82);
                    BigDecimal resultado = BigDecimal.valueOf(valor).multiply(taxaCambio).setScale(2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Real é igual a: R$" + resultado.toString());
                    break;
                }
                case "Real a Euro": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(5.36);
                    BigDecimal resultado = BigDecimal.valueOf(valor).divide(taxaCambio, 2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Euro é igual a: €" + resultado.toString());
                    break;
                }
                case "Euro a Real": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(5.36);
                    BigDecimal resultado = BigDecimal.valueOf(valor).multiply(taxaCambio).setScale(2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Real é igual a: R$" + resultado.toString());
                    break;
                }
                case "Real a Libras": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(6.26);
                    BigDecimal resultado = BigDecimal.valueOf(valor).divide(taxaCambio, 2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Libras é igual a: £" + resultado.toString());
                    break;
                }
                case "Libras a Real": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(6.26);
                    BigDecimal resultado = BigDecimal.valueOf(valor).multiply(taxaCambio).setScale(2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Real é igual a: R$" + resultado.toString());
                    break;
                }
                case "Real a Peso Argentino": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(0.18);
                    BigDecimal resultado = BigDecimal.valueOf(valor).divide(taxaCambio, 2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Peso Argentino é igual a: $" + resultado.toString());
                    break;
                }
                case "Peso Argentino a Real": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(0.18);
                    BigDecimal resultado = BigDecimal.valueOf(valor).multiply(taxaCambio).setScale(2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Real é igual a: R$" + resultado.toString());
                    break;
                }
                case "Real a Peso Chileno": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(0.59);
                    BigDecimal resultado = BigDecimal.valueOf(valor).divide(taxaCambio, 2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Peso Chileno é igual a: $" + resultado.toString());
                    break;
                }
                case "Peso Chileno a Real": {
                    BigDecimal taxaCambio = BigDecimal.valueOf(0.59);
                    BigDecimal resultado = BigDecimal.valueOf(valor).multiply(taxaCambio).setScale(2, RoundingMode.HALF_EVEN);
                    JOptionPane.showMessageDialog(this, "O valor em Real é igual a: R$" + resultado.toString());
                    break;
                }
                default:
                    break;
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentMoved

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Sair?", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            // Fecha a janela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        } else {
            // Cancela o fechamento da janela
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ConversorMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorMoedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorMoedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMoeda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
