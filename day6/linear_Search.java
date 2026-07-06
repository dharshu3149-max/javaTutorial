package day6;

public class linear_Search {
    public static void main(String[] args){
        int[] numbers = {5, 12, 8, 21, 3};
        int target = 21;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Found " + target + " at index: " + foundIndex);
        } else {
            System.out.println(target + " is not in the array.");
        }
    }
}
