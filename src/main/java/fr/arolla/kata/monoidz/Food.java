package fr.arolla.kata.monoidz;

public record Food(Diet diet) {

    public Food combine(Food food) {
        Diet combineDiet = this.diet.combine(food.diet);
        return new Food(combineDiet);
    }

}
