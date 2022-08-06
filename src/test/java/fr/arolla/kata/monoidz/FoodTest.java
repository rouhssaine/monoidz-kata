package fr.arolla.kata.monoidz;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static fr.arolla.kata.monoidz.Diet.VEGAN;
import static fr.arolla.kata.monoidz.Diet.VEGETARIAN;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
public class FoodTest {

    @Test
    void should_return_vegetarian_food_when_combine_vegan_and_vegetarian_food() {
        // Given
        Food salad = new Food(VEGAN, true);
        Food cheese = new Food(VEGETARIAN, true);

        // When
        Food result = salad.combine(cheese);

        // Then
        assertThat(result.diet()).isEqualTo(VEGETARIAN);
        assertThat(result.isOrganic()).isTrue();
    }

    @Test
    void should_return_not_organic_foor_when_has_not_organic_food_in_composition() {
        // Given
        Food salad = new Food(VEGAN, false);
        Food cheese = new Food(VEGAN, true);

        // When
        Food result = salad.combine(cheese);

        // Then
        assertThat(result.diet()).isEqualTo(VEGAN);
        assertThat(result.isOrganic()).isFalse();
    }
}
