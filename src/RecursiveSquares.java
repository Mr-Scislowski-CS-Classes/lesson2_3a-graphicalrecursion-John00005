public class RecursiveSquares {
    public static void draw(int n, double x, double y, double length) {
        if (n == 0) {
            return;
        }
        draw(n - 1, x - length / 2, y + length / 2, length / 2);
        draw(n - 1, x + length / 2, y + length / 2, length / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 2);
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledSquare(x, y, length / 2);
        draw(n - 1, x - length / 2, y - length / 2, length / 2);
        draw(n - 1, x + length / 2, y - length / 2, length / 2);
    }

    public static void main(String[] args) {
        draw(1, 0.5, 0.5, 0.5);
    }
}
