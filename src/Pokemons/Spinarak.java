package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spinarak extends Pokemon {
    public Spinarak(String name, int level ) {
        super(name, level);

        setType(Type.BUG, Type.POISON);

        setStats(40, 60, 40, 40, 40, 30);
        addMove(new PoisonSting());
        addMove(new Psychic());
        addMove(new Swagger());
    }
}
