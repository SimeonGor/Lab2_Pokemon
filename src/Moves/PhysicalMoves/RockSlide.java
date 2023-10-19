package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK,  75, 90);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        if ((new Effect()).chance(30).success()) {
            Effect.flinch(p);
        }
    }
    @Override
    public String describe() {
        String[] name = (this.getClass().toString().split("\\."));
        return "атакует " + name[name.length - 1];
    }
}
