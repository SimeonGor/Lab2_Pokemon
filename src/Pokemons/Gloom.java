package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Pokemon {
    public Gloom(String name, int level ) {
        super(name, level);

        setType(Type.GRASS, Type.POISON);

        setStats(60, 65, 70, 85, 75, 40);
        addMove(new Facade());
        addMove(new MegaDrain());
        addMove(new GigaDrain());
    }
}
