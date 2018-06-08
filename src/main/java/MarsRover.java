public class MarsRover {
    private  Point coordinate;
    private  Compass compass;
    private final Point plateau;

    public MarsRover(Point coordinate, Compass compass, Point plateau) {
        this.coordinate = coordinate;
        this.compass = compass;
        this.plateau = plateau;
    }

    public String getPosition() {
        return  coordinate.toString()+" "+compass;
    }

    public void instruction(String message) {
        for (Character character:message.toCharArray()) {
            if(character == 'L' || character =='R') compass = Direction.change(compass,character);
        }
    }
}
