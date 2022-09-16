package topmail.kz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest1 () {

        Assertions.assertTrue( new Random().nextInt()>=5);
    }

    void exampleTest2 () {

        Assertions.assertTrue(5>=3);
    }
}
