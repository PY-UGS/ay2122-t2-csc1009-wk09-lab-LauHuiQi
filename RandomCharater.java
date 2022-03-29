import java.util.Random;
import java.lang.String;

public class RandomCharater {

    public char getRandomLowerCaseLetter() {
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');

        return randomizedCharacter;
    }

    public char getRandomUpperCaseLetter() {
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'A');

        return randomizedCharacter;
    }

    public int getRandomDigitCharacter() {
        Random random = new Random();
        int randomInt = random.nextInt(0, 10);

        return randomInt;
    }

    public String getRandomCharater() {
        Random random = new Random();
        int randomInt = random.nextInt(0, 3);
        String randomChar = "";

        switch (randomInt) {
            case 0:
                randomChar = getRandomLowerCaseLetter() + "";
                break;
            case 1:
                randomChar = getRandomUpperCaseLetter() + "";
                break;
            case 2:
                randomChar = getRandomDigitCharacter() + "";
                break;

        }

        return randomChar;
    }

}
