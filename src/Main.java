import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(4, 6, 7, 8, 9, 19, 2, 12, 13));
        integers.stream().filter(list -> list % 2 == 0).map(l -> l * l)
                .toList().stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}