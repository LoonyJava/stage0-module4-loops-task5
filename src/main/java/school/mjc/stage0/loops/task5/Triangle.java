package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int x = 0; x < cathetusLength; x++) {
            for (int y = 0; y < cathetusLength; y++) {
                if (y <= x) {
                    System.out.print(8);
                }
                if (y == cathetusLength - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(3);
    }
}
