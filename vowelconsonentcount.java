package J12;

public class vowelconsonentcount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        countVowelsAndConsonants(str);
    }

    // Simplified method to count vowels and consonants and print them
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}

