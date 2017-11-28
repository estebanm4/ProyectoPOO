package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import javax.swing.JFrame;

public class ExeMapaJungla extends JFrame {
    
    public ExeMapaJungla() {
        initUI();
    }

    private void initUI() {
        add(new MapaJungla(this));
        setSize(1280, 720);
        setTitle("mapajungla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        ExeMapaJungla ex = new ExeMapaJungla();
        ex.setVisible(true);
    }
}
