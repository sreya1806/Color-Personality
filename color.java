import java.util.Scanner;
import java.util.Random;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ColorPersonality {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎨 Welcome to the Color Personality Decoder!");

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("Hi " + name + ", enter your favorite color: ");
        String color = scanner.nextLine().toLowerCase();

        System.out.println("\nPersonality Insight:");

        switch (color) {
            case "blue":
                System.out.println(" You are calm, reliable, and value inner peace.");
                break;
            case "red":
                System.out.println(" Bold and passionate, a born leader!");
                break;
            case "green":
                System.out.println(" Grounded, practical, and caring deeply for others.");
                break;
            case "yellow":
                System.out.println("Bright, cheerful, and creative.");
                break;
            case "black":
                System.out.println(" Mysterious and elegant. Deep thinker!");
                break;
            case "white":
                System.out.println(" Peaceful, pure, and organized.");
                break;
            case "purple":
                System.out.println(" Imaginative, spiritual, and artistic.");
                break;
            case "pink":
                System.out.println(" Soft-hearted and loving nature.");
                break;
            default:
                System.out.println(" Unique and vibrant! You walk your own path.");
        }

        // 📅 Day-based Motivation
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        System.out.println("\n Today is: " + today);
        switch (today) {
            case MONDAY:
                System.out.println("🚀Fresh start! Plan your week wisely.");
                break;
            case FRIDAY:
                System.out.println("🎉 It's almost the weekend, stay motivated!");
                break;
            case SUNDAY:
                System.out.println("😌 Relax and recharge your energy.");
                break;
            default:
                System.out.println("💪 Keep going! You're doing amazing.");
        }

        // Mini Quiz Suggestion
        System.out.println("\n Quick quiz! Let's discover a matching color.");
        System.out.print("Do you prefer calm or adventure? ");
        String q1 = scanner.nextLine().toLowerCase();
        System.out.print("Do you enjoy nature or city lights? ");
        String q2 = scanner.nextLine().toLowerCase();

        if (q1.equals("calm") && q2.equals("nature")) {
            System.out.println(" Your calming color might be GREEN.");
        } else if (q1.equals("adventure") && q2.equals("city lights")) {
            System.out.println("Your energetic color might be RED.");
        } else {
            System.out.println(" Maybe YELLOW or BLUE fits your vibe!");
        }

        // 🌈 Fun Fact
        String[] facts = {
            " Yellow is the most visible color from a distance.",
            " Blue is the most preferred color in the world.",
            " Red can increase heart rate and energy!",
            " Green is calming and often used in hospitals.",
            " Purple was once reserved only for royalty."
        };
        int index = new Random().nextInt(facts.length);
        System.out.println("\n Fun Fact: " + facts[index]);

        // 😄 Mood Response
        System.out.print("\nHow are you feeling today? (happy/sad/stressed): ");
        String mood = scanner.nextLine().toLowerCase();

        switch (mood) {
            case "happy":
                System.out.println("Stay happy, " + name + "! Keep spreading joy!");
                break;
            case "sad":
                System.out.println(" You're doing great!");
                break;
            case "stressed":
                System.out.println(" Breathe and relax. You got this!");
                break;
            default:
                System.out.println(" Wishing you a calm and beautiful day, " + name + "!");
        }

        // ⏳ Simulate "saving"
        System.out.println("\n Processing your color profile...");
        Thread.sleep(1000);
        System.out.println("all insights complete!");

        //Try Again?
        System.out.print("\nDo you want to try again? (yes/no): ");
        String again = scanner.nextLine().toLowerCase();
        if (again.equals("yes")) {
            System.out.println("\n Restarting...\n");
            main(null); // restart
        } else {
            System.out.println("\n Thank you, " + name + "! Stay colorful!");
        }

        scanner.close();
    }
}
