package java_assignment_code;
import java.util.Scanner;

public class KBCQuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        int correctAnswers = 0;
        int skippedQuestions = 0;
        int wrongAnswers = 0;

        System.out.print("Do you want to start the KBC Quiz Game? (yes/no): ");
        String startGame = scanner.nextLine().trim().toLowerCase();

        if (!startGame.equals("yes")) {
            System.out.println("Game exited.");
            scanner.close();
            return;
        }

        // Question 1
        System.out.println("\nQuestion 1: Which planet is known as the Red Planet?");
        System.out.println("A. Earth");
        System.out.println("B. Mars");
        System.out.println("C. Jupiter");
        System.out.println("D. Venus");
        System.out.print("Enter your answer (A/B/C/D) or type 'skip': ");
        String answer1 = scanner.nextLine().trim().toUpperCase();

        if (answer1.equals("SKIP")) {
            skippedQuestions++;
        } else if (answer1.length() == 1 && "ABCD".indexOf(answer1.charAt(0)) != -1) {
            if (answer1.charAt(0) == 'B') {
                totalScore += 1000;
                correctAnswers++;
                System.out.println("Correct! You've earned 1000 points.");
            } else {
                System.out.println("Wrong answer. Game over.");
                wrongAnswers++;
                endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
                return;
            }
        } else {
            System.out.println("Invalid input. Game over.");
            wrongAnswers++;
            endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
            return;
        }

        // Question 2
        System.out.println("\nQuestion 2: Who wrote the national anthem of India?");
        System.out.println("A. Rabindranath Tagore");
        System.out.println("B. Mahatma Gandhi");
        System.out.println("C. Subhash Chandra Bose");
        System.out.println("D. Jawaharlal Nehru");
        System.out.print("Enter your answer (A/B/C/D) or type 'skip': ");
        String answer2 = scanner.nextLine().trim().toUpperCase();

        if (answer2.equals("SKIP")) {
            skippedQuestions++;
        } else if (answer2.length() == 1 && "ABCD".indexOf(answer2.charAt(0)) != -1) {
            if (answer2.charAt(0) == 'A') {
                totalScore += 2000;
                correctAnswers++;
                System.out.println("Correct! You've earned 2000 points.");
            } else {
                System.out.println("Wrong answer. Game over.");
                wrongAnswers++;
                endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
                return;
            }
        } else {
            System.out.println("Invalid input. Game over.");
            wrongAnswers++;
            endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
            return;
        }

        // Question 3
        System.out.println("\nQuestion 3: Which is the longest river in the world?");
        System.out.println("A. Amazon");
        System.out.println("B. Yangtze");
        System.out.println("C. Nile");
        System.out.println("D. Ganga");
        System.out.print("Enter your answer (A/B/C/D) or type 'skip': ");
        String answer3 = scanner.nextLine().trim().toUpperCase();

        if (answer3.equals("SKIP")) {
            skippedQuestions++;
        } else if (answer3.length() == 1 && "ABCD".indexOf(answer3.charAt(0)) != -1) {
            if (answer3.charAt(0) == 'C') {
                totalScore += 3000;
                correctAnswers++;
                System.out.println("Correct! You've earned 3000 points.");
            } else {
                System.out.println("Wrong answer. Game over.");
                wrongAnswers++;
                endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
                return;
            }
        } else {
            System.out.println("Invalid input. Game over.");
            wrongAnswers++;
            endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
            return;
        }

        // Question 4
        System.out.println("\nQuestion 4: Which element has the chemical symbol 'O'?");
        System.out.println("A. Gold");
        System.out.println("B. Oxygen");
        System.out.println("C. Osmium");
        System.out.println("D. Ozone");
        System.out.print("Enter your answer (A/B/C/D) or type 'skip': ");
        String answer4 = scanner.nextLine().trim().toUpperCase();

        if (answer4.equals("SKIP")) {
            skippedQuestions++;
        } else if (answer4.length() == 1 && "ABCD".indexOf(answer4.charAt(0)) != -1) {
            if (answer4.charAt(0) == 'B') {
                totalScore += 5000;
                correctAnswers++;
                System.out.println("Correct! You've earned 5000 points.");
            } else {
                System.out.println("Wrong answer. Game over.");
                wrongAnswers++;
                endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
                return;
            }
        } else {
            System.out.println("Invalid input. Game over.");
            wrongAnswers++;
            endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
            return;
        }

        // Question 5
        System.out.println("\nQuestion 5: In which year did India gain independence?");
        System.out.println("A. 1945");
        System.out.println("B. 1946");
        System.out.println("C. 1947");
        System.out.println("D. 1948");
        System.out.print("Enter your answer (A/B/C/D) or type 'skip': ");
        String answer5 = scanner.nextLine().trim().toUpperCase();

        if (answer5.equals("SKIP")) {
            skippedQuestions++;
        } else if (answer5.length() == 1 && "ABCD".indexOf(answer5.charAt(0)) != -1) {
            if (answer5.charAt(0) == 'C') {
                totalScore += 10000;
                correctAnswers++;
                System.out.println("Correct! You've earned 10000 points.");
            } else {
                System.out.println("Wrong answer. Game over.");
                wrongAnswers++;
                endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
                return;
            }
        } else {
            System.out.println("Invalid input. Game over.");
            wrongAnswers++;
            endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
            return;
        }

        if (skippedQuestions == 5) {
            System.out.println("\nYou skipped all questions. Game over.");
        }

        endGame(totalScore, correctAnswers, skippedQuestions, wrongAnswers, scanner);
    }

    public static void endGame(int totalScore, int correctAnswers, int skippedQuestions, int wrongAnswers, Scanner scanner) {
        System.out.println("\n===== Game Summary =====");
        System.out.println("Total Score: " + totalScore);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Skipped Questions: " + skippedQuestions);
        System.out.println("Wrong Answers: " + wrongAnswers);

        System.out.print("\nWould you like to rate the game (1-5 stars)? ");
        String rating = scanner.nextLine().trim();
        System.out.println("Thank you for your feedback!");

        scanner.close();
    }
}
