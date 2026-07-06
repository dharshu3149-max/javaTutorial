package day6;

public class Triangle {
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 5;
        int side3 = 8;
        // 1. All sides are equal
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
