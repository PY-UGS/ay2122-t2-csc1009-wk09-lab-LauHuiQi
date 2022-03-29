public class Main {
    public static void main(String arg[]) {
        RandomCharater rC = new RandomCharater();

        System.out.println("Generating random charaters...\nLower Case\tUpperCase\tDigits");

        for (int i = 0; i < 15; i++) {
            System.out.print("\n" + rC.getRandomLowerCaseLetter());
            System.out.print("\t\t" + rC.getRandomUpperCaseLetter());
            System.out.print("\t\t" + rC.getRandomDigitCharacter());
        }
    }
}