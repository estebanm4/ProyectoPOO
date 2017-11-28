/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import Mapas.ExeMapaCiudad;
import Mapas.ExeMapaJungla;
import Mapas.ExeMapaVolcan;
import Mapas.ExeMapa_1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    private int contadorMapa1;
     private int contadorMapa2;
      private int contadorMapa3;
       private int contadorMapa4;
            
       private final File file;
    
    private PPOOMAIN ventanaMain;
    private ExeMapaJungla mapaJungla;
    private ExeMapaCiudad mapaCiudad;
    private ExeMapaVolcan mapaVolcan; // Prueba
    private ExeMapa_1 mapa1; // Prueba
    
    private JFrame ventana; // Prueba

    public Seleccion_Mapa(JFrame ventana) throws IOException {
        this.ventana = ventana;
        initBoard();
        file = new File("permanencia.txt");
        if(!file.exists()){
            
                file.createNewFile();
        }
        
        Scanner s = new Scanner(file);
        s.useDelimiter(",");
        /*while (s.hasNext()){
            
            String scontadorMapa1=s.next().trim();
            String scontadorMapa2=s.next().trim();
            String scontadorMapa3=s.next().trim();
            String scontadorMapa4=s.next().trim();
            contadorMapa1= Integer.parseInt(scontadorMapa1);
            contadorMapa2= Integer.parseInt(scontadorMapa2);
            contadorMapa3= Integer.parseInt(scontadorMapa3);
            contadorMapa4= Integer.parseInt(scontadorMapa4);
        }*/
        
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
        SelecMapa2.setBounds(740, 320, 300, 25);
        SelecMapa2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecMapa2.setForeground(Color.BLACK);
        SelecMapa2.setBackground(Color.WHITE);
        SelecMapa2.addActionListener(this);
        this.add(SelecMapa2);
        
        SelecMapa3 = new JButton("MAPA 3 ( CIUDAD DEL OLVIDO )");
        SelecMapa3.setBounds(250, 550, 300, 25);
        SelecMapa3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecMapa3.setForeground(Color.BLACK);
        SelecMapa3.setBackground(Color.WHITE);
        SelecMapa3.addActionListener(this);
        this.add(SelecMapa3);
        
        SelecMapa4 = new JButton("MAPA 4 ( ISLA SKULL )");
        SelecMapa4.setBounds(740, 550, 300, 25);
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
        Image volcan = loadImage("volcangrande.png");
        g.drawImage(volcan, 230, 100-20,570,400-20,0,0, 1280, 1280, this);
        g.drawString(Integer.toString(contadorMapa1), 570, 350-10);
        
        
        Image MAPA2 = loadImage("Mapa_1Final.png");
        g.drawImage(MAPA2, 700, 100, 1080, 350, 0, 0, 639, 505, this);
        g.drawString(Integer.toString(contadorMapa2), 1080, 350-10);
        
        Image MAPA3 = loadImage("background.png");
        Image MAPA3addOn = loadImage("middleground.png");
        g.drawImage(MAPA3, 230, 350+10, 570, 580+10, 0, 0, 384, 288, this);
        g.drawImage(MAPA3addOn, 230, 350, 570, 580+10, 0, 0, 384, 288, this);
        g.drawString(Integer.toString(contadorMapa3), 570, 580);
        
        Image MAPA4 = loadImage("background_1.png");
        Image MAPA4addon = loadImage("middleground_1.png");
        g.drawImage(MAPA4, 700, 350+10, 1080, 580+10, 0, 0, 384/2, 240, this);
        g.drawImage(MAPA4addon, 700, 350+10, 1080, 580+10, 0, 0, 384, 240, this);
        g.drawString(Integer.toString(contadorMapa4), 1080, 580);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            PrintStream xs;
            
            xs = new PrintStream(file);
            
            if(e.getSource() == SelecMapa1){            
                mapaVolcan = new ExeMapaVolcan();
                ventana.dispose();
                mapaVolcan.setVisible(true);
                this.contadorMapa1= contadorMapa1+1;
            }
            if(e.getSource() == SelecMapa2){
                mapa1 = new ExeMapa_1();
                ventana.dispose();
                mapa1.setVisible(true);
                this.contadorMapa2++;
            }
            if(e.getSource() == SelecMapa3){
                mapaCiudad = new ExeMapaCiudad();
                ventana.dispose();
                mapaCiudad.setVisible(true);
                this.contadorMapa3++;
            }
            if(e.getSource() == SelecMapa4){
                mapaJungla = new ExeMapaJungla();
                ventana.dispose();
                mapaJungla.setVisible(true);
                this.contadorMapa4++;
            }
            if(e.getSource() == Devolver){
                ventanaMain = new PPOOMAIN();
                ventana.dispose();
                ventanaMain.setVisible(true);
                //JOptionPane.showMessageDialog(null,"" + getWidth());
                //JOptionPane.showMessageDialog(null,"" + getHeight());
                
                
            }
                xs.println(this.contadorMapa1 + "," + this.contadorMapa2+ "," +this.contadorMapa3+","+this.contadorMapa4);
                xs.close();
                
                
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Seleccion_Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

}