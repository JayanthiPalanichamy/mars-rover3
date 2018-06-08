import java.util.ArrayList;
import java.util.List;

public class Direction {
    private static final List<Compass> directionList =new ArrayList<Compass>()
    {{
      add(Compass.N);
      add(Compass.E);
      add(Compass.S);
      add(Compass.W);
    }};
    public static Compass change(Compass compass, Character rotate) {
           int index = directionList.indexOf(compass);
           if(rotate=='L') {
               if(index==0) return directionList.get(3);
               else return directionList.get(index-1);
           }
           else return directionList.get((index+1)%4);
    }
}
