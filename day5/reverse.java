package day5;

public class reverse {
    public static void main(String[] args){
        String[] countdown = {"Launch!", "One", "Two", "Three"};
        for (int i = countdown.length - 1; i >= 0; i--) {
            System.out.println(countdown[i]);
        }
    }
}
