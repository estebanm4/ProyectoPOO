package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Revolver extends LargoAlcance {
    private Proyectil proyectil;
    
    public Revolver(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        super(10, (5*128), 1, 8, 0.18);
    }
    
}
