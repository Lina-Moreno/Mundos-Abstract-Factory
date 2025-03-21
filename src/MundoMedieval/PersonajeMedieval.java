package MundoMedieval;

import ClasesAbstractasMundos.Personaje;

public class PersonajeMedieval extends Personaje {
    // Constructor
    public PersonajeMedieval(String nombre, int vida) {
        super(nombre, vida);
    }

    // Implementación del método atacar
    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca con una espada medieval.");
    }

    // Implementación del método defenderse
    @Override
    public void defenderse() {
        System.out.println(getNombre() + " se defiende con un escudo de madera.");
    }
}