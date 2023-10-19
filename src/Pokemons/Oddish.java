package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Oddish extends Pokemon {
    public Oddish(String name, int level ) {
        super(name, level);

        setType(Type.GRASS, Type.POISON);

        setStats(45, 50, 55, 75, 65, 30);
        addMove(new Facade());
        addMove(new MegaDrain());
    }
}
