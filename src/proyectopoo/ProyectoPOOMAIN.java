/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author lenovo
 */
import javax.swing.JFrame;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class ProyectoPOOMAIN extends JFrame{ 
    
    public ProyectoPOOMAIN() {
        initUI();
    }

    private void initUI() {
        
        add(new Board());
        setSize(1024, 512);
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }    

    public static void main(String[] args) {
        ProyectoPOOMAIN ex = new ProyectoPOOMAIN();
        ex.setVisible(true);
        ex.initUI();
    }
    
}
