import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Given a board size of n * m, find the maximum amount of dominoes that can fit on the board.
         */

        // Dominoes cover 2 spaces each. As the total covered area can be represented by A = 2D,
        // No amount of dominoes can ever fully cover an odd amount of space.

        // For even areas, dominoes can cover all available spaces.
        // This is because there are two cases when an area is even, as one dimension must be even to make the area even.
        // Case 1: Both n and m are even, and dominoes can be arranged side by side all either horizontally or vertically.
        // Case 2: Either n or m is odd, and dominoes can be arranged side by side horizontally or vertically, until the final row.
        // On the final row, dominoes must be arranged the opposite orientation, however can fill all spaces this way.

        // When are is odd, the same strategy can be used, however, there will always be one empty space by nature of a dominoes area.

        Scanner s = new Scanner(System.in);
        String[] inputs = s.nextLine().split(" ");

        // If area is even, area / 2 dominoes can fit.
        // If area is odd, (area - 1) / 2 dominoes can fit.
        // This is convenient, because integer division ensures area / 2 covers both cases.
        int area = Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[1]);
        int dominoes = area / 2;

        System.out.println(dominoes);


    }

}