package main;

import characters.HarryPotter;
import characters.HermioneGranger;
import characters.RonWeasley;
import spells.ExpectoPatronum;
import spells.Expelliarmus;
import spells.OculusReparo;
import spells.WingardiumLeviosa;

/** Punto de entrada y controlador de inyección de dependencias en tiempo de ejecución. */
public class Main {
    public static void main(String[] args) {
        // Instanciación del contexto con estrategias base
        HarryPotter harry = new HarryPotter();
        RonWeasley ron = new RonWeasley();
        HermioneGranger hermione = new HermioneGranger();
        
        // Ejecución de estrategias iniciales
        harry.useMagic();
        ron.useMagic();
        hermione.useMagic();
        
        // Intercambio dinámico de estrategiasR
        hermione.setSpell(new OculusReparo());
        hermione.useMagic();

        harry.setSpell(new Expelliarmus());
        harry.useMagic();

        ron.setSpell(new WingardiumLeviosa());
        ron.useMagic();
    }
}