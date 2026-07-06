package day5;

public class enhance_for_loop {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int[] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
