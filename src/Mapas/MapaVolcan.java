/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import proyectopoo.ProyectoPOOMAIN;

public class MapaVolcan extends JPanel implements ActionListener {

    private final int piso = 553;
    private final int delay = 50;
    private Timer timer;
    private int secuencia;
    private int x = 0;

    private ProyectoPOOMAIN ventanaMain;
    private JButton btnDevolver;
    private JFrame ventana;
            
    public MapaVolcan(JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initMapaVolcan();
    }

    private void initMapaVolcan() {
        setBackground(Color.WHITE);
        setLayout(null);
        
        btnDevolver = new JButton("Boton prueba");
        btnDevolver.setBounds(28, 102, 219, 23);
        btnDevolver.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        btnDevolver.setForeground(Color.BLACK);
        btnDevolver.setBackground(Color.WHITE);
        btnDevolver.addActionListener(this);
        this.add(btnDevolver);
        
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
        g.drawImage(crookdtree, 128 * 7+32, piso-128, this);

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
        g.drawImage(tree, 128, piso - 128 * 2, null);
        
        Image rock1 = loadImage("volcano_pack_70.png");
        g.drawImage(rock1, 128*3-32, piso - 128, null);
        
        Image rock2 = loadImage("volcano_pack_71.png");
        g.drawImage(rock2, 128*5, piso - 128, null);
        
        
        Image sprout = loadImage("volcano_pack_69.png");
        g.drawImage(sprout, 128*2-32, piso - 128, null);
        
        g.drawImage(sprout, 128*4, piso - 128, null);
        
        Image flr2 = loadImage("volcano_pack_66.png");
        g.drawImage(flr2, 128*8+32, piso - 128, null);
        

        Image piso1 = loadImage("volcano_pack_alt_03.png");
        g.drawImage(piso1, 128, piso, null);

        Image piso2 = loadImage("volcano_pack_alt_07.png");
        g.drawImage(piso2, 128 * 8, piso, null);

        Image pisogen = loadImage("volcano_pack_alt_05.png");
        for (j = 128 * 2; j <= 4 * 128; j = j + 128) {
            g.drawImage(pisogen, j, piso, null);
        }

        Image pisoedge = loadImage("volcano_pack_alt_37.png");
        g.drawImage(pisoedge, 128 * 5, piso, null);
        Image pisoedge2 = loadImage("volcano_pack_alt_36.png");
        g.drawImage(pisoedge2, 128 * 7, piso, null);

        Image lava = loadImage("volcano_pack_53.png");
        
        if(secuencia>=400){
            
            Image piso1alt = loadImage("volcano_pack_03.png");
        g.drawImage(piso1alt, 128, piso, null);

        Image piso2alt = loadImage("volcano_pack_07.png");
        g.drawImage(piso2alt, 128 * 8, piso, null);

        Image pisogenalt = loadImage("volcano_pack_05.png");
        for (j = 128 * 2; j <= 4 * 128; j = j + 128) {
            g.drawImage(pisogenalt, j, piso, null);
            Image pisoedgealt = loadImage("volcano_pack_37.png");
        g.drawImage(pisoedgealt, 128 * 5, piso, null);
        Image pisoedge2alt = loadImage("volcano_pack_36.png");
        g.drawImage(pisoedge2alt, 128 * 7, piso, null);
       
            

     
        
        }
        }
        
        

        for (j = -128; j <= 20 * 128; j = j + 128) {

            g.drawImage(lava, j + x, piso + 32, this);
            g.drawImage(lava, j - x, piso + 32, this);
            
            

        }

        /*
        
        img - the specified image to be drawn. 
        This method does nothing if img is null. 
        dx1 - the x coordinate of the first corner of the destination rectangle. 
        dy1 - the y coordinate of the first corner of the destination rectangle. 
        dx2 - the x coordinate of the second corner of the destination rectangle. 
        dy2 - the y coordinate of the second corner of the destination rectangle. 
        
        sx1 - the x coordinate of the first corner of the source rectangle. 
        sy1 - the y coordinate of the first corner of the source rectangle. 
        sx2 - the x coordinate of the second corner of the source rectangle. 
        sy2 - the y coordinate of the second corner of the source rectangle. 
        observer - object to be notified as more of the image is scaled and converted.
        
         */
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
        repaint();
        if(e.getSource() == btnDevolver){
            ventana.dispose();
            ventanaMain = new ProyectoPOOMAIN();
            ventanaMain.setVisible(true); 
        }
    }

}
