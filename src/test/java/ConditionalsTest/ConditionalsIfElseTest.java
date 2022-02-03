package ConditionalsTest;

import Conditionals.ConditionalsIfElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalsIfElseTest {

    @Test

    public void shouldBeMoreThirtyPersons(){

        //given

        int persons = 35;

        //what

       String actual = ConditionalsIfElse.toManyHumans(persons);

       //then

        Assertions.assertEquals("Zu viele Personen!", actual);
    }

    @Test

    public void shouldBeLessThirtyPersons(){

        //given

        int persons = 29;

        //what

        String actual = ConditionalsIfElse.toManyHumans(persons);

        //then

        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", actual);

    }

}