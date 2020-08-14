package eight;

import java.util.List;

//return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();

public class MixedSum {
    public static int sum(List<?> mixed) {

        int result = 0;

        for (int i = 0; i < mixed.size(); i++) {
            result += Integer.parseInt(String.valueOf(mixed.get(i)));
        }

        return result;
    }
}
