import java.util.Random;

/**
 * @author Julia Marushkina
 */
public class Exercise1 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int first = randomGenerator.nextInt();
        int second = randomGenerator.nextInt();
        int third = randomGenerator.nextInt();
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        int sum = first + second + third;
        System.out.println("first + second + third = " + sum);
        if (first == second && second == third) {
            System.out.println("Player wins");

        }
    }
}
