package fr.arolla.kata.monoidz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DietTest {

    @ParameterizedTest(name = "{0} is more permissive than {1}")
    @CsvSource(value = {
            "CARNIVOROUS combines VEGAN",
            "CARNIVOROUS combines VEGETARIAN",
            "CARNIVOROUS combines PESCETARIAN",
            "PESCETARIAN combines VEGETARIAN",
            "PESCETARIAN combines VEGAN",
            "VEGETARIAN combines VEGAN"}, delimiterString = " combines ")
    void should_return_permissive_diet_when_combine_diets(Diet permissiveDiet, Diet strictDiet) {
        assertThat(permissiveDiet.combine(strictDiet)).isEqualTo(permissiveDiet);
    }

    @ParameterizedTest(name = "{0} combines with itself")
    @EnumSource(Diet.class)
    void should_return_diet(Diet diet) {
        assertThat(diet.combine(diet)).isEqualTo(diet);
    }

}
