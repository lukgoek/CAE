/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.cae;

import static java.lang.String.valueOf;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;

/**
 *
 * @author lugo
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Cita1Vez
     */
    public Registro() {
        initComponents();
        llenarSpinner();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNCuenta = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JCalendarCita = new com.toedter.calendar.JCalendar();
        lblFecha = new javax.swing.JLabel();
        barFormulario = new javax.swing.JProgressBar();
        spinerHora = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cita 1vez", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Numero de cuenta:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("e-mail");

        txtNombre.setToolTipText(""); // NOI18N

        btnRegistro.setText("Agendar");

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JCalendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCalendarCitaMouseClicked(evt);
            }
        });
        JCalendarCita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JCalendarCitaPropertyChange(evt);
            }
        });
        JCalendarCita.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                JCalendarCitaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        JCalendarCita.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JCalendarCitaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblFecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        spinerHora.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        spinerHora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.AM_PM));
        spinerHora.setToolTipText("");
        spinerHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spinerHoraFocusGained(evt);
            }
        });
        spinerHora.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinerHoraPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barFormulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2147483175, 2147483175, 2147483175))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtCelular)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtNCuenta)
                                    .addComponent(txtEmail)))
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCalendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(spinerHora, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JCalendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(barFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32037, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(740, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void llenarSpinner(){
            int horas=0, minutos=0;
            
            String horasMatriz[][] = new String[12][60];

            for(int i=0; i<12; i++){
                for(int j=0; j<60; j++){
                    
                    if(i<=9){
                        if(j<=9){
                            horasMatriz[i][j] = "0"+i+":0"+j;
                            System.out.println(horasMatriz[i][j]);
                        }else{
                            horasMatriz[i][j] = "0"+i+":"+j;
                            System.out.println(horasMatriz[i][j]);  
                        }
                        
                        
                    }else{
                        if(j<=9){
                            horasMatriz[i][j] = i+":0"+j;
                            System.out.println(horasMatriz[i][j]);
                        }else{
                            horasMatriz[i][j] = i+":"+j;
                            System.out.println(horasMatriz[i][j]);
                        }
                    }
                    
                }
            }
                
            
           /* horas =""+horas+":"+minutos
            spinerHora.setModel();
            */
            
        }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!txtNombre.getText().isEmpty() || !txtNCuenta.getText().isEmpty() || !txtTelefono.getText().isEmpty() || !txtCelular.getText().isEmpty() || !txtEmail.getText().isEmpty()){
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Realmente decea limpiar el formulario?");

            if(confirm == 1){
                txtNombre.setText("");
                txtNCuenta.setText("");
                txtCelular.setText("");
                txtTelefono.setText("");
                txtEmail.setText("");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JCalendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCalendarCitaMouseClicked

    }//GEN-LAST:event_JCalendarCitaMouseClicked

    private void JCalendarCitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JCalendarCitaPropertyChange
        Calendar diaActualCalendar = Calendar.getInstance();
        diaActualCalendar.add(Calendar.DATE, -1);
        Date diaActual = diaActualCalendar.getTime();

        Date diaCita = JCalendarCita.getDate();

        //System.out.println("Dia cita "+diaCita);
        //System.out.println("Dia actual "+diaActual);

        if(diaCita.before(diaActual)){
            JOptionPane.showMessageDialog(null, "Imposible realizar cita en esa fecha.",  "Algo ha salido mal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //iniciando de domingo
        String diaSemanaLetra = "";
        String MesLetra = "";

        String diaNumero = valueOf(JCalendarCita.getCalendar().get(Calendar.DATE));
        int diaSemana = JCalendarCita.getCalendar().get(Calendar.DAY_OF_WEEK);
        int mes = JCalendarCita.getCalendar().get(Calendar.MONTH);
        int año = JCalendarCita.getCalendar().get(Calendar.YEAR);

        switch(diaSemana){
            case 1:
            diaSemanaLetra = "Domingo";
            JOptionPane.showMessageDialog(null, "Citas no disponibles para fines de semana.",  "Algo ha salido mal", JOptionPane.ERROR_MESSAGE);
            return;
            case 2:
            diaSemanaLetra = "Lunes";
            break;
            case 3:
            diaSemanaLetra = "Martes";
            break;
            case 4:
            diaSemanaLetra = "Miercoles";
            break;
            case 5:
            diaSemanaLetra = "Jueves";
            break;
            case 6:
            diaSemanaLetra = "Viernes";
            break;
            case 7:
            diaSemanaLetra = "Sabado";
            JOptionPane.showMessageDialog(null, "Citas no disponibles para fines de semana.",  "Algo ha salido mal", JOptionPane.ERROR_MESSAGE);
            return;
            default:
            return;

        }

        //para mes
        switch(mes){
            case 0: MesLetra = "Enero";
            break;
            case 1: MesLetra = "Febrero";
            break;
            case 2: MesLetra = "Marzo";
            break;
            case 3: MesLetra = "Abril";
            break;
            case 4: MesLetra = "Mayo";
            break;
            case 5: MesLetra = "Junio";
            break;
            case 6: MesLetra = "Julio";
            break;
            case 7: MesLetra = "Agosto";
            break;
            case 8: MesLetra = "Septiembre";
            break;
            case 9: MesLetra = "Octubre";
            break;
            case 10: MesLetra = "Noviembre";
            break;
            case 11: MesLetra = "Diciembre";
            break;
        }

        lblFecha.setText(diaSemanaLetra+", "+diaNumero+" de "+MesLetra+" del "+año);

    }//GEN-LAST:event_JCalendarCitaPropertyChange

    private void JCalendarCitaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JCalendarCitaCaretPositionChanged
        //System.out.println("Febrero");
    }//GEN-LAST:event_JCalendarCitaCaretPositionChanged

    private void JCalendarCitaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JCalendarCitaAncestorAdded
        
    }//GEN-LAST:event_JCalendarCitaAncestorAdded

    private void spinerHoraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinerHoraPropertyChange
       System.out.println("entro");
        spinerHora.keyDown(null, WIDTH);
        
        
        
        
    }//GEN-LAST:event_spinerHoraPropertyChange

    private void spinerHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spinerHoraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_spinerHoraFocusGained

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar JCalendarCita;
    private javax.swing.JProgressBar barFormulario;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JSpinner spinerHora;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNCuenta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
