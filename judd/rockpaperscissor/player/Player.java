package judd.rockpaperscissor.player;

import judd.rockpaperscissor.shape.Shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player implements Pickable, Scorable {

    private static Player person;
    private int score = 0;
    private Shape shape;

    private Player() {}

    public static Player getInstance() {
        if (person == null)
            person = new Player();
        return person;
    }

    @Override
    public Shape pick() {
        this.shape = Shape.pick(getChoice());
        return this.shape;
    }

    private int getChoice() {
        displayChoices();
        while (true) {
            try {
                int choice = inputChoice();
                if (choice > 3 || choice < 1)
                    throw new InputMismatchException("Invalid choice!");
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Try again!");
            }
        }
    }

    private void displayChoices() {
        System.out.println("""
        1 --> Rock
        2 --> Paper
        3 --> Scissor
        """);
    }

    private int inputChoice() {
        Scanner console = new Scanner(System.in);
        System.out.print("Choose: ");
        return console.nextInt();
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public void increaseScore() {
        this.score++;
    }

    @Override
    public String toString() {
        return this.shape.toString();
    }
}
