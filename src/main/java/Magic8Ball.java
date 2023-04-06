import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {
    public static void main(String[] args) {

        showMenu();
        while (true){
            Scanner userInput = new Scanner(System.in);
            String userQuestion = userInput.nextLine();
            int randomNumber = new Random().nextInt(6);

            if (randomNumber == 0) {
                askMore("Forsure");
                String answerRough = userInput.nextLine();
                String answer = answerRough.toLowerCase().trim();
                if (answer.equals("y")){
                    showMenu();
                } else if (answer.equals("n")) {
                    break;
                }
            } else if (randomNumber == 1) {
                askMore("No shot");
                String answerRough = userInput.nextLine();
                String answer = answerRough.toLowerCase().trim();
                if (answer.equals("y")){
                    showMenu();
                } else if (answer.equals("n")) {
                    break;
                }
            } else if (randomNumber == 2) {
                askMore("80% of the time it happens 100% of the time");
                String answerRough = userInput.nextLine();
                String answer = answerRough.toLowerCase().trim();
                if (answer.equals("y")){
                    showMenu();
                } else if (answer.equals("n")) {
                    break;
                }
            } else if (randomNumber == 3) {
                askMore("Oh yeah! That's definitely going to happen...");
                String answerRough = userInput.nextLine();
                String answer = answerRough.toLowerCase().trim();
                if (answer.equals("y")){
                    showMenu();
                } else if (answer.equals("n")) {
                    break;
                }
            } else if (randomNumber == 4) {
                askMore("If you know, you know");
                String answerRough = userInput.nextLine();
                String answer = answerRough.toLowerCase().trim();
                if (answer.equals("y")){
                    showMenu();
                } else if (answer.equals("n")) {
                    break;
                }
            } else if (randomNumber == 5) {
                askMore("Try again later LOL");
                String answerRough = userInput.nextLine();
                String answer = answerRough.toLowerCase().trim();
                if (answer.equals("y")){
                    showMenu();
                } else if (answer.equals("n")) {
                    break;
                }
            }
        }

        }
        public static void showMenu() {
            System.out.println("\n\n***************************************************");
            System.out.println("***************************************************");
            System.out.println("         THE MAGIC 8 BALL NOBODY ASKED FOR         ");
            System.out.println("***************************************************");
            System.out.println("***************************************************");

            System.out.println("\n\n\n");
            System.out.println("You may have an answer to any question you seek! Ask wisely");
            System.out.print("What is your question? >>    ");
    }

    public static void askMore(String message){
        System.out.println(message + "\n\n");
        System.out.println("Wanna ask another question??     (Y) / (N)");
    }
}


