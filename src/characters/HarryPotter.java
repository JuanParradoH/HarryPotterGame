package characters;

import spells.ExpectoPatronum;

/** Entidad concreta inicializada con su estrategia algorítmica predeterminada. */
public class HarryPotter extends Character{
    public HarryPotter(){
        super("HarryPotter", new ExpectoPatronum()); 
    }
}
