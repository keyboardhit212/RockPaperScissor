package judd.rockpaperscissor.battle;

import judd.rockpaperscissor.player.Opponent;
import judd.rockpaperscissor.player.Player;

public class Battle {

    private Player player;
    private Opponent opponent;
    private int battleResult = 0;

    public Battle (Player player, Opponent opponent) {
        this.player = player;
        this.opponent = opponent;
        play();
    }

    public void displayResult() {
        displayScore();
        System.out.println(player + "  vs  " + opponent);
    }

    public void displayStatus() {
        displayScore();
        switch (this.battleResult) {
            case 1:
                System.out.println("You won!");
                break;
            case -1:
                System.out.println("You lost!");
                break;
            default:
                System.out.println("It's a tie.");
        }
    }

    private void displayScore() {
        System.out.println("Score: " + this.player.getScore() + " : " + this.opponent.getScore());
    }

    private void play() {
        this.battleResult = this.player.pick().compareTo(this.opponent.pick());
        updateScore();
    }

    private void updateScore() {
        if (this.battleResult == 1)
            this.player.increaseScore();
        else if (this.battleResult == -1)
            this.opponent.increaseScore();
    }


}
