package day6;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        String text = "Hello World";
        int vowels = 0;
        int consonants = 0;
        String cleanText = text.toLowerCase();
        for (int i = 0; i < cleanText.length(); i++) {
            char ch = cleanText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }

            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Original Text: " + text);
        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
    }
}
