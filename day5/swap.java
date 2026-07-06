package day5;

public class swap {
    public static void main(String[] args){
        int first = 10;
        int second = 20;
        int temp = first;
        first = second;
        second = temp;
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}
