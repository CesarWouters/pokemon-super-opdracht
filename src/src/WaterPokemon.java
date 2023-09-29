public class WaterPokemon extends Pokemon {
    private boolean bubble;
    private boolean watergun;
    private boolean surf;
    private boolean hydropump;

    public WaterPokemon(String name, int level, String sound, boolean bubble, boolean watergun, boolean surf, boolean hydropump){
        super(name, level, sound);
        this.bubble = bubble;
        this.watergun = watergun;
        this.surf = surf;
        this.hydropump = hydropump;
    }

    public boolean isBubble() {
        return bubble;
    }

    public void setBubble(boolean bubble) {
        this.bubble = bubble;
    }

    public boolean isWatergun() {
        return watergun;
    }

    public void setWatergun(boolean watergun) {
        this.watergun = watergun;
    }

    public boolean isSurf() {
        return surf;
    }

    public void setSurf(boolean surf) {
        this.surf = surf;
    }

    public boolean isHydropump() {
        return hydropump;
    }

    public void setHydropump(boolean hydropump) {
        this.hydropump = hydropump;
    }
    @Override
    public void getMoves() {
        System.out.println(getName() + " knows the move bubble " + isBubble());
        System.out.println(getName() + " knows the move water gun " + isWatergun());
        System.out.println(getName() + " knows the move surf " + isSurf());
        System.out.println(getName() + " knows the move hydro pump " + isHydropump());

    }
    public void firstMove() {
        if (bubble == true) {
            System.out.println("the first move of " + getName() + " is bubble");
        } else if (watergun == true) {
            System.out.println("the first move of " + getName() + " is water gun");
        } else if (surf == true) {
            System.out.println("the first move of " + getName() + " is surf");
        } else if (hydropump == true) {
            System.out.println("the first move of " + getName() + " is hydro pump");
        } else {
            System.out.println("first move unkown");
        }
    }
}
