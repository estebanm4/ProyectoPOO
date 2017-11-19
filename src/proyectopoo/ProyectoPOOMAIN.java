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
    
    // Atributos
    public ProyectoPOOMAIN() {
        initUI();
    }

    private void initUI() {
        add(new Menu_Inicio(this));
        setSize(1024, 512);
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        /*add(new MapaVolcan());
        setSize(1280, 720);
        setTitle("mapavolcan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);*/
        
    }    

    public static void main(String[] args) {
        ProyectoPOOMAIN ex = new ProyectoPOOMAIN();
        ex.setVisible(true);
        ex.initUI();
    }
}
