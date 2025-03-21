package MundoPostapocaliptico;

import ClasesAbstractasMundos.Personaje;

public class PersonajePostapocaliptico extends Personaje {
    // Constructor
    public PersonajePostapocaliptico(String nombre, int vida) {
        super(nombre, vida);
    }

    // Implementación del método atacar
    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca con una pistola.");
    }

    // Implementación del método defenderse
    @Override
    public void defenderse() {
        System.out.println(getNombre() + " se defiende.");
    }
}