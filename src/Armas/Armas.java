package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class Armas {
    public int daño;
    public int alcance;
    public int tCarga;
    public int NoUsos;
    public double probabilidad;

    public Armas(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        this.daño = daño;
        this.alcance = alcance;
        this.tCarga = tCarga;
        this.NoUsos = NoUsos;
        this.probabilidad = probabilidad;
    }
    
    public void Disparar(){
        
    }
}
