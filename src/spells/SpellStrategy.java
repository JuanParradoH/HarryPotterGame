package spells;
/** Interfaz base del patrón Strategy. Define el contrato inmutable para los hechizos. */
public interface SpellStrategy {
    /** Ejecuta la acción algorítmica específica. */
    void cast();
}
