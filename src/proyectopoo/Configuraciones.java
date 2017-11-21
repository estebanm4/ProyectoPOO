/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

    import java.awt.Color;
    import java.awt.Font;
    import java.awt.Graphics;
    import java.awt.Image;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import java.io.Serializable;
    import javax.swing.ImageIcon;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JTabbedPane;
    //import javax.swing.Timer;
/**
 *
 * @author lenovo
 */
public class Configuraciones extends JPanel implements ActionListener, Serializable{
    
    private JButton botonVolver; // Prueba
    private JFrame ventana; // Prueba
    
    private PPOOMAIN ventanaMain;
    
    public Configuraciones(JFrame ventana) {
        this.ventana = ventana;
        initBoard();
    }

    private void initBoard() {
        setLayout(null); // Colocar elementos en cualquier lado
        setBackground(Color.WHITE);
        TabbedPane tabbedpane = null;
   
        botonVolver = new JButton(" VOLVER ");
        botonVolver.setBounds(20, 20, 100, 25);
        botonVolver.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        botonVolver.setForeground(Color.BLACK);
        botonVolver.setBackground(Color.WHITE);
        botonVolver.addActionListener(this);
        this.add(botonVolver); 
   
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setBounds(280, 150, 700, 400);
        this.add(tabbedPane);
	//getContentPane().add(tabbedPane);
		
	JPanel INSTRUCCIONES = new JPanel();                
	INSTRUCCIONES.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	INSTRUCCIONES.setBackground(Color.WHITE);                
	tabbedPane.addTab("INSTRUCCIONES", null, INSTRUCCIONES, null);
	INSTRUCCIONES.setLayout(null);
		
	JLabel lblNombre = new JLabel("Nombre:");
	lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
	lblNombre.setBounds(31, 28, 52, 23);
	INSTRUCCIONES.add(lblNombre);
        
        JPanel CONTROLES = new JPanel();                
	CONTROLES.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	CONTROLES.setBackground(Color.WHITE);                
	tabbedPane.addTab(" CONTROLES ", null, CONTROLES, null);
	CONTROLES.setLayout(null);
        
        JLabel TextControl = new JLabel("Nombre:");
	TextControl.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
	TextControl.setBounds(31, 28, 52, 23);
	CONTROLES.add(TextControl);
        
        JPanel CREDITOS = new JPanel();                
	CREDITOS.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	CREDITOS.setBackground(Color.WHITE);                
	tabbedPane.addTab(" CREDITOS ", null, CREDITOS, null);
	CREDITOS.setLayout(null);
        
        JLabel TextCredit = new JLabel("Nombre:");
	TextCredit.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
	TextCredit.setBounds(31, 28, 52, 23);
	CREDITOS.add(TextCredit);
        
        JPanel CONFIGURACIONES = new JPanel();                
	CONFIGURACIONES.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	CONFIGURACIONES.setBackground(Color.WHITE);                
	tabbedPane.addTab(" CONFIGURACIONES ", null, CONFIGURACIONES, null);
	CONFIGURACIONES.setLayout(null);
        
	JLabel TextConfig = new JLabel("Nombre:");
	TextConfig.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
	TextConfig.setBounds(31, 28, 52, 23);
	CONFIGURACIONES.add(TextConfig);	
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("CONFIG.jpg");
        g.drawImage(fondo, 0, 0, 1280, 720, 0, 0, 700, 490, this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource() == botonVolver){
            ventanaMain = new PPOOMAIN();
            ventana.dispose(); 
            ventanaMain.setVisible(true);
        }
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    private static class TabbedPane {

        public TabbedPane() {
        }
    }

}