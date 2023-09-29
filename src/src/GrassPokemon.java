public class GrassPokemon extends Pokemon{
    private boolean vinewhip;
    private boolean leechseed;
    private boolean razorleaf;
    private boolean solarbeam;

    public GrassPokemon(String name, int level, String sound, boolean vinewhip, boolean leechseed, boolean razorleaf, boolean solarbeam){
        super(name, level, sound);
        this.vinewhip = vinewhip;
        this.leechseed = leechseed;
        this.razorleaf = razorleaf;
        this. solarbeam = solarbeam;
    }

    public boolean isVinewhip() {
        return vinewhip;
    }

    public void setVinewhip(boolean vinewhip) {
        this.vinewhip = vinewhip;
    }

    public boolean isLeechseed() {
        return leechseed;
    }

    public void setLeechseed(boolean leechseed) {
        this.leechseed = leechseed;
    }

    public boolean isRazorleaf() {
        return razorleaf;
    }

    public void setRazorleaf(boolean razorleaf) {
        this.razorleaf = razorleaf;
    }

    public boolean isSolarbeam() {
        return solarbeam;
    }

    public void setSolarbeam(boolean solarbeam) {
        this.solarbeam = solarbeam;
    }
    @Override
    public void getMoves() {
        System.out.println(getName() + " knows the move vine whip " + isVinewhip());
        System.out.println(getName() + " knows the move leech seed " + isLeechseed());
        System.out.println(getName() + " knows the move razor leaf " + isRazorleaf());
        System.out.println(getName() + " knows the move solar beam " + isSolarbeam());

    }
    public void firstMove() {
        if (vinewhip == true) {
            System.out.println("the first move of " + getName() + " is vine whip");
        } else if (leechseed == true) {
            System.out.println("the first move of " + getName() + " is leech seed");
        } else if (razorleaf == true) {
            System.out.println("the first move of " + getName() + " is razor leaf");
        } else if (solarbeam == true) {
            System.out.println("the first move of " + getName() + " is solar beam");
        } else {
            System.out.println("first move unkown");
        }
    }
}
