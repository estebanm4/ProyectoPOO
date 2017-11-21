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
/**
 *
 * @author lenovo
 */
public class Seleccion_Mapa extends JPanel implements ActionListener{
    
    private JButton SelecMapa1; // Prueba
    private JButton SelecMapa2; // Prueba
    private JButton SelecMapa3; // Prueba
    private JButton SelecMapa4; // Prueba
    private JButton Devolver; // Prueba
    
    private PPOOMAIN ventanaMain;
    private ExeMapaVolcan mapaVolcan; // Prueba
    private ExeMapa_1 mapa1; // Prueba
    
    private JFrame ventana; // Prueba

    public Seleccion_Mapa(JFrame ventana) {
        this.ventana = ventana;
        initBoard();
    }

    private void initBoard() {
        setLayout(null); // Colocar elementos en cualquier lado
        setBackground(Color.WHITE);
       
        SelecMapa1 = new JButton("MAPA 1 ( VOLCANES DE VALYRIA )");
        SelecMapa1.setBounds(250, 320, 300, 25);
        SelecMapa1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecMapa1.setForeground(Color.BLACK);
        SelecMapa1.setBackground(Color.WHITE);
        SelecMapa1.addActionListener(this);
        this.add(SelecMapa1);
        
        SelecMapa2 = new JButton("MAPA 2 ( BOSQUES REAL )");
        SelecMapa2.setBounds(720, 320, 300, 25);
        SelecMapa2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecMapa2.setForeground(Color.BLACK);
        SelecMapa2.setBackground(Color.WHITE);
        SelecMapa2.addActionListener(this);
        this.add(SelecMapa2);
        
        SelecMapa3 = new JButton("MAPA 3 ( MAPA 3 )");
        SelecMapa3.setBounds(250, 550, 300, 25);
        SelecMapa3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecMapa3.setForeground(Color.BLACK);
        SelecMapa3.setBackground(Color.WHITE);
        SelecMapa3.addActionListener(this);
        this.add(SelecMapa3);
        
        SelecMapa4 = new JButton("MAPA 4 ( MAPA 4 )");
        SelecMapa4.setBounds(720, 550, 300, 25);
        SelecMapa4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecMapa4.setForeground(Color.BLACK);
        SelecMapa4.setBackground(Color.WHITE);
        SelecMapa4.addActionListener(this);
        this.add(SelecMapa4);
        
        Devolver = new JButton(" VOLVER ");
        Devolver.setBounds(20, 20, 100, 25);
        Devolver.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        Devolver.setForeground(Color.BLACK);
        Devolver.setBackground(Color.WHITE);
        Devolver.addActionListener(this);
        this.add(Devolver);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("explosion_nuclear.jpg");
        g.drawImage(fondo, 0, 0, 1280, 720, 0, 0, 670, 413, this);
        
        Image MAPA1 = loadImage("bg_volcano.png");
        g.drawImage(MAPA1, 230, 100, 570, 350, 0, 0, 1280, 720, this);
        
        Image MAPA2 = loadImage("Mapa_1Final.png");
        g.drawImage(MAPA2, 700, 100, 1080, 350, 0, 0, 639, 505, this);
        
        Image MAPA3 = loadImage("bg_volcano.png");
        g.drawImage(MAPA3, 230, 350, 570, 580, 0, 0, 1280, 720, this);
        
        Image MAPA4 = loadImage("Mapa_1Final.png");
        g.drawImage(MAPA4, 700, 350, 1080, 580, 0, 0, 639, 505, this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource() == SelecMapa1){
            mapaVolcan = new ExeMapaVolcan();
            ventana.dispose(); 
            mapaVolcan.setVisible(true);
        }
        if(e.getSource() == SelecMapa2){
            mapa1 = new ExeMapa_1();
            ventana.dispose(); 
            mapa1.setVisible(true);
        }
        if(e.getSource() == SelecMapa3){
            mapaVolcan = new ExeMapaVolcan();
            ventana.dispose(); 
            mapaVolcan.setVisible(true);
        }
        if(e.getSource() == SelecMapa4){
            mapa1 = new ExeMapa_1();
            ventana.dispose(); 
            mapa1.setVisible(true);
        }
        if(e.getSource() == Devolver){
            ventanaMain = new PPOOMAIN();
            ventana.dispose();
            ventanaMain.setVisible(true); 
            //JOptionPane.showMessageDialog(null,"" + getWidth()); 
            //JOptionPane.showMessageDialog(null,"" + getHeight());
        }
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

}