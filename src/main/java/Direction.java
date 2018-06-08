import java.util.ArrayList;
import java.util.List;

public class Direction {
    private static final List<Compass> directionList = new ArrayList<Compass>() {{
        add(Compass.N);
        add(Compass.E);
        add(Compass.S);
        add(Compass.W);
    }};


    public static Compass rotateLeft(Compass compass) {
        int index = directionList.indexOf(compass);
        if (index == 0) return directionList.get(3);
        else return directionList.get(index - 1);
    }

    public static Compass rotateRight(Compass compass) {
        int index = directionList.indexOf(compass);
        return directionList.get((index + 1) % 4);
    }
}
