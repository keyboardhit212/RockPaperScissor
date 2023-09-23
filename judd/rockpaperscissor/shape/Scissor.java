package judd.rockpaperscissor.shape;

public class Scissor extends Shape {
    @Override
    public int compareTo(Shape o) {
        if (o instanceof Paper)
            return 1;
        else if (o instanceof Rock)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "\u270C";
    }
}
