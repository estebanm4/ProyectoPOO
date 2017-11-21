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
public class ExeConfig extends JFrame{

    public ExeConfig() {
        initUI();
    }

    private void initUI() {
        add(new Configuraciones(this));
        setSize(1303, 775);
        setTitle("Configuraciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}
