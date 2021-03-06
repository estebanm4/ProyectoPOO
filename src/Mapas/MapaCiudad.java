package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import Personajes.Arquero;
import Personajes.Knight;
import Personajes.Personajes;
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

public class MapaCiudad extends JPanel implements ActionListener {

    private final int piso = 530;
    private final int delay = 40;
    private Timer timer;
    private final int secuencia;
    private final int x = 0;
    private int xref1 = 530;
    private int xref2 = 700;    
    private Personajes personaje;
    private Personajes p2;

    private ExeSelecMapa ventanaVolverSelecMapa;
    private JButton VolverSelecMapa;
    private JFrame ventana;

    public MapaCiudad(JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initMapaVolcan();
        this.personaje = new Arquero(10, 20, 20, 10, 10, 600);
        this.p2 = new Knight(1100, 1100, 20, 10, 10, 600);
        //Hilos hilo1 = new Hilos("Asd");
        setFocusable(true);
        addKeyListener(new EventosTeclado());
    }

    private void dibujo (Personajes personaje1) {
        new Thread() {
            @Override
            public void run() {
                setFocusable(true);
        addKeyListener(new EventosTeclado());
            }
        }.start();
    }
    
    private void dibujar(Personajes personajes){
        dibujo(this.personaje);
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
        Image fondo = loadImage("environment-preview.png");
        g.drawImage(fondo, 0, 0, 1280, 720, 0 + 500, 0, 600 + 500, 288, this);
        this.personaje.pintarPersonaje(g);
        this.p2.pintarPersonaje(g);
//        this.enemigo2.pintarPersonaje(g);
//        this.enemigo3.pintarPersonaje(g);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(1155, 560, 60, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(1140, 480, 65, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(0, 630, 1253, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(710, 463, 165, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(530, 463, 70, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(490, 550, 150, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(845, 383, 135, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(100, 555, 113, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(268, 485, 50, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(405, 410, 50, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(255, 340, 80, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(155, 275, 50, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(225, 185, 80, 0);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(35, 185, 80, 0);
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

        if (this.personaje.getPosY() < this.piso) {
            this.personaje.setPosY(this.personaje.getPosY() + 10);
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
                Logger.getLogger(MapaCiudad.class.getName()).log(Level.SEVERE, null, ex);
            }

            ventanaVolverSelecMapa.setVisible(true);
            ventana.dispose();
        }
    }

    private class EventosTeclado implements KeyListener {

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
