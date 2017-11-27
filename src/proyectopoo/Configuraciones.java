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
    import javax.swing.JTextArea;
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
        
        JTextArea JTAI = new JTextArea(" INSTRUCCIONES: "+"\n"+"\n"+
                " El objetivo del juego es combatir en un entorno 2D entre "+"\n"+
                " varios jugadores con los cuales estara luchando utilizando "+"\n"+
                " armas de diferente accion, rango y potencia con el fin de  "+"\n"+
                " bajar la vida de los oponentes y asi derrotarlos siendo el  "+"\n"+
                " ultimo en pie proclamandose asi el GANADOR.", 10, 20);
        JTAI.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	JTAI.setBounds(100, 80, 500, 300);
	INSTRUCCIONES.add(JTAI);
                
        JPanel CONTROLES = new JPanel();                
	CONTROLES.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	CONTROLES.setBackground(Color.WHITE);                
	tabbedPane.addTab(" CONTROLES ", null, CONTROLES, null);
	CONTROLES.setLayout(null);
        
        JTextArea JTACTRL = new JTextArea(" CONTROLES: "+"\n"+"\n"+
                " W ...  Saltar."+"\n"+
                " A ...  Mover Hacia La Izquierda."+"\n"+
                " D ...  Mover Hacia La Derecha."+"\n"+
                " J ...  Usar Arma / Atacar."+"\n"+
                " K ...  Recoger Arma. "+"\n"+
                " L ...  Soltar Arma.", 10, 20);
        JTACTRL.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	JTACTRL.setBounds(350, 80, 500, 300);
	CONTROLES.add(JTACTRL);
        
        JPanel CREDITOS = new JPanel();                
	CREDITOS.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	CREDITOS.setBackground(Color.WHITE);                
	tabbedPane.addTab(" CREDITOS ", null, CREDITOS, null);
	CREDITOS.setLayout(null);
        
        JTextArea JTACRE = new JTextArea(" CREDITOS: "+"\n"+
                " Este Videojuego fue diseñado con el proposito de retar a nosotros"+"\n"+
                " los desarrolladores, estudiantes de Ingenieria Electronica de la "+"\n"+
                " Universidad Nacional De Colombia. Directamente programado lenguaje "+"\n"+
                " orientado a objetos (JAVA).Gracias al profesor Fabian Giraldo por"+"\n"+
                " su ayuda y colaboracion ( ponganos 5.0 profe :) )"+"\n"+
                " Esperamos que todo el que quiera, disfrute de este entorno interactivo"+"\n"+
                " entre amigos y enemigos, demostrando sus habilidades."+"\n"+
                " DESARROLLADORES: "+"\n"+
                "            CRISTHIAN MATEO PACHECO FANDIÑO"+"\n"+
                "              JUAN ESTEBAN MUÑOZ PACHECO"+"\n"+
                "              ALDO JOSE MARQUEZ MALDERA"+"\n"+
                "             LUIS FERNANDO SUAREZ CASSARES"+"\n"+
                
                " ", 10, 20);
        JTACRE.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	JTACRE.setBounds(80, 30, 600, 400);
	CREDITOS.add(JTACRE);
        
        JPanel CONFIGURACIONES = new JPanel();                
	CONFIGURACIONES.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	CONFIGURACIONES.setBackground(Color.WHITE);                
	tabbedPane.addTab(" CONFIGURACIONES ", null, CONFIGURACIONES, null);
	CONFIGURACIONES.setLayout(null);
        
        JTextArea JTACONF = new JTextArea(" CONFIGURACIONES: "+"\n"+"\n"+
                " El objetivo del juego es combatir en un entorno 2D entre "+"\n"+
                " varios jugadores con los cuales estara luchando utilizando "+"\n"+
                " armas de diferente accion, rango y potencia con el fin de  "+"\n"+
                " bajar la vida de los oponentes y asi derrotarlos siendo el  "+"\n"+
                " ultimo en pie proclamandose asi el GANADOR.", 10, 20);
        JTACONF.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	JTACONF.setBounds(100, 80, 500, 300);
	CONFIGURACIONES.add(JTACONF);
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