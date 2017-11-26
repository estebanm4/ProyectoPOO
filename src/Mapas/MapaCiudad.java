/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

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

public class MapaCiudad extends JPanel implements ActionListener {

    private final int piso = 553;
    private final int delay = 50;
    private Timer timer;
    private int secuencia;
    private int x = 0;

    private ExeSelecMapa ventanaVolverSelecMapa;
    private JButton VolverSelecMapa;
    private JFrame ventana;
            
    public MapaCiudad(JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initMapaVolcan();
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
        g.drawImage(fondo, 0, 0, 1280,720, 0+500, 0, 600+500, 288, this);
        
        
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
        
        repaint();
        if(e.getSource() == VolverSelecMapa){            
            ventanaVolverSelecMapa = new ExeSelecMapa();
            ventana.dispose();
            ventanaVolverSelecMapa.setVisible(true); 
        }
    }

}
