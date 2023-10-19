import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle ();

        Spinarak spinarak = new Spinarak("Spinarak", 1);
        Zangoose zangoose = new Zangoose("Zangoose", 1);
        Ariados ariados = new Ariados("Ariados", 1);
        Oddish oddish = new Oddish("Oddish", 1);
        Gloom gloom = new Gloom("Gloom", 1);
        Bellossom bellossom = new Bellossom("Bellossom", 1);

        b.addAlly(spinarak);
        b.addAlly(ariados);
        b.addAlly(gloom);

        b.addFoe(zangoose);
        b.addFoe(oddish);
        b.addFoe(bellossom);

        b.go();
    }
}