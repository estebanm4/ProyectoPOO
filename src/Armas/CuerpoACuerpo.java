package Armas;
import Armas.Armas;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class CuerpoACuerpo extends Armas{
    
    public CuerpoACuerpo(int daño, int alcance, int tCarga, int NoUsos, int probabilidad) {
        super(daño, alcance, tCarga, NoUsos, probabilidad);
    }
    
}
