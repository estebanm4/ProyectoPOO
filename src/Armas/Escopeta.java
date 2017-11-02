package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Escopeta extends LargoAlcance {
    private Proyectil proyectil;
    
    public Escopeta(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        super(15, (4*128), 2000, 5, 0.05);
    }
    
}
