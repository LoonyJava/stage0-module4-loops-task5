package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height; y++) {
                if (x < height / 2) {
                    if (y < x || y >= height - x) {
                        System.out.print(" ");
                    } else System.out.print(8);
                } else {
                    if (y > x || y < height -1 - x) {
                        System.out.print(" ");
                    } else System.out.print(8);
                }
                if (y == height - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(3);
    }
}


