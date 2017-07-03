/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import simulaciones.tp6.Controller;

/**
 *
 * @author gabrielneil
 */
public class CargaDatos extends javax.swing.JFrame {

    Controller controller;
    CargaTiempos cargaTiempos = new CargaTiempos();

    /**
     * Creates new form CargaDatos
     */
    public CargaDatos(Controller cont) {
        this.controller = cont;
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        desviacion_txt = new javax.swing.JTextField();
        media_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entranAComprar_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        entranAMesa_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sientaEnMesa_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        seRetira_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        aceptar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        editarTiempos_btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desde_txt = new javax.swing.JTextField();
        hasta_txt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        valorK_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        h_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Distribución de personas que entran: ");

        desviacion_txt.setText("2");

        media_txt.setText("10");

        jLabel4.setText("Cantidad que entra a comprar:");

        jLabel5.setText("Cantidad que entra a usar las mesas:");

        entranAComprar_txt.setText("60");

        jLabel6.setText("%");

        entranAMesa_txt.setText("40");

        jLabel7.setText("%");

        jLabel8.setText("Momento 1 (ingreso):");

        jLabel9.setText("Momento 2(luego de comprar):");

        jLabel10.setText("Cantidad que se sienta en una mesa:");

        sientaEnMesa_txt.setText("50");

        jLabel11.setText("%");

        jLabel12.setText("Cantidad que se retira:");

        seRetira_txt.setText("50");

        jLabel13.setText("%");

        aceptar_btn.setText("Aceptar");
        aceptar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_btnActionPerformed(evt);
            }
        });

        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        editarTiempos_btn.setText("Editar tiempos");
        editarTiempos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTiempos_btnActionPerformed(evt);
            }
        });

        jLabel14.setText("(");

        jLabel15.setText(";");

        jLabel16.setText(")");

        jLabel2.setText("Mostrar desde minuto:");

        jLabel3.setText("Mostrar hasta minuto:");

        desde_txt.setText("0");
        desde_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desde_txtActionPerformed(evt);
            }
        });

        hasta_txt.setText("60");

        jLabel17.setText("Valor de K:");

        valorK_txt.setText("11");

        jLabel18.setText("Valor de h:");

        h_txt.setText("0.01");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seRetira_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sientaEnMesa_txt)
                                    .addComponent(entranAMesa_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entranAComprar_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(media_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desviacion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(salir_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarTiempos_btn)
                                .addGap(18, 18, 18)
                                .addComponent(aceptar_btn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(252, 252, 252)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorK_txt)
                                    .addComponent(hasta_txt)
                                    .addComponent(desde_txt)
                                    .addComponent(h_txt))))
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(desviacion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(media_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(entranAComprar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(entranAMesa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sientaEnMesa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seRetira_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addComponent(desde_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hasta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(valorK_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(h_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptar_btn)
                            .addComponent(salir_btn))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editarTiempos_btn)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_btnActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(desde_txt.getText()) >= 0 && Integer.parseInt(hasta_txt.getText()) > Integer.parseInt(desde_txt.getText()) && valorK_txt.getText()!="" && Float.parseFloat(valorK_txt.getText()) != 0 && Float.parseFloat(valorK_txt.getText()) > 0 && Float.parseFloat(h_txt.getText()) != 0 && Float.parseFloat(h_txt.getText()) > 0 && h_txt.getText()!="" ) {

            if (Integer.parseInt(media_txt.getText()) >= 0 && Integer.parseInt(desviacion_txt.getText()) >= 0 && Integer.parseInt(entranAComprar_txt.getText()) >= 0 && Integer.parseInt(entranAMesa_txt.getText()) >= 0 && Integer.parseInt(sientaEnMesa_txt.getText()) >= 0 && Integer.parseInt(seRetira_txt.getText()) >= 0) {
                controller.valoresCargaTiempos(cargaTiempos.getTiempoTicket_txt(), cargaTiempos.getTiempoEspera_txt(), cargaTiempos.getTiempoConsumicion1_txt(), cargaTiempos.getTiempoConsumicion2_txt(), cargaTiempos.getTiempoUtilizacionMesa1_txt(), cargaTiempos.getTiempoUtilizacionMesa2_txt());
                controller.valoresCargaDatos(Integer.parseInt(media_txt.getText()), Integer.parseInt(desviacion_txt.getText()), Integer.parseInt(entranAComprar_txt.getText()), Integer.parseInt(entranAMesa_txt.getText()), Integer.parseInt(sientaEnMesa_txt.getText()), Integer.parseInt(seRetira_txt.getText()), Integer.parseInt(desde_txt.getText()), Integer.parseInt(hasta_txt.getText()), Float.parseFloat(valorK_txt.getText()), Float.parseFloat(h_txt.getText()));
                this.setVisible(false);
                controller.simulacion();
            } else {
                System.out.println("Alguno de los valores que ingresaste es inválido.");
            }
        } else {
            System.out.println("Problemas con los extremos");
        }
    }//GEN-LAST:event_aceptar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_salir_btnActionPerformed

    private void editarTiempos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTiempos_btnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        controller.valoresCargaDatos(Integer.parseInt(media_txt.getText()), Integer.parseInt(desviacion_txt.getText()), Integer.parseInt(entranAComprar_txt.getText()), Integer.parseInt(entranAMesa_txt.getText()), Integer.parseInt(sientaEnMesa_txt.getText()), Integer.parseInt(seRetira_txt.getText()), Integer.parseInt(desde_txt.getText()), Integer.parseInt(hasta_txt.getText()), Float.parseFloat(valorK_txt.getText()), Float.parseFloat(h_txt.getText()));
        cargaTiempos.setVisible(true);
    }//GEN-LAST:event_editarTiempos_btnActionPerformed

    private void desde_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desde_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desde_txtActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar_btn;
    private javax.swing.JTextField desde_txt;
    private javax.swing.JTextField desviacion_txt;
    private javax.swing.JButton editarTiempos_btn;
    private javax.swing.JTextField entranAComprar_txt;
    private javax.swing.JTextField entranAMesa_txt;
    private javax.swing.JTextField h_txt;
    private javax.swing.JTextField hasta_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField media_txt;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField seRetira_txt;
    private javax.swing.JTextField sientaEnMesa_txt;
    private javax.swing.JTextField valorK_txt;
    // End of variables declaration//GEN-END:variables
}
