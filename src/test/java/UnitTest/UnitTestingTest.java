package UnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingTest {

    @Test

    public void shouldNumberHigherthen100(){
        //given
        var value = 101;
        //when
        var result = UnitTesting.isHigher(value);
        //then
        Assertions.assertTrue(result);
    }

    @Test

    public void shouldNumberNotHigherThen100(){
        //given
        var value = 100;
        //when
        var result = UnitTesting.isHigher(value);
        //then
        Assertions.assertFalse(result);
    }

    @Test

    public void shouldNumberNotBe0(){
        //given
        var value = 0;
        //when
        var result = UnitTesting.isHigher(value);
        //then
        Assertions.assertFalse(result);
    }
}