package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Zangoose extends Pokemon {
    public Zangoose(String name, int level ) {
        super(name, level);

        setType(Type.NORMAL);
        setStats(73, 115, 60, 60, 60, 90);
        addMove(new Slash());
        addMove(new Thunderbolt());
        addMove(new RockSlide());
        addMove(new IceBeam());
    }
}
