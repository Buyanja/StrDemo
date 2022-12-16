import java.util.Random;

public class Main {
    static String[] names = {"Peter", "Michell", "Jane", "Steve"};
    static String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
    static String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
    static String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
    static String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
    static String[] details = {"near the river", "at home", "in the park"};

    public static String getRandomWord (String[]words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
    public static void main(String[] args) {

        System.out.println("Hello, this is your first random-generated sentence: ");

        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);
            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetail);
            System.out.println("Click [Enter] to generate a new one.");
        }
    }

}

