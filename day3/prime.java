package day3;

public class prime {
    public static void main(String[] args){
        int number = 11;
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("It is a prime");
        } else {
            System.out.println("Not a prime ");
        }

    }
}
