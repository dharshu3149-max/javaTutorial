package day3;

public class first_last_add {
    public static void main(String[]args){
        int number = 5274;
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println(sum);

    }
}

