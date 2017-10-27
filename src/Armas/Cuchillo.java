package Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Cuchillo extends CuerpoACuerpo {
    
    public Cuchillo(int daño, int alcance, int tCarga, int NoUsos, double probabilidad) {
        super(4, (2*128), 500, 15, 0.4);
    }
    
}
