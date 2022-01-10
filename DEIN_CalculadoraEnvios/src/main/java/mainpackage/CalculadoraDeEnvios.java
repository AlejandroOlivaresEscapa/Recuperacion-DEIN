package mainpackage;

/**
 *
 * @author Alejandro
 */
public class CalculadoraDeEnvios extends javax.swing.JFrame {

    private double precioacumulado, preciototal, a;
    private double valordeclarado, avisorecibo;

    public CalculadoraDeEnvios() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboEnvio = new javax.swing.JComboBox<>();
        jComboServicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonCalc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboPeso = new javax.swing.JComboBox<>();
        jTextField = new javax.swing.JTextField();
        jCheckBoxRecibo = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboEnvio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Internacional" }));

        jComboServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar", "Urgente", "Certificado", "Urgente-Certificado" }));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo de envío:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de servicio:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Peso en gramos:");

        BotonCalc.setText("Calcular precio");
        BotonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor declarado");

        jComboPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-20 g", "20-50 g", "50-100 g", "100-500g", "500-1000 g", "1000-2000 g" }));

        jCheckBoxRecibo.setText("Aviso de recibo");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CALCULADORA PARA ENVÍOS DE CARTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboServicio, javax.swing.GroupLayout.Alignment.TRAILING, 0, 295, Short.MAX_VALUE)
                            .addComponent(jComboEnvio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboPeso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxRecibo)
                .addGap(36, 36, 36)
                .addComponent(BotonCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcActionPerformed

        boolean preciovalido;

        a = 0; // la var a es igual al peso
        precioacumulado = 0;
        preciototal = 0;
        valordeclarado = 0;
        avisorecibo = 0;

        if (jComboServicio.getSelectedIndex() == 0 && jComboEnvio.getSelectedIndex() == 0) {
            if (a <= 20) {
                precioacumulado = 0.70;
            } else if (a > 20 && a <= 50) {
                precioacumulado = 0.80;
            } else if (a > 50 && a <= 100) {
                precioacumulado = 1.25;
            } else if (a > 100 && a <= 500) {
                precioacumulado = 2.50;
            } else if (a > 500 && a <= 1000) {
                precioacumulado = 5.15;
            } else if (a > 1000 && a <= 2000) {
                precioacumulado = 5.60;
            } else {
                preciovalido = false;
            }

        } else if (jComboServicio.getSelectedIndex() == 1) {
            if (a <= 20) {
                precioacumulado = 4.10;
            } else if (a > 20 && a <= 50) {
                precioacumulado = 4.22;
            } else if (a > 50 && a <= 100) {
                precioacumulado = 4.74;
            } else if (a > 100 && a <= 500) {
                precioacumulado = 6.38;
            } else {
                preciovalido = false;
            }

        } else if (jComboServicio.getSelectedIndex() == 2) {
            if (a <= 20) {
                precioacumulado = 4.15;
            } else if (a > 20 && a <= 50) {
                precioacumulado = 4.25;
            } else if (a > 50 && a <= 100) {
                precioacumulado = 4.70;
            } else if (a > 100 && a <= 500) {
                precioacumulado = 5.95;
            } else if (a > 500 && a <= 1000) {
                precioacumulado = 8.60;
            } else if (a > 1000 && a <= 2000) {
                precioacumulado = 9.05;
            } else {
                preciovalido = false;
            }

        } else if (jComboServicio.getSelectedIndex() == 3) {
            if (a <= 20) {
                precioacumulado = 8.28;
            } else if (a > 20 && a <= 50) {
                precioacumulado = 8.40;
            } else if (a > 50 && a <= 100) {
                precioacumulado = 8.92;
            } else if (a > 100 && a <= 500) {
                precioacumulado = 10.55;
            } else if (a > 500 && a <= 1000) {
                precioacumulado = 14.00;
            } else if (a > 1000 && a <= 2000) {
                precioacumulado = 14.58;
            } else {
                preciovalido = false;
            }

            valordeclarado = Integer.valueOf(jTextField.getText());

            if (jCheckBoxRecibo.isSelected()) {
                avisorecibo = 1.94;
            }

            preciototal = precioacumulado + valordeclarado + avisorecibo;
            String precioString = String.valueOf(preciototal);
            jTextField1.setText(precioString);

            // TRAS DARLE INNUMERABLES VUELTAS NO ESTIENDO PORQUE NO MUESTRA EL RESULTADO EN EL TEXTFIELD
            // PERO HE COMPROBADO QUE TODOS LOS DATOS Y VARIABLES SEAN CORRECTAS Y DARLES EL MEJOR USO POSIBLE
    }//GEN-LAST:event_BotonCalcActionPerformed
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDeEnvios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraDeEnvios().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalc;
    private javax.swing.JCheckBox jCheckBoxRecibo;
    private javax.swing.JComboBox<String> jComboEnvio;
    private javax.swing.JComboBox<String> jComboPeso;
    private javax.swing.JComboBox<String> jComboServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
