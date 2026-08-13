package characters;

import spells.SpellStrategy;

public abstract class Character {
    protected String name;
    protected SpellStrategy currentSpell;
    
    public Character(String name, SpellStrategy initialSpell) {
        this.name = name;
        this.currentSpell = initialSpell;
    }
    
    public void setSpell (SpellStrategy newSpell){
        this.currentSpell = newSpell;
    }
    
    public void useMagic() {
        System.out.print(this.name + " -> ");
        this.currentSpell.cast();
    }
}
