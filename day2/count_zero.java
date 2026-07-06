package day2;

public class count_zero {
    public static void main(String[] args){
        int[] numbers = {1, 0, 3, 0, 5};
        int count = 0;
        for (int num : numbers) {
            if (num == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
