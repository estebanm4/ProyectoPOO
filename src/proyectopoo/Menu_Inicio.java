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

public class Menu_Inicio extends JPanel implements ActionListener {

    private JButton BotonJUGAR; // Prueba
    private JButton BotonCONFIGURACIONES; // Prueba
    
    private JFrame ventana; // Prueba
    
    private ExeMapaVolcan mapaVolcan; // Prueba
    private ExeMapa_1 mapa1; // Prueba
    private ExeConfig configuraciones;
    private ExeSelecMapa seleccionMapa;
    
    public Menu_Inicio(JFrame ventana) {
        this.ventana = ventana;
        initBoard();
    }

    private void initBoard() {
        setLayout(null); // Colocar elementos en cualquier lado
        setBackground(Color.WHITE);
       
        BotonJUGAR = new JButton("JUGAR - NUEVA PARTIDA");
        BotonJUGAR.setBounds(470, 480, 300, 30);
        BotonJUGAR.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        BotonJUGAR.setForeground(Color.BLACK);
        BotonJUGAR.setBackground(Color.WHITE);
        BotonJUGAR.addActionListener(this);
        this.add(BotonJUGAR);
        
        BotonCONFIGURACIONES = new JButton("CONFIGURACIÓN");
        BotonCONFIGURACIONES.setBounds(520, 530, 200, 30);
        BotonCONFIGURACIONES.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        BotonCONFIGURACIONES.setForeground(Color.BLACK);
        BotonCONFIGURACIONES.setBackground(Color.WHITE);
        BotonCONFIGURACIONES.addActionListener(this);
        this.add(BotonCONFIGURACIONES);
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("FONDO MENU.jpg");
        g.drawImage(fondo, 0, 0, 1280, 720, 0, 0, 1752, 1054, this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == BotonJUGAR){
            seleccionMapa = new ExeSelecMapa();
            ventana.dispose(); 
            seleccionMapa.setVisible(true);
        }
        if(e.getSource() == BotonCONFIGURACIONES){            
            configuraciones = new ExeConfig();
            ventana.dispose(); 
            configuraciones.setVisible(true);
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