import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first political party:");
        String party1 = scanner.nextLine();

        System.out.println("Enter the number of votes received by the first political party:");
        int votes1 = scanner.nextInt();
        scanner.nextLine();  // This is added to consume the newline character left in the buffer by nextInt()

        System.out.println("Enter the name of the second political party:");
        String party2 = scanner.nextLine();

        System.out.println("Enter the number of votes received by the second political party:");
        int votes2 = scanner.nextInt();
        scanner.nextLine();  // This is added to consume the newline character left in the buffer by nextInt()

        System.out.println("Enter the name of the third political party:");
        String party3 = scanner.nextLine();

        System.out.println("Enter the number of votes received by the third political party:");
        int votes3 = scanner.nextInt();

        int totalVotes = votes1 + votes2 + votes3;

        double percentage1 = (double) votes1 / totalVotes * 100;
        double percentage2 = (double) votes2 / totalVotes * 100;
        double percentage3 = (double) votes3 / totalVotes * 100;

        System.out.println(party1 + " received " + percentage1 + "% of the votes.");
        System.out.println(party2 + " received " + percentage2 + "% of the votes.");
        System.out.println(party3 + " received " + percentage3 + "% of the votes.");
    }
}