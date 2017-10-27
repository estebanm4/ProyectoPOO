package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Lanzacohetes extends LargoAlcance {
    private Proyectil proyectil;
    
    public Lanzacohetes(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        super(20, (128*10), 5000, 2, 0.02);
    }
    
}
