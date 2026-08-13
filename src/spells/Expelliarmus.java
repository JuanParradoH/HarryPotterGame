package spells;

public class Expelliarmus implements SpellStrategy {
    @Override
    public void cast(){
        System.out.println("Casts Expelliarmus");
    }   
}
