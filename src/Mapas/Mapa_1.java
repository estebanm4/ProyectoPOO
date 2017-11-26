package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import proyectopoo.ExeSelecMapa;

public class Mapa_1 extends JPanel  implements ActionListener {

    private final int xRef = 0;
    private final int yRef = 0;
    private final int DELAY = 50;

    private Timer timer;
    private int x, y;
    private int secuencia;
    
    private ExeSelecMapa ventanaVolverSelecMapa;
    private JButton VolverSelecMapa;
    private JFrame ventana;    
    
    public Mapa_1 (JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initBoard();
    }

    private void initBoard() {
        setBackground(Color.WHITE);
        setLayout(null);
        
        VolverSelecMapa = new JButton(" SALIR ");
        VolverSelecMapa.setBounds(585, 640, 100, 25);
        VolverSelecMapa.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        VolverSelecMapa.setForeground(Color.BLACK);
        VolverSelecMapa.setBackground(Color.WHITE);
        VolverSelecMapa.addActionListener(this);
        this.add(VolverSelecMapa);
        
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
        g.setColor(Color.white);
        g.drawRect(320,165,450,0);
        g.setColor(Color.red);
        g.drawRect(830,165,130,0);
        g.setColor(Color.blue);
        g.drawRect(0,618,390,0);
        g.setColor(Color.yellow);
        g.drawRect(0,575,125,0);
        g.setColor(Color.orange);
        g.drawRect(65,300,125,0);
        g.setColor(Color.gray);
        g.drawRect(315,395,125,0);
        g.setColor(Color.white);
        g.drawRect(230,485,125,0);
        g.setColor(Color.CYAN);
        g.drawRect(700,440,125,0);
        g.setColor(Color.MAGENTA);
        g.drawRect(630,575,275,0);
        g.setColor(Color.PINK);
        g.drawRect(830,528,70,0);
        g.setColor(Color.red);
        g.drawRect(1025,620,250,0);
        g.setColor(Color.blue);
        g.drawRect(1018,348,145,0);
        g.setColor(Color.red);
        g.drawRect(1150,392,145,0);
        g.setColor(Color.yellow);
        g.drawRect(1230,170,60,0);
        g.setColor(Color.black);    //Escalera
        g.drawRect(800,163,0,275);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == VolverSelecMapa){
            ventanaVolverSelecMapa = new ExeSelecMapa();
            ventanaVolverSelecMapa.setVisible(true); ventana.dispose();
        }
        
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
