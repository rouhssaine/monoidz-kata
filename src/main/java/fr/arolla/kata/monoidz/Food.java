package fr.arolla.kata.monoidz;

public record Food(Diet diet, boolean isOrganic) {

    public Food combine(Food food) {
        Diet combineDiet = this.diet.combine(food.diet);
        boolean isOrganic = food.isOrganic && this.isOrganic;
        return new Food(combineDiet, isOrganic);
    }

}
