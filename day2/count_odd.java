package day2;

public class count_odd {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
