/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class ExeSelecMapa extends JFrame{

    public ExeSelecMapa() {
        try {
            initUI();
        } catch (IOException ex) {
            Logger.getLogger(ExeSelecMapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initUI() throws IOException {
        add(new Seleccion_Mapa(this));
        setSize(1303, 775);
        setTitle("SELECCION DE MAPA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}