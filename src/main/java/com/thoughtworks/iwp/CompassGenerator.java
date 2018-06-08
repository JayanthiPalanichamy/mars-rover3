package com.thoughtworks.iwp;

import java.util.ArrayList;
import java.util.List;

public class CompassGenerator {
    private static final List<Compass> COMPASS_LIST = new ArrayList<Compass>() {{
        add(Compass.N);
        add(Compass.E);
        add(Compass.S);
        add(Compass.W);
    }};
    public static final int TOTAL_COMPASSES = 4;
    public static final int LAST_INDEX = TOTAL_COMPASSES-1;


    public static Compass rotateLeft(Compass compass) {
        int index = COMPASS_LIST.indexOf(compass);
        if (index == 0) return COMPASS_LIST.get(LAST_INDEX);
        else return COMPASS_LIST.get(index - 1);
    }

    public static Compass rotateRight(Compass compass) {
        int index = COMPASS_LIST.indexOf(compass);
        return COMPASS_LIST.get((index + 1) % TOTAL_COMPASSES);
    }
}
