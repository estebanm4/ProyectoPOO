package proyectopoo;

import javax.swing.JFrame;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class ExeConfig extends JFrame{

    public ExeConfig() {
        initUI();
    }

    private void initUI() {
        add(new Configuraciones(this));
        setSize(1303, 775);
        setTitle("Configuraciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}
