/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
********************************************************************************
********************************************************************************
********************************************************************************
NOTAS:
Para que funcione la libreria de PanamaHitek_Arduino que facilita la comunicacion
Serial entre Arduino y Java y viceversa, hay que tener instalado Java 1.8 de 32 bits y el
IDE de Netbeans 8.2, la libreria de PanamaHitek_Arduino es la version 3.0 Para que todo funcione.
********************************************************************************
********************************************************************************
********************************************************************************
 */
package com.edgarmayorga.principal;

import com.edgarmayorga.recibirRX.RecibirDatos;
import com.edgarmayorga.rxtx.RecibirTransmitirRXTX;
import com.edgarmayorga.transmitirTX.TransmitirDatos;

/**
 *
 * @author ZReti
 */
public class Principal {
    public static void main(String[] args){
//        TransmitirDatos transmitir = new TransmitirDatos();
//        transmitir.setVisible(true);
        
//        RecibirDatos recibir = new RecibirDatos();
//        recibir.setVisible(true);

        RecibirTransmitirRXTX recepciontransmision = new RecibirTransmitirRXTX();
        recepciontransmision.setVisible(true);
    }
}
