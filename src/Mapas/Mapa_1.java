package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Mapa_1 extends JPanel  implements ActionListener {

    private final int xRef = 0;
    private final int yRef = 0;
    private final int DELAY = 50;

    private Timer timer;
    private int x, y;
    private int secuencia;

    public Mapa_1 () {
        this.secuencia = 0;
        initBoard();
    }

    private void initBoard() {
        setBackground(Color.WHITE);
        x = xRef;
        y = yRef;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
                      
        Image fondo = loadImage("Mapa_1Final.png");
        
        g.drawImage(fondo, x, y, 1280, 720,this);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        /*x += 5;
        if(this.secuencia == 5){
          this.secuencia = 0;
        }else 
            this.secuencia++;
      
       if(x>=900)
           x = xRef;
       repaint();*/
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}
