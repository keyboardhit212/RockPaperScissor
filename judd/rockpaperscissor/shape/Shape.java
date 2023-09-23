package judd.rockpaperscissor.shape;

public abstract class Shape implements Comparable<Shape> {

    /**
     * @precondition choice must be an integer whose value is 1, 2 or 3
     * @return an instance of Shape
     * @throws RuntimeException if choice contains different value other than the precondition
     */
    public static Shape pick(int choice) throws RuntimeException {
        if (choice == 1)
            return new Rock();
        else if (choice == 2)
            return new Paper();
        else if (choice == 3)
            return new Scissor();
        else
            throw new RuntimeException("Invalid Choice!");
    }
}
