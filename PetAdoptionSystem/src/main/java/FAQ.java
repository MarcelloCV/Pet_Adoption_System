import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PetFAQ {
    private static Map<String, String> faqDatabase;

    public static void FAQ() {
        initializeFAQs();

        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to the Pet FAQ system!");
        System.out.println("Enter the type of pet you have (cat, dog, bird, bunny) or type 'exit' to quit:");

        while (true) {
            userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (faqDatabase.containsKey(userInput)) {
                System.out.println(faqDatabase.get(userInput));
            } else {
                System.out.println("Sorry, we don't have FAQs for that pet type. Please try again.");
            }
        }
        scanner.close();
        return;
    }

    private static void initializeFAQs() {
        faqDatabase = new HashMap<>();

        faqDatabase.put("cat", "FAQs about Cats:\n" +
                "Q: What do cats eat?\n" +
                "A: Cats are obligate carnivores, meaning they primarily eat meat.\n" +
                "Q: How often should I take my cat to the vet?\n" +
                "A: Cats should have annual check-ups, and more frequently if they have health issues or are seniors.\n" +
                "Q: How long do cats live?"+
                "A: The average lifespan of an indoor cat is 13 to 17 years. "               
                );

        faqDatabase.put("dog", "FAQs about Dogs:\n" +
                "Q: What should I feed my dog?\n" +
                "A: Dogs need a balanced diet of protein, carbohydrates, and fats.\n" +
                "Q: How often should I walk my dog?\n" +
                "A: Dogs generally need at least one walk per day, but it depends on the breed and energy level.");

        faqDatabase.put("bird", "FAQs about Birds:\n" +
                "Q: What do birds eat?\n" +
                "A: Birds eat a variety of seeds, fruits, and insects depending on the species.\n" +
                "Q: How do I train my bird?\n" +
                "A: Birds can be trained using positive reinforcement techniques, and patience is key.");

        faqDatabase.put("bunny", "FAQs about Bunnies:\n" +
                "Q: What do bunnies eat?\n" +
                "A: Bunnies need a diet high in fiber, so they primarily eat hay, vegetables, and some pellets.\n" +
                "Q: How do I litter train my bunny?\n" +
                "A: Bunnies can be litter trained similarly to cats, using a litter box filled with bunny-safe litter.");
    }
}
