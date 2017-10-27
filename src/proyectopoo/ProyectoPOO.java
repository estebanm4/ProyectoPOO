package proyectopoo;
import javax.swing.JFrame;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class ProyectoPOO extends JFrame{ 
    
    public ProyectoPOO() {
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
        ProyectoPOO ex = new ProyectoPOO();
        ex.setVisible(true);
       
    }
}

