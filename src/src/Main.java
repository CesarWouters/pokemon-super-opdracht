public class Main {
    public static void main(String[] args) {
Pokemon charmander = new FirePokemon("charmander", 15, "char char", true, true, false, true);
Pokemon bulbasaur = new GrassPokemon("bulbasaur", 12, "bulba", true, false, false, false);
Pokemon blastoise = new WaterPokemon("blastoise", 69, "blastoise", false, true, true, true);
Pokemon pikachu = new LightningPokemon("pikachu", 82, "pika", true, true, true, true);
charmander.PrintSound();
charmander.PrintLevel();
charmander.getMoves();
bulbasaur.getMoves();
blastoise.PrintLevel();
pikachu.PrintSound();
blastoise.firstMove();
pikachu.firstMove();
    }
}