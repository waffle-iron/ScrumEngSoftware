/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author felipe
 */



public class RegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterPanel
     */
    public RegisterPanel() {
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

        usuarioRegLabel = new javax.swing.JLabel();
        senhaRegLabel = new javax.swing.JLabel();
        cpfRegLabel = new javax.swing.JLabel();
        usuarioRegTextField = new javax.swing.JTextField();
        senhaRegTextField = new javax.swing.JTextField();
        cpfRegTextField = new javax.swing.JTextField();
        registrarRegButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sobreRegTextArea = new javax.swing.JTextArea();
        sobreRegLabel = new javax.swing.JLabel();
        nomeRegLabel = new javax.swing.JLabel();
        nomeRegTextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();

        usuarioRegLabel.setText("Usuario");

        senhaRegLabel.setText("Senha");

        cpfRegLabel.setText("CPF");

        usuarioRegTextField.setText("jTextField1");
        usuarioRegTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioRegTextFieldActionPerformed(evt);
            }
        });

        senhaRegTextField.setText("jTextField1");

        cpfRegTextField.setText("jTextField1");

        registrarRegButton.setText("Registrar");
        registrarRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRegButtonActionPerformed(evt);
            }
        });

        sobreRegTextArea.setColumns(20);
        sobreRegTextArea.setRows(5);
        jScrollPane1.setViewportView(sobreRegTextArea);

        sobreRegLabel.setText("Sobre");

        nomeRegLabel.setText("Nome");

        nomeRegTextField.setText("jTextField1");
        nomeRegTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeRegTextFieldActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeRegLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registrarRegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usuarioRegLabel)
                                    .addComponent(cpfRegLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sobreRegLabel)
                                        .addComponent(senhaRegLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usuarioRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senhaRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeRegLabel)
                            .addComponent(nomeRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioRegLabel)
                    .addComponent(usuarioRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaRegLabel)
                    .addComponent(senhaRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfRegLabel)
                    .addComponent(cpfRegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(sobreRegLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addComponent(registrarRegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioRegTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioRegTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioRegTextFieldActionPerformed

    private void registrarRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRegButtonActionPerformed
        // TODO add your handling code here:
       ConnectionProperties cp;
        cp = new ConnectionProperties("localhost","3306","id1537077_projectdb","id1537077_root","roottoor");
        
        ServerConnect sc = new ServerConnect();
        sc.setConnectionProp(cp);
        
        sc.QueryGeneric("SELECT * FROM Login WHERE usuario="+usuarioRegLabel.getText()+";");
    }//GEN-LAST:event_registrarRegButtonActionPerformed

    private void nomeRegTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeRegTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeRegTextFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpfRegLabel;
    private javax.swing.JTextField cpfRegTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeRegLabel;
    private javax.swing.JTextField nomeRegTextField;
    private javax.swing.JButton registrarRegButton;
    private javax.swing.JLabel senhaRegLabel;
    private javax.swing.JTextField senhaRegTextField;
    private javax.swing.JLabel sobreRegLabel;
    private javax.swing.JTextArea sobreRegTextArea;
    private javax.swing.JLabel usuarioRegLabel;
    private javax.swing.JTextField usuarioRegTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
