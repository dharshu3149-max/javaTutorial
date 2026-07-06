package day1;

public class switch_case {
    public static void main(String[] args){
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // This block will execute
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
