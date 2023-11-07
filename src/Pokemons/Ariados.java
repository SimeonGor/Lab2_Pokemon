package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import Pokemons.Spinarak;
import ru.ifmo.se.pokemon.Type;

public class Ariados extends Spinarak {
    public Ariados(String name, int level ) {
        super(name, level);

        setStats(70, 90, 70, 60, 70, 40);
        addMove(new VenomDrench());
    }
}
