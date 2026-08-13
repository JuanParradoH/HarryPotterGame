package characters;

import spells.SpellStrategy;

/** Clase de contexto que encapsula y delega el comportamiento a la interfaz SpellStrategy. */

public abstract class Character {
    protected String name;
    protected SpellStrategy currentSpell;
    
    /** Inicializa el estado base y asigna la estrategia por defecto. */
    
    public Character(String name, SpellStrategy initialSpell) {
        this.name = name;
        this.currentSpell = initialSpell;
    }
    
    /** Modifica la estrategia algorítmica en tiempo de ejecución. */
    public void setSpell (SpellStrategy newSpell){
        this.currentSpell = newSpell;
    }
    
    /** Delega la ejecución a la estrategia inyectada. */
    public void useMagic() {
        System.out.print(this.name + " -> ");
        this.currentSpell.cast();
    }
}
