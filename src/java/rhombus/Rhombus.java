package java.rhombus;

public class Rhombus { //I like "Rhombus"

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void rhombusDrawer(int sizeOfRhombusArea) {
        int spacePartOfRhombus = sizeOfRhombusArea / 2;
        int starPartOfRhombus = sizeOfRhombusArea - 2 * spacePartOfRhombus;

        while (starPartOfRhombus < sizeOfRhombusArea) {
            stringPrinter(starPartOfRhombus, spacePartOfRhombus);
            spacePartOfRhombus--;
            starPartOfRhombus += 2;
        }
        while (starPartOfRhombus > 0) {
            stringPrinter(starPartOfRhombus, spacePartOfRhombus);
            spacePartOfRhombus++;
            starPartOfRhombus -= 2;
        }
        System.out.println("\nGood job! Wish you great rhombuses!!!");
    }

    private static void stringPrinter(int quantityOfStars, int quantityOfSpaces) {
        spacePartOfStringWriter(quantityOfSpaces);
        for (int s = quantityOfStars; s > 0; s--) {
            System.out.print(STAR);
        }
        spacePartOfStringWriter(quantityOfSpaces);
        System.out.println();
    }

    private static void spacePartOfStringWriter(int quantityOfSpaces) {
        for (int p = quantityOfSpaces; p > 0; p--) {
            System.out.print(SPACE);
        }
    }
}
