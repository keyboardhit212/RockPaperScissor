package judd.rockpaperscissor.screen;

public class Screen {

    private static long refreshRate = 2000;

    public static void clear() {
        System.out.println("\033\143");
    }

    public static void pause() {
        try {
            Thread.sleep(refreshRate);
        } catch (InterruptedException e) {

        }
    }
}
