package introexceptiontrycatchtrace;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = Arrays.asList("John", "Jack", "Jane", null);

    public String getWinner() {
        Random rnd = new Random();
        int winner = rnd.nextInt(names.size());
        return names.get(winner).toUpperCase();
    }
}
