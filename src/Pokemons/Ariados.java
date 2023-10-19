package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ariados extends Pokemon {
    public Ariados(String name, int level ) {
        super(name, level);

        setType(Type.BUG, Type.POISON);

        setStats(70, 90, 70, 60, 70, 40);
        addMove(new PoisonSting());
        addMove(new Psychic());
        addMove(new Swagger());
        addMove(new VenomDrench());
    }
}
