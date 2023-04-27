import java.util.*;

/**
 * dz11
 */
public class dz11 {

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Сатурн");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Нептун");
        planets.add("Земля");

        System.out.println(Collections.frequency(planets, "Земля"));
        }
}