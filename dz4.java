import java.util.Scanner;
/**
 * dz4
 */
public class dz4 {

    public static void main(String[] args) {
        System.out.println("\n\nЗадано выражение: 2? + ?5 = 69 . Восстановить выражение до верного равенства.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count += 1;
                    System.out.println(count + ") 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }
    }
}