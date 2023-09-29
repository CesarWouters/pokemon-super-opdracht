public class FirePokemon extends Pokemon {
    private boolean ember;
    private boolean flamethrower;
    private boolean firespin;
    private boolean fireblast;

    public FirePokemon(String name, int level, String sound, boolean ember, boolean flamethrower, boolean firespin, boolean fireblast) {
        super(name, level, sound);
        this.ember = ember;
        this.flamethrower = flamethrower;
        this.firespin = firespin;
        this.fireblast = fireblast;
    }

    public boolean isEmber() {
        return ember;
    }

    public void setEmber(boolean ember) {
        this.ember = ember;
    }

    public boolean isFlamethrower() {
        return flamethrower;
    }

    public void setFlamethrower(boolean flamethrower) {
        this.flamethrower = flamethrower;
    }

    public boolean isFirespin() {
        return firespin;
    }

    public void setFirespin(boolean firespin) {
        this.firespin = firespin;
    }

    public boolean isFireblast() {
        return fireblast;
    }

    public void setFireblast(boolean fireblast) {
        this.fireblast = fireblast;
    }

    @Override
    public void getMoves() {
        System.out.println(getName() + " knows the move ember " + isEmber());
        System.out.println(getName() + " knows the move flamethrower " + isFlamethrower());
        System.out.println(getName() + " knows the move fire spin " + isFirespin());
        System.out.println(getName() + " knows the move fire blast " + isFireblast());

    }
    public void firstMove() {
        if (ember == true) {
            System.out.println("the first move of " + getName() + " is ember");
        } else if (flamethrower == true) {
            System.out.println("the first move of " + getName() + " is flamethrower");
        } else if (firespin == true) {
            System.out.println("the first move of " + getName() + " is fire spin");
        } else if (fireblast == true) {
            System.out.println("the first move of " + getName() + " is fire blast");
        } else {
            System.out.println("first move unkown");
        }
    }
}