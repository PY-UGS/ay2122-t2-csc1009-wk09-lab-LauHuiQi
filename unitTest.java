import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class unitTest {
    RandomCharater rC = new RandomCharater();

    @Test
    @DisplayName("Testing random characters")
    @RepeatedTest(15)
    public void getRandomCharacterTest() {
        char c = rC.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(c));

        c = rC.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(c));

        int i = rC.getRandomDigitCharacter();
        assertTrue(i < 10 && i >= 0);
    }
}
