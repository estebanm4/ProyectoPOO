/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;
import javax.swing.JFrame;

public class ExeMapaJungla extends JFrame {
    
    public ExeMapaJungla() {
        initUI();
    }

    private void initUI() {
        add(new MapaJungla(this));
        setSize(1280, 720);
        setTitle("mapajungla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        ExeMapaJungla ex = new ExeMapaJungla();
        ex.setVisible(true);
    }
}
