/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;
import javax.swing.JFrame;

public class ExeMapaCiudad extends JFrame {
    
    public ExeMapaCiudad() {
        initUI();
    }

    private void initUI() {
        add(new MapaCiudad(this));
        setSize(1280, 720);
        setTitle("mapaciudad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        ExeMapaCiudad ex = new ExeMapaCiudad();
        ex.setVisible(true);
    }
}
