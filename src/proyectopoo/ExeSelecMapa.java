/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class ExeSelecMapa extends JFrame{

    public ExeSelecMapa() {
        initUI();
    }

    private void initUI() {
        add(new Seleccion_Mapa(this));
        setSize(1303, 775);
        setTitle("SELECCION DE MAPA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}