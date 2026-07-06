package day6;

public class search_String {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};
        String target = "Cherry";
        int foundIndex = -1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Found " + target + " at index: " + foundIndex);
        } else {
            System.out.println(target + " was not found.");
        }
    }
}
