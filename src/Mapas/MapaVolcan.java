package Mapas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
import Personajes.Arquero;
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

public class MapaVolcan extends JPanel implements ActionListener {

    private final int lavafloor = 553;
    private final int piso= 450;
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
            
    public MapaVolcan(JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initMapaVolcan();
        this.personaje = new Wizard(10, 500,430,10,10,600);
        this.p2 = new Arquero(1100, 60, 430, 10, 10, 600);
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
        Image fondo = loadImage("bg_volcano.png");
        g.drawImage(fondo, 0, 0, null);
        int j;

//        for(int t=0;t<=1280;t=t+128){
//        Image test = loadImage("volcano_pack_alt_37.png");
//        g.drawImage(test, 0, t, null);  
//        }       
//        for(int t=0;t<=1280;t=t+128){
//        Image test2 = loadImage("volcano_pack_alt_37.png");
//        g.drawImage(test2, t, 0, null);  
//        }       
        Image volcan = loadImage("volcangrande.png");
        g.drawImage(volcan, 64, -256, 1280 - 128, 1280, this);

        Image platfanti = loadImage("volcano_pack_alt_38.png");
        g.drawImage(platfanti, 128 + 64, 128 * 2, this);

        Image crystalp = loadImage("volcano_pack_56.png");
        g.drawImage(crystalp, 128 + 64, 128, this);

        Image platf = loadImage("volcano_pack_alt_13.png");

        Image crookdtree = loadImage("volcano_pack_73.png");
        g.drawImage(crookdtree, 128 * 2 + 64, 128, this);
        g.drawImage(crookdtree, 128 * 7+32, lavafloor-128, this);

        g.drawImage(platf, 128 * 2 + 64, 128 * 2, this);

        Image platedge = loadImage("volcano_pack_alt_15.png");
        g.drawImage(platedge, 128 * 3 + 64, 128 * 2, this);

        Image crystalb = loadImage("volcano_pack_72.png");
        g.drawImage(crystalb, 128 * 3 + 64, 128, this);

        Image flr = loadImage("volcano_pack_74.png");
        g.drawImage(flr, 128 * 7 + 64 + 32, 128 * 2, this);

        Image plat2izq = loadImage("volcano_pack_alt_38.png");
        g.drawImage(plat2izq, 128 * 7 - 64, 128 * 3, this);

        Image crystaly = loadImage("volcano_pack_65.png");
        g.drawImage(crystaly, 128 * 7, 128 * 2, this);

        Image plat2der = loadImage("volcano_pack_alt_15.png");
        g.drawImage(plat2der, 128 * 8 - 64, 128 * 3, this);

        g.drawImage(flr, 128 * 7 - 64 - 32, 128 * 2, this);

        Image tree = loadImage("volcano_pack_59.png");
        g.drawImage(tree, 128, lavafloor - 128 * 2, null);
        
        Image rock1 = loadImage("volcano_pack_70.png");
        g.drawImage(rock1, 128*3-32, lavafloor - 128, null);
        
        Image rock2 = loadImage("volcano_pack_71.png");
        g.drawImage(rock2, 128*5, lavafloor - 128, null);
        
        
        Image sprout = loadImage("volcano_pack_69.png");
        g.drawImage(sprout, 128*2-32, lavafloor - 128, null);
        
        g.drawImage(sprout, 128*4, lavafloor - 128, null);
        
        Image flr2 = loadImage("volcano_pack_66.png");
        g.drawImage(flr2, 128*8+32, lavafloor - 128, null);
        

        Image piso1 = loadImage("volcano_pack_alt_03.png");
        g.drawImage(piso1, 128, lavafloor, null);

        Image piso2 = loadImage("volcano_pack_alt_07.png");
        g.drawImage(piso2, 128 * 8, lavafloor, null);
        
        //
        g.drawRect(125, 555, 645, 20);
        g.drawRect(895, 555, 252, 20);
        g.drawRect(195, 260, 375, 20);
        g.drawRect(833, 390, 255, 20);
        
        g.setColor(Color.green);
        g.fillRect(15, 15, xref1, 30);
        g.setColor(Color.green);
        g.fillRect(xref2, 15, 530, 30);
        //
        Image pisogen = loadImage("volcano_pack_alt_05.png");
        for (j = 128 * 2; j <= 4 * 128; j = j + 128) {
            g.drawImage(pisogen, j, lavafloor, null);
        }

        Image pisoedge = loadImage("volcano_pack_alt_37.png");
        g.drawImage(pisoedge, 128 * 5, lavafloor, null);
        Image pisoedge2 = loadImage("volcano_pack_alt_36.png");
        g.drawImage(pisoedge2, 128 * 7, lavafloor, null);

        Image lava = loadImage("volcano_pack_53.png");
        
        if(secuencia>=400){
            
            Image piso1alt = loadImage("volcano_pack_03.png");
        g.drawImage(piso1alt, 128, lavafloor, null);

        Image piso2alt = loadImage("volcano_pack_07.png");
        g.drawImage(piso2alt, 128 * 8, piso, null);

        Image pisogenalt = loadImage("volcano_pack_05.png");
        for (j = 128 * 2; j <= 4 * 128; j = j + 128) {
            g.drawImage(pisogenalt, j, lavafloor, null);
            Image pisoedgealt = loadImage("volcano_pack_37.png");
        g.drawImage(pisoedgealt, 128 * 5, lavafloor, null);
        Image pisoedge2alt = loadImage("volcano_pack_36.png");
        g.drawImage(pisoedge2alt, 128 * 7, lavafloor, null);
        }
      }
        
        for (j = -128; j <= 20 * 128; j = j + 128) {

            g.drawImage(lava, j + x, lavafloor + 32, this);
            g.drawImage(lava, j - x, lavafloor + 32, this);
            
        }
        
        this.personaje.pintarPersonaje(g);
        this.p2.pintarPersonaje(g);
//        this.enemigo1.pintarPersonaje(g);
//        this.enemigo2.pintarPersonaje(g);
//        this.enemigo3.pintarPersonaje(g);
    }

    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 4;
        if (this.secuencia == 600) {
            this.secuencia = 0;
        } else {
            this.secuencia++;
        }

        if (x >= 128) {
            x = 0;
        }
        
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
        if(e.getSource() == VolverSelecMapa){            
            try {
                ventanaVolverSelecMapa = new ExeSelecMapa();
            } catch (IOException ex) {
                Logger.getLogger(MapaVolcan.class.getName()).log(Level.SEVERE, null, ex);
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
