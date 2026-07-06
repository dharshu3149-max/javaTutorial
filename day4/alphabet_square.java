package day4;

public class alphabet_square {
    public static void main(String[] args){
        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }

    }
}
