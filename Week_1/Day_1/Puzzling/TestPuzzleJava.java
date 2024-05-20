package Week_1.Day_1.Puzzling;

import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        
        // Test getTenRolls method
        System.out.println("----- getTenRolls Test -----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // Test getRandomLetter method
        System.out.println("\n----- getRandomLetter Test -----");
        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        // Test generatePassword method
        System.out.println("\n----- generatePassword Test -----");
        String password = generator.generatePassword();
        System.out.println(password);

        // Test getNewPasswordSet method
        System.out.println("\n----- getNewPasswordSet Test -----");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(5);
        System.out.println(passwordSet);

        // Bonus: Test shuffleArray method
        System.out.println("\n----- shuffleArray Test -----");
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        generator.shuffleArray(array);
        System.out.print("Shuffled array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

