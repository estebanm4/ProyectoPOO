/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;
import javax.swing.JFrame;

public class ExeMapaVolcan extends JFrame {
    
    public ExeMapaVolcan() {

        initUI();
    }

    private void initUI() {
        add(new MapaVolcan(this));
        setSize(1280, 720);
        setTitle("mapavolcan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        ExeMapaVolcan ex = new ExeMapaVolcan();
        ex.setVisible(true);
    }
}
