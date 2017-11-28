package Personajes;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class Personajes extends JPanel implements ActionListener {
    protected int vida;
    protected int posX;
    protected int posY;
    protected int dx;
    protected int dy;
    protected boolean parado = true;
    protected int piso;
    protected Image sprite;
    protected final int gravedad=10;

    public Personajes(int vida, int posX, int posY, int dx, int dy, int piso) {
        this.vida = vida;
        this.posX = posX;
        this.posY = posY;
        this.dx = dx;
        this.dy = dy;
        this.piso = piso;
    }

    public  abstract void pintarPersonaje(Graphics g);
    

    public boolean isParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

   

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

   

    

    
    
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
   
    
    public abstract void saltar();
    
    public abstract void moverIzquierda();
    
    public abstract void moverDerecha();
}
