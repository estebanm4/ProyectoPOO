package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Espada extends CuerpoACuerpo {
    
    public Espada(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        super(6, (3*128), 800, 10, 0.25);
    }
    
}
