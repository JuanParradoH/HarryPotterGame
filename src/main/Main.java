package main;

import characters.HarryPotter;
import characters.HermioneGranger;
import characters.RonWeasley;
import spells.ExpectoPatronum;
import spells.Expelliarmus;
import spells.OculusReparo;
import spells.WingardiumLeviosa;

public class Main {
    public static void main(String[] args) {
        HarryPotter harry = new HarryPotter();
        RonWeasley ron = new RonWeasley();
        HermioneGranger hermione = new HermioneGranger();

        harry.useMagic();
        ron.useMagic();
        hermione.useMagic();

        hermione.setSpell(new OculusReparo());
        hermione.useMagic();

        harry.setSpell(new Expelliarmus());
        harry.useMagic();

        ron.setSpell(new WingardiumLeviosa());
        ron.useMagic();
    }
}