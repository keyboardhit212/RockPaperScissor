package judd.rockpaperscissor.player;

import judd.rockpaperscissor.shape.Shape;

import java.util.Random;

public class Opponent implements Pickable, Scorable {

    private static Opponent opponent;
    private int score = 0;
    private Shape shape;

    private Opponent() {}

    public static Opponent getInstance() {
        if (opponent == null)
            opponent = new Opponent();
        return opponent;
    }

    @Override
    public Shape pick() {
        this.shape = Shape.pick(generateRandomInt());
        return this.shape;
    }

    private int generateRandomInt() {
        Random randomGenerator = new Random();
        int randomInteger = randomGenerator.nextInt(3);
        return randomInteger + 1;
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
