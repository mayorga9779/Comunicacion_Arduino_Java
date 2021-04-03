/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edgarmayorga.recibirRX;

import com.edgarmayorga.transmitirTX.TransmitirDatos;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author ZReti
 */
public class RecibirDatos extends javax.swing.JFrame {

    PanamaHitek_Arduino comunicacionSerial = new PanamaHitek_Arduino();
    //Escuchando la actividad en el puerto serial
    SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                /*es true en el momento que desde arduino reciba un mensaje, o que arduino envia un mensaje
                cuando se utiliza el println en el puerto serial, en Arduino, se envian 2 bytes, el byte 13 y el byte 10, enter y retroceso.
                En el momento que se recibe el los caracteres 13 y 10, se sabe que ya se ha completado la recepcion del mensaje, y el metodo es true*/
                if (comunicacionSerial.isMessageAvailable()) {
                    System.out.println(comunicacionSerial.printMessage());
                }
            } catch (SerialPortException ex) {
                Logger.getLogger(TransmitirDatos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(TransmitirDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    /**
     * Creates new form RecibirDatos
     */
    public RecibirDatos() {
        initComponents();
        
        try {
            //para recibir datos de Arduino
            comunicacionSerial.arduinoRX("COM4", 9600, listener);   
        } catch (ArduinoException ex) {
            Logger.getLogger(RecibirDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(RecibirDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOn = new javax.swing.JButton();
        btnOff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnOn.setText("ON LED");
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });
        getContentPane().add(btnOn);
        btnOn.setBounds(40, 20, 140, 60);

        btnOff.setText("OFF LED");
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });
        getContentPane().add(btnOff);
        btnOff.setBounds(210, 20, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        
    }//GEN-LAST:event_btnOnActionPerformed

    private void btnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffActionPerformed
        
    }//GEN-LAST:event_btnOffActionPerformed

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
            java.util.logging.Logger.getLogger(RecibirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecibirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecibirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecibirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecibirDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOff;
    private javax.swing.JButton btnOn;
    // End of variables declaration//GEN-END:variables
}