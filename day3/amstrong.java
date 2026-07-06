package day3;

public class amstrong {
    public static void main(String[] args){
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            number = number / 10;
        }
        if (sum == originalNumber) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

    }
}
