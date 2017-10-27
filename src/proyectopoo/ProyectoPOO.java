package proyectopoo;

import javax.swing.JFrame;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class ProyectoPOO {

    public class Application extends JFrame {
    
    public Application() {
        
        initUI();
    }

    private void initUI() {
        add(new Board());
        setSize(1024, 512);
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public void main(String[] args) {
        Application ex = new Application();
        ex.setVisible(true);
       
    }
  }
}
