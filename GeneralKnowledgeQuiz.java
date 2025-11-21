import java.util.Scanner;

public class GeneralKnowledgeQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of Bangladesh?",
            "2. Who is known as the Father of the Nation of Bangladesh?",
            "3. What is the largest planet in our solar system?",
            "4. Who wrote 'Gitanjali'?",
            "5. What is the national flower of Bangladesh?",
            "6. Which gas do plants absorb during photosynthesis?",
            "7. Who invented the telephone?",
            "8. What is the currency of Japan?",
            "9. How many continents are there in the world?",
            "10. What is the hardest natural substance?"
        };

        String[] answers = {
            "Dhaka",
            "Bangabandhu Sheikh Mujibur Rahman",
            "Jupiter",
            "Rabindranath Tagore",
            "Water Lily",
            "Carbon Dioxide",
            "Alexander Graham Bell",
            "Yen",
            "7",
            "Diamond"
        };

        int score = 0;

        System.out.println("===== HIGH SCHOOL GENERAL KNOWLEDGE QUIZ =====\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your Answer: ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("✔ Correct!\n");
                score++;
            } else {
                System.out.println("✘ Wrong! Correct Answer: " + answers[i] + "\n");
            }
        }

        System.out.println("==============================================");
        System.out.println("Your Final Score: " + score + " out of 10");

        if (score >= 8) {
            System.out.println("Excellent! Great Job!");
        } else if (score >= 5) {
            System.out.println("Good! Keep improving!");
        } else {
            System.out.println("Needs Improvement. Study more!");
        }

        input.close();
    }
}