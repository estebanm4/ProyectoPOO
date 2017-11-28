package proyectopoo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class ExeSelecMapa extends JFrame{

    public ExeSelecMapa() {
        try {
            initUI();
        } catch (IOException ex) {
            Logger.getLogger(ExeSelecMapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initUI() throws IOException {
        add(new Seleccion_Mapa(this));
        setSize(1303, 775);
        setTitle("SELECCION DE MAPA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}