package proyectopoo;

import java.io.IOException;
import javax.swing.JFrame;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class ExeSelecMapa extends JFrame{

    public ExeSelecMapa() throws IOException  {
            initUI();
    }

    private void initUI() throws IOException  {
        add(new Seleccion_Mapa(this));
        setSize(1303, 775);
        setTitle("SELECCION DE MAPA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}
