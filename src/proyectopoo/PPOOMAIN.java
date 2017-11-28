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
public class PPOOMAIN extends JFrame{ 
    
    // Atributos
    
    public PPOOMAIN()  {
        initUI();
    }

    private void initUI()  {
        add(new Menu_Inicio(this));
        setSize(1296, 750);
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    

    public static void main(String[] args) {
        PPOOMAIN ex = new PPOOMAIN();
        ex.setVisible(true);
        ex.initUI();
    }
}   
