package spells;

/** Estrategia concreta que implementa un comportamiento de hechizo específico. */
public class ExpectoPatronum implements SpellStrategy {
    @Override
    public void cast(){
        System.out.println("Casts Expecto Patronum");
    }
}
