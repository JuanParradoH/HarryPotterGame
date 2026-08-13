package spells;

public class ExpectoPatronum implements SpellStrategy {
    @Override
    public void cast(){
        System.out.println("Casts Expecto Patronum");
    }
}
