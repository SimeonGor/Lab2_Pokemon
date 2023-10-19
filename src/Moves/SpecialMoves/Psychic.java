package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        if ((new Effect()).chance(10).success()) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }

    @Override
    public String describe() {
        String[] name = (this.getClass().toString().split("\\."));
        return "атакует " + name[name.length - 1];
    }
}
