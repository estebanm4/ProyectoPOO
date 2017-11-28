package Personajes;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Knight_2 extends Personajes {
    
     private int xD1 = 0;
    private int xD2= 445;

    public Knight_2(int vida, int posX, int posY, int dx, int dy, int piso) {
        super(vida, posX, posY, dx, dy, piso);
        Image knight2 = this.loadImage("Archer.png");
        this.sprite = knight2;        
    }

    

   

    

   

    
    

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(sprite, posX, posY,100+posX,100+posY,xD1,0,xD2,460, this);

    }

    
     public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    @Override
    public void saltar() {
        for (int i = 0; i < 10; i++) {
            this.posY-=dy;
        }
    }

    @Override
    public void moverIzquierda() {
        this.xD1=445;
        this.xD2=0;
        this.posX-=dx;
        
    }

    @Override
    public void moverDerecha() {
        this.xD2=445;
        this.xD1=0;
        this.posX+=dx;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void pintarPersonaje(Graphics g) {
        this.paintComponent(g);
    }

    
    
}
