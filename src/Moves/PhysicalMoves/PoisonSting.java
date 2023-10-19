package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonSting extends PhysicalMove {
    public PoisonSting() {
        super(Type.POISON, 15, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        if ((new Effect()).chance(30).success()) {
            Effect.poison(p);
        }
    }

    @Override
    public String describe() {
        String[] name = (this.getClass().toString().split("\\."));
        return "атакует " + name[name.length - 1];
    }
}
