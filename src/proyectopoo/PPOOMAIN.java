package proyectopoo;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import javax.swing.JFrame;

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
