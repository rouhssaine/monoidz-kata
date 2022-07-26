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
        Food salad = new Food(VEGAN);
        Food cheese = new Food(VEGETARIAN);

        // When
        Food result = salad.combine(cheese);

        // Then
        assertThat(result.diet()).isEqualTo(VEGETARIAN);
    }
}
