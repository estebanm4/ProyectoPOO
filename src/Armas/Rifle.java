package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Rifle extends LargoAlcance {
    private Proyectil proyectil;
    
    public Rifle(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        super(12, (7*128), 2000, 5, 0.1);
    }
    
}
