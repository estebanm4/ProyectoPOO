package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import Personajes.Arquero;
import Personajes.Knight_2;
import Personajes.Personajes;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
    private Personajes personaje;
//    private Personajes enemigo1;
//    private Personajes enemigo2;
//    private Personajes enemigo3;
    private final int piso = 400;

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
        this.personaje = new Knight_2(10, 20,20,10,10,600);
        setFocusable(true);
        addKeyListener(new EventosTeclado());
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
        g.setColor(Color.blue); // Este está por fuera de la pantalla, para que cuando se detecte la colisión, el personaje muera
        g.drawRect(0, 0, 1280, 720);
        
        this.personaje.pintarPersonaje(g);
//        this.enemigo1.pintarPersonaje(g);
//        this.enemigo2.pintarPersonaje(g);
//        this.enemigo3.pintarPersonaje(g);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(this.personaje.getPosY() < this.piso){
            this.personaje.setPosY(this.personaje.getPosY()+10);
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
        
        if(e.getSource() == VolverSelecMapa){
            ventanaVolverSelecMapa = new ExeSelecMapa();
            ventanaVolverSelecMapa.setVisible(true); ventana.dispose();
        }
        
       
       repaint();
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
        private class EventosTeclado implements KeyListener{

        @Override
        public void keyTyped(KeyEvent ke) {
        int key = ke.getKeyCode();    
        
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            int key = ke.getKeyCode();
            if(key == KeyEvent.VK_A){
                personaje.moverIzquierda();
                System.err.println("A");
            }
            if(key == KeyEvent.VK_D){
                personaje.moverDerecha();
                System.err.println("D");
            }
            
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            int key = ke.getKeyCode();
            if(key == KeyEvent.VK_W){
                personaje.saltar();
                System.err.println("W");
            }
        }
        
    }
   
}
