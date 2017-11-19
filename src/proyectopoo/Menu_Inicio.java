/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import Mapas.ExeMapaVolcan;
import Mapas.ExeMapa_1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Menu_Inicio extends JPanel implements ActionListener {

    private final int INITIAL_X = -40;
    private final int INITIAL_Y = 340;
    private final int DELAY = 50;

    private Timer timer;
    private int x, y;
    private int secuencia;

    private JButton botonPrueba; // Prueba
    private JButton botonPrueba2; // Prueba
    private JFrame ventana; // Prueba
    
    private ExeMapaVolcan mapaVolcan; // Prueba
    private ExeMapa_1 mapa1; // Prueba
    
    public Menu_Inicio(JFrame ventana) {
        this.ventana = ventana;
        this.secuencia = 0;
        initBoard();
    }

    private void initBoard() {
        setLayout(null); // Colocar elementos en cualquier lado
        setBackground(Color.WHITE);
       
        botonPrueba = new JButton("Boton prueba");
        botonPrueba.setBounds(28, 102, 219, 23);
        botonPrueba.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        botonPrueba.setForeground(Color.BLACK);
        botonPrueba.setBackground(Color.WHITE);
        botonPrueba.addActionListener(this);
        this.add(botonPrueba);
        
        botonPrueba2 = new JButton("Boton prueba2");
        botonPrueba2.setBounds(28, 122, 219, 23);
        botonPrueba2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        botonPrueba2.setForeground(Color.BLACK);
        botonPrueba2.setBackground(Color.WHITE);
        botonPrueba2.addActionListener(this);
        this.add(botonPrueba2);
        
        x = INITIAL_X;
        y = INITIAL_Y;
        //Fires one or more ActionEvents at specified intervals.
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("FONDO MENU.jpg");
        g.drawImage(fondo, 0, 0, 1280, 720, 0, 0, 1752, 1054, this);
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
        
        g.drawRect(x, y, 132,80*/
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        /*x += 5;
        if(this.secuencia == 5){
          this.secuencia = 0;
        }else 
            this.secuencia++;
        
       //TAMANO MAXIMO. ESTO DEBE SER AJUSTADO A PARTIR DE VARIABLES. 
       if(x>=900)
           x=INITIAL_X;
       repaint();*/
        if(e.getSource() == botonPrueba){
            mapaVolcan = new ExeMapaVolcan();
            ventana.dispose(); mapaVolcan.setVisible(true);
        }
        if(e.getSource() == botonPrueba2){
            mapa1 = new ExeMapa_1();
            ventana.dispose(); mapa1.setVisible(true);
            JOptionPane.showMessageDialog(null,"" + getWidth()); 
            JOptionPane.showMessageDialog(null,"" + getHeight());
        }
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

}