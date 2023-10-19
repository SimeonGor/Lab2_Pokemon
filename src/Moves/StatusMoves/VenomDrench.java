package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class VenomDrench extends StatusMove {
    public VenomDrench() {
        super(Type.POISON, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.POISON) {
            Effect eAttack  = new Effect().stat(Stat.ATTACK, -1);
            Effect eSpecialAttack = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
            Effect eSpeed = new Effect().stat(Stat.SPEED, -1);
            p.addEffect(eAttack);
            p.addEffect(eSpeed);
            p.addEffect(eSpecialAttack);
        }
    }

    @Override
    public String describe() {
        String[] name = (this.getClass().toString().split("\\."));
        return "атакует " + name[name.length - 1];
    }
}
