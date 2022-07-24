package fr.arolla.kata.monoidz;

public enum Diet {
    VEGAN(0),
    VEGETARIAN(1),
    PESCETARIAN(2),
    CARNIVOROUS(3);

    private final int permissive;

    Diet(int permissive) {
        this.permissive = permissive;
    }

    public int getPermissive() {
        return permissive;
    }

    public Diet combine(Diet diet) {
        return this.getPermissive() > diet.getPermissive() ? this : diet;
    }
}
