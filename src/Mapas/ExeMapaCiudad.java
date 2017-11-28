package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import javax.swing.JFrame;

public class ExeMapaCiudad extends JFrame {
    
    public ExeMapaCiudad() {
        initUI();
    }

    private void initUI() {
        add(new MapaCiudad(this));
        setSize(1280, 720);
        setTitle("La Ciudad de La Furia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        ExeMapaCiudad ex = new ExeMapaCiudad();
        ex.setVisible(true);
    }
}
