package judd.rockpaperscissor;

import judd.rockpaperscissor.battle.Battle;
import judd.rockpaperscissor.player.Opponent;
import judd.rockpaperscissor.player.Player;
import judd.rockpaperscissor.screen.Screen;

public class Main {

    public static void main(String[] args) {

        Opponent computer = Opponent.getInstance();
        Player judd = Player.getInstance();
        Battle battle;

        while (true) {
            battle = new Battle(judd, computer);
            Screen.clear();
            battle.displayResult();
            Screen.pause();
            Screen.clear();
            battle.displayStatus();
            Screen.pause();
            Screen.clear();
        }

    }
}
