package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import Personajes.Arquero;
import Personajes.Knight;
import Personajes.Personajes;
import Personajes.Wizard;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import proyectopoo.ExeSelecMapa;

public class MapaJungla extends JPanel implements ActionListener {

    private final int piso = 220;
    private final int delay = 50;
    private Timer timer;
    private int secuencia;
    private int x = 0;
    private int xref1 = 530;
    private int xref2 = 700;
    private Personajes personaje;
    private Personajes p2;
//    private Personajes enemigo1;
//    private Personajes enemigo2;
//    private Personajes enemigo3;

    private ExeSelecMapa ventanaVolverSelecMapa;
    private JButton VolverSelecMapa;
    private JFrame ventana;

    public MapaJungla(JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initMapaVolcan();
        this.personaje = new Knight(10, 20,20,10,10,600);
        this.p2 = new Wizard(1100, 10, 20, 10, 10, 600);
        setFocusable(true);
        addKeyListener(new EventosTeclado());
    }

    private void initMapaVolcan() {
        setBackground(Color.WHITE);
        setLayout(null);

        VolverSelecMapa = new JButton(" SALIR ");
        VolverSelecMapa.setBounds(585, 640, 100, 25);
        VolverSelecMapa.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        VolverSelecMapa.setForeground(Color.BLACK);
        VolverSelecMapa.setBackground(Color.WHITE);
        VolverSelecMapa.addActionListener(this);
        this.add(VolverSelecMapa);
        
        

        this.timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("environment-preview_1.png");
        g.drawImage(fondo, 0, 0, 1280, 720, 0 + 500, 0, 600 + 500, 288, this);
        Image bee = loadImage("bee.gif");
        g.drawImage(bee, 1125, 350, this);
        g.drawImage(bee, 1125, 175, this);
        g.drawImage(bee, 1000, 150, -37, 39, this);
        Image piranha = loadImage("piranha-plant.gif");
        g.drawImage(piranha, 170, 355, -61, 45, this);
        Image slug = loadImage("slug.gif");
        g.drawImage(slug, 170 + 425, 380, 32, 21, this);
        Image plat = loadImage("tileset.png");
        g.drawImage(plat, 820, 300, 820 + 66, 300 + 80, 0, 160, 30 + 5, 190 + 5, this);
        g.drawImage(plat, 400, 200, 400 + 66, 200 + 80, 0, 160, 30 + 5, 190 + 5, this);
        
        this.personaje.pintarPersonaje(g);
        this.p2.pintarPersonaje(g);
//        this.enemigo1.pintarPersonaje(g);
//        this.enemigo2.pintarPersonaje(g);
//        this.enemigo3.pintarPersonaje(g);

        g.setColor(Color.DARK_GRAY);
        g.drawRect(60, 320, 65, 0); //H
        g.setColor(Color.DARK_GRAY);
        g.drawRect(125, 320, 0, 80); //V
        g.setColor(Color.DARK_GRAY);
        g.drawRect(125, 400, 35, 0); //H

        g.setColor(Color.DARK_GRAY);
        g.drawRect(165, 565, 160, 0); //Muerte espinas
        g.setColor(Color.DARK_GRAY);
        g.drawRect(335, 320, 65, 0); //H
        g.setColor(Color.DARK_GRAY);
        g.drawRect(400, 320, 0, 40); //V
        g.setColor(Color.DARK_GRAY);
        g.drawRect(400, 360, 75, 0); //H
        g.setColor(Color.DARK_GRAY);
        g.drawRect(475, 360, 0, 40); //V
        g.setColor(Color.DARK_GRAY);
        g.drawRect(475, 400, 230, 0); //H
        g.setColor(Color.DARK_GRAY);
        g.drawRect(638, 475, 0, 125); //V
        g.setColor(Color.DARK_GRAY);
        g.drawRect(638, 600, 342, 0); //H
        g.setColor(Color.DARK_GRAY);
        g.drawRect(980, 560, 0, 40); //V
        g.setColor(Color.DARK_GRAY);
        g.drawRect(980, 560, 275, 0); //H

        g.setColor(Color.DARK_GRAY);
        g.drawRect(400, 200, 60, 0); //Plataforma 1
        g.setColor(Color.DARK_GRAY);
        g.drawRect(820, 300, 60, 0); //Plataforma 2
        
        g.setColor(Color.green);
        g.fillRect(15, 15, xref1, 30);
        g.setColor(Color.green);
        g.fillRect(xref2, 15, 530, 30);

        g.setColor(Color.CYAN); // Este está por fuera de la pantalla, para que cuando se detecte la colisión, el personaje se detenda
        g.drawRect(0, 0, 1280, 720);
    }

    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.personaje.getPosY() < this.piso){
            this.personaje.setPosY(this.personaje.getPosY()+10);
        }
        if (this.p2.getPosY() < this.piso) {
            this.p2.setPosY(this.p2.getPosY() + 10);
        }
//        if(this.enemigo1.getPosY() < this.piso){
//            this.enemigo1.setPosY(this.enemigo1.getPosY()+10);
//        }
//        if(this.enemigo2.getPosY() < this.piso){
//            this.enemigo2.setPosY(this.enemigo2.getPosY()+10);
//        }
//        if(this.enemigo3.getPosY() < this.piso){
//            this.enemigo3.setPosY(this.enemigo3.getPosY()+10);
//        }

        repaint();
        if (e.getSource() == VolverSelecMapa) {
            try {
                ventanaVolverSelecMapa = new ExeSelecMapa();
            } catch (IOException ex) {
                Logger.getLogger(MapaJungla.class.getName()).log(Level.SEVERE, null, ex);
            }
            ventana.dispose();
            ventanaVolverSelecMapa.setVisible(true);
        }
    }
 private class EventosTeclado implements KeyListener{
@Override
        public void keyTyped(KeyEvent ke) {
            int key = ke.getKeyCode();

        }

        @Override
        public void keyPressed(KeyEvent ke) {
            int key = ke.getKeyCode();
            if (key == KeyEvent.VK_A) {
                personaje.moverIzquierda();
                System.err.println("A");
            }
            if (key == KeyEvent.VK_D) {
                personaje.moverDerecha();
                System.err.println("D");
            }
              if(key == KeyEvent.VK_LEFT){
                p2.moverIzquierda();
                System.err.println("izqda");
            }
            if(key == KeyEvent.VK_RIGHT){
                p2.moverDerecha();
                System.err.println("dcha");
            }

        }

        @Override
        public void keyReleased(KeyEvent ke) {
            int key = ke.getKeyCode();
            if (key == KeyEvent.VK_W) {
                personaje.saltar();
                System.err.println("W");
            }
            if(key == KeyEvent.VK_UP){
                p2.saltar();
                System.err.println("arriba");
            }
        }

    }
}

