package proyectopoo;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import java.io.IOException;
import javax.swing.JFrame;

public class ExeSelecPersonaje extends JFrame {
    
    public ExeSelecPersonaje() throws IOException {
        
            initUI();
       
    }

    private void initUI() throws IOException {
        add(new Seleccion_Personaje(this));
        setSize(1303, 775);
        setTitle("SELECCION DE PERSONAJE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}