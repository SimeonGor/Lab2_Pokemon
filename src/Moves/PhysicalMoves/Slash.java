package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    public double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1. / 8.;
    }

    @Override
    public String describe() {
        String[] name = (this.getClass().toString().split("\\."));
        return "атакует " + name[name.length - 1];
    }
}
