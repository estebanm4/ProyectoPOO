package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import javax.swing.JFrame;

public class ExeMapa_1 extends JFrame {
    
    public ExeMapa_1() {
        initUI();
    }

    private void initUI() {
        add(new Mapa_1());
        setSize(1303, 775);
        setTitle("Mapa_1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    /*public static void main(String[] args) {
        ExeMapa_1 ex = new ExeMapa_1();
        ex.setVisible(true);
       
    }*/
}