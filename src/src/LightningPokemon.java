public class LightningPokemon extends Pokemon {
    private boolean thundershock;
    private boolean thunderpunch;
    private boolean thunderbolt;
    private boolean thunder;

    public LightningPokemon(String name, int level, String sound, boolean thundershock, boolean thunderpunch, boolean thunderbolt, boolean thunder){
        super(name, level, sound);
        this.thundershock = thundershock;
        this.thunderpunch = thunderpunch;
        this.thunderbolt = thunderbolt;
        this.thunder = thunder;
    }

    public boolean isThundershock() {
        return thundershock;
    }

    public void setThundershock(boolean thundershock) {
        this.thundershock = thundershock;
    }

    public boolean isThunderpunch() {
        return thunderpunch;
    }

    public void setThunderpunch(boolean thunderpunch) {
        this.thunderpunch = thunderpunch;
    }

    public boolean isThunderbolt() {
        return thunderbolt;
    }

    public void setThunderbolt(boolean thunderbolt) {
        this.thunderbolt = thunderbolt;
    }

    public boolean isThunder() {
        return thunder;
    }

    public void setThunder(boolean thunder) {
        this.thunder = thunder;
    }
    @Override
    public void getMoves() {
        System.out.println(getName() + " knows the move thundershock " + isThundershock());
        System.out.println(getName() + " knows the move thunderpunch " + isThunderpunch());
        System.out.println(getName() + " knows the move thunderbolt " + isThunderbolt());
        System.out.println(getName() + " knows the move thunder " + isThunder());

    }
    public void firstMove() {
        if (thundershock == true) {
            System.out.println("the first move of " + getName() + " thundershock");
        } else if (thunderpunch == true) {
            System.out.println("the first move of " + getName() + " is thunderpunch");
        } else if (thunderbolt == true) {
            System.out.println("the first move of " + getName() + " is thunderbolt");
        } else if (thunder == true) {
            System.out.println("the first move of " + getName() + " is thunder");
        } else {
            System.out.println("first move unkown");
        }
    }
}
