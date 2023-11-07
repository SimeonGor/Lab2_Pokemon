package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Pokemons.Oddish;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Oddish {
    public Gloom(String name, int level ) {
        super(name, level);

        setStats(60, 65, 70, 85, 75, 40);
        addMove(new GigaDrain());
    }
}
