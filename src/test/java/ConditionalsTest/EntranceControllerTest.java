package ConditionalsTest;

import Conditionals.EntranceController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntranceControllerTest {

    @Test

    public void shouldBeMoreThirtyPersons(){

        //given

        int persons = 35;

        //what

       String actual = EntranceController.toManyHumans(persons);

       //then

        Assertions.assertEquals("Zu viele Personen!", actual);
    }

    @Test

    public void shouldBeLessThirtyPersons(){

        //given

        int persons = 29;

        //what

        String actual = EntranceController.toManyHumans(persons);

        //then

        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", actual);

    }

}