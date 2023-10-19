package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    public String describe() {
        String[] name = (this.getClass().toString().split("\\."));
        return "атакует " + name[name.length - 1];
    }
}
