package day2;

public class largest_number {
    public static void main(String[] args){
        int[] numbers = {4, 12, 7, 23, 9};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
