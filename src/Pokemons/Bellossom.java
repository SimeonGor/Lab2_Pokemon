package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Pokemons.Gloom;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.Type;
public class Bellossom extends Gloom {
    public Bellossom(String name, int level ) {
        super(name, level);

        setType(Type.GRASS);

        setStats(75, 80, 95, 90, 100, 50);
        addMove(new Confide());
    }
}
