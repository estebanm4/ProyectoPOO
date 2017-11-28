package proyectopoo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

public class Seleccion_Personaje extends JPanel implements ActionListener, KeyListener{
    
    private JButton SelecPer1; // Prueba
    private JButton SelecPer2; // Prueba
    private JButton SelecPer3; // Prueba
    private JButton SelecPer4; // Prueba
    private JButton Atras; // Prueba
    private JButton SIGUIENTE;
    
    
    private PPOOMAIN ventanaMain;
    private ExeSelecMapa seleccionarMapa;
    private JFrame ventana;

    Seleccion_Personaje(ExeSelecPersonaje aThis) {
         initBoard();
    }

    
    
    
   private void initBoard() {
        setLayout(null); // Colocar elementos en cualquier lado
        setBackground(Color.WHITE);
       
        SelecPer1 = new JButton("CABALLERO");
        SelecPer1.setBounds(250, 320, 300, 25);
        SelecPer1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecPer1.setForeground(Color.BLACK);
        SelecPer1.setBackground(Color.WHITE);
        SelecPer1.addActionListener(this);
        this.add(SelecPer1);
        
        SelecPer2 = new JButton("CABALLERO ROJO");
        SelecPer2.setBounds(740, 320, 300, 25);
        SelecPer2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecPer2.setForeground(Color.BLACK);
        SelecPer2.setBackground(Color.WHITE);
        SelecPer2.addActionListener(this);
        this.add(SelecPer2);
        
        SelecPer3 = new JButton("ARQUERO");
        SelecPer3.setBounds(250, 550, 300, 25);
        SelecPer3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecPer3.setForeground(Color.BLACK);
        SelecPer3.setBackground(Color.WHITE);
        SelecPer3.addActionListener(this);
        this.add(SelecPer3);
        
        SelecPer4 = new JButton("MAGO");
        SelecPer4.setBounds(740, 550, 300, 25);
        SelecPer4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        SelecPer4.setForeground(Color.BLACK);
        SelecPer4.setBackground(Color.WHITE);
        SelecPer4.addActionListener(this);
        this.add(SelecPer4);
        
        Atras = new JButton(" VOLVER ");
        Atras.setBounds(80, 20, 150, 25);
        Atras.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        Atras.setForeground(Color.BLACK);
        Atras.setBackground(Color.WHITE);
        Atras.addActionListener(this);
        this.add(Atras);
        
        
   }
   
   @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Image fondop = loadImage("Background_7_2048x1536.png");
        g.drawImage(fondop, 0, 0, 1280, 720, 0, 0, 2048, 1536, this);
        
        
        Image PER1 = loadImage("0.png");
        g.drawImage(PER1, 220, 80, 520, 350, 0, 0, 445, 460, this);
        
        
        Image PER2 = loadImage("Bazooka.png");
        g.drawImage(PER2, 700, 100, 1080, 350, 0, 0, 639, 505, this);
        
        Image PER3 = loadImage("Archer.png");
        g.drawImage(PER3, 190, 290, 490, 560, 0, 0, 445, 490, this);
        
        Image PER4 = loadImage("Wizard.png");
        g.drawImage(PER4, 600, 290, 950, 550, 0, 0, 520, 460, this);
    }
    
    
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
